package com.chachaup.iplant.auth.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.chachaup.iplant.R
import com.chachaup.iplant.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {
    private var _binding: FragmentSignupBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): ConstraintLayout {
        _binding =  FragmentSignupBinding.inflate(inflater, container, false)
        val view = binding.root
        val fullName = binding.editTextFullNameCA
        val email = binding.editTextEmailCA
        val password = binding.editTextPasswordCA
        val confirmPassword = binding.editTextConfirmPasswordCA
        val btnSignup = binding.buttonSignupCA

        btnSignup.setOnClickListener{
            if (!fullName.text.isNullOrBlank() && !email.text.isNullOrBlank() && !password.text.isNullOrBlank() && !confirmPassword.text.isNullOrBlank()){
                Toast.makeText(context, "Welcome to Jumanji", Toast.LENGTH_SHORT).show()
            }
            if (fullName.text.isNullOrBlank()){
                fullName.error = "Required"
            }
            if(email.text.isNullOrBlank()){
                email.error = "Required"
            }
            if(password.text.isNullOrBlank()){
                password.error = "Required"
            }
            if (confirmPassword.text.isNullOrBlank()){
                confirmPassword.error = "Required"
            }
        }
        return view
    }

}