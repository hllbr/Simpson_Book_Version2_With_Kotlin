package com.hllbr.simpsonbookv2kotlin

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //List operatinos
        var homorList = ArrayList<String>()
        homorList.add("Homor")
        homorList.add("Lisa")
        homorList.add("Bart")
        homorList.add("Marge")
        //IAMGE
        val homor = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.simpson)
        val lisa = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.lisa)
        val bart = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.bart)
        val marge = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.marge)

        var SimpsonImageList =ArrayList<Bitmap>()
        SimpsonImageList.add(homor)
        SimpsonImageList.add(lisa)
        SimpsonImageList.add(bart)
        SimpsonImageList.add(marge)


        //DATA
        val adapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,homorList)
        listView.adapter = adapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            var intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("name",homorList[position])
            var selected = Singleton.Selected
            selected.SelectedImage = SimpsonImageList[position]

            startActivity(intent)

        }

    }
}