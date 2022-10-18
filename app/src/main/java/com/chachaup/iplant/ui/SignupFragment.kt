package com.chachaup.iplant.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import com.chachaup.iplant.R
import com.chachaup.iplant.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {
    private lateinit var binding: FragmentSignupBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =  DataBindingUtil.inflate(inflater, R.layout.fragment_signup, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fullName = binding.editTextFullNameCA
        val email = binding.editTextEmailCA
        val password = binding.editTextPasswordCA
        val confirmPassword = binding.editTextConfirmPasswordCA
        binding.buttonSignupCA.setOnClickListener{
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
    }

}