package com.example.kloo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       //Helps me reach out to the NewDocument button
        val newDocumentButton = findViewById<Button>(R.id.NewDocumentButton)

        newDocumentButton.setOnClickListener(){
            val intent = Intent (this, PickDocument::class.java)
            startActivity(intent)
        }
    }
}