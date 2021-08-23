package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_south.*
import kotlinx.android.synthetic.main.northidian.*

class south : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_south)

        val southtitles = resources.getStringArray(R.array.southtitles)
        val southcontents = resources.getStringArray(R.array.southcontents)
        val southimages = resources.getStringArray(R.array.southindianImages)

        var adapter = southAdapter(southtitles,southcontents,southimages)

        southlist.layoutManager = LinearLayoutManager(this)
        southlist.adapter = adapter
    }
}