package com.example.mtgedh

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_players_four.*

class MainActivity : AppCompatActivity() {

    private var players = 1
    private var playerammount = 2
    private var imageListener: ImageListener =
        ImageListener { position, imageView -> imageView.setImageResource(sampleImages[position]) }

    var sampleImages = intArrayOf(
        R.drawable.bg_angrath,
        R.drawable.bg_lathliss,
        R.drawable.bg_kaladesh,
        R.drawable.bg_dino,
        R.drawable.bg_nissa,
        R.drawable.bg_arixmethes
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val carouselView = findViewById<CarouselView>(R.id.carouselView)
        carouselView.pageCount = sampleImages.size
        carouselView.setImageListener(imageListener)




        buttonStart.setOnClickListener {
            if(players == 1){
                val players2 = Intent(this, PlayersTwo::class.java)
                startActivity(players2)
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
            }
            if(players == 2){
                val players3 = Intent(this, PlayersThree::class.java)
                startActivity(players3)
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
            }
            if(players == 3){
                val players4 = Intent(this, PlayersFour::class.java)
                startActivity(players4)
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left)
            }
        }

       


    }


    fun addPlayers(view: View){
        if(players < 3){
            players++
            playerammount++
            buttonNoOfPlayers.text = "$playerammount"
        }
    }
    fun removePlayers(view: View){
        if(players > 1){
            players--
            playerammount--
            buttonNoOfPlayers.text = "$playerammount"
        }
    }

    fun closeApp(view: View) {
        finishAffinity()
        overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom)
    }
}