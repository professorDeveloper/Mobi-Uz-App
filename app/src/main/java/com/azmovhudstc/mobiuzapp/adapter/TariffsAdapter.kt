package com.azmovhudstc.mobiuzapp.adapter

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.azmovhudstc.mobiuzapp.R
import com.azmovhudstc.mobiuzapp.adapter.TariffsAdapter.*
import com.azmovhudstc.mobiuzapp.model.Tarif
import kotlinx.android.synthetic.main.item_tariflar.view.*

class TariffsAdapter(var arrayList: ArrayList<Tarif>, var fragment: Fragment?):RecyclerView.Adapter<Wh>() {
    inner class Wh(var itemView:View):RecyclerView.ViewHolder(itemView) {
        fun  onBind(tarif: Tarif){
            itemView.tarif_name.text=tarif.tarifName
            itemView.tarif_code.text=tarif.tarifCode
            itemView.mini_description.text=tarif.tarifMiniDes
            itemView.setOnClickListener {
                var bundle=Bundle()
                bundle.putString("tarifName",tarif.tarifName)
                bundle.putString("tarifDes",tarif.tarifiDes)
                fragment?.findNavController()?.navigate(R.id.itemFragment,bundle)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Wh {
        return Wh(LayoutInflater.from(parent.context).inflate(R.layout.item_tariflar,parent,false))
    }

    override fun onBindViewHolder(holder: Wh, position: Int) {
        val tarif=arrayList[position]
        holder.onBind(tarif = tarif)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}