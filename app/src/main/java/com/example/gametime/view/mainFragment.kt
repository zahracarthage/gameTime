package com.example.gametime.view

import android.app.ActionBar
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gametime.R
import com.example.gametime.databinding.FragmentMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationItemView


class mainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater,container,false)
        binding.navbar.MyActionBar.background=null

        return binding.root
    }

}