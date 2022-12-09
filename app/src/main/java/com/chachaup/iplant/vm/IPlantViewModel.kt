package com.chachaup.iplant.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chachaup.iplant.data.IPlantDao
import com.chachaup.iplant.data.IPlantRepository
import com.chachaup.iplant.data.model.User
import kotlinx.coroutines.launch

class IPlantViewModel(private val iPlantRepository: IPlantRepository): ViewModel() {
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

    fun addUser(name: String, email: String, pass:String) = viewModelScope.launch{
        val user = User(0,name,email,pass)
        iPlantRepository.newUser(user)
    }


}