package com.azmovhudstc.mobiuzapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_item.*
import kotlinx.android.synthetic.main.fragment_item.view.*


class ItemFragment : Fragment() {
    lateinit var root: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val string = arguments?.getString("tarifName")
        val string1 = arguments?.getString("tarifDes")
        root = inflater.inflate(R.layout.fragment_item, container, false)
        root.description.text = string1
        root.name.text = string
        return root
    }


}