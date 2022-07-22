package com.ocean.loginkotlindemo.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SignUpDbDao {

    @Insert
    suspend fun insert(signUpEntity: SignUpEntity)

    @Query("SELECT * FROM sign_up_user_table ORDER BY user_id DESC")
    fun getAllUser(): LiveData<List<SignUpEntity>>

    @Query("SELECT * FROM sign_up_user_table WHERE user_name LIKE :user_name")
    suspend fun getUserName(user_name: String): SignUpEntity?


}