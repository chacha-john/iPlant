package com.chachaup.iplant.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.chachaup.iplant.data.model.User

@Dao
interface IPlantDao {
    //create function
    @Insert
    suspend fun newUser(user: User)

    @Query("SELECT * FROM tbl_users WHERE email = :email")
    suspend fun findByEmail(email: String): User

}