package com.example.kloo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Form1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form1)

        //Creates an action bar that helps me go back to the last page
        val actionBar = supportActionBar

        actionBar!!.title = "Forms"

//check the manifest to help go back to the last activity
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}