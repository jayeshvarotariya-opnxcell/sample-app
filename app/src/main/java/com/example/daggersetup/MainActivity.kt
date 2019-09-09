package com.example.daggersetup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggersetup.di.DaggerMainComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var user : User

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        DaggerMainComponent.factory()
            .create("Test user","123")
            .inject(this)

        user.print()

    }




}
