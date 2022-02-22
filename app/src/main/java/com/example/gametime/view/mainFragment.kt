package com.example.gametime.view

import android.app.ActionBar
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.compose.animation.core.LinearEasing
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gametime.MainPostAdapter
import com.example.gametime.R
import com.example.gametime.databinding.FragmentMainBinding
import com.example.gametime.model.MainPosts
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.navigation.NavigationView


class mainFragment : Fragment() {

    lateinit var binding: FragmentMainBinding

    lateinit var MainPostRecycler: RecyclerView
    lateinit var MainPostRecyclerAdapter : MainPostAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater,container,false)
        binding.navbar.MyActionBar.background=null

        MainPostRecycler = binding.MainPostRecycler

        var MainPostsList: MutableList<MainPosts> = ArrayList()

        MainPostsList.add(MainPosts(Title = "Schedule", Content = "Easily Schedule event/games then find like minded players for battle. You up for it ?", Picture = R.drawable.post))
        MainPostsList.add(MainPosts(Title = "Statics", Content = "All data from previous and upcoming games can be found here", Picture = R.drawable.post1))
        MainPostsList.add(MainPosts(Title = "Discover Combats", Content = "Find out what's new and compete among players with new challenges and earn cash with game points", Picture = R.drawable.post2))
        MainPostsList.add(MainPosts(Title = "Message Players", Content = "Found the profile of a player that interests you? Start a conversation.", Picture = R.drawable.post3))


        MainPostRecyclerAdapter = MainPostAdapter(MainPostsList)
        MainPostRecycler.adapter = MainPostRecyclerAdapter

        MainPostRecycler.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL, false)



        return binding.root
    }

}