package com.saeedev.passmanager

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.saeedev.passmanager.databinding.FragmentSplashBinding

class SplashFragment : Fragment() {
    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!

    private val SPLASH_DELAY: Long = 3000

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val splasScreeRunnable = Runnable{
            Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_mainFragment)
        }

        Handler().postDelayed(splasScreeRunnable, SPLASH_DELAY)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}