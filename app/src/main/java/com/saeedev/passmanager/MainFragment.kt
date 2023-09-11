package com.saeedev.passmanager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.drawerlayout.widget.DrawerLayout
import com.saeedev.passmanager.databinding.FragmentMainBinding
import com.saeedev.passmanager.databinding.FragmentSplashBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null;
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupDrawer();

    }

    private fun setupDrawer() {
       val drawerLayout : DrawerLayout = binding.drawerLayout

    }

}