package com.abcdiane.motormaticmurah

import android.media.Image
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity(){
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_DESK = "extra_desk"
        const val EXTRA_IMG = "extra_image"
        const val EXTRA_MESIN = "extra_mesin"
        const val EXTRA_CC = "extra_cc"
        const val EXTRA_SISTEM = "extra_sistem"
        const val EXTRA_DAYA = "extra_daya"
        const val EXTRA_TORSI = "extra_torsi"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "Detail"
        }

        val name = intent.getStringExtra(EXTRA_NAME)
        val price = intent.getStringExtra(EXTRA_PRICE)
        val deskripsi = intent.getStringExtra(EXTRA_DESK)
        val img = intent.getIntExtra(EXTRA_IMG, 0)
        val mesin = intent.getStringExtra(EXTRA_MESIN)
        val cc = intent.getStringExtra(EXTRA_CC)
        val sistem = intent.getStringExtra(EXTRA_SISTEM)
        val daya = intent.getStringExtra(EXTRA_DAYA)
        val torsi = intent.getStringExtra(EXTRA_TORSI)

        val imgView: ImageView = findViewById(R.id.img_detail_photo)
        imgView.setImageResource(img)

        val tvName: TextView = findViewById(R.id.tv_detail_nama)
        tvName.text = name

        val tvPrice: TextView = findViewById(R.id.tv_detail_harga)
        tvPrice.text = price

        val tvDesk: TextView = findViewById(R.id.tv_detail_deskripsi)
        tvDesk.text = deskripsi

        val tvMesin: TextView = findViewById(R.id.tv_detail_mesin)
        tvMesin.text = mesin

        val tvCc: TextView = findViewById(R.id.tv_detail_cc)
        tvCc.text = cc

        val tvSistem: TextView = findViewById(R.id.tv_detail_sistem)
        tvSistem.text = sistem

        val tvDaya: TextView = findViewById(R.id.tv_detail_daya)
        tvDaya.text = daya

        val tvTorsi: TextView = findViewById(R.id.tv_detail_torsi)
        tvTorsi.text = torsi
    }
}