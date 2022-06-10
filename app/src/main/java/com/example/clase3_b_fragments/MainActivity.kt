package com.example.clase3_b_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clase3_b_fragments.fragments.DarkFragment
import com.example.clase3_b_fragments.fragments.LightFragment
import com.example.clase3_b_fragments.fragments.LightFragmentListener

class MainActivity : AppCompatActivity(), LightFragmentListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lightFragment = LightFragment()
        supportFragmentManager.beginTransaction().add(R.id.fragmentContainerView, lightFragment).commit()
        lightFragment.setListener(this)
    }

    override fun callBackToActivity() {
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, DarkFragment()).addToBackStack(null).commit()
    }
}