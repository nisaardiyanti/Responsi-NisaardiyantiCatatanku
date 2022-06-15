package com.nisaardiyanti.catatanku//nama packages

import android.content.Intent//mengambil data data dari android.content.Intent
import androidx.appcompat.app.AppCompatActivity//mengambil data data dari androidx.appcompat.app.AppCompatActivity
import android.os.Bundle//mengambil data data dari android.os.Bundle
import android.provider.AlarmClock//mengambil data data dari android.provider.AlarmClock
import android.view.View//mengambil data data dari android.view.View
import android.widget.TextView//mengambil data data dari android.widget.TextView
import android.widget.Toast//mengambil data data dari android.widget.Toast

class MainActivity3 : AppCompatActivity() { //kelas MainActivity3
    override fun onCreate(savedInstanceState: Bundle?) {  //override digunakan untuk mengganti fungsi
        super.onCreate(savedInstanceState) //super digunakan untuk mereferensikan fungsi di class induk
        setContentView(R.layout.activity_main3)//SetContentView digunakan untuk mengisi jendela dengan UI
        // yang disediakan dari file tata letak setContentView(R. layout. activity_main3).

        val message = intent.getStringExtra(AlarmClock.EXTRA_MESSAGE) //ekstrak string untuk mendapatkan Intent yang memulai aktivitas ini

        val kegiatan = findViewById<TextView>(R.id.kegiatan).apply {
            text = message
            //findViewById adalah metode yang menemukan View dengan ID yang diberikan.
            //pada id diatas menggunakan id kegiatan
        }
    }
    fun edit(view: View) { //funtion edit menggunakan 1 parameter yaitu funtion untuk menentukan view
        val intent = Intent(this, MainActivity2::class.java)
        //intent digunakan sebagai jembatan yang menghubungkan interaksi antara Activity
        //pada intent diatas akan menghubungkan aktivitas MainActivity3 ke MainActivity2
        startActivity(intent)//metode startActivity(intent) digunakan Untuk memulai aktivitas
    }
    fun hapus(view: View) { // funtion hapus menggunakan 1 parameter yaitu funtion untuk menentukan view
        val intent = Intent(this, MainActivity::class.java)
        //intent digunakan sebagai jembatan yang menghubungkan interaksi antara Activity
        //pada intent diatas akan menghubungkan aktivitas MainActivity3 ke MainActivity
        startActivity(intent)//metode startActivity(intent) digunakan Untuk memulai aktivitas
        Toast.makeText(applicationContext, "berhasil dihapus", Toast.LENGTH_LONG).show()
        //makeText() adalah method static yang ada di dalam kelas Toast untuk membuat sebuah objek
    // Toast baru berisi parameter yang akan menampilkan teks berhasil dihapus
    }
}