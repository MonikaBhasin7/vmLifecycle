package com.hk.vmLifecycle

import android.app.ActivityManager
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    lateinit var activityManager: ActivityManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        activityManager = getSystemService(ACTIVITY_SERVICE) as ActivityManager
    }

    @RequiresApi(Build.VERSION_CODES.Q)
    fun getTasksStackInfo(): String {
        val taskInfo = activityManager.getRunningTasks(10)
        var str : String = ""
        str = "$str Number of tasks : ${taskInfo.size} \n"
        for (info in taskInfo) {
            str = "$str task Id : ${info.id} \n Number of Activities : ${info.numActivities}\n"
            //str = "$str Number of Activities - $info.numActivities\n"
            str = "$str Top Activity : ${info.topActivity?.className?.replace("com.hk.vmLifecycle","")} \n"
            str = "$str Root Activity : ${info.baseActivity?.className?.replace("com.hk.vmLifecycle","")} \n"
            str = "$str \n\n"
        }
        return str
    }
}