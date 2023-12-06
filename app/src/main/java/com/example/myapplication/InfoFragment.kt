package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private lateinit var binding: FragmentInfoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentInfoBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val loginResult = arguments?.getString("login")
        val loginResult1 = arguments?.getString("info")
        val loginResult2 = arguments?.getString("image")

        binding.info.text = loginResult1
        binding.tvName.text = loginResult
        if (loginResult2 != null) {
            binding.imgCharacter.loadImage(loginResult2)
        }
    }
}