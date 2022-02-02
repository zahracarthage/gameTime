package com.example.gametime.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.gametime.R
import com.example.gametime.databinding.FragmentSignInBinding


class SignInFragment : Fragment() {

    private lateinit var binding: FragmentSignInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSignInBinding.inflate(inflater, container, false)
       // return inflater.inflate(R.layout.fragment_sign_in, container, false)
        binding.signUpbtn.setOnClickListener(

                Navigation.createNavigateOnClickListener(R.id.action_signInFragment_to_signUpFragment)
            )


        return binding.root
    }


}