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
            ListProvinsi("Papua Tengah", "Kabupaten Nabire", R.drawable.papuateng_karapao),
            ListProvinsi("Nusa Tenggara Timur", "Kupang", R.drawable.ntt),
            ListProvinsi("Sumatra Selatan", "Palembang", R.drawable.sumsel_limas),
            ListProvinsi("Sumatra Barat", "Padang", R.drawable.sumbar_gadang),
            ListProvinsi("Sulawesi Utara", "Manado", R.drawable.sulut_walewangko),
            ListProvinsi("Sulawesi Tenggara", "Kendari", R.drawable.sultenggara_butpn),
            ListProvinsi("Sulawesi Tengah", "Palu", R.drawable.sulteng_souraja),
            ListProvinsi("Sulawesi Barat", "Mamuju", R.drawable.sulbar_boyang),
            ListProvinsi("Nanggroe Aceh Darussalam", "Aceh", R.drawable.nad_aceh),
            ListProvinsi(" Sumatra Utara", "Medan", R.drawable.sumut_bolon),
            ListProvinsi("Riau","Pekanbaru", R.drawable.riau_selaso),
            ListProvinsi("Papua","Jayapura", R.drawable.papua_honai),
            ListProvinsi("Papua Barat","Manokwari", R.drawable.pabar_modaki),
            ListProvinsi("Nusa Tenggara Barat","Mataram", R.drawable.ntb_loka),
            ListProvinsi("Maluku Utara","Sofifi", R.drawable.malut_sasadu),
            ListProvinsi("Maluku","Ambon", R.drawable.maluku_baileo),
            ListProvinsi("Lampung","Bandar Lampung", R.drawable.lampung_nuwo),
            ListProvinsi("Kepulauan Riau","Tanjung Pinang", R.drawable.kepri_atap),
            ListProvinsi("Kalimantan Utara","Tanjung Selor", R.drawable.kalut_baloy),
            ListProvinsi("Kalimantan Timur","Samarinda", R.drawable.kaltim_lamin),
            ListProvinsi("Kalimantan Tengah","Palangkaraya", R.drawable.kalteng_betang),
            ListProvinsi("Kalimantan Selatan","Banjar Baru", R.drawable.kalsel_bubungan),
            ListProvinsi("Kalimantan Barat","Pontianak", R.drawable.kalbar_panjang),



        )
        var adapterProvinsi =DataAdapter(listProvinsi)
        val ln = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        rvProvinsi.layoutManager = ln
        val recyclerView =findViewById<RecyclerView>(R.id.rvProvinsi)
        recyclerView.adapter =adapterProvinsi


    }
}