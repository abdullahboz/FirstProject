package com.abdullahboz.abdullah_rv

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abdullahboz.abdullah_rv.databinding.ActivityMainBinding
import com.abdullahboz.abdullah_rv.databinding.RecycleritemBinding

class Adapter(val takimListe : ArrayList<Model>): RecyclerView.Adapter<Adapter.TakimHolder>() {
    // bu takimholder class ile recyc layoutumuzun viewlerine ulaşıyoruz.
    class TakimHolder(val binding: RecycleritemBinding):RecyclerView.ViewHolder(binding.root)

    // verileri tanımlıyoruz.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TakimHolder {
        val binding = RecycleritemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TakimHolder(binding)
    }

    // Oncreateviewden dönen verileri bağlamak için yazıyoruzz.
    @SuppressLint("SuspiciousIndentation")
    override fun onBindViewHolder(holder: TakimHolder, position: Int) {
        holder.binding.recyclertakim.text = takimListe.get(position).takim
        val takim = takimListe.get(position).takim
        val tahmin = takimListe.get(position).tahmin

        // verileri tahmin activity'e intent ediyoruz.
        holder.binding.btntahmin.setOnClickListener {
         val intent = Intent(holder.itemView.context,TahminActivity::class.java)
            intent.putExtra("takimismi",takim)
            intent.putExtra("tahminsec",tahmin)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return takimListe.size
    }

}