package com.example.colorpicker

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.christophesmet.android.views.colorpicker.ColorPickerView


class MainActivity : AppCompatActivity() {


    private var mColorPickerView: ColorPickerView? = null
    private var mColorView: View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mColorPickerView = findViewById(R.id.colorpicker)
        mColorView = findViewById(R.id.result_color);
        loadListeners();
        //Set this to true, to enable visual debugging. To check the offset radius
        mColorPickerView?.setDrawDebug(false);
    }


    private fun loadListeners() {

        mColorPickerView!!.setColorListener { color -> mColorView!!.setBackgroundColor(color) }

    }


}