package com.hk.vmLifecycle.LaunchModes

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import com.hk.vmLifecycle.BaseActivity
import com.hk.vmLifecycle.R

class C : BaseActivity(), View.OnClickListener {

    private lateinit var btnA : Button
    private lateinit var btnB : Button
    private lateinit var btnC : Button
    private lateinit var btnD : Button
    private lateinit var tvTasksInfo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        btnA = findViewById(R.id.btn_a)
        btnB = findViewById(R.id.btn_b)
        btnC = findViewById(R.id.btn_c)
        btnD = findViewById(R.id.btn_d)
        tvTasksInfo = findViewById(R.id.txt_task_info)

        btnA.setOnClickListener(this)
        btnB.setOnClickListener(this)
        btnC.setOnClickListener(this)
        btnD.setOnClickListener(this)
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onStart() {
        super.onStart()

        tvTasksInfo.text = getTasksStackInfo()
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_a -> startActivity(Intent(this, A::class.java))
            R.id.btn_b -> startActivity(Intent(this, B::class.java))
            R.id.btn_c -> startActivity(Intent(this, C::class.java))
            R.id.btn_d -> startActivity(Intent(this, D::class.java))
        }
    }
}