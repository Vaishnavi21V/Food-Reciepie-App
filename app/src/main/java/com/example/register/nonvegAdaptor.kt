package com.example.register


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class nonvegAdaptor(private val nonvegtitles : Array<String>, private val nonvegcontents: Array<String>, private val nonvegimages: Array<String>) : RecyclerView.Adapter<nonvegAdaptor.ViewHolder>() {



    class ViewHolder(nonvegView: View) : RecyclerView.ViewHolder(nonvegView) {
        val cardtitle: TextView = nonvegView.findViewById(R.id.cardtitle)
        val cardcontent: TextView = nonvegView.findViewById(R.id.cardcontent)
        val cardimage: ImageView = nonvegView.findViewById(R.id.cardimage)
        val view = nonvegView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemview,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cardtitle.text = nonvegtitles[position]
        holder.cardcontent.text = nonvegcontents[position]
        Picasso.get().load(nonvegimages[position]).into(holder.cardimage)

        holder.view.setOnClickListener {
            val intent = Intent(it.context,detailsnonveg::class.java)
            intent.putExtra("nonvegtitle",nonvegtitles[position])
            intent.putExtra("nonvegcontents",nonvegcontents[position])
            intent.putExtra("nonvegimages",nonvegimages[position])
            holder.view.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return nonvegtitles.size
    }
}