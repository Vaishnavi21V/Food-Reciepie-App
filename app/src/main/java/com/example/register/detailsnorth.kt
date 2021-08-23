package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detailsnorth.*

class detailsnorth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailsnorth)

        val ntitle = intent.getStringExtra("northtitle")
        val ncontent = intent.getStringExtra("northcontent")
        val nimage = intent.getStringExtra("northimage")

        supportActionBar?.title = ntitle
        Picasso.get().load(nimage).into(northfeatureimage)
        northdetail.text = ncontent
    }
}