package com.ocean.loginkotlindemo.viewModel

import android.app.Application
import androidx.databinding.Observable
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ocean.loginkotlindemo.db.SignUpRepository

class SignUpViewModel(private val repository: SignUpRepository, application: Application):
                        AndroidViewModel(application), Observable{

    val users = repository.users
    val userFirstName = MutableLiveData<String>()
    val userLastName = MutableLiveData<String>()
    val userName = MutableLiveData<String>()
    val password = MutableLiveData<String>()

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        TODO("Not yet implemented")
    }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        TODO("Not yet implemented")
    }

    fun submitButton(){
        if (userFirstName.value == null || userLastName.value == null || userName.value == null || password.value == null){

        }
    }
}