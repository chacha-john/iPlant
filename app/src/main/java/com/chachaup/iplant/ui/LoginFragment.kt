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
import com.chachaup.iplant.databinding.FragmentLoginBinding
import com.chachaup.iplant.utils.toast
import com.chachaup.iplant.vm.IPlantViewModel
import com.chachaup.iplant.vm.IPlantViewModelFactory

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    private val sharedVM: IPlantViewModel by activityViewModels {
        IPlantViewModelFactory((activity?.application as IPlantApplication).repo)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            val email = editTextEmailLogin.text.toString()
            val pass = editTextPasswordLogin.text.toString()
            textViewSignupLinkLogin.setOnClickListener{
                findNavController().navigate(R.id.action_loginFragment_to_signupFragment)
            }
            buttonLogin.setOnClickListener {
                sharedVM.login(email, pass)
            }

        }
    }


}