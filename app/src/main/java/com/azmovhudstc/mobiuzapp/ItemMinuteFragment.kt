package com.azmovhudstc.mobiuzapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_item_minute.view.*


class ItemMinuteFragment : Fragment() {
    lateinit var root:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_item_minute, container, false)
        var string = arguments?.getString("minutName")
        var string1 = arguments?.getString("minutDes")
        var string2 = arguments?.getString("minutCode")
        root.MCode.text=string2
        root.Mdescription.text=string1
        root.Mname.text=string
        return root
    }
}