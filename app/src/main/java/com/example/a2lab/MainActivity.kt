package com.example.a2lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem


class MainActivity : AppCompatActivity() {

    lateinit var currentObj: MenuItem
    lateinit var myCanvasView: CanvasView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myCanvasView = CanvasView(this)
        setContentView(myCanvasView)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        currentObj = menu.findItem(R.id.currentObj)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val newTitle = item.title
        return when(item.itemId) {
            R.id.point -> {
                currentObj.setTitle(newTitle)
                myCanvasView.startPointEditor()
                true
            }
            R.id.line -> {
                currentObj.setTitle(newTitle)
                myCanvasView.startLineEditor()
                true
            }
            R.id.rect -> {
                currentObj.setTitle(newTitle)
                myCanvasView.startRectEditor()
                true
            }
            R.id.ellipse -> {
                currentObj.setTitle(newTitle)
                myCanvasView.startEllipseEditor()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}