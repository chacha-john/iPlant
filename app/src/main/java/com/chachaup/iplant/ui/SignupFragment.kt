package com.chachaup.iplant.ui

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import com.chachaup.iplant.IPlantApplication
import com.chachaup.iplant.R
import com.chachaup.iplant.databinding.FragmentSignupBinding
import com.chachaup.iplant.utils.toast
import com.chachaup.iplant.vm.IPlantViewModel
import com.chachaup.iplant.vm.IPlantViewModelFactory

class SignupFragment : Fragment() {
    private lateinit var binding: FragmentSignupBinding
    private val sharedViewModel: IPlantViewModel by activityViewModels {
        IPlantViewModelFactory((activity?.application as IPlantApplication).repo)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =  DataBindingUtil.inflate(inflater, R.layout.fragment_signup, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            buttonSignupCA.setOnClickListener{
                sharedViewModel.addUser(editTextFullNameCA.text.toString(),editTextEmailCA.text.toString(),editTextPasswordCA.text.toString())
                toast("success")
                editTextEmailCA.text?.clear()
                editTextPasswordCA.text?.clear()
                editTextFullNameCA.text?.clear()
                editTextConfirmPasswordCA.text?.clear()
            }
        }
    }

}