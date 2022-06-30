package com.zero.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.zero.myapplication.databinding.FragmentSecondBinding
import com.zero.myapplication.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private val binding: FragmentThirdBinding by lazy {
        FragmentThirdBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.tvThird.setOnClickListener {
            findNavController().navigate(ThirdFragmentDirections.actionThirdFragmentToHomeFragment())
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return binding.root
    }
}