package com.example.gametime.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.gametime.R
import com.example.gametime.adapter.sliderAdapter
import com.example.gametime.databinding.FragmentViewPagerBinding


class viewPagerFragment : Fragment() {
    private lateinit var binding : FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       // view =  inflater.inflate(R.layout.fragment_view_pager, container, false)
        binding = FragmentViewPagerBinding.inflate(inflater, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FragmentSlider1(),
            FragmentSlider2(),
            FragmentSlider3()

        )

        val adapter = sliderAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle

        )

        binding.viewPager.adapter = adapter


        return binding.root
    }


}