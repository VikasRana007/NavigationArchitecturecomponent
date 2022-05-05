package com.learning.navigationcomponentarchitecture

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.learning.navigationcomponentarchitecture.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var fragmentSecondBinding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        fragmentSecondBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)

        fragmentSecondBinding.textView.text = arguments?.getString("user_input")

        return fragmentSecondBinding.root
    }


}