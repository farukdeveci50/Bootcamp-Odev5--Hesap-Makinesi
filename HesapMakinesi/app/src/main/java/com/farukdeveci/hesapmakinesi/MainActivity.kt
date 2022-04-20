package com.farukdeveci.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.farukdeveci.hesapmakinesi.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)
        var sayiStringi=""
        var integersayim=0
        var toplamsayim = 0

        tasarim.buttonTopla.setOnClickListener {

                //val snackbar = Snackbar.make(tasarim.root,"Dikkat! Sayı Girmeyi Unutmayınız",Snackbar.LENGTH_LONG).show()
                //Toast.makeText(applicationContext,"Dikkat! Sayı Girmeyi Unutmayınız",Toast.LENGTH_SHORT).show()

            if(sayiStringi!=""){
                integersayim =  sayiStringi.toInt()
                toplamsayim = toplamsayim + integersayim
                sayiStringi=""
            }else{
                val snackbar = Snackbar.make(tasarim.root,"Dikkat! Sayı Girmeyi Unutmayınız",Snackbar.LENGTH_LONG).show()
            }



        }
        tasarim.buttonSifir.setOnClickListener {
            sayiStringi +="0"
            tasarim.textView.text = sayiStringi.toString()
        }
        tasarim.buttonBir.setOnClickListener {
            sayiStringi +="1"
            tasarim.textView.text = sayiStringi.toString()
        }
        tasarim.buttonIki.setOnClickListener {
            sayiStringi +="2"
            tasarim.textView.text = sayiStringi.toString()
        }
        tasarim.buttonUc.setOnClickListener {
            sayiStringi +="3"
            tasarim.textView.text = sayiStringi.toString()
        }
        tasarim.buttonDort.setOnClickListener {
            sayiStringi +="4"
            tasarim.textView.text = sayiStringi.toString()
        }
        tasarim.buttonBes.setOnClickListener {
            sayiStringi +="5"
            tasarim.textView.text = sayiStringi.toString()
        }
        tasarim.buttonAlti.setOnClickListener {
            sayiStringi +="6"
            tasarim.textView.text = sayiStringi.toString()
        }
        tasarim.buttonYedi.setOnClickListener {
            sayiStringi +="7"
            tasarim.textView.text = sayiStringi.toString()
        }
        tasarim.buttonSekiz.setOnClickListener {
            sayiStringi +="8"
            tasarim.textView.text = sayiStringi.toString()
        }
        tasarim.buttonDokuz.setOnClickListener {
            sayiStringi +="9"
            tasarim.textView.text = sayiStringi.toString()
        }

        tasarim.buttonEsittir.setOnClickListener {
            integersayim =  sayiStringi.toInt()
            toplamsayim = toplamsayim + integersayim
            tasarim.textView.text = toplamsayim.toString()
        }
        tasarim.buttonTemizle.setOnClickListener {
            tasarim.textView.text = ""
            toplamsayim = 0
            sayiStringi=""
        }





    }
}