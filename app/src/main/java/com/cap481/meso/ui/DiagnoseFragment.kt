package com.cap481.meso.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cap481.meso.databinding.FragmentDiagnoseBinding
import com.cap481.meso.detail.DiagnoseDetailActivity

class DiagnoseFragment : Fragment() {

    private lateinit var binding: FragmentDiagnoseBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentDiagnoseBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnStartDiagnose.setOnClickListener{
            val intent = Intent(activity, DiagnoseDetailActivity::class.java)
            startActivity(intent)
        }
    }

}