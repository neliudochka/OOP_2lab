package com.example.a2lab.editor

abstract class Editor() {
    abstract fun onLBDown(x: Float, y: Float)
    abstract fun onLBUp()
    abstract fun onMouseMove(x: Float, y: Float)
}