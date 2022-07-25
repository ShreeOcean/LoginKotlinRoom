package com.ocean.loginkotlindemo.viewModelFactory

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ocean.loginkotlindemo.db.SignUpRepository
import com.ocean.loginkotlindemo.viewModel.LoginViewModel
import java.lang.IllegalArgumentException

class LoginViewModelFactory(private val repository: SignUpRepository,
                            private val application: Application):ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(LoginViewModel::class.java)){
            return LoginViewModel(repository, application) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}