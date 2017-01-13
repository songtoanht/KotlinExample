package com.toanns.kotlinexample.service

import android.app.Service
import android.content.Context
import android.content.Intent
import android.graphics.PixelFormat
import android.os.IBinder
import android.util.Log
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.view.WindowManager
import android.view.WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
import android.view.WindowManager.LayoutParams.TYPE_PHONE
import android.widget.ImageView
import com.toanns.kotlinexample.R




/**
 * Copyright © 2016 AsianTech inc.
 * Created by toanns on 22/12/2016.
 */

class ChatHeadService : Service() {
    private var windowManager: WindowManager? = null
    private var chatHead: ImageView? = null


//    override fun onBind(intent: Intent?): IBinder {
//        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()

        windowManager = getSystemService(Context.WINDOW_SERVICE) as WindowManager?
        chatHead = ImageView(this)
        chatHead!!.setImageResource(R.mipmap.ic_launcher)

        Log.d("ttt", "hay hay" + windowManager + " " + chatHead)

        val params: WindowManager.LayoutParams = WindowManager.LayoutParams(
                WRAP_CONTENT,
                WRAP_CONTENT,
                TYPE_PHONE,
                FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT
        )
        params.gravity = Gravity.TOP or Gravity.LEFT
        params.x = 0
        params.y = 100

        windowManager!!.addView(chatHead, params)

        /*chatHead!!.setOnTouchListener ({ view, motionEvent ->
            var initialX: Int = 0
            var initialY: Int = 0
            var initialTouchX: Float = 0f
            var initialTouchY: Float = 0f
            when(motionEvent.actionMasked) {
                MotionEvent.ACTION_DOWN -> {
                    initialX = params.x
                    initialY = params.y
                    initialTouchX = motionEvent.rawX
                    initialTouchY = motionEvent.rawY
                    return true

                }
            }
        })*/


        chatHead!!.setOnTouchListener(object : View.OnTouchListener {
            private var initialX: Int = 0
            private var initialY: Int = 0
            private var initialTouchX: Float = 0.toFloat()
            private var initialTouchY: Float = 0.toFloat()

            override fun onTouch(v: View, event: MotionEvent): Boolean {
                when (event.action) {
                    MotionEvent.ACTION_DOWN -> {
                        initialX = params.x
                        initialY = params.y
                        initialTouchX = event.rawX
                        initialTouchY = event.rawY
                        return true
                    }
                    MotionEvent.ACTION_UP -> {
                        Log.d("ttt", "up")
                        chatHead!!.visibility = View.GONE
                        return true
                    }
                    MotionEvent.ACTION_MOVE -> {
                        params.x = initialX + (event.rawX - initialTouchX).toInt()
                        params.y = initialY + (event.rawY - initialTouchY).toInt()
                        windowManager!!.updateViewLayout(chatHead, params)
                        return true
                    }
                }
                return false
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        if (chatHead !=null) windowManager!!.removeView(chatHead)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }
}
