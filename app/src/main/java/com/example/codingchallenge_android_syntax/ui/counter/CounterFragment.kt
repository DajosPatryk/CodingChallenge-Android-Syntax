package com.example.codingchallenge_android_syntax.ui.counter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.codingchallenge_android_syntax.databinding.FragmentCounterBinding

class CounterFragment : Fragment() {

    private var _binding: FragmentCounterBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val counterViewModel = ViewModelProvider(this).get(CounterViewModel::class.java)

        _binding = FragmentCounterBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCounter
        counterViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        binding.imageCounter.setOnClickListener {
            counterViewModel.incrementCount()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}