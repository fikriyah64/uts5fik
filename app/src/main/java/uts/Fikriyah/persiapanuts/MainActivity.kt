package com.example.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.sdnp1,"Lokasi SD","SDN 1 Pagerbarang","SDN 1 Pagerbarang.\n SD NEGERI PAGERBARANG 01. NPSN, : 20325026. Alamat, : JLN RAYA UTARA PAGERBARANG. Kode Pos, : 52462. Desa/Kelurahan, : Pagerbarang. "))

        data?.add(DataModel(R.drawable.sma1,"Lokasi SD","SDN 2 Pagerbarang","SDN 2 Pagerbarang.\n SD NEGERI PAGERBARANG 02. NPSN, : 20325027. Alamat, : JLN RAYA UTARA PAGERBARANG. Kode Pos, : 52462. Desa/Kelurahan, : Pagerbarang."))
        data?.add(DataModel(R.drawable.smp5,"Lokasi SD","SDN 3 Pagerbarang","SDN 3 Pagerbarang.\n  SD NEGERI PAGERBARANG 03. NPSN, : 20325028. Alamat, : JLN RAYA UTARA PAGERBARANG. Kode Pos, : 52462. Desa/Kelurahan, : Pagerbarang. "))
        data?.add(DataModel(R.drawable.sma4,"Lokasi SD","SDN 4 Pagerbarang","SDN 4 Pagerbarang.\n SD NEGERI PAGERBARANG 04. NPSN, : 20325029. Alamat, : JLN RAYA UTARA PAGERBARANG. Kode Pos, : 52462. Desa/Kelurahan, : Pagerbarang. "))
        data?.add(DataModel(R.drawable.sma2,"Lokasi SD","SDN 5 Pagerbarang","SDN 5 Pagerbarang.\n SD NEGERI PAGERBARANG 05. NPSN, : 20325030. Alamat, : JLN RAYA UTARA PAGERBARANG. Kode Pos, : 52462. Desa/Kelurahan, : Pagerbarang. "))

        data?.add(DataModel(R.drawable.smp2,"Lokasi SD","SDN 6 Pagerbarang","SDN 6 Pagerbarang.\n  SD NEGERI PAGERBARANG 06. NPSN, : 20325031. Alamat, : JLN RAYA UTARA PAGERBARANG. Kode Pos, : 52462. Desa/Kelurahan, : Pagerbarang. "))
        data?.add(DataModel(R.drawable.sma3,"Lokasi SD","SDN 7 Pagerbarang","SDN 7 Pagerbarang.\n SD NEGERI PAGERBARANG 07. NPSN, : 20325032. Alamat, : JLN RAYA UTARA PAGERBARANG. Kode Pos, : 52462. Desa/Kelurahan, : Pagerbarang."))
        data?.add(DataModel(R.drawable.smp4,"Lokasi SD","SDN 8 Pagerbarang","SDN 8 Pagerbarang.\n SD NEGERI PAGERBARANG 08. NPSN, : 20325033. Alamat, : JLN RAYA UTARA PAGERBARANG. Kode Pos, : 52462. Desa/Kelurahan, : Pagerbarang. "))
        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.lokasi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}