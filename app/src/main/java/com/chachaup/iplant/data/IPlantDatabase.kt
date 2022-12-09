package com.chachaup.iplant.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.chachaup.iplant.data.model.User

@Database(entities = arrayOf(User::class), exportSchema = false, version = 1)
abstract class IPlantDatabase: RoomDatabase() {
    abstract fun getDao(): IPlantDao

    companion object {
        @Volatile
        private var INSTANCE: IPlantDatabase? = null

        fun getInstance(context: Context): IPlantDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    IPlantDatabase::class.java,
                    "iplant"
                )
                    .build()
                INSTANCE = instance

                instance
            }
        }
    }
}