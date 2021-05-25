package com.example.mtgedh

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_players_four.*
import kotlinx.android.synthetic.main.activity_players_four.buttonReturn
import kotlinx.android.synthetic.main.activity_players_three.*
import kotlinx.android.synthetic.main.activity_players_two.*


class PlayersFour : AppCompatActivity() {

    private var hp = 40
    private var comTax = 0
    private var hp2 = 40
    private var comTax2 = 0
    private var hp3 = 40
    private var comTax3 = 0
    private var hp4 = 40
    private var comTax4 = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_players_four)




        buttonReturn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }

        button_commander_color41.setOnClickListener {
            val i3 = Intent(this, ColorIdentityFour::class.java)
            i3.putExtra("Color42", intent.getStringExtra("Color42"))
            i3.putExtra("Color43", intent.getStringExtra("Color43"))
            i3.putExtra("Color44", intent.getStringExtra("Color44"))
            startActivity(i3)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }

        button_commander_color42.setOnClickListener {
            val i3 = Intent(this, ColorIdentityFour2::class.java)
            i3.putExtra("Color41", intent.getStringExtra("Color41"))
            i3.putExtra("Color43", intent.getStringExtra("Color43"))
            i3.putExtra("Color44", intent.getStringExtra("Color44"))
            startActivity(i3)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }

        button_commander_color43.setOnClickListener {
            val i3 = Intent(this, ColorIdentityFour3::class.java)
            i3.putExtra("Color41", intent.getStringExtra("Color41"))
            i3.putExtra("Color42", intent.getStringExtra("Color42"))
            i3.putExtra("Color44", intent.getStringExtra("Color44"))
            startActivity(i3)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        button_commander_color44.setOnClickListener {
            val i3 = Intent(this, ColorIdentityFour4::class.java)
            i3.putExtra("Color41", intent.getStringExtra("Color41"))
            i3.putExtra("Color42", intent.getStringExtra("Color42"))
            i3.putExtra("Color43", intent.getStringExtra("Color43"))
            startActivity(i3)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        val intent = intent

        fun color1(color : String, bColor : String) {
            commander4_1.setBackgroundColor(Color.parseColor(bColor))
            buttonAdd41.setBackgroundColor(Color.parseColor(color))
            buttonRemove41.setBackgroundColor(Color.parseColor(color))
            buttonComTaxAdd41.setBackgroundColor(Color.parseColor(color))
            buttonComTaxRemove41.setBackgroundColor(Color.parseColor(color))
            buttonResetCom41.setBackgroundColor(Color.parseColor(color))
            button_monarch41.text = "♛"
            button_monarch41.setBackgroundColor(Color.parseColor(color))
            button_city41.text = "⛯"
            button_city41.setBackgroundColor(Color.parseColor(color))
            hp = 40
            textViewHp41.text = "40"
            textViewHp41.setBackgroundResource(0)
            comTax = 0
            textViewComTaxCount41.text = "0"
            textViewComTaxCount41.setBackgroundResource(0)
        }

        val color = intent.getStringExtra("Color41")
        cmdrColor41.text = color

        when (cmdrColor41.text.toString()) {
            "white" -> {
                color1("#e6e3ba","#d3d3c9")
                button_commander_color41.setBackgroundResource(R.drawable.color_monowhite)
                button_commander_color41.text = ""
            }
            "blue" -> {
                color1("#0a67bf","#2680d6")
                button_commander_color41.setBackgroundResource(R.drawable.color_monoblue)
                button_commander_color41.text = ""
            }
            "black" -> {
                color1("#282829","#3b3b3c")
                button_commander_color41.setBackgroundResource(R.drawable.color_monoblack)
                button_commander_color41.text = ""
            }
            "red" -> {
                color1("#b01c1c","#de1d1d")
                button_commander_color41.setBackgroundResource(R.drawable.color_monored)
                button_commander_color41.text = ""
            }
            "green" -> {
                color1("#04750c","#1aa027")
                button_commander_color41.setBackgroundResource(R.drawable.color_monogreen)
                button_commander_color41.text = ""
            }
            "colorless" -> {
                commander4_1.setBackgroundResource(R.drawable.bg_colorless)
                button_commander_color41.setBackgroundResource(R.drawable.color_colorless)
                button_commander_color41.text = ""
            }
            "azorius" -> {
                color1("#3ea0cf","#8bd5f8")
                button_commander_color41.setBackgroundResource(R.drawable.color_azorius)
                button_commander_color41.text = ""
            }
            "boros" -> {
                color1("#b9641e","#d37920")
                button_commander_color41.setBackgroundResource(R.drawable.color_boros)
                button_commander_color41.text = ""
            }
            "dimir" -> {
                color1("#04045e","#08157d")
                button_commander_color41.setBackgroundResource(R.drawable.color_dimir)
                button_commander_color41.text = ""
            }
            "golgari" -> {
                color1("#023d0b","#075605")
                button_commander_color41.setBackgroundResource(R.drawable.color_golgari)
                button_commander_color41.text = ""
            }
            "gruul" -> {
                color1("#4b1905","#5b1d04")
                button_commander_color41.setBackgroundResource(R.drawable.color_gruul)
                button_commander_color41.text = ""
            }
            "izzet" -> {
                color1("#110b50","#1a036d")
                button_commander_color41.setBackgroundResource(R.drawable.color_izzet)
                button_commander_color41.text = ""
            }
            "orzhov" -> {
                color1("#3f3942","#594e5f")
                button_commander_color41.setBackgroundResource(R.drawable.color_orzhov)
                button_commander_color41.text = ""
            }
            "rakdos" -> {
                color1("#5b0505","#420807")
                button_commander_color41.setBackgroundResource(R.drawable.color_rakdos)
                button_commander_color41.text = ""
            }
            "selesnya" -> {
                color1("#72c767","#8fdd85")
                button_commander_color41.setBackgroundResource(R.drawable.color_selesnya)
                button_commander_color41.text = ""
            }
            "simic" -> {
                color1("#108360","#11a376")
                button_commander_color41.setBackgroundResource(R.drawable.color_simic)
                button_commander_color41.text = ""
            }
            "abzan" -> {
                color1("#4d7057","#7da88a")
                button_commander_color41.setBackgroundResource(R.drawable.color_abzan)
                button_commander_color41.text = ""
            }
            "bant" -> {
                color1("#3b9d81","#5fae98")
                button_commander_color41.setBackgroundResource(R.drawable.color_bant)
                button_commander_color41.text = ""
            }
            "esper" -> {
                color1("#4a3672","#65518c")
                button_commander_color41.setBackgroundResource(R.drawable.color_esper)
                button_commander_color41.text = ""
            }
            "grixis" -> {
                color1("#230c4f","#350a7d")
                button_commander_color41.setBackgroundResource(R.drawable.color_grixis)
                button_commander_color41.text = ""
            }
            "jeskai" -> {
                color1("#f4b483","#fcd3b3")
                button_commander_color41.setBackgroundResource(R.drawable.color_jeskai)
                button_commander_color41.text = ""
            }
            "jund" -> {
                color1("#671309","#561008")
                button_commander_color41.setBackgroundResource(R.drawable.color_jund)
                button_commander_color41.text = ""
            }
            "mardu" -> {
                color1("#694747","#7e5656")
                button_commander_color41.setBackgroundResource(R.drawable.color_mardu)
                button_commander_color41.text = ""
            }
            "naya" -> {
                color1("#c9ac18","#b39e0f")
                button_commander_color41.setBackgroundResource(R.drawable.color_naya)
                button_commander_color41.text = ""
            }
            "sultai" -> {
                color1("#334f3f","#3f604d")
                button_commander_color41.setBackgroundResource(R.drawable.color_sultai)
                button_commander_color41.text = ""
            }
            "temur" -> {
                color1("#5f6119","#6b6d19")
                button_commander_color41.setBackgroundResource(R.drawable.color_temur)
                button_commander_color41.text = ""
            }
            "dune" -> {
                color1("#4f4427","#806e40")
                button_commander_color41.setBackgroundResource(R.drawable.color_dune)
                button_commander_color41.text = ""
            }
            "ink" -> {
                color1("#546e54","#719571")
                button_commander_color41.setBackgroundResource(R.drawable.color_ink)
                button_commander_color41.text = ""
            }
            "glint" -> {
                color1("#333223","#403f2b")
                button_commander_color41.setBackgroundResource(R.drawable.color_glint)
                button_commander_color41.text = ""
            }
            "witch" -> {
                color1("#285852","#3c7f76")
                button_commander_color41.setBackgroundResource(R.drawable.color_witch)
                button_commander_color41.text = ""
            }
            "yore" -> {
                color1("#514951","#777077")
                button_commander_color41.setBackgroundResource(R.drawable.color_yore)
                button_commander_color41.text = ""
            }
            "five" -> {
                color1("#5a394b","#80526c")
                button_commander_color41.setBackgroundResource(R.drawable.color_5color)
                button_commander_color41.text = ""
            }
        }

        fun color2(color : String, bColor : String) {
            commander4_2.setBackgroundColor(Color.parseColor(bColor))
            buttonAdd42.setBackgroundColor(Color.parseColor(color))
            buttonRemove42.setBackgroundColor(Color.parseColor(color))
            buttonComTaxAdd42.setBackgroundColor(Color.parseColor(color))
            buttonComTaxRemove42.setBackgroundColor(Color.parseColor(color))
            buttonResetCom42.setBackgroundColor(Color.parseColor(color))
            button_monarch42.text = "♛"
            button_monarch42.setBackgroundColor(Color.parseColor(color))
            button_city42.text = "⛯"
            button_city42.setBackgroundColor(Color.parseColor(color))
            hp2 = 40
            textViewHp42.text = "40"
            textViewHp42.setBackgroundResource(0)
            comTax2 = 0
            textViewComTaxCount42.text = "0"
            textViewComTaxCount42.setBackgroundResource(0)
        }

        val color2 = intent.getStringExtra("Color42")
        cmdrColor42.text = color2

        when (cmdrColor42.text.toString()) {
            "white" -> {
                color2("#e6e3ba","#d3d3c9")
                button_commander_color42.setBackgroundResource(R.drawable.color_monowhite)
                button_commander_color42.text = ""
            }
            "blue" -> {
                color2("#0a67bf","#2680d6")
                button_commander_color42.setBackgroundResource(R.drawable.color_monoblue)
                button_commander_color42.text = ""
            }
            "black" -> {
                color2("#282829","#3b3b3c")
                button_commander_color42.setBackgroundResource(R.drawable.color_monoblack)
                button_commander_color42.text = ""
            }
            "red" -> {
                color2("#b01c1c","#de1d1d")
                button_commander_color42.setBackgroundResource(R.drawable.color_monored)
                button_commander_color42.text = ""
            }
            "green" -> {
                color2("#04750c","#1aa027")
                button_commander_color42.setBackgroundResource(R.drawable.color_monogreen)
                button_commander_color42.text = ""
            }
            "colorless" -> {
                commander4_2.setBackgroundResource(R.drawable.bg_colorless)
                button_commander_color42.setBackgroundResource(R.drawable.color_colorless)
                button_commander_color42.text = ""
            }
            "azorius" -> {
                color2("#3ea0cf","#8bd5f8")
                button_commander_color42.setBackgroundResource(R.drawable.color_azorius)
                button_commander_color42.text = ""
            }
            "boros" -> {
                color2("#b9641e","#d37920")
                button_commander_color42.setBackgroundResource(R.drawable.color_boros)
                button_commander_color42.text = ""
            }
            "dimir" -> {
                color2("#04045e","#08157d")
                button_commander_color42.setBackgroundResource(R.drawable.color_dimir)
                button_commander_color42.text = ""
            }
            "golgari" -> {
                color2("#023d0b","#075605")
                button_commander_color42.setBackgroundResource(R.drawable.color_golgari)
                button_commander_color42.text = ""
            }
            "gruul" -> {
                color2("#4b1905","#5b1d04")
                button_commander_color42.setBackgroundResource(R.drawable.color_gruul)
                button_commander_color42.text = ""
            }
            "izzet" -> {
                color2("#110b50","#1a036d")
                button_commander_color42.setBackgroundResource(R.drawable.color_izzet)
                button_commander_color42.text = ""
            }
            "orzhov" -> {
                color2("#3f3942","#594e5f")
                button_commander_color42.setBackgroundResource(R.drawable.color_orzhov)
                button_commander_color42.text = ""
            }
            "rakdos" -> {
                color2("#5b0505","#420807")
                button_commander_color42.setBackgroundResource(R.drawable.color_rakdos)
                button_commander_color42.text = ""
            }
            "selesnya" -> {
                color2("#72c767","#8fdd85")
                button_commander_color42.setBackgroundResource(R.drawable.color_selesnya)
                button_commander_color42.text = ""
            }
            "simic" -> {
                color2("#108360","#11a376")
                button_commander_color42.setBackgroundResource(R.drawable.color_simic)
                button_commander_color42.text = ""
            }
            "abzan" -> {
                color2("#4d7057","#7da88a")
                button_commander_color42.setBackgroundResource(R.drawable.color_abzan)
                button_commander_color42.text = ""
            }
            "bant" -> {
                color2("#3b9d81","#5fae98")
                button_commander_color42.setBackgroundResource(R.drawable.color_bant)
                button_commander_color42.text = ""
            }
            "esper" -> {
                color2("#4a3672","#65518c")
                button_commander_color42.setBackgroundResource(R.drawable.color_esper)
                button_commander_color42.text = ""
            }
            "grixis" -> {
                color2("#230c4f","#350a7d")
                button_commander_color42.setBackgroundResource(R.drawable.color_grixis)
                button_commander_color42.text = ""
            }
            "jeskai" -> {
                color2("#f4b483","#fcd3b3")
                button_commander_color42.setBackgroundResource(R.drawable.color_jeskai)
                button_commander_color42.text = ""
            }
            "jund" -> {
                color2("#671309","#561008")
                button_commander_color42.setBackgroundResource(R.drawable.color_jund)
                button_commander_color42.text = ""
            }
            "mardu" -> {
                color2("#694747","#7e5656")
                button_commander_color42.setBackgroundResource(R.drawable.color_mardu)
                button_commander_color42.text = ""
            }
            "naya" -> {
                color2("#c9ac18","#b39e0f")
                button_commander_color42.setBackgroundResource(R.drawable.color_naya)
                button_commander_color42.text = ""
            }
            "sultai" -> {
                color2("#334f3f","#3f604d")
                button_commander_color42.setBackgroundResource(R.drawable.color_sultai)
                button_commander_color42.text = ""
            }
            "temur" -> {
                color2("#5f6119","#6b6d19")
                button_commander_color42.setBackgroundResource(R.drawable.color_temur)
                button_commander_color42.text = ""
            }
            "dune" -> {
                color2("#4f4427","#806e40")
                button_commander_color42.setBackgroundResource(R.drawable.color_dune)
                button_commander_color42.text = ""
            }
            "ink" -> {
                color2("#546e54","#719571")
                button_commander_color42.setBackgroundResource(R.drawable.color_ink)
                button_commander_color42.text = ""
            }
            "glint" -> {
                color2("#333223","#403f2b")
                button_commander_color42.setBackgroundResource(R.drawable.color_glint)
                button_commander_color42.text = ""
            }
            "witch" -> {
                color2("#285852","#3c7f76")
                button_commander_color42.setBackgroundResource(R.drawable.color_witch)
                button_commander_color42.text = ""
            }
            "yore" -> {
                color2("#514951","#777077")
                button_commander_color42.setBackgroundResource(R.drawable.color_yore)
                button_commander_color42.text = ""
            }
            "five" -> {
                color2("#5a394b","#80526c")
                button_commander_color42.setBackgroundResource(R.drawable.color_5color)
                button_commander_color42.text = ""
            }
        }

        fun color3(color : String, bColor : String) {
            commander4_3.setBackgroundColor(Color.parseColor(bColor))
            buttonAdd43.setBackgroundColor(Color.parseColor(color))
            buttonRemove43.setBackgroundColor(Color.parseColor(color))
            buttonComTaxAdd43.setBackgroundColor(Color.parseColor(color))
            buttonComTaxRemove43.setBackgroundColor(Color.parseColor(color))
            buttonResetCom43.setBackgroundColor(Color.parseColor(color))
            button_monarch43.text = "♛"
            button_monarch43.setBackgroundColor(Color.parseColor(color))
            button_city43.text = "⛯"
            button_city43.setBackgroundColor(Color.parseColor(color))
            hp3 = 40
            textViewHp43.text = "40"
            textViewHp43.setBackgroundResource(0)
            comTax3= 0
            textViewComTaxCount43.text = "0"
            textViewComTaxCount43.setBackgroundResource(0)
        }

        val color3 = intent.getStringExtra("Color43")
        cmdrColor43.text = color3

        when (cmdrColor43.text.toString()) {
            "white" -> {
                color3("#e6e3ba","#d3d3c9")
                button_commander_color43.setBackgroundResource(R.drawable.color_monowhite)
                button_commander_color43.text = ""
            }
            "blue" -> {
                color3("#0a67bf","#2680d6")
                button_commander_color43.setBackgroundResource(R.drawable.color_monoblue)
                button_commander_color43.text = ""
            }
            "black" -> {
                color3("#282829","#3b3b3c")
                button_commander_color43.setBackgroundResource(R.drawable.color_monoblack)
                button_commander_color43.text = ""
            }
            "red" -> {
                color3("#b01c1c","#de1d1d")
                button_commander_color43.setBackgroundResource(R.drawable.color_monored)
                button_commander_color43.text = ""
            }
            "green" -> {
                color3("#04750c","#1aa027")
                button_commander_color43.setBackgroundResource(R.drawable.color_monogreen)
                button_commander_color43.text = ""
            }
            "colorless" -> {
                commander4_3.setBackgroundResource(R.drawable.bg_colorless)
                button_commander_color43.setBackgroundResource(R.drawable.color_colorless)
                button_commander_color43.text = ""
            }
            "azorius" -> {
                color3("#3ea0cf","#8bd5f8")
                button_commander_color43.setBackgroundResource(R.drawable.color_azorius)
                button_commander_color43.text = ""
            }
            "boros" -> {
                color3("#b9641e","#d37920")
                button_commander_color43.setBackgroundResource(R.drawable.color_boros)
                button_commander_color43.text = ""
            }
            "dimir" -> {
                color3("#04045e","#08157d")
                button_commander_color43.setBackgroundResource(R.drawable.color_dimir)
                button_commander_color43.text = ""
            }
            "golgari" -> {
                color3("#023d0b","#075605")
                button_commander_color43.setBackgroundResource(R.drawable.color_golgari)
                button_commander_color43.text = ""
            }
            "gruul" -> {
                color3("#4b1905","#5b1d04")
                button_commander_color43.setBackgroundResource(R.drawable.color_gruul)
                button_commander_color43.text = ""
            }
            "izzet" -> {
                color3("#110b50","#1a036d")
                button_commander_color43.setBackgroundResource(R.drawable.color_izzet)
                button_commander_color43.text = ""
            }
            "orzhov" -> {
                color3("#3f3943","#594e5f")
                button_commander_color43.setBackgroundResource(R.drawable.color_orzhov)
                button_commander_color43.text = ""
            }
            "rakdos" -> {
                color3("#5b0505","#430807")
                button_commander_color43.setBackgroundResource(R.drawable.color_rakdos)
                button_commander_color43.text = ""
            }
            "selesnya" -> {
                color3("#72c767","#8fdd85")
                button_commander_color43.setBackgroundResource(R.drawable.color_selesnya)
                button_commander_color43.text = ""
            }
            "simic" -> {
                color3("#108360","#11a376")
                button_commander_color43.setBackgroundResource(R.drawable.color_simic)
                button_commander_color43.text = ""
            }
            "abzan" -> {
                color3("#4d7057","#7da88a")
                button_commander_color43.setBackgroundResource(R.drawable.color_abzan)
                button_commander_color43.text = ""
            }
            "bant" -> {
                color3("#3b9d81","#5fae98")
                button_commander_color43.setBackgroundResource(R.drawable.color_bant)
                button_commander_color43.text = ""
            }
            "esper" -> {
                color3("#4a3672","#65518c")
                button_commander_color43.setBackgroundResource(R.drawable.color_esper)
                button_commander_color43.text = ""
            }
            "grixis" -> {
                color3("#230c4f","#350a7d")
                button_commander_color43.setBackgroundResource(R.drawable.color_grixis)
                button_commander_color43.text = ""
            }
            "jeskai" -> {
                color3("#f4b483","#fcd3b3")
                button_commander_color43.setBackgroundResource(R.drawable.color_jeskai)
                button_commander_color43.text = ""
            }
            "jund" -> {
                color3("#671309","#561008")
                button_commander_color43.setBackgroundResource(R.drawable.color_jund)
                button_commander_color43.text = ""
            }
            "mardu" -> {
                color3("#694747","#7e5656")
                button_commander_color43.setBackgroundResource(R.drawable.color_mardu)
                button_commander_color43.text = ""
            }
            "naya" -> {
                color3("#c9ac18","#b39e0f")
                button_commander_color43.setBackgroundResource(R.drawable.color_naya)
                button_commander_color43.text = ""
            }
            "sultai" -> {
                color3("#334f3f","#3f604d")
                button_commander_color43.setBackgroundResource(R.drawable.color_sultai)
                button_commander_color43.text = ""
            }
            "temur" -> {
                color3("#5f6119","#6b6d19")
                button_commander_color43.setBackgroundResource(R.drawable.color_temur)
                button_commander_color43.text = ""
            }
            "dune" -> {
                color3("#4f4427","#806e40")
                button_commander_color43.setBackgroundResource(R.drawable.color_dune)
                button_commander_color43.text = ""
            }
            "ink" -> {
                color3("#546e54","#719571")
                button_commander_color43.setBackgroundResource(R.drawable.color_ink)
                button_commander_color43.text = ""
            }
            "glint" -> {
                color3("#333223","#403f2b")
                button_commander_color43.setBackgroundResource(R.drawable.color_glint)
                button_commander_color43.text = ""
            }
            "witch" -> {
                color3("#285852","#3c7f76")
                button_commander_color43.setBackgroundResource(R.drawable.color_witch)
                button_commander_color43.text = ""
            }
            "yore" -> {
                color3("#514951","#777077")
                button_commander_color43.setBackgroundResource(R.drawable.color_yore)
                button_commander_color43.text = ""
            }
            "five" -> {
                color3("#5a394b","#80526c")
                button_commander_color43.setBackgroundResource(R.drawable.color_5color)
                button_commander_color43.text = ""
            }
        }

        fun color4(color : String, bColor : String) {
            commander4_4.setBackgroundColor(Color.parseColor(bColor))
            buttonAdd44.setBackgroundColor(Color.parseColor(color))
            buttonRemove44.setBackgroundColor(Color.parseColor(color))
            buttonComTaxAdd44.setBackgroundColor(Color.parseColor(color))
            buttonComTaxRemove44.setBackgroundColor(Color.parseColor(color))
            buttonResetCom44.setBackgroundColor(Color.parseColor(color))
            button_monarch44.text = "♛"
            button_monarch44.setBackgroundColor(Color.parseColor(color))
            button_city44.text = "⛯"
            button_city44.setBackgroundColor(Color.parseColor(color))
            hp4 = 40
            textViewHp44.text = "40"
            textViewHp44.setBackgroundResource(0)
            comTax4 = 0
            textViewComTaxCount44.text = "0"
            textViewComTaxCount44.setBackgroundResource(0)
        }

        val color4 = intent.getStringExtra("Color44")
        cmdrColor44.text = color4

        when (cmdrColor44.text.toString()) {
            "white" -> {
                color4("#e6e3ba","#d3d3c9")
                button_commander_color44.setBackgroundResource(R.drawable.color_monowhite)
                button_commander_color44.text = ""
            }
            "blue" -> {
                color4("#0a67bf","#2680d6")
                button_commander_color44.setBackgroundResource(R.drawable.color_monoblue)
                button_commander_color44.text = ""
            }
            "black" -> {
                color4("#282829","#3b3b3c")
                button_commander_color44.setBackgroundResource(R.drawable.color_monoblack)
                button_commander_color44.text = ""
            }
            "red" -> {
                color4("#b01c1c","#de1d1d")
                button_commander_color44.setBackgroundResource(R.drawable.color_monored)
                button_commander_color44.text = ""
            }
            "green" -> {
                color4("#04750c","#1aa027")
                button_commander_color44.setBackgroundResource(R.drawable.color_monogreen)
                button_commander_color44.text = ""
            }
            "colorless" -> {
                commander4_4.setBackgroundResource(R.drawable.bg_colorless)
                button_commander_color44.setBackgroundResource(R.drawable.color_colorless)
                button_commander_color44.text = ""
            }
            "azorius" -> {
                color4("#3ea0cf","#8bd5f8")
                button_commander_color44.setBackgroundResource(R.drawable.color_azorius)
                button_commander_color44.text = ""
            }
            "boros" -> {
                color4("#b9641e","#d37920")
                button_commander_color44.setBackgroundResource(R.drawable.color_boros)
                button_commander_color44.text = ""
            }
            "dimir" -> {
                color4("#04045e","#08157d")
                button_commander_color44.setBackgroundResource(R.drawable.color_dimir)
                button_commander_color44.text = ""
            }
            "golgari" -> {
                color4("#023d0b","#075605")
                button_commander_color44.setBackgroundResource(R.drawable.color_golgari)
                button_commander_color44.text = ""
            }
            "gruul" -> {
                color4("#4b1905","#5b1d04")
                button_commander_color44.setBackgroundResource(R.drawable.color_gruul)
                button_commander_color44.text = ""
            }
            "izzet" -> {
                color4("#110b50","#1a036d")
                button_commander_color44.setBackgroundResource(R.drawable.color_izzet)
                button_commander_color44.text = ""
            }
            "orzhov" -> {
                color4("#3f3944","#594e5f")
                button_commander_color44.setBackgroundResource(R.drawable.color_orzhov)
                button_commander_color44.text = ""
            }
            "rakdos" -> {
                color4("#5b0505","#440807")
                button_commander_color44.setBackgroundResource(R.drawable.color_rakdos)
                button_commander_color44.text = ""
            }
            "selesnya" -> {
                color4("#72c767","#8fdd85")
                button_commander_color44.setBackgroundResource(R.drawable.color_selesnya)
                button_commander_color44.text = ""
            }
            "simic" -> {
                color4("#108360","#11a376")
                button_commander_color44.setBackgroundResource(R.drawable.color_simic)
                button_commander_color44.text = ""
            }
            "abzan" -> {
                color4("#4d7057","#7da88a")
                button_commander_color44.setBackgroundResource(R.drawable.color_abzan)
                button_commander_color44.text = ""
            }
            "bant" -> {
                color4("#3b9d81","#5fae98")
                button_commander_color44.setBackgroundResource(R.drawable.color_bant)
                button_commander_color44.text = ""
            }
            "esper" -> {
                color4("#4a3672","#65518c")
                button_commander_color44.setBackgroundResource(R.drawable.color_esper)
                button_commander_color44.text = ""
            }
            "grixis" -> {
                color4("#230c4f","#350a7d")
                button_commander_color44.setBackgroundResource(R.drawable.color_grixis)
                button_commander_color44.text = ""
            }
            "jeskai" -> {
                color4("#f4b483","#fcd3b3")
                button_commander_color44.setBackgroundResource(R.drawable.color_jeskai)
                button_commander_color44.text = ""
            }
            "jund" -> {
                color4("#671309","#561008")
                button_commander_color44.setBackgroundResource(R.drawable.color_jund)
                button_commander_color44.text = ""
            }
            "mardu" -> {
                color4("#694747","#7e5656")
                button_commander_color44.setBackgroundResource(R.drawable.color_mardu)
                button_commander_color44.text = ""
            }
            "naya" -> {
                color4("#c9ac18","#b39e0f")
                button_commander_color44.setBackgroundResource(R.drawable.color_naya)
                button_commander_color44.text = ""
            }
            "sultai" -> {
                color4("#334f3f","#3f604d")
                button_commander_color44.setBackgroundResource(R.drawable.color_sultai)
                button_commander_color44.text = ""
            }
            "temur" -> {
                color4("#5f6119","#6b6d19")
                button_commander_color44.setBackgroundResource(R.drawable.color_temur)
                button_commander_color44.text = ""
            }
            "dune" -> {
                color4("#4f4427","#806e40")
                button_commander_color44.setBackgroundResource(R.drawable.color_dune)
                button_commander_color44.text = ""
            }
            "ink" -> {
                color4("#546e54","#719571")
                button_commander_color44.setBackgroundResource(R.drawable.color_ink)
                button_commander_color44.text = ""
            }
            "glint" -> {
                color4("#333223","#403f2b")
                button_commander_color44.setBackgroundResource(R.drawable.color_glint)
                button_commander_color44.text = ""
            }
            "witch" -> {
                color4("#285852","#3c7f76")
                button_commander_color44.setBackgroundResource(R.drawable.color_witch)
                button_commander_color44.text = ""
            }
            "yore" -> {
                color4("#514951","#777077")
                button_commander_color44.setBackgroundResource(R.drawable.color_yore)
                button_commander_color44.text = ""
            }
            "five" -> {
                color4("#5a394b","#80526c")
                button_commander_color44.setBackgroundResource(R.drawable.color_5color)
                button_commander_color44.text = ""
            }
        }

    }

    fun addHp(view: View){
        hp++
        textViewHp41.text = "$hp"
    }

    fun removeHp(view: View){
        hp--
        textViewHp41.text = "$hp"
        if(textViewHp41.text == "0"){
            commander4_1.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color41.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color41.text = ""
            buttonAdd41.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonRemove41.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxAdd41.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxRemove41.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonResetCom41.setBackgroundColor(Color.parseColor("#4C4949"))
            textViewHp41.setBackgroundColor(Color.parseColor("#5a5c5a"))
            textViewComTaxCount41.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_monarch41.text = "♛"
            button_monarch41.setBackgroundColor(Color.parseColor("#4C4949"))
            button_city41.text = "⛯"
            button_city41.setBackgroundColor(Color.parseColor("#4C4949"))
            button_commander_color41.isEnabled = false
            button_city41.isEnabled = false
            button_monarch41.isEnabled = false
            buttonComTaxAdd41.isEnabled = false
            buttonComTaxRemove41.isEnabled = false
        }
    }

    fun addComTax(view: View) {
        if(comTax < 20){
            comTax += 2
        }
        textViewComTaxCount41.text = "$comTax"
    }

    fun removeComTax(view: View) {
        if(comTax > 0){
            comTax -= 2
        }
        textViewComTaxCount41.text = "$comTax"
    }

    private fun monarchColor(color : String){
        button_monarch41.text = "♛"
        button_monarch41.setBackgroundColor(Color.parseColor(color))
    }

    fun monarch1(view: View){
        if(intent.getStringExtra("Monarch") != "1")
        {
            intent.putExtra("Monarch","1")
            button_monarch41.setBackgroundResource(R.drawable.monarch)
            button_monarch41.text = ""
        }
        else
        {
            intent.putExtra("Monarch","0")
            val colorMonarch = intent.getStringExtra("Color41")
            cmdrColor41.text = colorMonarch
            when (cmdrColor41.text.toString()) {
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
                    button_monarch41.text = "♛"
                    button_monarch41.setBackgroundColor(Color.parseColor("#4C4949"))
                }
            }
        }
    }

    private fun blessingColor(color : String){
        button_city41.text = "⛯"
        button_city41.setBackgroundColor(Color.parseColor(color))

    }

    fun blessing1(view: View){
        if(intent.getStringExtra("City") != "1")
        {
            intent.putExtra("City","1")
            button_city41.setBackgroundResource(R.drawable.c_blessing)
            button_city41.text = ""
        }
        else
        {
            intent.putExtra("City","0")
            val colorCity = intent.getStringExtra("Color41")
            cmdrColor41.text = colorCity
            when (cmdrColor41.text.toString()) {
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
                    button_city41.text = "⛯"
                    button_city41.setBackgroundColor(Color.parseColor("#4C4949"))
                }
            }
        }
    }

    fun resetCom1(view: View){
        hp = 40
        textViewHp41.text = "40"
        textViewHp41.setBackgroundColor(Color.parseColor("#C8C5C5"))
        comTax = 0
        textViewComTaxCount41.text = "0"
        textViewComTaxCount41.setBackgroundColor(Color.parseColor("#C8C5C5"))
        button_commander_color41.text = "C"
        button_commander_color41.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonAdd41.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonRemove41.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxAdd41.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxRemove41.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonResetCom41.setBackgroundColor(Color.parseColor("#4C4949"))
        button_monarch41.text = "♛"
        button_monarch41.setBackgroundColor(Color.parseColor("#4C4949"))
        button_city41.text = "⛯"
        button_city41.setBackgroundColor(Color.parseColor("#4C4949"))
        commander4_1.setBackgroundColor(Color.parseColor("#C8C5C5"))
        commander4_1.setBackgroundResource(0)
        button_commander_color41.isEnabled = true
        button_city41.isEnabled = true
        button_monarch41.isEnabled = true
        buttonComTaxAdd41.isEnabled = true
        buttonComTaxRemove41.isEnabled = true
        intent.putExtra("Color41","")
    }

    fun addHp2(view: View){
        hp2++
        textViewHp42.text = "$hp2"
    }

    fun removeHp2(view: View){
        hp2--
        textViewHp42.text = "$hp2"
        if(textViewHp42.text == "0"){
            commander4_2.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color42.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color42.text = ""
            buttonAdd42.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonRemove42.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxAdd42.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxRemove42.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonResetCom42.setBackgroundColor(Color.parseColor("#4C4949"))
            textViewHp42.setBackgroundColor(Color.parseColor("#5a5c5a"))
            textViewComTaxCount42.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_monarch42.text = "♛"
            button_monarch42.setBackgroundColor(Color.parseColor("#4C4949"))
            button_city42.text = "⛯"
            button_city42.setBackgroundColor(Color.parseColor("#4C4949"))
            button_commander_color42.isEnabled = false
            button_city42.isEnabled = false
            button_monarch42.isEnabled = false
            buttonComTaxAdd42.isEnabled = false
            buttonComTaxRemove42.isEnabled = false
        }
    }

    fun addComTax2(view: View) {
        if(comTax2 < 20){
            comTax2 += 2
        }
        textViewComTaxCount42.text = "$comTax2"
    }

    fun removeComTax2(view: View) {
        if(comTax2 > 0){
            comTax2 -= 2
        }
        textViewComTaxCount42.text = "$comTax2"
    }

    private fun monarchColor2(color : String){
        button_monarch42.text = "♛"
        button_monarch42.setBackgroundColor(Color.parseColor(color))
    }

    fun monarch2(view: View){
        if(intent.getStringExtra("Monarch") != "1")
        {
            intent.putExtra("Monarch","1")
            button_monarch42.setBackgroundResource(R.drawable.monarch)
            button_monarch42.text = ""
        }
        else
        {
            intent.putExtra("Monarch","0")
            val colorMonarch = intent.getStringExtra("Color42")
            cmdrColor42.text = colorMonarch
            when (cmdrColor42.text.toString()) {
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
                    button_monarch42.text = "♛"
                    button_monarch42.setBackgroundColor(Color.parseColor("#4C4949"))
                }
            }
        }
    }

    private fun blessingColor2(color : String){
        button_city42.text = "⛯"
        button_city42.setBackgroundColor(Color.parseColor(color))

    }

    fun blessing2(view: View){
        if(intent.getStringExtra("City") != "1")
        {
            intent.putExtra("City","1")
            button_city42.setBackgroundResource(R.drawable.c_blessing)
            button_city42.text = ""
        }
        else
        {
            intent.putExtra("City","0")
            val colorCity = intent.getStringExtra("Color42")
            cmdrColor42.text = colorCity
            when (cmdrColor42.text.toString()) {
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
                    button_city42.text = "⛯"
                    button_city42.setBackgroundColor(Color.parseColor("#4C4949"))
                }
            }
        }
    }

    fun resetCom2(view: View){
        hp2 = 40
        textViewHp42.text = "40"
        textViewHp42.setBackgroundColor(Color.parseColor("#C8C5C5"))
        comTax2 = 0
        textViewComTaxCount42.text = "0"
        textViewComTaxCount42.setBackgroundColor(Color.parseColor("#C8C5C5"))
        button_commander_color42.text = "C"
        button_commander_color42.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonAdd42.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonRemove42.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxAdd42.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxRemove42.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonResetCom42.setBackgroundColor(Color.parseColor("#4C4949"))
        button_monarch42.text = "♛"
        button_monarch42.setBackgroundColor(Color.parseColor("#4C4949"))
        button_city42.text = "⛯"
        button_city42.setBackgroundColor(Color.parseColor("#4C4949"))
        commander4_2.setBackgroundColor(Color.parseColor("#C8C5C5"))
        commander4_2.setBackgroundResource(0)
        button_commander_color42.isEnabled = true
        button_city42.isEnabled = true
        button_monarch42.isEnabled = true
        buttonComTaxAdd42.isEnabled = true
        buttonComTaxRemove42.isEnabled = true
        intent.putExtra("Color42","")
    }

    fun addHp3(view: View){
        hp3++
        textViewHp43.text = "$hp3"
    }

    fun removeHp3(view: View){
        hp3--
        textViewHp43.text = "$hp3"
        if(textViewHp43.text == "0"){
            commander4_3.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color43.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color43.text = ""
            buttonAdd43.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonRemove43.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxAdd43.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxRemove43.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonResetCom43.setBackgroundColor(Color.parseColor("#4C4949"))
            textViewHp43.setBackgroundColor(Color.parseColor("#5a5c5a"))
            textViewComTaxCount43.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_monarch43.text = "♛"
            button_monarch43.setBackgroundColor(Color.parseColor("#4C4949"))
            button_city43.text = "⛯"
            button_city43.setBackgroundColor(Color.parseColor("#4C4949"))
            button_commander_color43.isEnabled = false
            button_city43.isEnabled = false
            button_monarch43.isEnabled = false
            buttonComTaxAdd43.isEnabled = false
            buttonComTaxRemove43.isEnabled = false
        }
    }

    fun addComTax3(view: View) {
        if(comTax3 < 20){
            comTax3 += 2
        }
        textViewComTaxCount43.text = "$comTax3"
    }

    fun removeComTax3(view: View) {
        if(comTax3 > 0){
            comTax3 -= 2
        }
        textViewComTaxCount43.text = "$comTax3"
    }

    private fun monarchColor3(color : String){
        button_monarch43.text = "♛"
        button_monarch43.setBackgroundColor(Color.parseColor(color))
    }

    fun monarch3(view: View){
        if(intent.getStringExtra("Monarch") != "1")
        {
            intent.putExtra("Monarch","1")
            button_monarch43.setBackgroundResource(R.drawable.monarch)
            button_monarch43.text = ""
        }
        else
        {
            intent.putExtra("Monarch","0")
            val colorMonarch = intent.getStringExtra("Color43")
            cmdrColor43.text = colorMonarch
            when (cmdrColor43.text.toString()) {
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
                    button_monarch43.text = "♛"
                    button_monarch43.setBackgroundColor(Color.parseColor("#4C4949"))
                }
            }
        }
    }

    private fun blessingColor3(color : String){
        button_city43.text = "⛯"
        button_city43.setBackgroundColor(Color.parseColor(color))

    }

    fun blessing3(view: View){
        if(intent.getStringExtra("City") != "1")
        {
            intent.putExtra("City","1")
            button_city43.setBackgroundResource(R.drawable.c_blessing)
            button_city43.text = ""
        }
        else
        {
            intent.putExtra("City","0")
            val colorCity = intent.getStringExtra("Color43")
            cmdrColor43.text = colorCity
            when (cmdrColor43.text.toString()) {
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
                    button_city43.text = "⛯"
                    button_city43.setBackgroundColor(Color.parseColor("#4C4949"))
                }
            }
        }
    }

    fun resetCom3(view: View){
        hp3 = 40
        textViewHp43.text = "40"
        textViewHp43.setBackgroundColor(Color.parseColor("#C8C5C5"))
        comTax3 = 0
        textViewComTaxCount43.text = "0"
        textViewComTaxCount43.setBackgroundColor(Color.parseColor("#C8C5C5"))
        button_commander_color43.text = "C"
        button_commander_color43.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonAdd43.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonRemove43.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxAdd43.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxRemove43.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonResetCom43.setBackgroundColor(Color.parseColor("#4C4949"))
        button_monarch43.text = "♛"
        button_monarch43.setBackgroundColor(Color.parseColor("#4C4949"))
        button_city43.text = "⛯"
        button_city43.setBackgroundColor(Color.parseColor("#4C4949"))
        commander4_3.setBackgroundColor(Color.parseColor("#C8C5C5"))
        commander4_3.setBackgroundResource(0)
        button_commander_color43.isEnabled = true
        button_city43.isEnabled = true
        button_monarch43.isEnabled = true
        buttonComTaxAdd43.isEnabled = true
        buttonComTaxRemove43.isEnabled = true
        intent.putExtra("Color43","")
    }

    fun addHp4(view: View){
        hp4++
        textViewHp44.text = "$hp4"
    }

    fun removeHp4(view: View){
        hp4--
        textViewHp44.text = "$hp4"
        if(textViewHp44.text == "0"){
            commander4_4.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color44.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color44.text = ""
            buttonAdd44.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonRemove44.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxAdd44.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxRemove44.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonResetCom44.setBackgroundColor(Color.parseColor("#4C4949"))
            textViewHp44.setBackgroundColor(Color.parseColor("#5a5c5a"))
            textViewComTaxCount44.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_monarch44.text = "♛"
            button_monarch44.setBackgroundColor(Color.parseColor("#4C4949"))
            button_city44.text = "⛯"
            button_city44.setBackgroundColor(Color.parseColor("#4C4949"))
            button_commander_color44.isEnabled = false
            button_city44.isEnabled = false
            button_monarch44.isEnabled = false
            buttonComTaxAdd44.isEnabled = false
            buttonComTaxRemove44.isEnabled = false
        }
    }

    fun addComTax4(view: View) {
        if(comTax4 < 20){
            comTax4 += 2
        }
        textViewComTaxCount44.text = "$comTax4"
    }

    fun removeComTax4(view: View) {
        if(comTax4 > 0){
            comTax4 -= 2
        }
        textViewComTaxCount44.text = "$comTax4"
    }

    private fun monarchColor4(color : String){
        button_monarch44.text = "♛"
        button_monarch44.setBackgroundColor(Color.parseColor(color))
    }

    fun monarch4(view: View){
        if(intent.getStringExtra("Monarch") != "1")
        {
            intent.putExtra("Monarch","1")
            button_monarch44.setBackgroundResource(R.drawable.monarch)
            button_monarch44.text = ""
        }
        else
        {
            intent.putExtra("Monarch","0")
            val colorMonarch = intent.getStringExtra("Color44")
            cmdrColor44.text = colorMonarch
            when (cmdrColor44.text.toString()) {
                "white" -> {
                    monarchColor4("#e6e3ba")
                }
                "blue" -> {
                    monarchColor4("#0a67bf")
                }
                "black" -> {
                    monarchColor4("#282829")
                }
                "red" -> {
                    monarchColor4("#b01c1c")
                }
                "green" -> {
                    monarchColor4("#04750c")
                }
                "azorius" -> {
                    monarchColor4("#3ea0cf")
                }
                "boros" -> {
                    monarchColor4("#b9641e")
                }
                "dimir" -> {
                    monarchColor4("#04045e")
                }
                "golgari" -> {
                    monarchColor4("#023d0b")
                }
                "gruul" -> {
                    monarchColor4("#4b1905")
                }
                "izzet" -> {
                    monarchColor4("#110b50")
                }
                "orzhov" -> {
                    monarchColor4("#3f3942")
                }
                "rakdos" -> {
                    monarchColor4("#5b0505")
                }
                "selesnya" -> {
                    monarchColor4("#72c767")
                }
                "simic" -> {
                    monarchColor4("#108360")
                }
                "abzan" -> {
                    monarchColor4("#4d7057")
                }
                "bant" -> {
                    monarchColor4("#3b9d81")
                }
                "esper" -> {
                    monarchColor4("#4a3672")
                }
                "grixis" -> {
                    monarchColor4("#230c4f")
                }
                "jeskai" -> {
                    monarchColor4("#f4b483")
                }
                "jund" -> {
                    monarchColor4("#671309")
                }
                "mardu" -> {
                    monarchColor4("#694747")
                }
                "naya" -> {
                    monarchColor4("#c9ac18")
                }
                "sultai" -> {
                    monarchColor4("#334f3f")
                }
                "temur" -> {
                    monarchColor4("#5f6119")
                }
                "dune" -> {
                    monarchColor4("#4f4427")
                }
                "ink" -> {
                    monarchColor4("#546e54")
                }
                "glint" -> {
                    monarchColor4("#333223")
                }
                "witch" -> {
                    monarchColor4("#285852")
                }
                "yore" -> {
                    monarchColor4("#514951")
                }
                "five" -> {
                    monarchColor4("#5a394b")
                }
                else -> {
                    button_monarch44.text = "♛"
                    button_monarch44.setBackgroundColor(Color.parseColor("#4C4949"))
                }
            }
        }
    }

    private fun blessingColor4(color : String){
        button_city44.text = "⛯"
        button_city44.setBackgroundColor(Color.parseColor(color))

    }

    fun blessing4(view: View){
        if(intent.getStringExtra("City") != "1")
        {
            intent.putExtra("City","1")
            button_city44.setBackgroundResource(R.drawable.c_blessing)
            button_city44.text = ""
        }
        else
        {
            intent.putExtra("City","0")
            val colorCity = intent.getStringExtra("Color44")
            cmdrColor44.text = colorCity
            when (cmdrColor44.text.toString()) {
                "white" -> {
                    blessingColor4("#e6e3ba")
                }
                "blue" -> {
                    blessingColor4("#0a67bf")
                }
                "black" -> {
                    blessingColor4("#282829")
                }
                "red" -> {
                    blessingColor4("#b01c1c")
                }
                "green" -> {
                    blessingColor4("#04750c")
                }
                "azorius" -> {
                    blessingColor4("#3ea0cf")
                }
                "boros" -> {
                    blessingColor4("#b9641e")
                }
                "dimir" -> {
                    blessingColor4("#04045e")
                }
                "golgari" -> {
                    blessingColor4("#023d0b")
                }
                "gruul" -> {
                    blessingColor4("#4b1905")
                }
                "izzet" -> {
                    blessingColor4("#110b50")
                }
                "orzhov" -> {
                    blessingColor4("#3f3942")
                }
                "rakdos" -> {
                    blessingColor4("#5b0505")
                }
                "selesnya" -> {
                    blessingColor4("#72c767")
                }
                "simic" -> {
                    blessingColor4("#108360")
                }
                "abzan" -> {
                    blessingColor4("#4d7057")
                }
                "bant" -> {
                    blessingColor4("#3b9d81")
                }
                "esper" -> {
                    blessingColor4("#4a3672")
                }
                "grixis" -> {
                    blessingColor4("#230c4f")
                }
                "jeskai" -> {
                    blessingColor4("#f4b483")
                }
                "jund" -> {
                    blessingColor4("#671309")
                }
                "mardu" -> {
                    blessingColor4("#694747")
                }
                "naya" -> {
                    blessingColor4("#c9ac18")
                }
                "sultai" -> {
                    blessingColor4("#334f3f")
                }
                "temur" -> {
                    blessingColor4("#5f6119")
                }
                "dune" -> {
                    blessingColor4("#4f4427")
                }
                "ink" -> {
                    blessingColor4("#546e54")
                }
                "glint" -> {
                    blessingColor4("#333223")
                }
                "witch" -> {
                    blessingColor4("#285852")
                }
                "yore" -> {
                    blessingColor4("#514951")
                }
                "five" -> {
                    blessingColor4("#5a394b")
                }
                else -> {
                    button_city44.text = "⛯"
                    button_city44.setBackgroundColor(Color.parseColor("#4C4949"))
                }
            }
        }
    }

    fun resetCom4(view: View){
        hp4 = 40
        textViewHp44.text = "40"
        textViewHp44.setBackgroundColor(Color.parseColor("#C8C5C5"))
        comTax4 = 0
        textViewComTaxCount44.text = "0"
        textViewComTaxCount44.setBackgroundColor(Color.parseColor("#C8C5C5"))
        button_commander_color44.text = "C"
        button_commander_color44.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonAdd44.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonRemove44.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxAdd44.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxRemove44.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonResetCom44.setBackgroundColor(Color.parseColor("#4C4949"))
        button_monarch44.text = "♛"
        button_monarch44.setBackgroundColor(Color.parseColor("#4C4949"))
        button_city44.text = "⛯"
        button_city44.setBackgroundColor(Color.parseColor("#4C4949"))
        commander4_4.setBackgroundColor(Color.parseColor("#C8C5C5"))
        commander4_4.setBackgroundResource(0)
        button_commander_color44.isEnabled = true
        button_city44.isEnabled = true
        button_monarch44.isEnabled = true
        buttonComTaxAdd44.isEnabled = true
        buttonComTaxRemove44.isEnabled = true
        intent.putExtra("Color44","")
    }
}