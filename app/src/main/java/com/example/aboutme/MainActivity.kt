package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.getSystemService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnILoveYou).setOnClickListener {
            addLoverName(it)
        }
    }

    private fun addLoverName(view: View) {
        val editText: EditText = findViewById(R.id.edtLoverName)
        val loverName: TextView = findViewById(R.id.txtLoverName)
        val italian: TextView = findViewById(R.id.txtItalianPoem)
        val portuguese: TextView = findViewById(R.id.txtPortugueseSonnet)

        loverName.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        loverName.visibility = View.VISIBLE
        italian.visibility = View.VISIBLE
        portuguese.visibility = View.VISIBLE

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}