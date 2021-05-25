package com.example.mtgedh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class ColorIdentity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color_identity)

        val color2Et = findViewById<TextView>(R.id.textColor)
        val saveBtn = findViewById<Button>(R.id.buttonSave)


        saveBtn.setOnClickListener {
            val color2 = color2Et.text.toString()

            val i = Intent(this, PlayersTwo::class.java)
            i.putExtra("Color2", color2)
            i.putExtra("Color", intent.getStringExtra("Color"))
            startActivity(i)
            overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom)


        }

    }

    private fun colorPicked(color: String) {
        var colorPicked = findViewById<TextView>(R.id.textColor)
        colorPicked.text = color
    }


    fun colorWhite(view: View) {
        colorPicked("white")
    }
    fun colorBlue(view: View) {
        colorPicked("blue")
    }
    fun colorBlack(view: View) {
        colorPicked("black")
    }
    fun colorRed(view: View) {
        colorPicked("red")
    }
    fun colorGreen(view: View) {
        colorPicked("green")
    }
    fun colorLess(view: View) {
        colorPicked("colorless")
    }
    fun colorAzorius(view: View) {
        colorPicked("azorius")
    }
    fun colorBoros(view: View) {
        colorPicked("boros")
    }
    fun colorDimir(view: View) {
        colorPicked("dimir")
    }
    fun colorGolgari(view: View) {
        colorPicked("golgari")
    }
    fun colorGruul(view: View) {
        colorPicked("gruul")
    }
    fun colorIzzet(view: View) {
        colorPicked("izzet")
    }
    fun colorOrzhov(view: View) {
        colorPicked("orzhov")
    }
    fun colorRakdos(view: View) {
        colorPicked("rakdos")
    }
    fun colorSelesnya(view: View) {
        colorPicked("selesnya")
    }
    fun colorSimic(view: View) {
        colorPicked("simic")
    }
    fun colorAbzan(view: View) {
        colorPicked("abzan")
    }
    fun colorBant(view: View) {
        colorPicked("bant")
    }
    fun colorEsper(view: View) {
        colorPicked("esper")
    }
    fun colorGrixis(view: View) {
        colorPicked("grixis")
    }
    fun colorJeskai(view: View) {
        colorPicked("jeskai")
    }
    fun colorJund(view: View) {
        colorPicked("jund")
    }
    fun colorMardu(view: View) {
        colorPicked("mardu")
    }
    fun colorNaya(view: View) {
        colorPicked("naya")
    }
    fun colorSultai(view: View) {
        colorPicked("sultai")
    }
    fun colorTemur(view: View) {
        colorPicked("temur")
    }
    fun colorDune(view: View) {
        colorPicked("dune")
    }
    fun colorGlint(view: View) {
        colorPicked("glint")
    }
    fun colorInk(view: View) {
        colorPicked("ink")
    }
    fun colorWitch(view: View) {
        colorPicked("witch")
    }
    fun colorYore(view: View) {
        colorPicked("yore")
    }
    fun colorFive(view: View) {
        colorPicked("five")
    }

}