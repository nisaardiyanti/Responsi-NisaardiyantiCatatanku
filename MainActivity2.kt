package com.nisaardiyanti.catatanku//nama packages

import android.content.Intent //mengambil data data dari android.content.intent
import androidx.appcompat.app.AppCompatActivity //mengambil data data dari android.appcompat.app.AppCompatActivity
import android.os.Bundle //mengambil data data dari android.os.Bundle
import android.provider.AlarmClock//mengambil data data dari android.provider.AlarmClock
import android.view.View//mengambil data data dari android.view.View
import android.widget.EditText//mengambil data data dari android.widget.EditText
import android.widget.Toast//mengambil data data dari android.widget.Toast

class MainActivity2 : AppCompatActivity() { //kelas MainActivity2
    override fun onCreate(savedInstanceState: Bundle?) {  //override digunakan untuk mengganti fungsi
        super.onCreate(savedInstanceState) //super digunakan untuk mereferensikan fungsi di class induk
        setContentView(R.layout.activity_main2)//SetContentView digunakan untuk mengisi jendela dengan UI
        // yang disediakan dari file tata letak setContentView(R. layout. activity_main2).

    }

    fun simpan(view: View) { // funtion simpan menggunakan 1 parameter yaitu funtion untuk menentukan view
        val editkegiatan = findViewById<EditText>(R.id.editkegiatan)
        //findViewById adalah metode yang menemukan View dengan ID yang diberikan.
        val message1 = editkegiatan.text.toString()
        val intent = Intent(this, MainActivity3::class.java).apply {
            putExtra(AlarmClock.EXTRA_MESSAGE, message1) // EXTRA MESSAGE digunakan sebagai Pesan khusus untuk mengidentifikasi alarm
            //pada extra_message diatas akan mengidentifikasi message 1 yaitu pada bagian edit kegiatan
        }
        //intent digunakan sebagai jembatan yang menghubungkan interaksi antara Activity
        //pada intent diatas akan menghubungkan aktivitas MainActivity2 ke MainActivity3
        startActivity(intent)//metode startActivity(intent) digunakan Untuk memulai aktivitas
        Toast.makeText(applicationContext, "berhasil disimpan", Toast.LENGTH_LONG).show()
        //makeText() adalah method static yang ada  di dalam kelas Toast untuk membuat sebuah objek
    // Toast baru berisi parameter yang akan menampilkan teks berhasil disimpan
    }
}