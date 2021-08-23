package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_detailsdessert.*
import kotlinx.android.synthetic.main.activity_detailsnorth.*

class detailsdessert : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailsdessert)

        val dtitle = intent.getStringExtra("desserttitle")
        val dcontent = intent.getStringExtra("dessertcontent")
        val dimage = intent.getStringExtra("dessertimage")

        supportActionBar?.title = dtitle
        Picasso.get().load(dimage).into(dessertfeatureimage)
            dessertdetail.text = dcontent
    }
}