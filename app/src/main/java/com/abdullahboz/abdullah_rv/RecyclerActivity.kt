package com.abdullahboz.abdullah_rv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.abdullahboz.abdullah_rv.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {
    // Array list ve activityrcylayout için bağlantıyı oluşturduk
    private lateinit var takimListe : ArrayList<Model>
    private lateinit var binding: ActivityRecyclerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // Burada geçici bir database oluşturuyoruz.
        takimListe = ArrayList<Model>()

        val arjantin = Model("Arjantin", "Arjantin Tahmini Yapıldı.")
        val portekiz = Model("Portekiz", "Portekiz Tahmini Yapıldı.")
        val brezilya = Model("Bezilya", "Brezilya Tahmini Yapıldı.")
        val almanya = Model("Almanya", "Almanya Tahmini Yapıldı.")
        val turkiye = Model("Türkiye", "Türkiye Tahmini Yapıldı.")
        val Polonya = Model("Polonya", "Polonya Tahmini Yapıldı.")
        val Fransa = Model("Fransa", "Fransa Tahmini Yapıldı.")
        val Suriye = Model("Suriye", "Suriye Tahmini Yapıldı.")


        //listeye verileri ekliyoruz
        takimListe.add(arjantin)
        takimListe.add(portekiz)
        takimListe.add(brezilya)
        takimListe.add(almanya)
        takimListe.add(turkiye)
        takimListe.add(Polonya)
        takimListe.add(Fransa)
        takimListe.add(Suriye)

       // adaptere bağlama işlemi yapıyoruz.

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter  = Adapter(takimListe)
        binding.recyclerView.adapter = adapter
    }
}