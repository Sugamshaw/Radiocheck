package com.sugam.radio_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.ToggleButton

class Togglebutton : AppCompatActivity() {

    private lateinit var toggleButton: Togglebutton
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_togglebutton)

        toggleButton = findViewById(R.id.toggleButton)
        textView = findViewById(R.id.textView)

        toggleButton.setOnCheckedChangeListener { compoundButton, ischecked ->
            if(ischecked){
                textView.visibility= View.VISIBLE
            }
            else{
                textView.visibility= View.VISIBLE
            }
        }

    }
}