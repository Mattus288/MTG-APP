package com.example.mtgedh

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_players_three.*
import kotlinx.android.synthetic.main.activity_players_three.button_commander_color31
import kotlinx.android.synthetic.main.activity_players_three.button_commander_color32
import kotlinx.android.synthetic.main.activity_players_three.button_commander_color33
import kotlinx.android.synthetic.main.activity_players_two.buttonReturn


class PlayersThree : AppCompatActivity() {

    private var hp = 40
    private var comTax = 0
    private var hp2 = 40
    private var comTax2 = 0
    private var hp3 = 40
    private var comTax3 = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_players_three)




        buttonReturn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }


        button_commander_color31.setOnClickListener {
            val i2 = Intent(this, ColorIdentityThree::class.java)
            i2.putExtra("Color32", intent.getStringExtra("Color32"))
            i2.putExtra("Color33", intent.getStringExtra("Color33"))
            startActivity(i2)
            overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom)
        }

        button_commander_color32.setOnClickListener {
            val i2 = Intent(this, ColorIdentityThree2::class.java)
            i2.putExtra("Color31", intent.getStringExtra("Color31"))
            i2.putExtra("Color33", intent.getStringExtra("Color33"))
            startActivity(i2)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }

        button_commander_color33.setOnClickListener {
            val i2 = Intent(this, ColorIdentityThree3::class.java)
            i2.putExtra("Color31", intent.getStringExtra("Color31"))
            i2.putExtra("Color32", intent.getStringExtra("Color32"))
            startActivity(i2)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        val intent = intent

        fun color1(color : String, bColor : String) {
            commander3_1.setBackgroundColor(Color.parseColor(bColor))
            buttonAdd31.setBackgroundColor(Color.parseColor(color))
            buttonRemove31.setBackgroundColor(Color.parseColor(color))
            buttonComTaxAdd31.setBackgroundColor(Color.parseColor(color))
            buttonComTaxRemove31.setBackgroundColor(Color.parseColor(color))
            buttonResetCom31.setBackgroundColor(Color.parseColor(color))
            button_monarch31.text = "♛"
            button_monarch31.setBackgroundColor(Color.parseColor(color))
            button_city31.text = "⛯"
            button_city31.setBackgroundColor(Color.parseColor(color))
            hp = 40
            textViewHp31.text = "40"
            textViewHp31.setBackgroundResource(0)
            comTax = 0
            textViewComTaxCount31.text = "0"
            textViewComTaxCount31.setBackgroundResource(0)
        }

        val color = intent.getStringExtra("Color31")
        cmdrColor31.text = color

        when (cmdrColor31.text.toString()) {
            "white" -> {
                color1("#e6e3ba","#d3d3c9")
                button_commander_color31.setBackgroundResource(R.drawable.color_monowhite)
                button_commander_color31.text = ""
            }
            "blue" -> {
                color1("#0a67bf","#2680d6")
                button_commander_color31.setBackgroundResource(R.drawable.color_monoblue)
                button_commander_color31.text = ""
            }
            "black" -> {
                color1("#282829","#3b3b3c")
                button_commander_color31.setBackgroundResource(R.drawable.color_monoblack)
                button_commander_color31.text = ""
            }
            "red" -> {
                color1("#b01c1c","#de1d1d")
                button_commander_color31.setBackgroundResource(R.drawable.color_monored)
                button_commander_color31.text = ""
            }
            "green" -> {
                color1("#04750c","#1aa027")
                button_commander_color31.setBackgroundResource(R.drawable.color_monogreen)
                button_commander_color31.text = ""
            }
            "colorless" -> {
                commander3_1.setBackgroundResource(R.drawable.bg_colorless)
                button_commander_color31.setBackgroundResource(R.drawable.color_colorless)
                button_commander_color31.text = ""
            }
            "azorius" -> {
                color1("#3ea0cf","#8bd5f8")
                button_commander_color31.setBackgroundResource(R.drawable.color_azorius)
                button_commander_color31.text = ""
            }
            "boros" -> {
                color1("#b9641e","#d37920")
                button_commander_color31.setBackgroundResource(R.drawable.color_boros)
                button_commander_color31.text = ""
            }
            "dimir" -> {
                color1("#04045e","#08157d")
                button_commander_color31.setBackgroundResource(R.drawable.color_dimir)
                button_commander_color31.text = ""
            }
            "golgari" -> {
                color1("#023d0b","#075605")
                button_commander_color31.setBackgroundResource(R.drawable.color_golgari)
                button_commander_color31.text = ""
            }
            "gruul" -> {
                color1("#4b1905","#5b1d04")
                button_commander_color31.setBackgroundResource(R.drawable.color_gruul)
                button_commander_color31.text = ""
            }
            "izzet" -> {
                color1("#110b50","#1a036d")
                button_commander_color31.setBackgroundResource(R.drawable.color_izzet)
                button_commander_color31.text = ""
            }
            "orzhov" -> {
                color1("#3f3942","#594e5f")
                button_commander_color31.setBackgroundResource(R.drawable.color_orzhov)
                button_commander_color31.text = ""
            }
            "rakdos" -> {
                color1("#5b0505","#420807")
                button_commander_color31.setBackgroundResource(R.drawable.color_rakdos)
                button_commander_color31.text = ""
            }
            "selesnya" -> {
                color1("#72c767","#8fdd85")
                button_commander_color31.setBackgroundResource(R.drawable.color_selesnya)
                button_commander_color31.text = ""
            }
            "simic" -> {
                color1("#108360","#11a376")
                button_commander_color31.setBackgroundResource(R.drawable.color_simic)
                button_commander_color31.text = ""
            }
            "abzan" -> {
                color1("#4d7057","#7da88a")
                button_commander_color31.setBackgroundResource(R.drawable.color_abzan)
                button_commander_color31.text = ""
            }
            "bant" -> {
                color1("#3b9d81","#5fae98")
                button_commander_color31.setBackgroundResource(R.drawable.color_bant)
                button_commander_color31.text = ""
            }
            "esper" -> {
                color1("#4a3672","#65518c")
                button_commander_color31.setBackgroundResource(R.drawable.color_esper)
                button_commander_color31.text = ""
            }
            "grixis" -> {
                color1("#230c4f","#350a7d")
                button_commander_color31.setBackgroundResource(R.drawable.color_grixis)
                button_commander_color31.text = ""
            }
            "jeskai" -> {
                color1("#f4b483","#fcd3b3")
                button_commander_color31.setBackgroundResource(R.drawable.color_jeskai)
                button_commander_color31.text = ""
            }
            "jund" -> {
                color1("#671309","#561008")
                button_commander_color31.setBackgroundResource(R.drawable.color_jund)
                button_commander_color31.text = ""
            }
            "mardu" -> {
                color1("#694747","#7e5656")
                button_commander_color31.setBackgroundResource(R.drawable.color_mardu)
                button_commander_color31.text = ""
            }
            "naya" -> {
                color1("#c9ac18","#b39e0f")
                button_commander_color31.setBackgroundResource(R.drawable.color_naya)
                button_commander_color31.text = ""
            }
            "sultai" -> {
                color1("#334f3f","#3f604d")
                button_commander_color31.setBackgroundResource(R.drawable.color_sultai)
                button_commander_color31.text = ""
            }
            "temur" -> {
                color1("#5f6119","#6b6d19")
                button_commander_color31.setBackgroundResource(R.drawable.color_temur)
                button_commander_color31.text = ""
            }
            "dune" -> {
                color1("#4f4427","#806e40")
                button_commander_color31.setBackgroundResource(R.drawable.color_dune)
                button_commander_color31.text = ""
            }
            "ink" -> {
                color1("#546e54","#719571")
                button_commander_color31.setBackgroundResource(R.drawable.color_ink)
                button_commander_color31.text = ""
            }
            "glint" -> {
                color1("#333223","#403f2b")
                button_commander_color31.setBackgroundResource(R.drawable.color_glint)
                button_commander_color31.text = ""
            }
            "witch" -> {
                color1("#285852","#3c7f76")
                button_commander_color31.setBackgroundResource(R.drawable.color_witch)
                button_commander_color31.text = ""
            }
            "yore" -> {
                color1("#514951","#777077")
                button_commander_color31.setBackgroundResource(R.drawable.color_yore)
                button_commander_color31.text = ""
            }
            "five" -> {
                color1("#5a394b","#80526c")
                button_commander_color31.setBackgroundResource(R.drawable.color_5color)
                button_commander_color31.text = ""
            }
        }

        fun color2(color : String, bColor : String) {
            commander3_2.setBackgroundColor(Color.parseColor(bColor))
            buttonAdd32.setBackgroundColor(Color.parseColor(color))
            buttonRemove32.setBackgroundColor(Color.parseColor(color))
            buttonComTaxAdd32.setBackgroundColor(Color.parseColor(color))
            buttonComTaxRemove32.setBackgroundColor(Color.parseColor(color))
            buttonResetCom32.setBackgroundColor(Color.parseColor(color))
            button_monarch32.text = "♛"
            button_monarch32.setBackgroundColor(Color.parseColor(color))
            button_city32.text = "⛯"
            button_city32.setBackgroundColor(Color.parseColor(color))
            hp2 = 40
            textViewHp32.text = "40"
            textViewHp32.setBackgroundResource(0)
            comTax2 = 0
            textViewComTaxCount32.text = "0"
            textViewComTaxCount32.setBackgroundResource(0)
        }

        val color2 = intent.getStringExtra("Color32")
        cmdrColor32.text = color2

        when (cmdrColor32.text.toString()) {
            "white" -> {
                color2("#e6e3ba","#d3d3c9")
                button_commander_color32.setBackgroundResource(R.drawable.color_monowhite)
                button_commander_color32.text = ""
            }
            "blue" -> {
                color2("#0a67bf","#2680d6")
                button_commander_color32.setBackgroundResource(R.drawable.color_monoblue)
                button_commander_color32.text = ""
            }
            "black" -> {
                color2("#282829","#3b3b3c")
                button_commander_color32.setBackgroundResource(R.drawable.color_monoblack)
                button_commander_color32.text = ""
            }
            "red" -> {
                color2("#b01c1c","#de1d1d")
                button_commander_color32.setBackgroundResource(R.drawable.color_monored)
                button_commander_color32.text = ""
            }
            "green" -> {
                color2("#04750c","#1aa027")
                button_commander_color32.setBackgroundResource(R.drawable.color_monogreen)
                button_commander_color32.text = ""
            }
            "colorless" -> {
                commander3_2.setBackgroundResource(R.drawable.bg_colorless)
                button_commander_color32.setBackgroundResource(R.drawable.color_colorless)
                button_commander_color32.text = ""
            }
            "azorius" -> {
                color2("#3ea0cf","#8bd5f8")
                button_commander_color32.setBackgroundResource(R.drawable.color_azorius)
                button_commander_color32.text = ""
            }
            "boros" -> {
                color2("#b9641e","#d37920")
                button_commander_color32.setBackgroundResource(R.drawable.color_boros)
                button_commander_color32.text = ""
            }
            "dimir" -> {
                color2("#04045e","#08157d")
                button_commander_color32.setBackgroundResource(R.drawable.color_dimir)
                button_commander_color32.text = ""
            }
            "golgari" -> {
                color2("#023d0b","#075605")
                button_commander_color32.setBackgroundResource(R.drawable.color_golgari)
                button_commander_color32.text = ""
            }
            "gruul" -> {
                color2("#4b1905","#5b1d04")
                button_commander_color32.setBackgroundResource(R.drawable.color_gruul)
                button_commander_color32.text = ""
            }
            "izzet" -> {
                color2("#110b50","#1a036d")
                button_commander_color32.setBackgroundResource(R.drawable.color_izzet)
                button_commander_color32.text = ""
            }
            "orzhov" -> {
                color2("#3f3942","#594e5f")
                button_commander_color32.setBackgroundResource(R.drawable.color_orzhov)
                button_commander_color32.text = ""
            }
            "rakdos" -> {
                color2("#5b0505","#420807")
                button_commander_color32.setBackgroundResource(R.drawable.color_rakdos)
                button_commander_color32.text = ""
            }
            "selesnya" -> {
                color2("#72c767","#8fdd85")
                button_commander_color32.setBackgroundResource(R.drawable.color_selesnya)
                button_commander_color32.text = ""
            }
            "simic" -> {
                color2("#108360","#11a376")
                button_commander_color32.setBackgroundResource(R.drawable.color_simic)
                button_commander_color32.text = ""
            }
            "abzan" -> {
                color2("#4d7057","#7da88a")
                button_commander_color32.setBackgroundResource(R.drawable.color_abzan)
                button_commander_color32.text = ""
            }
            "bant" -> {
                color2("#3b9d81","#5fae98")
                button_commander_color32.setBackgroundResource(R.drawable.color_bant)
                button_commander_color32.text = ""
            }
            "esper" -> {
                color2("#4a3672","#65518c")
                button_commander_color32.setBackgroundResource(R.drawable.color_esper)
                button_commander_color32.text = ""
            }
            "grixis" -> {
                color2("#230c4f","#350a7d")
                button_commander_color32.setBackgroundResource(R.drawable.color_grixis)
                button_commander_color32.text = ""
            }
            "jeskai" -> {
                color2("#f4b483","#fcd3b3")
                button_commander_color32.setBackgroundResource(R.drawable.color_jeskai)
                button_commander_color32.text = ""
            }
            "jund" -> {
                color2("#671309","#561008")
                button_commander_color32.setBackgroundResource(R.drawable.color_jund)
                button_commander_color32.text = ""
            }
            "mardu" -> {
                color2("#694747","#7e5656")
                button_commander_color32.setBackgroundResource(R.drawable.color_mardu)
                button_commander_color32.text = ""
            }
            "naya" -> {
                color2("#c9ac18","#b39e0f")
                button_commander_color32.setBackgroundResource(R.drawable.color_naya)
                button_commander_color32.text = ""
            }
            "sultai" -> {
                color2("#334f3f","#3f604d")
                button_commander_color32.setBackgroundResource(R.drawable.color_sultai)
                button_commander_color32.text = ""
            }
            "temur" -> {
                color2("#5f6119","#6b6d19")
                button_commander_color32.setBackgroundResource(R.drawable.color_temur)
                button_commander_color32.text = ""
            }
            "dune" -> {
                color2("#4f4427","#806e40")
                button_commander_color32.setBackgroundResource(R.drawable.color_dune)
                button_commander_color32.text = ""
            }
            "ink" -> {
                color2("#546e54","#719571")
                button_commander_color32.setBackgroundResource(R.drawable.color_ink)
                button_commander_color32.text = ""
            }
            "glint" -> {
                color2("#333223","#403f2b")
                button_commander_color32.setBackgroundResource(R.drawable.color_glint)
                button_commander_color32.text = ""
            }
            "witch" -> {
                color2("#285852","#3c7f76")
                button_commander_color32.setBackgroundResource(R.drawable.color_witch)
                button_commander_color32.text = ""
            }
            "yore" -> {
                color2("#514951","#777077")
                button_commander_color32.setBackgroundResource(R.drawable.color_yore)
                button_commander_color32.text = ""
            }
            "five" -> {
                color2("#5a394b","#80526c")
                button_commander_color32.setBackgroundResource(R.drawable.color_5color)
                button_commander_color32.text = ""
            }
        }

        fun color3(color : String, bColor : String) {
            commander3_3.setBackgroundColor(Color.parseColor(bColor))
            buttonAdd33.setBackgroundColor(Color.parseColor(color))
            buttonRemove33.setBackgroundColor(Color.parseColor(color))
            buttonComTaxAdd33.setBackgroundColor(Color.parseColor(color))
            buttonComTaxRemove33.setBackgroundColor(Color.parseColor(color))
            buttonResetCom33.setBackgroundColor(Color.parseColor(color))
            button_monarch33.text = "♛"
            button_monarch33.setBackgroundColor(Color.parseColor(color))
            button_city33.text = "⛯"
            button_city33.setBackgroundColor(Color.parseColor(color))
            hp3 = 40
            textViewHp33.text = "40"
            textViewHp33.setBackgroundResource(0)
            comTax3 = 0
            textViewComTaxCount33.text = "0"
            textViewComTaxCount33.setBackgroundResource(0)
        }

        val color3 = intent.getStringExtra("Color33")
        cmdrColor33.text = color3

        when (cmdrColor33.text.toString()) {
            "white" -> {
                color3("#e6e3ba","#d3d3c9")
                button_commander_color33.setBackgroundResource(R.drawable.color_monowhite)
                button_commander_color33.text = ""
            }
            "blue" -> {
                color3("#0a67bf","#2680d6")
                button_commander_color33.setBackgroundResource(R.drawable.color_monoblue)
                button_commander_color33.text = ""
            }
            "black" -> {
                color3("#282829","#3b3b3c")
                button_commander_color33.setBackgroundResource(R.drawable.color_monoblack)
                button_commander_color33.text = ""
            }
            "red" -> {
                color3("#b01c1c","#de1d1d")
                button_commander_color33.setBackgroundResource(R.drawable.color_monored)
                button_commander_color33.text = ""
            }
            "green" -> {
                color3("#04750c","#1aa027")
                button_commander_color33.setBackgroundResource(R.drawable.color_monogreen)
                button_commander_color33.text = ""
            }
            "colorless" -> {
                commander3_3.setBackgroundResource(R.drawable.bg_colorless)
                button_commander_color33.setBackgroundResource(R.drawable.color_colorless)
                button_commander_color33.text = ""
            }
            "azorius" -> {
                color3("#3ea0cf","#8bd5f8")
                button_commander_color33.setBackgroundResource(R.drawable.color_azorius)
                button_commander_color33.text = ""
            }
            "boros" -> {
                color3("#b9641e","#d37920")
                button_commander_color33.setBackgroundResource(R.drawable.color_boros)
                button_commander_color33.text = ""
            }
            "dimir" -> {
                color3("#04045e","#08157d")
                button_commander_color33.setBackgroundResource(R.drawable.color_dimir)
                button_commander_color33.text = ""
            }
            "golgari" -> {
                color3("#023d0b","#075605")
                button_commander_color33.setBackgroundResource(R.drawable.color_golgari)
                button_commander_color33.text = ""
            }
            "gruul" -> {
                color3("#4b1905","#5b1d04")
                button_commander_color33.setBackgroundResource(R.drawable.color_gruul)
                button_commander_color33.text = ""
            }
            "izzet" -> {
                color3("#110b50","#1a036d")
                button_commander_color33.setBackgroundResource(R.drawable.color_izzet)
                button_commander_color33.text = ""
            }
            "orzhov" -> {
                color3("#3f3942","#594e5f")
                button_commander_color33.setBackgroundResource(R.drawable.color_orzhov)
                button_commander_color33.text = ""
            }
            "rakdos" -> {
                color3("#5b0505","#420807")
                button_commander_color33.setBackgroundResource(R.drawable.color_rakdos)
                button_commander_color33.text = ""
            }
            "selesnya" -> {
                color3("#72c767","#8fdd85")
                button_commander_color33.setBackgroundResource(R.drawable.color_selesnya)
                button_commander_color33.text = ""
            }
            "simic" -> {
                color3("#108360","#11a376")
                button_commander_color33.setBackgroundResource(R.drawable.color_simic)
                button_commander_color33.text = ""
            }
            "abzan" -> {
                color3("#4d7057","#7da88a")
                button_commander_color33.setBackgroundResource(R.drawable.color_abzan)
                button_commander_color33.text = ""
            }
            "bant" -> {
                color3("#3b9d81","#5fae98")
                button_commander_color33.setBackgroundResource(R.drawable.color_bant)
                button_commander_color33.text = ""
            }
            "esper" -> {
                color3("#4a3672","#65518c")
                button_commander_color33.setBackgroundResource(R.drawable.color_esper)
                button_commander_color33.text = ""
            }
            "grixis" -> {
                color3("#230c4f","#350a7d")
                button_commander_color33.setBackgroundResource(R.drawable.color_grixis)
                button_commander_color33.text = ""
            }
            "jeskai" -> {
                color3("#f4b483","#fcd3b3")
                button_commander_color33.setBackgroundResource(R.drawable.color_jeskai)
                button_commander_color33.text = ""
            }
            "jund" -> {
                color3("#671309","#561008")
                button_commander_color33.setBackgroundResource(R.drawable.color_jund)
                button_commander_color33.text = ""
            }
            "mardu" -> {
                color3("#694747","#7e5656")
                button_commander_color33.setBackgroundResource(R.drawable.color_mardu)
                button_commander_color33.text = ""
            }
            "naya" -> {
                color3("#c9ac18","#b39e0f")
                button_commander_color33.setBackgroundResource(R.drawable.color_naya)
                button_commander_color33.text = ""
            }
            "sultai" -> {
                color3("#334f3f","#3f604d")
                button_commander_color33.setBackgroundResource(R.drawable.color_sultai)
                button_commander_color33.text = ""
            }
            "temur" -> {
                color3("#5f6119","#6b6d19")
                button_commander_color33.setBackgroundResource(R.drawable.color_temur)
                button_commander_color33.text = ""
            }
            "dune" -> {
                color3("#4f4427","#806e40")
                button_commander_color33.setBackgroundResource(R.drawable.color_dune)
                button_commander_color33.text = ""
            }
            "ink" -> {
                color3("#546e54","#719571")
                button_commander_color33.setBackgroundResource(R.drawable.color_ink)
                button_commander_color33.text = ""
            }
            "glint" -> {
                color3("#333223","#403f2b")
                button_commander_color33.setBackgroundResource(R.drawable.color_glint)
                button_commander_color33.text = ""
            }
            "witch" -> {
                color3("#285852","#3c7f76")
                button_commander_color33.setBackgroundResource(R.drawable.color_witch)
                button_commander_color33.text = ""
            }
            "yore" -> {
                color3("#514951","#777077")
                button_commander_color33.setBackgroundResource(R.drawable.color_yore)
                button_commander_color33.text = ""
            }
            "five" -> {
                color3("#5a394b","#80526c")
                button_commander_color33.setBackgroundResource(R.drawable.color_5color)
                button_commander_color33.text = ""
            }
        }
    }

    fun addHp(view: View){
        hp++
        textViewHp31.text = "$hp"
    }

    fun removeHp(view: View){
        hp--
        textViewHp31.text = "$hp"
        if(textViewHp31.text == "0"){
            commander3_1.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color31.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color31.text = ""
            buttonAdd31.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonRemove31.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxAdd31.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxRemove31.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonResetCom31.setBackgroundColor(Color.parseColor("#4C4949"))
            textViewHp31.setBackgroundColor(Color.parseColor("#5a5c5a"))
            textViewComTaxCount31.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_monarch31.text = "♛"
            button_monarch31.setBackgroundColor(Color.parseColor("#4C4949"))
            button_city31.text = "⛯"
            button_city31.setBackgroundColor(Color.parseColor("#4C4949"))
            button_commander_color31.isEnabled = false
            button_city31.isEnabled = false
            button_monarch31.isEnabled = false
            buttonComTaxAdd31.isEnabled = false
            buttonComTaxRemove31.isEnabled = false
        }
    }

    fun addComTax(view: View) {
        if(comTax < 20){
            comTax += 2
        }
        textViewComTaxCount31.text = "$comTax"
    }

    fun removeComTax(view: View) {
        if(comTax > 0){
            comTax -= 2
        }
        textViewComTaxCount31.text = "$comTax"
    }

    private fun monarchColor(color : String){
        button_monarch31.text = "♛"
        button_monarch31.setBackgroundColor(Color.parseColor(color))
    }

    fun monarch(view: View){
        if(intent.getStringExtra("Monarch") != "1")
        {
            intent.putExtra("Monarch","1")
            button_monarch31.setBackgroundResource(R.drawable.monarch)
            button_monarch31.text = ""
        }
        else
        {
            intent.putExtra("Monarch","0")
            val colorMonarch = intent.getStringExtra("Color31")
            cmdrColor31.text = colorMonarch
            when (cmdrColor31.text.toString()) {
                "white" -> {
                    monarchColor("#e6e3ba")
                }
                "blue" -> {
                    monarchColor("#0a67bf")
                }
                "black" -> {
                    monarchColor("#282829")
                }
                "red" -> {
                    monarchColor("#b01c1c")
                }
                "green" -> {
                    monarchColor("#04750c")
                }
                "azorius" -> {
                    monarchColor("#3ea0cf")
                }
                "boros" -> {
                    monarchColor("#b9641e")
                }
                "dimir" -> {
                    monarchColor("#04045e")
                }
                "golgari" -> {
                    monarchColor("#023d0b")
                }
                "gruul" -> {
                    monarchColor("#4b1905")
                }
                "izzet" -> {
                    monarchColor("#110b50")
                }
                "orzhov" -> {
                    monarchColor("#3f3942")
                }
                "rakdos" -> {
                    monarchColor("#5b0505")
                }
                "selesnya" -> {
                    monarchColor("#72c767")
                }
                "simic" -> {
                    monarchColor("#108360")
                }
                "abzan" -> {
                    monarchColor("#4d7057")
                }
                "bant" -> {
                    monarchColor("#3b9d81")
                }
                "esper" -> {
                    monarchColor("#4a3672")
                }
                "grixis" -> {
                    monarchColor("#230c4f")
                }
                "jeskai" -> {
                    monarchColor("#f4b483")
                }
                "jund" -> {
                    monarchColor("#671309")
                }
                "mardu" -> {
                    monarchColor("#694747")
                }
                "naya" -> {
                    monarchColor("#c9ac18")
                }
                "sultai" -> {
                    monarchColor("#334f3f")
                }
                "temur" -> {
                    monarchColor("#5f6119")
                }
                "dune" -> {
                    monarchColor("#4f4427")
                }
                "ink" -> {
                    monarchColor("#546e54")
                }
                "glint" -> {
                    monarchColor("#333223")
                }
                "witch" -> {
                    monarchColor("#285852")
                }
                "yore" -> {
                    monarchColor("#514951")
                }
                "five" -> {
                    monarchColor("#5a394b")
                }
                else -> {
                    button_monarch31.text = "♛"
                    button_monarch31.setBackgroundColor(Color.parseColor("#4C4949"))
                }
            }
        }
    }

    private fun blessingColor(color : String){
        button_city31.text = "⛯"
        button_city31.setBackgroundColor(Color.parseColor(color))

    }

    fun blessing(view: View){
        if(intent.getStringExtra("City") != "1")
        {
            intent.putExtra("City","1")
            button_city31.setBackgroundResource(R.drawable.c_blessing)
            button_city31.text = ""
        }
        else
        {
            intent.putExtra("City","0")
            val colorCity = intent.getStringExtra("Color31")
            cmdrColor31.text = colorCity
            when (cmdrColor31.text.toString()) {
                "white" -> {
                    blessingColor("#e6e3ba")
                }
                "blue" -> {
                    blessingColor("#0a67bf")
                }
                "black" -> {
                    blessingColor("#282829")
                }
                "red" -> {
                    blessingColor("#b01c1c")
                }
                "green" -> {
                    blessingColor("#04750c")
                }
                "azorius" -> {
                    blessingColor("#3ea0cf")
                }
                "boros" -> {
                    blessingColor("#b9641e")
                }
                "dimir" -> {
                    blessingColor("#04045e")
                }
                "golgari" -> {
                    blessingColor("#023d0b")
                }
                "gruul" -> {
                    blessingColor("#4b1905")
                }
                "izzet" -> {
                    blessingColor("#110b50")
                }
                "orzhov" -> {
                    blessingColor("#3f3942")
                }
                "rakdos" -> {
                    blessingColor("#5b0505")
                }
                "selesnya" -> {
                    blessingColor("#72c767")
                }
                "simic" -> {
                    blessingColor("#108360")
                }
                "abzan" -> {
                    blessingColor("#4d7057")
                }
                "bant" -> {
                    blessingColor("#3b9d81")
                }
                "esper" -> {
                    blessingColor("#4a3672")
                }
                "grixis" -> {
                    blessingColor("#230c4f")
                }
                "jeskai" -> {
                    blessingColor("#f4b483")
                }
                "jund" -> {
                    blessingColor("#671309")
                }
                "mardu" -> {
                    blessingColor("#694747")
                }
                "naya" -> {
                    blessingColor("#c9ac18")
                }
                "sultai" -> {
                    blessingColor("#334f3f")
                }
                "temur" -> {
                    blessingColor("#5f6119")
                }
                "dune" -> {
                    blessingColor("#4f4427")
                }
                "ink" -> {
                    blessingColor("#546e54")
                }
                "glint" -> {
                    blessingColor("#333223")
                }
                "witch" -> {
                    blessingColor("#285852")
                }
                "yore" -> {
                    blessingColor("#514951")
                }
                "five" -> {
                    blessingColor("#5a394b")
                }
                else -> {
                    button_city31.text = "⛯"
                    button_city31.setBackgroundColor(Color.parseColor("#4C4949"))
                }
            }
        }
    }

    fun resetCom1(view: View){
        hp = 40
        textViewHp31.text = "40"
        textViewHp31.setBackgroundColor(Color.parseColor("#C8C5C5"))
        comTax = 0
        textViewComTaxCount31.text = "0"
        textViewComTaxCount31.setBackgroundColor(Color.parseColor("#C8C5C5"))
        button_commander_color31.text = "C"
        button_commander_color31.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonAdd31.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonRemove31.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxAdd31.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxRemove31.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonResetCom31.setBackgroundColor(Color.parseColor("#4C4949"))
        button_monarch31.text = "♛"
        button_monarch31.setBackgroundColor(Color.parseColor("#4C4949"))
        button_city31.text = "⛯"
        button_city31.setBackgroundColor(Color.parseColor("#4C4949"))
        commander3_1.setBackgroundColor(Color.parseColor("#C8C5C5"))
        commander3_1.setBackgroundResource(0)
        button_commander_color31.isEnabled = true
        button_city31.isEnabled = true
        button_monarch31.isEnabled = true
        buttonComTaxAdd31.isEnabled = true
        buttonComTaxRemove31.isEnabled = true
        intent.putExtra("Color31","")
    }

    fun addHp2(view: View){
        hp2++
        textViewHp32.text = "$hp2"
    }

    fun removeHp2(view: View){
        hp2--
        textViewHp32.text = "$hp2"
        if(textViewHp32.text == "0"){
            commander3_2.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color32.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color32.text = ""
            buttonAdd32.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonRemove32.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxAdd32.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxRemove32.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonResetCom32.setBackgroundColor(Color.parseColor("#4C4949"))
            textViewHp32.setBackgroundColor(Color.parseColor("#5a5c5a"))
            textViewComTaxCount32.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_monarch32.text = "♛"
            button_monarch32.setBackgroundColor(Color.parseColor("#4C4949"))
            button_city32.text = "⛯"
            button_city32.setBackgroundColor(Color.parseColor("#4C4949"))
            button_commander_color32.isEnabled = false
            button_city32.isEnabled = false
            button_monarch32.isEnabled = false
            buttonComTaxAdd32.isEnabled = false
            buttonComTaxRemove32.isEnabled = false
        }
    }

    fun addComTax2(view: View) {
        if(comTax2 < 20){
            comTax2 += 2
        }
        textViewComTaxCount32.text = "$comTax2"
    }

    fun removeComTax2(view: View) {
        if(comTax2 > 0){
            comTax2 -= 2
        }
        textViewComTaxCount32.text = "$comTax2"
    }

    private fun monarchColor2(color : String){
        button_monarch32.text = "♛"
        button_monarch32.setBackgroundColor(Color.parseColor(color))
    }

    fun monarch2(view: View){
        if(intent.getStringExtra("Monarch") != "1")
        {
            intent.putExtra("Monarch","1")
            button_monarch32.setBackgroundResource(R.drawable.monarch)
            button_monarch32.text = ""
        }
        else
        {
            intent.putExtra("Monarch","0")
            val colorMonarch = intent.getStringExtra("Color32")
            cmdrColor32.text = colorMonarch
            when (cmdrColor32.text.toString()) {
                "white" -> {
                    monarchColor2("#e6e3ba")
                }
                "blue" -> {
                    monarchColor2("#0a67bf")
                }
                "black" -> {
                    monarchColor2("#282829")
                }
                "red" -> {
                    monarchColor2("#b01c1c")
                }
                "green" -> {
                    monarchColor2("#04750c")
                }
                "azorius" -> {
                    monarchColor2("#3ea0cf")
                }
                "boros" -> {
                    monarchColor2("#b9641e")
                }
                "dimir" -> {
                    monarchColor2("#04045e")
                }
                "golgari" -> {
                    monarchColor2("#023d0b")
                }
                "gruul" -> {
                    monarchColor2("#4b1905")
                }
                "izzet" -> {
                    monarchColor2("#110b50")
                }
                "orzhov" -> {
                    monarchColor2("#3f3942")
                }
                "rakdos" -> {
                    monarchColor2("#5b0505")
                }
                "selesnya" -> {
                    monarchColor2("#72c767")
                }
                "simic" -> {
                    monarchColor2("#108360")
                }
                "abzan" -> {
                    monarchColor2("#4d7057")
                }
                "bant" -> {
                    monarchColor2("#3b9d81")
                }
                "esper" -> {
                    monarchColor2("#4a3672")
                }
                "grixis" -> {
                    monarchColor2("#230c4f")
                }
                "jeskai" -> {
                    monarchColor2("#f4b483")
                }
                "jund" -> {
                    monarchColor2("#671309")
                }
                "mardu" -> {
                    monarchColor2("#694747")
                }
                "naya" -> {
                    monarchColor2("#c9ac18")
                }
                "sultai" -> {
                    monarchColor2("#334f3f")
                }
                "temur" -> {
                    monarchColor2("#5f6119")
                }
                "dune" -> {
                    monarchColor2("#4f4427")
                }
                "ink" -> {
                    monarchColor2("#546e54")
                }
                "glint" -> {
                    monarchColor2("#333223")
                }
                "witch" -> {
                    monarchColor2("#285852")
                }
                "yore" -> {
                    monarchColor2("#514951")
                }
                "five" -> {
                    monarchColor2("#5a394b")
                }
                else -> {
                    button_monarch32.text = "♛"
                    button_monarch32.setBackgroundColor(Color.parseColor("#4C4949"))
                }
            }
        }
    }

    private fun blessingColor2(color : String){
        button_city32.text = "⛯"
        button_city32.setBackgroundColor(Color.parseColor(color))

    }

    fun blessing2(view: View){
        if(intent.getStringExtra("City") != "1")
        {
            intent.putExtra("City","1")
            button_city32.setBackgroundResource(R.drawable.c_blessing)
            button_city32.text = ""
        }
        else
        {
            intent.putExtra("City","0")
            val colorCity = intent.getStringExtra("Color32")
            cmdrColor32.text = colorCity
            when (cmdrColor32.text.toString()) {
                "white" -> {
                    blessingColor2("#e6e3ba")
                }
                "blue" -> {
                    blessingColor2("#0a67bf")
                }
                "black" -> {
                    blessingColor2("#282829")
                }
                "red" -> {
                    blessingColor2("#b01c1c")
                }
                "green" -> {
                    blessingColor2("#04750c")
                }
                "azorius" -> {
                    blessingColor2("#3ea0cf")
                }
                "boros" -> {
                    blessingColor2("#b9641e")
                }
                "dimir" -> {
                    blessingColor2("#04045e")
                }
                "golgari" -> {
                    blessingColor2("#023d0b")
                }
                "gruul" -> {
                    blessingColor2("#4b1905")
                }
                "izzet" -> {
                    blessingColor2("#110b50")
                }
                "orzhov" -> {
                    blessingColor2("#3f3942")
                }
                "rakdos" -> {
                    blessingColor2("#5b0505")
                }
                "selesnya" -> {
                    blessingColor2("#72c767")
                }
                "simic" -> {
                    blessingColor2("#108360")
                }
                "abzan" -> {
                    blessingColor2("#4d7057")
                }
                "bant" -> {
                    blessingColor2("#3b9d81")
                }
                "esper" -> {
                    blessingColor2("#4a3672")
                }
                "grixis" -> {
                    blessingColor2("#230c4f")
                }
                "jeskai" -> {
                    blessingColor2("#f4b483")
                }
                "jund" -> {
                    blessingColor2("#671309")
                }
                "mardu" -> {
                    blessingColor2("#694747")
                }
                "naya" -> {
                    blessingColor2("#c9ac18")
                }
                "sultai" -> {
                    blessingColor2("#334f3f")
                }
                "temur" -> {
                    blessingColor2("#5f6119")
                }
                "dune" -> {
                    blessingColor2("#4f4427")
                }
                "ink" -> {
                    blessingColor2("#546e54")
                }
                "glint" -> {
                    blessingColor2("#333223")
                }
                "witch" -> {
                    blessingColor2("#285852")
                }
                "yore" -> {
                    blessingColor2("#514951")
                }
                "five" -> {
                    blessingColor2("#5a394b")
                }
                else -> {
                    button_city32.text = "⛯"
                    button_city32.setBackgroundColor(Color.parseColor("#4C4949"))
                }
            }
        }
    }

    fun resetCom2(view: View){
        hp2 = 40
        textViewHp32.text = "40"
        textViewHp32.setBackgroundColor(Color.parseColor("#C8C5C5"))
        comTax2 = 0
        textViewComTaxCount32.text = "0"
        textViewComTaxCount32.setBackgroundColor(Color.parseColor("#C8C5C5"))
        button_commander_color32.text = "C"
        button_commander_color32.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonAdd32.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonRemove32.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxAdd32.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxRemove32.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonResetCom32.setBackgroundColor(Color.parseColor("#4C4949"))
        button_monarch32.text = "♛"
        button_monarch32.setBackgroundColor(Color.parseColor("#4C4949"))
        button_city32.text = "⛯"
        button_city32.setBackgroundColor(Color.parseColor("#4C4949"))
        commander3_2.setBackgroundColor(Color.parseColor("#C8C5C5"))
        commander3_2.setBackgroundResource(0)
        button_commander_color32.isEnabled = true
        button_city32.isEnabled = true
        button_monarch32.isEnabled = true
        buttonComTaxAdd32.isEnabled = true
        buttonComTaxRemove32.isEnabled = true
        intent.putExtra("Color32","")
    }

    fun addHp3(view: View){
        hp3++
        textViewHp33.text = "$hp3"
    }

    fun removeHp3(view: View){
        hp3--
        textViewHp33.text = "$hp3"
        if(textViewHp33.text == "0"){
            commander3_3.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color33.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color33.text = ""
            buttonAdd33.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonRemove33.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxAdd33.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxRemove33.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonResetCom33.setBackgroundColor(Color.parseColor("#4C4949"))
            textViewHp33.setBackgroundColor(Color.parseColor("#5a5c5a"))
            textViewComTaxCount32.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_monarch33.text = "♛"
            button_monarch33.setBackgroundColor(Color.parseColor("#4C4949"))
            button_city33.text = "⛯"
            button_city33.setBackgroundColor(Color.parseColor("#4C4949"))
            button_commander_color33.isEnabled = false
            button_city33.isEnabled = false
            button_monarch33.isEnabled = false
            buttonComTaxAdd33.isEnabled = false
            buttonComTaxRemove33.isEnabled = false
        }
    }

    fun addComTax3(view: View) {
        if(comTax3 < 20){
            comTax3 += 2
        }
        textViewComTaxCount33.text = "$comTax3"
    }

    fun removeComTax3(view: View) {
        if(comTax3 > 0){
            comTax3 -= 2
        }
        textViewComTaxCount33.text = "$comTax3"
    }

    private fun monarchColor3(color : String){
        button_monarch33.text = "♛"
        button_monarch33.setBackgroundColor(Color.parseColor(color))
    }

    fun monarch3(view: View){
        if(intent.getStringExtra("Monarch") != "1")
        {
            intent.putExtra("Monarch","1")
            button_monarch33.setBackgroundResource(R.drawable.monarch)
            button_monarch33.text = ""
        }
        else
        {
            intent.putExtra("Monarch","0")
            val colorMonarch = intent.getStringExtra("Color33")
            cmdrColor33.text = colorMonarch
            when (cmdrColor33.text.toString()) {
                "white" -> {
                    monarchColor3("#e6e3ba")
                }
                "blue" -> {
                    monarchColor3("#0a67bf")
                }
                "black" -> {
                    monarchColor3("#282829")
                }
                "red" -> {
                    monarchColor3("#b01c1c")
                }
                "green" -> {
                    monarchColor3("#04750c")
                }
                "azorius" -> {
                    monarchColor3("#3ea0cf")
                }
                "boros" -> {
                    monarchColor3("#b9641e")
                }
                "dimir" -> {
                    monarchColor3("#04045e")
                }
                "golgari" -> {
                    monarchColor3("#023d0b")
                }
                "gruul" -> {
                    monarchColor3("#4b1905")
                }
                "izzet" -> {
                    monarchColor3("#110b50")
                }
                "orzhov" -> {
                    monarchColor3("#3f3942")
                }
                "rakdos" -> {
                    monarchColor3("#5b0505")
                }
                "selesnya" -> {
                    monarchColor3("#72c767")
                }
                "simic" -> {
                    monarchColor3("#108360")
                }
                "abzan" -> {
                    monarchColor3("#4d7057")
                }
                "bant" -> {
                    monarchColor3("#3b9d81")
                }
                "esper" -> {
                    monarchColor3("#4a3672")
                }
                "grixis" -> {
                    monarchColor3("#230c4f")
                }
                "jeskai" -> {
                    monarchColor3("#f4b483")
                }
                "jund" -> {
                    monarchColor3("#671309")
                }
                "mardu" -> {
                    monarchColor3("#694747")
                }
                "naya" -> {
                    monarchColor3("#c9ac18")
                }
                "sultai" -> {
                    monarchColor3("#334f3f")
                }
                "temur" -> {
                    monarchColor3("#5f6119")
                }
                "dune" -> {
                    monarchColor3("#4f4427")
                }
                "ink" -> {
                    monarchColor3("#546e54")
                }
                "glint" -> {
                    monarchColor3("#333223")
                }
                "witch" -> {
                    monarchColor3("#285852")
                }
                "yore" -> {
                    monarchColor3("#514951")
                }
                "five" -> {
                    monarchColor3("#5a394b")
                }
                else -> {
                    button_monarch33.text = "♛"
                    button_monarch33.setBackgroundColor(Color.parseColor("#4C4949"))
                }
            }
        }
    }

    private fun blessingColor3(color : String){
        button_city33.text = "⛯"
        button_city33.setBackgroundColor(Color.parseColor(color))

    }

    fun blessing3(view: View){
        if(intent.getStringExtra("City") != "1")
        {
            intent.putExtra("City","1")
            button_city33.setBackgroundResource(R.drawable.c_blessing)
            button_city33.text = ""
        }
        else
        {
            intent.putExtra("City","0")
            val colorCity = intent.getStringExtra("Color33")
            cmdrColor33.text = colorCity
            when (cmdrColor33.text.toString()) {
                "white" -> {
                    blessingColor3("#e6e3ba")
                }
                "blue" -> {
                    blessingColor3("#0a67bf")
                }
                "black" -> {
                    blessingColor3("#282829")
                }
                "red" -> {
                    blessingColor3("#b01c1c")
                }
                "green" -> {
                    blessingColor3("#04750c")
                }
                "azorius" -> {
                    blessingColor3("#3ea0cf")
                }
                "boros" -> {
                    blessingColor3("#b9641e")
                }
                "dimir" -> {
                    blessingColor3("#04045e")
                }
                "golgari" -> {
                    blessingColor3("#023d0b")
                }
                "gruul" -> {
                    blessingColor3("#4b1905")
                }
                "izzet" -> {
                    blessingColor3("#110b50")
                }
                "orzhov" -> {
                    blessingColor3("#3f3942")
                }
                "rakdos" -> {
                    blessingColor3("#5b0505")
                }
                "selesnya" -> {
                    blessingColor3("#72c767")
                }
                "simic" -> {
                    blessingColor3("#108360")
                }
                "abzan" -> {
                    blessingColor3("#4d7057")
                }
                "bant" -> {
                    blessingColor3("#3b9d81")
                }
                "esper" -> {
                    blessingColor3("#4a3672")
                }
                "grixis" -> {
                    blessingColor3("#230c4f")
                }
                "jeskai" -> {
                    blessingColor3("#f4b483")
                }
                "jund" -> {
                    blessingColor3("#671309")
                }
                "mardu" -> {
                    blessingColor3("#694747")
                }
                "naya" -> {
                    blessingColor3("#c9ac18")
                }
                "sultai" -> {
                    blessingColor3("#334f3f")
                }
                "temur" -> {
                    blessingColor3("#5f6119")
                }
                "dune" -> {
                    blessingColor3("#4f4427")
                }
                "ink" -> {
                    blessingColor3("#546e54")
                }
                "glint" -> {
                    blessingColor3("#333223")
                }
                "witch" -> {
                    blessingColor3("#285852")
                }
                "yore" -> {
                    blessingColor3("#514951")
                }
                "five" -> {
                    blessingColor3("#5a394b")
                }
                else -> {
                    button_city33.text = "⛯"
                    button_city33.setBackgroundColor(Color.parseColor("#4C4949"))
                }
            }
        }
    }

    fun resetCom3(view: View){
        hp3 = 40
        textViewHp33.text = "40"
        textViewHp33.setBackgroundColor(Color.parseColor("#C8C5C5"))
        comTax3 = 0
        textViewComTaxCount33.text = "0"
        textViewComTaxCount33.setBackgroundColor(Color.parseColor("#C8C5C5"))
        button_commander_color33.text = "C"
        button_commander_color33.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonAdd33.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonRemove33.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxAdd33.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxRemove33.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonResetCom33.setBackgroundColor(Color.parseColor("#4C4949"))
        button_monarch33.text = "♛"
        button_monarch33.setBackgroundColor(Color.parseColor("#4C4949"))
        button_city33.text = "⛯"
        button_city33.setBackgroundColor(Color.parseColor("#4C4949"))
        commander3_3.setBackgroundColor(Color.parseColor("#C8C5C5"))
        commander3_3.setBackgroundResource(0)
        button_commander_color33.isEnabled = true
        button_city33.isEnabled = true
        button_monarch33.isEnabled = true
        buttonComTaxAdd33.isEnabled = true
        buttonComTaxRemove33.isEnabled = true
        intent.putExtra("Color33","")
    }



}