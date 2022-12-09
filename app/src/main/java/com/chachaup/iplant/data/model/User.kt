package com.chachaup.iplant.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_users")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    @ColumnInfo(name="name") val name: String,
    @ColumnInfo(name="email") val email: String,
    @ColumnInfo(name="pass") val password: String
)
