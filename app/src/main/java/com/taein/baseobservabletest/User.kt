package com.taein.baseobservabletest

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class User : BaseObservable() {

    @get:Bindable
    var firstName: String = ""
        set(value) {
            field = value
            Log.d("test", "firstName value : ${value}")
            notifyPropertyChanged(BR.firstName)
        }

    @get:Bindable
    var lastName: String = ""
        set(value) {
            field = value
            Log.d("test", "lastName value : ${value}")
            notifyPropertyChanged(BR.lastName)
        }
}