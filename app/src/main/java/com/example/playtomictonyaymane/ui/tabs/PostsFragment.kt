package com.example.playtomictonyaymane.ui.tabs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.playtomictonyaymane.R
import com.example.playtomictonyaymane.databinding.FragmentPostsBinding

class PostsFragment:Fragment() {
    private var _binding: FragmentPostsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPostsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Hier wordt een voorbeeldtekst weergegeven in de TextView
        binding.textViewActivities.text = "Dit is de Activities Fragment"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}