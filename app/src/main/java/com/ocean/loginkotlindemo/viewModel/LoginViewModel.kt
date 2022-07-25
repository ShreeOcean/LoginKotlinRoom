package com.ocean.loginkotlindemo.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.ocean.loginkotlindemo.db.SignUpRepository
import androidx.databinding.Observable
import androidx.lifecycle.MutableLiveData

class LoginViewModel(private val repository: SignUpRepository, application: Application): AndroidViewModel(application),
    Observable {

    val users = repository.users


    val inputUserName = MutableLiveData<String>()

    val inputPassword = MutableLiveData<String>()

    /** Function triggered When the Login Button is Clicked, Via Binding. */
    fun loginButton(){
        //---TODO logic for code---
    }
    fun signUp(){
        //---TODO navigate to the Register Fragment---
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        TODO("Not yet implemented")
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        TODO("Not yet implemented")
    }
}