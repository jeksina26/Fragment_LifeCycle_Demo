package com.example.fragmentlifecycle_demo

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Fragmentlifecycle : Fragment() {

    lateinit var mess : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("mess","Call OnCrete Method")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fragmentlifecycle,container,false)
        Log.d("mess","Call OnCreateView Method")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("mess","Call OnAttach Method")
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("mess","Call ActivityCreated Method")
    }

    override fun onStart() {
        super.onStart()
        Log.d("mess","Call OnStart Method")
    }

    override fun onResume() {
        super.onResume()
        Log.d("mess","Call Resume Method")
    }

    override fun onPause() {
        super.onPause()
        Log.d("mess","Call OnPause Method")
    }

    override fun onStop() {
        super.onStop()
        Log.d("mess","Call OnStop Method")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("mess","Call OnDestroyView Method")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("mess","Call onDestroy Method")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("mess","Call OnDetech Method")
    }
}