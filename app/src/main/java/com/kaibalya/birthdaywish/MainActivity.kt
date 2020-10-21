package com.kaibalya.birthdaywish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtView.setOnClickListener {
            Toast.makeText(this, "Birthday wish", Toast.LENGTH_SHORT).show()
        }
        btn.setOnClickListener {
            var frndName : String = editTextTextPersonName.text.toString()
            Toast.makeText(this, "Name: $frndName", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, DisplayPage::class.java)
            intent.putExtra(DisplayPage.NAME_EXTRA,frndName )
            startActivity(intent)
        }
    }
}