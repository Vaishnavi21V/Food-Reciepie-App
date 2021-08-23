package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detailsnonveg.*
import kotlinx.android.synthetic.main.activity_detailsnorth.*

class detailsnonveg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailsnonveg)

        val nvtitle = intent.getStringExtra("nonvegtitle")
        val nvcontent = intent.getStringExtra("nonvegcontents")
        val nvimage = intent.getStringExtra("nonvegimages")

        supportActionBar?.title = nvtitle
        Picasso.get().load(nvimage).into(nvfeatureimage)
        nvdetail.text = nvcontent
    }
}