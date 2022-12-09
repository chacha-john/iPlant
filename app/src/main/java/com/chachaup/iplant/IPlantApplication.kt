package com.chachaup.iplant

import android.app.Application
import com.chachaup.iplant.data.IPlantDatabase
import com.chachaup.iplant.data.IPlantRepository

class IPlantApplication: Application() {
    private val database by lazy { IPlantDatabase.getInstance(this) }
    val repo by lazy { IPlantRepository(database.getDao())}
}