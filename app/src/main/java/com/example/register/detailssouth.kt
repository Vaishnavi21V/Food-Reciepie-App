package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detailsnorth.*
import kotlinx.android.synthetic.main.activity_detailssouth.*

class detailssouth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailssouth)

        val stitle = intent.getStringExtra("southtitle")
        val scontent = intent.getStringExtra("southcontent")
        val simage = intent.getStringExtra("southimage")

        supportActionBar?.title = stitle
        Picasso.get().load(simage).into(southfeatureimage)
        southdetail.text = scontent
    }
}