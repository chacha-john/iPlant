package com.chachaup.iplant.vm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.chachaup.iplant.data.IPlantDao
import com.chachaup.iplant.data.IPlantRepository

class IPlantViewModelFactory(private val iPlantRepository: IPlantRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(IPlantViewModel::class.java)){
            @Suppress("UNCHECKED_CAST")
            return IPlantViewModel(iPlantRepository) as T
        }
        throw IllegalArgumentException("Unknown viewModel class")
    }
}