package com.example.android.basicandroidaccessibility

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class LocalizingStringFragment : Fragment() {

    private lateinit var doSomething: Button;
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_localizing_string, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        doSomething = view.findViewById(R.id.localizing_button)

        doSomething.setOnClickListener {
            showToast();
        }
    }

    private fun showToast(){
        Toast.makeText(this.context, R.string.toast, Toast.LENGTH_SHORT).show()
    }
}