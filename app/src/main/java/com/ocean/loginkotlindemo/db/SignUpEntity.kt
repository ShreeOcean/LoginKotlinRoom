package com.ocean.loginkotlindemo.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sign_up_user_table")
data class SignUpEntity (

    @PrimaryKey(autoGenerate = true)
    var user_id: Int = 0,
    @ColumnInfo(name = "first_name")
    var first_name: String,
    @ColumnInfo(name = "last_name")
    var last_name: String,
    @ColumnInfo(name = "user_name")
    var user_name: String,
    @ColumnInfo(name = "password")
    var password: String
)