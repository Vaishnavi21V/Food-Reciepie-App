package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.register.R
import kotlinx.android.synthetic.main.activity_dessert.*
import kotlinx.android.synthetic.main.northidian.*

class dessert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dessert)



        val desserttitles = resources.getStringArray(R.array.desserttitles)
       val dessertcontents = resources.getStringArray(R.array.dessertcontents)
       val dessertimages = resources.getStringArray(R.array.dessertImages)

        var adapter = dessertAdaptor(desserttitles,dessertcontents,dessertimages)

        dessertlist.layoutManager = LinearLayoutManager(this)
        dessertlist.adapter = adapter
    }
}