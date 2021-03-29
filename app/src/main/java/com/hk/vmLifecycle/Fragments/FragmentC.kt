package com.hk.vmLifecycle.Fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.hk.vmLifecycle.R

// TODO: Rename parameter arguments, choose names that match

class FragmentC : Fragment() {
    var modeFragment: String? = null
    private lateinit var txtMode: TextView
    val TAG = "F-C"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")
        arguments?.let {
            modeFragment = it.getString(modeFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view : View? = inflater.inflate(R.layout.fragment_c, container, false)
        Log.d(TAG, "onCreateView")
        txtMode = view?.findViewById(R.id.txt_mode)!!
        return view
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
        txtMode.text  = modeFragment
    }

    companion object {
        @JvmStatic
        fun newInstance(mode: String) =
            FragmentC().apply {
                arguments = Bundle().apply {
                    putString(modeFragment, mode)
                }
            }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "onAttach")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach")
    }
}