package com.ocean.loginkotlindemo.db

class SignUpRepository(private val dao: SignUpDbDao) {

    val users = dao.getAllUser()

    suspend fun insert(user: SignUpEntity){
        return dao.insert(user)
    }

    suspend fun getUserName(userName: String): SignUpEntity?{
        return dao.getUserName(userName)
    }
}