package com.elowis.cafeteria

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.elowis.cafeteria.databinding.FragmentPrimerPlatBinding

class primerPlat : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentPrimerPlatBinding>(inflater,
            R.layout.fragment_primer_plat,container,false)
        setHasOptionsMenu(true)
        return binding.root
    }


}// Required empty public constructor