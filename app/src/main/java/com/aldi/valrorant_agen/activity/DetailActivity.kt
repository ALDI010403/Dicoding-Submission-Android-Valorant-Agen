package com.aldi.valrorant_agen.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.aldi.valrorant_agen.R

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PERAN = "extra_peran"
        const val EXTRA_BIO = "extra_bio"
        const val EXTRA_PIC = "extra_pic"
        const val EXTRA_PICBG = "extra_picbg"
        const val EXTRA_ROLE = "extra_role"
        const val EXTRA_LINK = "extra_link"
        const val EXTRA_COUNTRY = "extra_country"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvCharName: TextView = findViewById(R.id.agen_name)
        val tvCharPeran: TextView = findViewById(R.id.agen_peran)
        val tvCharBio: TextView = findViewById(R.id.agen_biografi)
        val imgCharPic: ImageView = findViewById(R.id.agen_pic)
        val imgCharPicbg: ImageView = findViewById(R.id.agen_bg)
        val imgCharRole: ImageView = findViewById(R.id.agen_role)
        val shareButton: Button = findViewById(R.id.share_button)
        val imgCountry: ImageView = findViewById(R.id.agen_country)

        val charName = intent.getStringExtra(EXTRA_NAME)
        val charPeran = intent.getStringExtra(EXTRA_PERAN)
        val charBio = intent.getStringExtra(EXTRA_BIO)
        val charPic = intent.getIntExtra(EXTRA_PIC, 0)
        val charPicbg = intent.getIntExtra(EXTRA_PICBG, 0)
        val charRole = intent.getIntExtra(EXTRA_ROLE, 0)
        val charLink = intent.getStringExtra(EXTRA_LINK)
        val charCountry = intent.getIntExtra(EXTRA_COUNTRY, 0)

        tvCharName.text = charName
        tvCharPeran.text = charPeran
        tvCharBio.text = charBio
        Glide.with(this)
            .load(charPic)
            .apply(RequestOptions())
            .into(imgCharPic)
        Glide.with(this)
            .load(charPicbg)
            .apply(RequestOptions())
            .into(imgCharPicbg)
        Glide.with(this)
            .load(charRole)
            .apply(RequestOptions())
            .into(imgCharRole)
        Glide.with(this)
            .load(charCountry)
            .apply(RequestOptions())
            .into(imgCountry)

        shareButton.setOnClickListener {
            val goShare = Intent()
            goShare.action = Intent.ACTION_SEND
            goShare.putExtra(Intent.EXTRA_TEXT, "Hey look at this Valorant Agen: $charLink")
            goShare.type = "text/plain"
            startActivity(Intent.createChooser(goShare, "Share To:"))
        }
    }
}