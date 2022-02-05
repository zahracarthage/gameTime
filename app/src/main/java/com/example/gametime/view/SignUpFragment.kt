package com.example.gametime.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.gametime.R
import com.example.gametime.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentSignUpBinding.inflate(inflater, container, false)
       // return inflater.inflate(R.layout.fragment_sign_up, container, false)
        binding.SigninBtn.setOnClickListener(
        Navigation.createNavigateOnClickListener(R.id.action_signUpFragment_to_signInFragment)

        )

        return binding.root
    }



}