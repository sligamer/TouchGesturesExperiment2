package com.touchgesturesexp2.sligamer.touchgesturesexperiment2

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.MotionEvent
import android.view.View

/**
 * Created by Justin Freres on 4/10/2018.
 * Lab 7-2 Touch Gesture Experiment 2
 * Plugin Support with kotlin_version = '1.2.40'
 */

class GameView: View {

    // DECLARE VARIABLES
    private var paint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private var mCircle: Circle = Circle()

    constructor(context: Context?) : super(context) {

        // CREATE A CIRCLE AND SET THE PAINT
        // SET THE RADIUS X, Y, LOCATIONS

        paint.color = Color.rgb(126,79,43)
        mCircle.setPaint(paint)

        mCircle.setRadius(100F)
        mCircle.setX(400F)
        mCircle.setY(300F)
    }

    override fun onDraw(canvas: Canvas?) {
        // TASK 1: FILL THE BACKGROUND OF THE CANVAS
        canvas!!.drawRGB(248,232,198)

        // TASK 2: DRAW THE CIRCLE
        canvas!!.drawCircle(mCircle.getX(), mCircle.getY(),mCircle.getRadius(), mCircle.getPaint())
    }

    fun update() {
        invalidate()
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {

        // TASK 1: IDENTIFY THE TOUCH ACTION BEING PERFORMED
        val touchAction = event!!.actionMasked

        // TASK 2: RESPOND TO TWO POSSIBLE TOUCH EVENTS
        when(touchAction)
        {
            MotionEvent.ACTION_DOWN -> {
                mCircle.setRadius(300F)
            }
            MotionEvent.ACTION_UP -> {
                mCircle.setRadius(75F)

            }
            MotionEvent.ACTION_MOVE -> {
                mCircle.setRadius(300F)
                mCircle.setX(event.x)
                mCircle.setY(event.y)
            }
        }

        // TASK 3: INVALIDATE THE VIEW
        invalidate()

        // TASK 4: RETURN TRUE
        return true

    }

}