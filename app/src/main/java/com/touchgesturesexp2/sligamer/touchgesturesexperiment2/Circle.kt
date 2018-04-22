package com.touchgesturesexp2.sligamer.touchgesturesexperiment2

import android.graphics.Paint

/**
 * Created by Justin Freres on 4/10/2018.
 * Lab 7-2 Touch Gesture Experiment 2
 * Plugin Support with kotlin_version = '1.2.40'
 */

class Circle {

    // DECLARE VARIABLES
    private lateinit var mPaint: Paint
    private var mRadius: Float = 0F
    private var mX: Float = 0F
    private var mY: Float = 0F

    fun setPaint(paint: Paint) {
        mPaint = paint
    }

    fun getPaint(): Paint {
        return mPaint
    }

    fun setRadius(radius: Float) {
        mRadius = radius
    }

    fun getRadius(): Float {
        return mRadius
    }

    fun setX(x: Float) {
        mX = x
    }
    fun getX(): Float {
        return mX
    }

    fun setY(y: Float) {
        mY = y
    }
    fun getY(): Float {
        return mY
    }
}