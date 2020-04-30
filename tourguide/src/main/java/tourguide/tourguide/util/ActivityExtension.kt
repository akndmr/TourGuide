package tourguide.tourguide.util

import android.app.Activity
import android.graphics.Point
import android.os.Build

/**
 * Created by Akın DEMİR on 30.04.2020.
 */

fun Activity.getRealSizeOfDevice(): Point{
    val display = this.windowManager.defaultDisplay
    val size = Point()
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
        // include nav bar height
        display.getRealSize(size)
    } else {
        // Minimum API support is 13
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            display.getSize(size)
        }
    }
    return size
}