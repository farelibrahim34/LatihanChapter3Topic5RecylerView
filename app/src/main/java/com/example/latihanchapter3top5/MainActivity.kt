package com.example.latihanchapter3top5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listProvinsi = arrayListOf(
            ListProvinsi("Papua Selatan", "Kabupaten Merauke", R.drawable.papua_selatan),
            ListProvinsi("Papua Tengah", "Kabupaten Nabire", R.drawable.papua_selatan),
            ListProvinsi("Nusa Tenggara Timur", "Kupang", R.drawable.ntt),
            ListProvinsi("Sumatra Selatan", "Palembang", R.drawable.sumsel_limas),
            ListProvinsi("Sumatra Barat", "Padang", R.drawable.sumbar_gadang),
            ListProvinsi("Sulawesi Utara", "Manado", R.drawable.sulut_walewangko),
            ListProvinsi("Sulawesi Tenggara", "Kendari", R.drawable.sultenggara_butpn),
            ListProvinsi("Sulawesi Tengah", "Palu", R.drawable.sulteng_souraja),
            ListProvinsi("Sulawesi Barat", "Mamuju", R.drawable.sulbar_boyang),
            ListProvinsi("Nanggroe Aceh Darussalam", "Aceh", R.drawable.nad_aceh),
            ListProvinsi(" Sumatra Utara", "Medan", R.drawable.sumut_bolon),

        )
        var adapterProvinsi =DataAdapter(listProvinsi)
        val ln = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        rvProvinsi.layoutManager = ln
        val recyclerView =findViewById<RecyclerView>(R.id.rvProvinsi)
        recyclerView.adapter =adapterProvinsi


    }
}