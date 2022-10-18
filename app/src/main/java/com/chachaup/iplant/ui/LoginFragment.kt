package com.chachaup.iplant.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import com.chachaup.iplant.R
import com.chachaup.iplant.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): ConstraintLayout {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val view = binding.root
        val btnLogin = binding.buttonLogin
        val username = binding.editTextFullNameLogin
        val password = binding.editTextPasswordLogin
        val signupLink = binding.textViewSignupLinkLogin

        btnLogin.setOnClickListener{
            if (username.text?.isBlank() == true && password.text?.isBlank() == true){
                username.error = "Name required!"
                password.error = "Password required!"
            }
            else if (username.text?.isBlank() == true && password.text?.isBlank() == false){
                username.error = "Name required!"
            }
            else if(username.text?.isBlank() == false && password.text?.isBlank() == true){
                password.error = "Password required!"
            }
            else{
                Toast.makeText(context, "Welcome to Jumanji", Toast.LENGTH_SHORT).show()
            }

        }
        signupLink.setOnClickListener{
            findNavController().navigate(R.id.action_loginFragment_to_signupFragment)
        }
        return view

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}