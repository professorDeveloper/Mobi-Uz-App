package com.azmovhudstc.mobiuzapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {


    lateinit var root:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        root= inflater.inflate(R.layout.fragment_home, container, false)

        root.tariflar.setOnClickListener {
            findNavController().navigate(R.id.tariflarFragment)
        }
        root.daqiqalar.setOnClickListener {
            findNavController().navigate(R.id.minutesFragment)
        }
        root.xizmatlar.setOnClickListener {
            findNavController().navigate(R.id.tariflarFragment)
        }
        root.internet.setOnClickListener {
            findNavController().navigate(R.id.minutesFragment)
        }
        root.sms.setOnClickListener {
            findNavController().navigate(R.id.tariflarFragment)
        }
        root.yangliklar.setOnClickListener {
            findNavController().navigate(R.id.minutesFragment)
        }
        return root

    }
}