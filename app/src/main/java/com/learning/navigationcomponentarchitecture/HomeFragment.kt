package com.learning.navigationcomponentarchitecture

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.learning.navigationcomponentarchitecture.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var fragmentHomeBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentHomeBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        fragmentHomeBinding.submit.setOnClickListener {
            if (!TextUtils.isEmpty(fragmentHomeBinding.editText.text.toString())) {
                val bundle: Bundle =
                    bundleOf("user_input" to fragmentHomeBinding.editText.text.toString())
                it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment, bundle)
            } else {
                Toast.makeText(activity, "carrier is null.", Toast.LENGTH_LONG).show()
            }
        }

        return fragmentHomeBinding.root


    }

}