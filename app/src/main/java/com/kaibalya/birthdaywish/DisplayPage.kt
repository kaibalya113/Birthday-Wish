package com.kaibalya.birthdaywish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display_page.*

class DisplayPage : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_page)
        val name = intent.getStringExtra(NAME_EXTRA)
        frndN.text = "Happy BirthDay\n $name"
    }
}