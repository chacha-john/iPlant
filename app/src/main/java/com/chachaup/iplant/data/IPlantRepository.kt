package com.chachaup.iplant.data

import com.chachaup.iplant.data.model.User

class IPlantRepository(private val iPlantDao: IPlantDao) {

    suspend fun newUser(user: User){
        iPlantDao.newUser(user)
    }
    suspend fun findByEmail(email: String): User{
        return iPlantDao.findByEmail(email)
    }
}