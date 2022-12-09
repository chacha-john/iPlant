package com.chachaup.iplant.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.chachaup.iplant.IPlantApplication
import com.chachaup.iplant.vm.IPlantViewModel
import com.chachaup.iplant.vm.IPlantViewModelFactory
import com.chachaup.iplant.R
import com.chachaup.iplant.databinding.FragmentDashboardBinding


class DashboardFragment : Fragment() {
    val viewModel: IPlantViewModel by activityViewModels {
        IPlantViewModelFactory((activity?.application as IPlantApplication).repo)
    }
    private lateinit var binding: FragmentDashboardBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }


}