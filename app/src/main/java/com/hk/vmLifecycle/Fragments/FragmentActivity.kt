package com.hk.vmLifecycle.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.hk.vmLifecycle.R
import com.hk.vmLifecycle.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var dataBinding: ActivityFragmentBinding
    private lateinit var fragmentManager : FragmentManager
    private val TAG = "FragmentActivity"
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_fragment)
        Log.d(TAG, "onCreate")
        fragmentManager = supportFragmentManager

        fragmentManager.addOnBackStackChangedListener {
            dataBinding.txtBackStackCount.text = "back Stack Count - ${fragmentManager.backStackEntryCount}"
        }

        dataBinding.addWithBackstack.setOnClickListener(this)
        dataBinding.addWithoutBackstack.setOnClickListener(this)
        dataBinding.replaceWithBackstack.setOnClickListener(this)
        dataBinding.replaceWithoutBackstack.setOnClickListener(this)
    }

    private fun chooseFragment(mode: String) : Fragment? {
        val currentFragment = fragmentManager.findFragmentById(R.id.fragment_container)
        return if(currentFragment == null) {
            FragmentA.newInstance(mode)
        } else {
            when (currentFragment) {
                is FragmentA -> {
                    FragmentB.newInstance(mode)
                }
                is FragmentB -> {
                    FragmentC.newInstance(mode)
                }
                is FragmentC -> {
                    FragmentA.newInstance(mode)
                }
                else -> {
                    FragmentA.newInstance(mode)
                }
            }
        }
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.add_with_backstack -> {
                val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.add(R.id.fragment_container, chooseFragment("add_with_backstack")!!)
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commit()
            }

            R.id.add_without_backstack -> {
                val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.add(R.id.fragment_container, chooseFragment("add_without_backstack")!!)
                fragmentTransaction.commit()
            }

            R.id.replace_with_backstack -> {
                val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.fragment_container, chooseFragment("replace_with_backstack")!!)
                fragmentTransaction.addToBackStack(null)
                fragmentTransaction.commit()
            }

            R.id.replace_without_backstack -> {
                val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.fragment_container, chooseFragment("replace_without_backstack")!!)
                fragmentTransaction.commit()
            }
        }
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }


}