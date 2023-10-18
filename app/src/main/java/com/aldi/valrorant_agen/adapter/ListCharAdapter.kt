package com.aldi.valrorant_agen.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.aldi.valrorant_agen.R
import com.aldi.valrorant_agen.activity.DetailActivity
import com.aldi.valrorant_agen.model.ValoranAgen

class ListCharAdapter(private val listChar: ArrayList<ValoranAgen>) : RecyclerView.Adapter<ListCharAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_char, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val context = holder.itemView.context
        val valoranAgen = listChar[position]
        Glide.with(holder.itemView.context)
                .load(valoranAgen.pic)
                .apply(RequestOptions())
                .into(holder.picture)
        holder.name.text = valoranAgen.name
        holder.peran.text = valoranAgen.peran
        holder.negara.text = valoranAgen.negara
        holder.itemView.setOnClickListener {
            val passItem = Intent(context, DetailActivity::class.java)
            passItem.putExtra(DetailActivity.EXTRA_NAME, valoranAgen.name)
            passItem.putExtra(DetailActivity.EXTRA_PERAN, valoranAgen.peran)
            passItem.putExtra(DetailActivity.EXTRA_BIO, valoranAgen.bio)
            passItem.putExtra(DetailActivity.EXTRA_PIC, valoranAgen.pic)
            passItem.putExtra(DetailActivity.EXTRA_PICBG, valoranAgen.background)
            passItem.putExtra(DetailActivity.EXTRA_ROLE, valoranAgen.role)
            passItem.putExtra(DetailActivity.EXTRA_LINK, valoranAgen.charlink)
            passItem.putExtra(DetailActivity.EXTRA_COUNTRY, valoranAgen.country)
            context.startActivity(passItem)
        }
    }

    override fun getItemCount(): Int {
        return listChar.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.agen_name)
        var peran: TextView = itemView.findViewById(R.id.agen_peran)
        var negara: TextView = itemView.findViewById(R.id.agen_negara)
        var picture: ImageView = itemView.findViewById(R.id.agen_pic)
    }
}