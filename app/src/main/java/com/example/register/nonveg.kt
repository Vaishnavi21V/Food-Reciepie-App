package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_nonveg.*
import kotlinx.android.synthetic.main.northidian.*

class nonveg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nonveg)

        val nonvegtitles = resources.getStringArray(R.array.nonvegtitles)
        val nonvegcontents = resources.getStringArray(R.array.nonvegcontents)
        val nonvegimages = resources.getStringArray(R.array.nonvegImages)

        var adapter = nonvegAdaptor(nonvegtitles,nonvegcontents,nonvegimages)

        nonveglist.layoutManager = LinearLayoutManager(this)
        nonveglist.adapter = adapter
    }
}