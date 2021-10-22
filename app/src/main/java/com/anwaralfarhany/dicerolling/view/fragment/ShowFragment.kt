package com.anwaralfarhany.dicerolling.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.anwaralfarhany.dicerolling.R
import com.anwaralfarhany.dicerolling.databinding.FragmentShowBinding
import com.anwaralfarhany.dicerolling.viewModel.DiceViewModel


class ShowFragment : Fragment() {
    private lateinit var binding: FragmentShowBinding
    private val viewModel : DiceViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_show, container,false)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        return binding.root
         }
}