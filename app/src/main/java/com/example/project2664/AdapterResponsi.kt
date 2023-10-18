package com.example.project2664

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterResponsi (private val listBuku:List<SpacePerpus>):
    RecyclerView.Adapter<AdapterResponsi.ViewHolder>() {
    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView) {
        val gambar: ImageView = itemView.findViewById(R.id.imageViewBuku1)
        val judul: TextView = itemView.findViewById(R.id.textViewJudul1)
        val isi1: TextView = itemView.findViewById(R.id.textViewIsi1)
        val isi2: TextView = itemView.findViewById(R.id.textViewIsi2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.card_layout_responsi,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBuku.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val spacePerpus = listBuku[position]

        holder.gambar.setImageResource(spacePerpus.gambar)
        holder.judul.text = spacePerpus.judul
        holder.isi1.text = spacePerpus.isi1
        holder.isi2.text = spacePerpus.isi2
    }

}