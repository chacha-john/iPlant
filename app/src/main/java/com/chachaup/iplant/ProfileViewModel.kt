package com.chachaup.iplant

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel: ViewModel() {
    private val _fullName: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val fullName: LiveData<String> get() = _fullName

    private val _email: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val email: LiveData<String> get() = _email

    private val _password: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val password: LiveData<String> get() = _password

    private val _confirmPassword: MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val confirmPassword: LiveData<String> get() = _confirmPassword


}