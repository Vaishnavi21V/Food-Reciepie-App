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

class NorthAdapter(private val northtitles : Array<String>, private val northcontents: Array<String>, private val northimages: Array<String>) : RecyclerView.Adapter<NorthAdapter.ViewHolder>() {



    class ViewHolder(northindianView: View) : RecyclerView.ViewHolder(northindianView) {
     val cardtitle: TextView = northindianView.findViewById(R.id.cardtitle)
        val cardcontent: TextView = northindianView.findViewById(R.id.cardcontent)
        val cardimage: ImageView = northindianView.findViewById(R.id.cardimage)
        val view = northindianView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemview,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      holder.cardtitle.text = northtitles[position]
        holder.cardcontent.text = northcontents[position]
        Picasso.get().load(northimages[position]).into(holder.cardimage)

        holder.view.setOnClickListener {
            val intent = Intent(it.context,detailsnorth::class.java)
            intent.putExtra("northtitle",northtitles[position])
            intent.putExtra("northcontent",northcontents[position])
            intent.putExtra("northimage",northimages[position])
            holder.view.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
      return northtitles.size
    }
}