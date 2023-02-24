package com.example.a2lab.shape

import android.graphics.Canvas
import com.example.a2lab.PaintOptions
import java.lang.Math.abs

class EllipseShape (val paintOptions: PaintOptions): Shape(paintOptions) {
    private var startx = x1
    private var endx = x1
    private var starty = y1
    private var endy = y2


    override fun show(canvas: Canvas) {
        startx = x1 - abs(x1-x2)
        endx = x1 + abs(x1-x2)
        starty = y1 - abs(y1-y2)
        endy = y1 + abs(y1-y2)

        canvas.drawOval(startx,starty, endx, endy, PaintOptions.inProgress)
    }

    override fun showFinal(canvas: Canvas) {
        canvas.drawOval(startx,starty, endx, endy, PaintOptions.final)
    }

    override fun fill (canvas: Canvas) {
        canvas.drawOval(startx,starty, endx, endy, PaintOptions.fillEllipse)
    }

}