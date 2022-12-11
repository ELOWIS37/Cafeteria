package com.elowis.cafeteria

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.elowis.cafeteria.databinding.FragmentPrimerPlatBinding


class primerPlat : Fragment() {

    var primerPlats = arrayOf("Patates Braves", "Empanadilles", "Alites de Pollastre", "Gambes a la Plantxa", "Croquetes de Pernil")
    var preu = arrayOf("Preu: 4€, Preu: 3,5€, Preu: 4€, Preu: 5€, Preu: 3,25€")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentPrimerPlatBinding>(inflater,
            R.layout.fragment_primer_plat,container,false)
        setHasOptionsMenu(true)

            return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adaptador: ArrayAdapter<String> = ArrayAdapter<String>(
            requireActivity().applicationContext,
            android.R.layout.simple_list_item_1, primerPlats
        )

        val listview:ListView = requireView().findViewById<View>(R.id.listView) as ListView
        listview.adapter = adaptador
    }

    


}