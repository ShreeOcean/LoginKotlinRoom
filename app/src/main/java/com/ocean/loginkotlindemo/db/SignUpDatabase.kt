package com.ocean.loginkotlindemo.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

/** Room Database */
@Database(entities = [SignUpEntity::class], version = 1, exportSchema = false)
abstract class SignUpDatabase: RoomDatabase() {

        abstract var signUpDbDao: SignUpDbDao
        companion object{

            @Volatile
            private var INSTANCE: SignUpDatabase? = null

            fun getInstance(context: Context): SignUpDatabase{
                synchronized(this){

                    var instance = INSTANCE
                    if (instance == null){

                        instance = Room.databaseBuilder(context.applicationContext,
                                                        SignUpDatabase::class.java,
                                                        "user_details_db")
                            .fallbackToDestructiveMigration().build()

                        INSTANCE = instance
                    }
                    return instance
                }
            }
        }
}