package com.example.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.northidian.*

class north : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.northidian)



        val northtitles = resources.getStringArray(R.array.northtitles)
        val northcontents = resources.getStringArray(R.array.northcontents)
        val northimages = resources.getStringArray(R.array.northindianImages)

        var adapter = NorthAdapter(northtitles,northcontents,northimages)

        northlist.layoutManager = LinearLayoutManager(this)
        northlist.adapter = adapter
    }


}