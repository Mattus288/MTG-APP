package com.example.mtgedh

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_players_two.*

class PlayersTwo : AppCompatActivity() {

    private var hp = 40
    private var hp2 = 40
    private var comTax = 0
    private var comTax2 = 0

    @ExperimentalStdlibApi
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_players_two)



        buttonReturn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }
        button_commander_color.setOnClickListener {
            val i = Intent(this, ColorIdentity::class.java)
            i.putExtra("Color2", intent.getStringExtra("Color2"))
            startActivity(i)
            overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom)
        }
        button_commander_color2.setOnClickListener {
            val i = Intent(this, ColorIdentity2::class.java)
            i.putExtra("Color", intent.getStringExtra("Color"))
            startActivity(i)
            overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom)
        }

        val intent = intent

        fun color1(color : String, bColor : String) {
            commander_img1.setBackgroundColor(Color.parseColor(bColor))
            buttonAdd.setBackgroundColor(Color.parseColor(color))
            buttonRemove.setBackgroundColor(Color.parseColor(color))
            buttonComTaxAdd.setBackgroundColor(Color.parseColor(color))
            buttonComTaxRemove.setBackgroundColor(Color.parseColor(color))
            buttonResetCom1.setBackgroundColor(Color.parseColor(color))
            button_monarch.text = "♛"
            button_monarch.setBackgroundColor(Color.parseColor(color))
            button_city.text = "⛯"
            button_city.setBackgroundColor(Color.parseColor(color))
            hp = 40
            textViewHp.text = "40"
            textViewHp.setBackgroundResource(0)
            comTax = 0
            textViewComTaxCount.text = "0"
            textViewComTaxCount.setBackgroundResource(0)
        }

        val color = intent.getStringExtra("Color")
        cmdrColor1.text = color

        when (cmdrColor1.text.toString()) {
            "white" -> {
                color1("#e6e3ba","#d3d3c9")
                button_commander_color.setBackgroundResource(R.drawable.color_monowhite)
                button_commander_color.text = ""
            }
            "blue" -> {
                color1("#0a67bf","#2680d6")
                button_commander_color.setBackgroundResource(R.drawable.color_monoblue)
                button_commander_color.text = ""
            }
            "black" -> {
                color1("#282829","#3b3b3c")
                button_commander_color.setBackgroundResource(R.drawable.color_monoblack)
                button_commander_color.text = ""
            }
            "red" -> {
                color1("#b01c1c","#de1d1d")
                button_commander_color.setBackgroundResource(R.drawable.color_monored)
                button_commander_color.text = ""
            }
            "green" -> {
                color1("#04750c","#1aa027")
                button_commander_color.setBackgroundResource(R.drawable.color_monogreen)
                button_commander_color.text = ""
            }
            "colorless" -> {
                commander_img1.setBackgroundResource(R.drawable.bg_colorless)
                button_commander_color.setBackgroundResource(R.drawable.color_colorless)
                button_commander_color.text = ""
            }
            "azorius" -> {
                color1("#3ea0cf","#8bd5f8")
                button_commander_color.setBackgroundResource(R.drawable.color_azorius)
                button_commander_color.text = ""
            }
            "boros" -> {
                color1("#b9641e","#d37920")
                button_commander_color.setBackgroundResource(R.drawable.color_boros)
                button_commander_color.text = ""
            }
            "dimir" -> {
                color1("#04045e","#08157d")
                button_commander_color.setBackgroundResource(R.drawable.color_dimir)
                button_commander_color.text = ""
            }
            "golgari" -> {
                color1("#023d0b","#075605")
                button_commander_color.setBackgroundResource(R.drawable.color_golgari)
                button_commander_color.text = ""
            }
            "gruul" -> {
                color1("#4b1905","#5b1d04")
                button_commander_color.setBackgroundResource(R.drawable.color_gruul)
                button_commander_color.text = ""
            }
            "izzet" -> {
                color1("#110b50","#1a036d")
                button_commander_color.setBackgroundResource(R.drawable.color_izzet)
                button_commander_color.text = ""
            }
            "orzhov" -> {
                color1("#3f3942","#594e5f")
                button_commander_color.setBackgroundResource(R.drawable.color_orzhov)
                button_commander_color.text = ""
            }
            "rakdos" -> {
                color1("#5b0505","#420807")
                button_commander_color.setBackgroundResource(R.drawable.color_rakdos)
                button_commander_color.text = ""
            }
            "selesnya" -> {
                color1("#72c767","#8fdd85")
                button_commander_color.setBackgroundResource(R.drawable.color_selesnya)
                button_commander_color.text = ""
            }
            "simic" -> {
                color1("#108360","#11a376")
                button_commander_color.setBackgroundResource(R.drawable.color_simic)
                button_commander_color.text = ""
            }
            "abzan" -> {
                color1("#4d7057","#7da88a")
                button_commander_color.setBackgroundResource(R.drawable.color_abzan)
                button_commander_color.text = ""
            }
            "bant" -> {
                color1("#3b9d81","#5fae98")
                button_commander_color.setBackgroundResource(R.drawable.color_bant)
                button_commander_color.text = ""
            }
            "esper" -> {
                color1("#4a3672","#65518c")
                button_commander_color.setBackgroundResource(R.drawable.color_esper)
                button_commander_color.text = ""
            }
            "grixis" -> {
                color1("#230c4f","#350a7d")
                button_commander_color.setBackgroundResource(R.drawable.color_grixis)
                button_commander_color.text = ""
            }
            "jeskai" -> {
                color1("#f4b483","#fcd3b3")
                button_commander_color.setBackgroundResource(R.drawable.color_jeskai)
                button_commander_color.text = ""
            }
            "jund" -> {
                color1("#671309","#561008")
                button_commander_color.setBackgroundResource(R.drawable.color_jund)
                button_commander_color.text = ""
            }
            "mardu" -> {
                color1("#694747","#7e5656")
                button_commander_color.setBackgroundResource(R.drawable.color_mardu)
                button_commander_color.text = ""
            }
            "naya" -> {
                color1("#c9ac18","#b39e0f")
                button_commander_color.setBackgroundResource(R.drawable.color_naya)
                button_commander_color.text = ""
            }
            "sultai" -> {
                color1("#334f3f","#3f604d")
                button_commander_color.setBackgroundResource(R.drawable.color_sultai)
                button_commander_color.text = ""
            }
            "temur" -> {
                color1("#5f6119","#6b6d19")
                button_commander_color.setBackgroundResource(R.drawable.color_temur)
                button_commander_color.text = ""
            }
            "dune" -> {
                color1("#4f4427","#806e40")
                button_commander_color.setBackgroundResource(R.drawable.color_dune)
                button_commander_color.text = ""
            }
            "ink" -> {
                color1("#546e54","#719571")
                button_commander_color.setBackgroundResource(R.drawable.color_ink)
                button_commander_color.text = ""
            }
            "glint" -> {
                color1("#333223","#403f2b")
                button_commander_color.setBackgroundResource(R.drawable.color_glint)
                button_commander_color.text = ""
            }
            "witch" -> {
                color1("#285852","#3c7f76")
                button_commander_color.setBackgroundResource(R.drawable.color_witch)
                button_commander_color.text = ""
            }
            "yore" -> {
                color1("#514951","#777077")
                button_commander_color.setBackgroundResource(R.drawable.color_yore)
                button_commander_color.text = ""
            }
            "five" -> {
                color1("#5a394b","#80526c")
                button_commander_color.setBackgroundResource(R.drawable.color_5color)
                button_commander_color.text = ""
            }



        }

        fun color2(color2 : String, bColor2 : String) {
            commander_img2.setBackgroundColor(Color.parseColor(bColor2))
            buttonAdd2.setBackgroundColor(Color.parseColor(color2))
            buttonRemove2.setBackgroundColor(Color.parseColor(color2))
            buttonComTaxAdd2.setBackgroundColor(Color.parseColor(color2))
            buttonComTaxRemove2.setBackgroundColor(Color.parseColor(color2))
            buttonResetCom2.setBackgroundColor(Color.parseColor(color2))
            button_monarch2.text = "♛"
            button_monarch2.setBackgroundColor(Color.parseColor(color2))
            button_city2.text = "⛯"
            button_city2.setBackgroundColor(Color.parseColor(color2))
            hp2 = 40
            textViewHp2.text = "40"
            textViewHp2.setBackgroundResource(0)
            comTax2 = 0
            textViewComTaxCount2.text = "0"
            textViewComTaxCount2.setBackgroundResource(0)
        }

        val color2 = intent.getStringExtra("Color2")
        cmdrColor2.text = color2

        when (cmdrColor2.text.toString()) {
            "white" -> {
                color2("#e6e3ba","#d3d3c9")
                button_commander_color2.setBackgroundResource(R.drawable.color_monowhite)
                button_commander_color2.text = ""
            }
            "blue" -> {
                color2("#0a67bf","#2680d6")
                button_commander_color2.setBackgroundResource(R.drawable.color_monoblue)
                button_commander_color2.text = ""
            }
            "black" -> {
                color2("#282829","#3b3b3c")
                button_commander_color2.setBackgroundResource(R.drawable.color_monoblack)
                button_commander_color2.text = ""
            }
            "red" -> {
                color2("#b01c1c","#de1d1d")
                button_commander_color2.setBackgroundResource(R.drawable.color_monored)
                button_commander_color2.text = ""
            }
            "green" -> {
                color2("#04750c","#1aa027")
                button_commander_color2.setBackgroundResource(R.drawable.color_monogreen)
                button_commander_color2.text = ""
            }
            "colorless" -> {
                commander_img1.setBackgroundResource(R.drawable.bg_colorless)
                button_commander_color2.setBackgroundResource(R.drawable.color_colorless)
                button_commander_color2.text = ""
            }
            "azorius" -> {
                color2("#3ea0cf","#8bd5f8")
                button_commander_color2.setBackgroundResource(R.drawable.color_azorius)
                button_commander_color2.text = ""
            }
            "boros" -> {
                color2("#b9641e","#d37920")
                button_commander_color2.setBackgroundResource(R.drawable.color_boros)
                button_commander_color2.text = ""
            }
            "dimir" -> {
                color2("#04045e","#08157d")
                button_commander_color2.setBackgroundResource(R.drawable.color_dimir)
                button_commander_color2.text = ""
            }
            "golgari" -> {
                color2("#023d0b","#075605")
                button_commander_color2.setBackgroundResource(R.drawable.color_golgari)
                button_commander_color2.text = ""
            }
            "gruul" -> {
                color2("#4b1905","#5b1d04")
                button_commander_color2.setBackgroundResource(R.drawable.color_gruul)
                button_commander_color2.text = ""
            }
            "izzet" -> {
                color2("#110b50","#1a036d")
                button_commander_color2.setBackgroundResource(R.drawable.color_izzet)
                button_commander_color2.text = ""
            }
            "orzhov" -> {
                color2("#3f3942","#594e5f")
                button_commander_color2.setBackgroundResource(R.drawable.color_orzhov)
                button_commander_color2.text = ""
            }
            "rakdos" -> {
                color2("#5b0505","#420807")
                button_commander_color2.setBackgroundResource(R.drawable.color_rakdos)
                button_commander_color2.text = ""
            }
            "selesnya" -> {
                color2("#72c767","#8fdd85")
                button_commander_color2.setBackgroundResource(R.drawable.color_selesnya)
                button_commander_color2.text = ""
            }
            "simic" -> {
                color2("#108360","#11a376")
                button_commander_color2.setBackgroundResource(R.drawable.color_simic)
                button_commander_color2.text = ""
            }
            "abzan" -> {
                color2("#4d7057","#7da88a")
                button_commander_color2.setBackgroundResource(R.drawable.color_abzan)
                button_commander_color2.text = ""
            }
            "bant" -> {
                color2("#3b9d81","#5fae98")
                button_commander_color2.setBackgroundResource(R.drawable.color_bant)
                button_commander_color2.text = ""
            }
            "esper" -> {
                color2("#4a3672","#65518c")
                button_commander_color2.setBackgroundResource(R.drawable.color_esper)
                button_commander_color2.text = ""
            }
            "grixis" -> {
                color2("#230c4f","#350a7d")
                button_commander_color2.setBackgroundResource(R.drawable.color_grixis)
                button_commander_color2.text = ""
            }
            "jeskai" -> {
                color2("#f4b483","#fcd3b3")
                button_commander_color2.setBackgroundResource(R.drawable.color_jeskai)
                button_commander_color2.text = ""
            }
            "jund" -> {
                color2("#671309","#561008")
                button_commander_color2.setBackgroundResource(R.drawable.color_jund)
                button_commander_color2.text = ""
            }
            "mardu" -> {
                color2("#694747","#7e5656")
                button_commander_color2.setBackgroundResource(R.drawable.color_mardu)
                button_commander_color2.text = ""
            }
            "naya" -> {
                color2("#c9ac18","#b39e0f")
                button_commander_color2.setBackgroundResource(R.drawable.color_naya)
                button_commander_color2.text = ""
            }
            "sultai" -> {
                color2("#334f3f","#3f604d")
                button_commander_color2.setBackgroundResource(R.drawable.color_sultai)
                button_commander_color2.text = ""
            }
            "temur" -> {
                color2("#5f6119","#6b6d19")
                button_commander_color2.setBackgroundResource(R.drawable.color_temur)
                button_commander_color2.text = ""
            }
            "dune" -> {
                color2("#4f4427","#806e40")
                button_commander_color2.setBackgroundResource(R.drawable.color_dune)
                button_commander_color2.text = ""
            }
            "ink" -> {
                color2("#546e54","#719571")
                button_commander_color2.setBackgroundResource(R.drawable.color_ink)
                button_commander_color2.text = ""
            }
            "glint" -> {
                color2("#333223","#403f2b")
                button_commander_color2.setBackgroundResource(R.drawable.color_glint)
                button_commander_color2.text = ""
            }
            "witch" -> {
                color2("#285852","#3c7f76")
                button_commander_color2.setBackgroundResource(R.drawable.color_witch)
                button_commander_color2.text = ""
            }
            "yore" -> {
                color2("#514951","#777077")
                button_commander_color2.setBackgroundResource(R.drawable.color_yore)
                button_commander_color2.text = ""
            }
            "five" -> {
                color2("#5a394b","#80526c")
                button_commander_color2.setBackgroundResource(R.drawable.color_5color)
                button_commander_color2.text = ""
            }
        }

    }

    fun addHp(view: View){
        hp++
        textViewHp.text = "$hp"
    }

    fun removeHp(view: View){
        hp--
        val text = findViewById<TextView>(R.id.textViewHp)
        text.text = "$hp"
        if(text.text == "0"){
            commander_img1.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color.text = ""
            buttonAdd.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonRemove.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxAdd.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxRemove.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonResetCom1.setBackgroundColor(Color.parseColor("#4C4949"))
            textViewHp.setBackgroundColor(Color.parseColor("#5a5c5a"))
            textViewComTaxCount.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_monarch.text = "♛"
            button_monarch.setBackgroundColor(Color.parseColor("#4C4949"))
            button_city.text = "⛯"
            button_city.setBackgroundColor(Color.parseColor("#4C4949"))
            button_commander_color.isEnabled = false
            button_city.isEnabled = false
            button_monarch.isEnabled = false
            buttonComTaxAdd.isEnabled = false
            buttonComTaxRemove.isEnabled = false
        }
    }

    fun addComTax(view: View) {
        if(comTax < 20){
            comTax += 2
        }
        textViewComTaxCount.text = "$comTax"
    }

    fun removeComTax(view: View) {
        if(comTax > 0){
            comTax -= 2
        }
        textViewComTaxCount.text = "$comTax"
    }

    fun addHp2(view: View){
        hp2++
        textViewHp2.text = "$hp2"
    }

    fun removeHp2(view: View){
        hp2--
        val text = findViewById<TextView>(R.id.textViewHp2)
        text.text = "$hp2"
        if(text.text == "0"){
            commander_img2.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color2.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_commander_color2.text = ""
            buttonAdd2.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonRemove2.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonComTaxRemove2.setBackgroundColor(Color.parseColor("#4C4949"))
            buttonResetCom2.setBackgroundColor(Color.parseColor("#4C4949"))
            textViewHp2.setBackgroundColor(Color.parseColor("#5a5c5a"))
            textViewComTaxCount2.setBackgroundColor(Color.parseColor("#5a5c5a"))
            button_monarch2.text = "♛"
            button_monarch2.setBackgroundColor(Color.parseColor("#4C4949"))
            button_city2.text = "⛯"
            button_city2.setBackgroundColor(Color.parseColor("#4C4949"))
            button_commander_color2.isEnabled = false
            button_city2.isEnabled = false
            button_monarch2.isEnabled = false
            buttonComTaxAdd2.isEnabled = false
            buttonComTaxRemove2.isEnabled = false
        }
    }

    fun addComTax2(view: View) {
        if(comTax2 < 20){
            comTax2 += 2
        }
        val text = findViewById<TextView>(R.id.textViewComTaxCount2)
        text.text = "$comTax2"


    }

    fun removeComTax2(view: View) {
        if(comTax2 > 0){
            comTax2 -= 2
        }
        textViewComTaxCount2.text = "$comTax2"

    }

    private fun monarchColor(color : String){
        button_monarch.text = "♛"
        button_monarch.setBackgroundColor(Color.parseColor(color))
    }

    fun monarch(view: View){
        if(intent.getStringExtra("Monarch") != "1")
        {
            intent.putExtra("Monarch","1")
            button_monarch.setBackgroundResource(R.drawable.monarch)
            button_monarch.text = ""
        }
        else
        {
            intent.putExtra("Monarch","0")
            val colorMonarch = intent.getStringExtra("Color")
            cmdrColor1.text = colorMonarch
            when (cmdrColor1.text.toString()) {
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
                    button_monarch.text = "♛"
                    button_monarch.setBackgroundColor(Color.parseColor("#4C4949"))

                }
            }

        }

    }

    private fun blessingColor(color : String){
        button_city.text = "⛯"
        button_city.setBackgroundColor(Color.parseColor(color))

    }

    fun blessing(view: View){
        if(intent.getStringExtra("City") != "1")
        {
            intent.putExtra("City","1")
            button_city.setBackgroundResource(R.drawable.c_blessing)
            button_city.text = ""
        }
        else
        {
            intent.putExtra("City","0")
            val colorCity = intent.getStringExtra("Color")
            cmdrColor1.text = colorCity
            when (cmdrColor1.text.toString()) {
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
                    button_city.text = "⛯"
                    button_city.setBackgroundColor(Color.parseColor("#4C4949"))

                }
            }

        }


    }

    private fun monarchColor2(color : String){
        button_monarch2.text = "♛"
        button_monarch2.setBackgroundColor(Color.parseColor(color))
    }

    fun monarch2(view: View){
        if(intent.getStringExtra("Monarch") != "1")
        {
            intent.putExtra("Monarch","1")
            button_monarch2.setBackgroundResource(R.drawable.monarch)
            button_monarch2.text = ""
        }
        else
        {
            intent.putExtra("Monarch","0")
            val colorMonarch2 = intent.getStringExtra("Color2")
            cmdrColor2.text = colorMonarch2
            when (cmdrColor2.text.toString()) {
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
                    button_monarch2.text = "♛"
                    button_monarch2.setBackgroundColor(Color.parseColor("#4C4949"))

                }
            }

        }
    }

    private fun blessingColor2(color : String){
        button_city2.text = "⛯"
        button_city2.setBackgroundColor(Color.parseColor(color))

    }

    fun blessing2(view: View){
        if(intent.getStringExtra("City") != "1")
        {
            intent.putExtra("City","1")
            button_city2.setBackgroundResource(R.drawable.c_blessing)
            button_city2.text = ""
        }
        else
        {
            intent.putExtra("City","0")
            val colorCity2 = intent.getStringExtra("Color2")
            cmdrColor2.text = colorCity2
            when (cmdrColor2.text.toString()) {
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
                    button_city2.text = "⛯"
                    button_city2.setBackgroundColor(Color.parseColor("#4C4949"))

                }
            }

        }

    }

    fun resetCom1(view: View){
        hp = 40
        textViewHp.text = "40"
        textViewHp.setBackgroundColor(Color.parseColor("#C8C5C5"))
        comTax = 0
        textViewComTaxCount.text = "0"
        textViewComTaxCount.setBackgroundColor(Color.parseColor("#C8C5C5"))
        button_commander_color.text = "C"
        button_commander_color.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonAdd.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonRemove.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxAdd.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxRemove.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonResetCom1.setBackgroundColor(Color.parseColor("#4C4949"))
        button_monarch.text = "♛"
        button_monarch.setBackgroundColor(Color.parseColor("#4C4949"))
        button_city.text = "⛯"
        button_city.setBackgroundColor(Color.parseColor("#4C4949"))
        commander_img1.setBackgroundColor(Color.parseColor("#C8C5C5"))
        commander_img1.setBackgroundResource(0)
        button_commander_color.isEnabled = true
        button_city.isEnabled = true
        button_monarch.isEnabled = true
        buttonComTaxAdd.isEnabled = true
        buttonComTaxRemove.isEnabled = true
        intent.putExtra("Color","")
    }

    fun resetCom2(view: View){
        hp = 40
        textViewHp2.text = "40"
        textViewHp2.setBackgroundColor(Color.parseColor("#C8C5C5"))
        comTax = 0
        textViewComTaxCount2.text = "0"
        textViewComTaxCount2.setBackgroundColor(Color.parseColor("#C8C5C5"))
        button_commander_color2.text = "C"
        button_commander_color2.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonAdd2.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonRemove2.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxAdd2.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonComTaxRemove2.setBackgroundColor(Color.parseColor("#4C4949"))
        buttonResetCom2.setBackgroundColor(Color.parseColor("#4C4949"))
        button_monarch2.text = "♛"
        button_monarch2.setBackgroundColor(Color.parseColor("#4C4949"))
        button_city2.text = "⛯"
        button_city2.setBackgroundColor(Color.parseColor("#4C4949"))
        commander_img2.setBackgroundColor(Color.parseColor("#C8C5C5"))
        commander_img2.setBackgroundResource(0)
        button_commander_color2.isEnabled = true
        button_city2.isEnabled = true
        button_monarch2.isEnabled = true
        buttonComTaxAdd2.isEnabled = true
        buttonComTaxRemove2.isEnabled = true
        intent.putExtra("Color2","")
    }




}