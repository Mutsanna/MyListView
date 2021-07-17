package com.mutsanna.mylistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MoveWithObjectActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_HERO = "extra_hero"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        val imgPhoto: CircleImageView = findViewById(R.id.img_photo)
        val tvName: TextView = findViewById(R.id.tv_name)
        val tvDetail: TextView = findViewById(R.id.tv_detail)


        val hero = intent.getParcelableExtra<Hero>(EXTRA_HERO) as Hero


        val textNama = "Name : ${hero.name.toString()}"
        val textDetail = "Deskripsi : ${hero.description.toString()}"

        imgPhoto.setImageResource(hero.photo)
        tvName.text = textNama
        tvDetail.text = textDetail
    }
}