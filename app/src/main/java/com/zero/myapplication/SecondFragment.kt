package com.zero.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.zero.myapplication.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private val binding: FragmentSecondBinding by lazy {
        FragmentSecondBinding.inflate(layoutInflater)
    }
    private val args: SecondFragmentArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.tvSecond.setOnClickListener {
            findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToThirdFragment())
        }
        binding.tvSecond.text = args.title
        Toast.makeText(context, "From ${args.dataTranfer.from} ", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return binding.root
    }

}