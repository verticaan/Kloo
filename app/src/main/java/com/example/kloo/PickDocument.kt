package com.example.kloo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PickDocument : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pick_document)

        //Creates an action bar that helps me go back to the last page
        val actionBar = supportActionBar

        actionBar!!.title = "New Document"

//check the manifest to help go back to the last activity
        actionBar.setDisplayHomeAsUpEnabled(true)

        //Helps me reach out to the Form1 button
        val form1 = findViewById<Button>(R.id.button)

        form1.setOnClickListener(){
            val intent = Intent (this, Form1::class.java)
            startActivity(intent)

    }
}
}