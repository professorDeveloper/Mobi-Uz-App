package com.azmovhudstc.mobiuzapp.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.azmovhudstc.mobiuzapp.R
import kotlinx.android.synthetic.main.item_minutes.view.*

import com.azmovhudstc.mobiuzapp.model.Minut

class MinutesAdapter(var arrayList: ArrayList<Minut>, var fragment: Fragment?):RecyclerView.Adapter<MinutesAdapter.Wh>() {
    inner class Wh(var itemView:View):RecyclerView.ViewHolder(itemView) {
        fun  onBind(minut: Minut){
            itemView.minute_name.text=minut.tarifName
            itemView.minute_code.text=minut.tarifCode
            itemView.minute_min_des.text=minut.tarifMiniDes
            itemView.setOnClickListener {
                var bundle=Bundle()
                bundle.putString("minutName",minut.tarifName)
                bundle.putString("minutDes",minut.tarifiDes)
                bundle.putString("minutCode",minut.tarifCode)
                fragment?.findNavController()?.navigate(R.id.itemMinuteFragment,bundle)

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Wh {
        return Wh(LayoutInflater.from(parent.context).inflate(R.layout.item_minutes,parent,false))
    }



    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: MinutesAdapter.Wh, position: Int) {
        val minut = arrayList[position]

        holder.onBind(minut=minut)

    }
}