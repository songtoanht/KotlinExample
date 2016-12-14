@file:JvmName("ExtensionUtils")

package com.toanns.kotlinexample.common

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * @author ToanNS
 */

fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}