package com.taein.baseobservabletest

/* MainActivity.kt */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.taein.baseobservabletest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    private lateinit var mUser: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (DataBindingUtil.setContentView(this, R.layout.activity_main)
                as ActivityMainBinding)
            .apply {
                mUser = User()
                mUser.firstName = "firstName"
                mUser.lastName = "LastName"
                user = mUser
            }
    }
}
