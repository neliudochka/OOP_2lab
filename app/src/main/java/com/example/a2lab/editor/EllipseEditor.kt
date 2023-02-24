package com.example.a2lab.editor

import com.example.a2lab.PaintOptions
import com.example.a2lab.shape.EllipseShape
import com.example.a2lab.shape.Shape
import com.example.a2lab.shape.ShapeAdder

class EllipseEditor (val paintOptions: PaintOptions,
                     shapes: MutableList<Shape>) : ShapeEditor(paintOptions, shapes) {
    var ellipseShape: EllipseShape = EllipseShape(paintOptions)


    override fun onLBDown(x: Float, y: Float) {
        ellipseShape = EllipseShape(paintOptions)
        ellipseShape.setStartCoords(x, y)
    }

    override fun onLBUp() {
        ellipseShape.setFillFlag()
        ellipseShape.setFinishedFlag()
        ShapeAdder.addShape(ellipseShape, shapes)
    }

    override fun onMouseMove(x: Float, y: Float) {
        if (shapes.contains(ellipseShape))
            shapes.removeAt(shapes.lastIndex)

        ellipseShape.setEndCoords(x, y)
        ShapeAdder.addShape(ellipseShape, shapes)
    }

}