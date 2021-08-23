package com.example.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.northidian.*
import androidx.recyclerview.widget.RecyclerView.LayoutManager as LayoutManager1

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button = findViewById<Button>(R.id.b1)
        button.setOnClickListener{
            val i = Intent(this,north::class.java)
            startActivity(i)
        }


        val btn2 = findViewById<Button>(R.id.b2)
        btn2.setOnClickListener{
            val i = Intent(this,south::class.java)
            startActivity(i)
        }

        val btn4 = findViewById<Button>(R.id.b4)
        btn4.setOnClickListener{
            val i = Intent(this,dessert::class.java)
            startActivity(i)
        }

        val btn3 = findViewById<Button>(R.id.b3)
        btn3.setOnClickListener{
            val i = Intent(this,nonveg::class.java)
            startActivity(i)
        }



    }




}