package com.example.register


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.register.R
import com.squareup.picasso.Picasso

class dessertAdaptor(private val desserttitles : Array<String>, private val dessertcontents: Array<String>, private val dessertimages: Array<String>) : RecyclerView.Adapter<dessertAdaptor.ViewHolder>() {



    class ViewHolder(dessertView: View) : RecyclerView.ViewHolder(dessertView) {
        val cardtitle: TextView = dessertView.findViewById(R.id.cardtitle)
        val cardcontent: TextView = dessertView.findViewById(R.id.cardcontent)
        val cardimage: ImageView = dessertView.findViewById(R.id.cardimage)
        val view = dessertView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemview,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cardtitle.text = desserttitles[position]
        holder.cardcontent.text = dessertcontents[position]
        Picasso.get().load(dessertimages[position]).into(holder.cardimage)

        holder.view.setOnClickListener {
            val intent = Intent(it.context,detailsdessert::class.java)
            intent.putExtra("desserttitle",desserttitles[position])
            intent.putExtra("dessertcontent",dessertcontents[position])
            intent.putExtra("dessertimage",dessertimages[position])
            holder.view.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return desserttitles.size
    }
}