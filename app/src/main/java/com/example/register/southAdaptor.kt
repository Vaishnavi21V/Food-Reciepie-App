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

class southAdapter(private val southtitles : Array<String>, private val southcontents: Array<String>, private val southimages: Array<String>) : RecyclerView.Adapter<southAdapter.ViewHolder>() {



    class ViewHolder(southindianView: View) : RecyclerView.ViewHolder(southindianView) {
        val cardtitle: TextView = southindianView.findViewById(R.id.cardtitle)
        val cardcontent: TextView = southindianView.findViewById(R.id.cardcontent)
        val cardimage: ImageView = southindianView.findViewById(R.id.cardimage)
        val view = southindianView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemview,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cardtitle.text = southtitles[position]
        holder.cardcontent.text =southcontents[position]
        Picasso.get().load(southimages[position]).into(holder.cardimage)

        holder.view.setOnClickListener {
            val intent = Intent(it.context,detailssouth::class.java)
            intent.putExtra("southtitle",southtitles[position])
            intent.putExtra("southcontent",southcontents[position])
            intent.putExtra("southimage",southimages[position])
            holder.view.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return southtitles.size
    }
}
