package com.chachaup.iplant.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
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
                toast("Account created successfully")
                editTextEmailCA.text?.clear()
                editTextPasswordCA.text?.clear()
                editTextFullNameCA.text?.clear()
                editTextConfirmPasswordCA.text?.clear()
                findNavController().navigate(R.id.action_signupFragment_to_loginFragment2)
            }
        }
    }

}