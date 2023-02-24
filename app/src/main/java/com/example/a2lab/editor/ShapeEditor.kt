package com.example.a2lab.editor

import com.example.a2lab.PaintOptions
import com.example.a2lab.shape.Shape

abstract class ShapeEditor (paintOptions: PaintOptions, val shapes: MutableList<Shape>): Editor() {

    override fun onMouseMove(x: Float, y: Float) {
    }

    override fun onLBDown(x: Float, y: Float) {
    }

    override fun onLBUp() {
    }
}