package com.example.wizardcode.screens.login

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch

class LoginScreenViewModel : ViewModel() {

   private val auth : FirebaseAuth = Firebase.auth
    private val _loading = MutableLiveData(false)

    fun signInWithEmailAndPassword(email : String, password : String, home : ()-> Unit )
     = viewModelScope.launch {
         try {
             auth.signInWithEmailAndPassword(email, password)
                 .addOnCompleteListener { task ->
                     if (task.isSuccessful) {
                         home()
                     }
                     else {

                     }
                 }
         } catch(ex:Exception){
             Log.d("WizardCode", "signInWithEmailAndPassword: ${ex.message}")

         }
    }

    fun createWithEmailAndPassword(
        email : String,
        password : String,
        home : () -> Unit
    ) {
        if (_loading.value == false) {
            _loading.value = true
            auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener {task ->
                    if (task.isSuccessful) {
                        home()
                    } else{
                        //
                    }
                    _loading.value = false
                }
        }
    }
}