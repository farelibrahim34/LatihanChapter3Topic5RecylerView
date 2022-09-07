package com.example.latihanchapter3top5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdapter(val lisProvinsi :ArrayList<ListProvinsi>): RecyclerView.Adapter<DataAdapter.ViewHolder>() {
    class ViewHolder(view : View): RecyclerView.ViewHolder(view) {

        var nProvinsi =  view.findViewById<TextView>(R.id.txtProvinsi)
        var nIbukota = view.findViewById<TextView>(R.id.txtIbukota)
        var image = view.findViewById<ImageView>(R.id.iconPerson)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_provinsi, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nIbukota.text = "Ibukota : "+lisProvinsi[position].namaIbukota
        holder.nProvinsi.text = "Provinsi : "+lisProvinsi[position].namaProvinsi
        holder.image.setImageResource(lisProvinsi[position].img)
    }

    override fun getItemCount(): Int {
        return lisProvinsi.size
    }
}