package com.example.gametime.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.gametime.R
import com.example.gametime.databinding.FragmentSlider1Binding
import com.example.gametime.databinding.FragmentSlider2Binding
import com.example.gametime.databinding.FragmentSlider3Binding


class FragmentSlider2 : Fragment() {
    private lateinit var binding : FragmentSlider2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSlider2Binding.inflate(inflater, container, false)
        binding.skipbtn.setOnClickListener(

            Navigation.createNavigateOnClickListener(R.id.action_viewPagerFragment_to_signInFragment)
        )
        return binding.root      }


}