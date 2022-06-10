package com.example.clase3_b_fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.clase3_b_fragments.R


class LightFragment : Fragment() {

    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var listener: LightFragmentListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val myView = inflater.inflate(R.layout.fragment_light, container, false)

        textView = myView.findViewById(R.id.textView)
        button = myView.findViewById(R.id.button)

        button.setOnClickListener{
            listener.callBackToActivity()
        }
        return myView
    }

    fun setListener(listener: LightFragmentListener) {
        this.listener = listener
    }
}