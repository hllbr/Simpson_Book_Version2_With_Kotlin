package com.hllbr.simpsonbookv2kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        var intent = intent
        var singleton = Singleton.Selected
        var selectedSingleton = singleton.SelectedImage
        imageView.setImageBitmap(selectedSingleton)

        var listName = intent.getStringExtra("name")
        textView.text = listName

    }
}