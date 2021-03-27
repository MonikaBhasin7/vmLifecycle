package com.hk.vmLifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {

    val TAG = "SecondActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "OnCreate")
        println("The saved Instance is - ${savedInstanceState?.getString("vishMon")}")
        setContentView(R.layout.activity_second)
    }

    /**
     * Instead of restoring the state during onCreate() you may choose to implement onRestoreInstanceState(),
     * which the system calls after the onStart() method. The system calls onRestoreInstanceState()
     * only if there is a saved state to restore, so you do not need to check whether the Bundle is null:
     */
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "OnRestoreStateInstanceState")
    }

    /**
     * As your activity begins to stop, the system calls the onSaveInstanceState() method so your activity
     * can save state information to an instance state bundle. The default implementation of this method
     * saves transient information about the state of the activity's view hierarchy, such as the text in
     * an EditText widget or the scroll position of a ListView widget.
     */
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.run {
            putString("vishMon", "vvvmmm")
        }
        Log.d(TAG, "onSaveInstanceState")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    /**
     * This is the state in which the app interacts with the user.
     * The app stays in this state until something happens to take focus away from the app.
     * When an interruptive event occurs, the activity enters the Paused state, and the system invokes the onPause() callback.
     */
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")

    }

    /**
     * The system calls this method as the first indication that the user is leaving your activity
     * (though it does not always mean the activity is being destroyed); it indicates that the activity
     * is no longer in the foreground (though it may still be visible if the user is in multi-window mode).
     * You can also use the onPause() method to release system resources, handles to sensors (like GPS),
     * or any resources that may affect battery life while your activity is paused and the user does not need them.
     * However, as mentioned above in the onResume() section, a Paused activity may still be fully visible
     * if in multi-window mode. As such, you should consider using onStop() instead of onPause()
     * to fully release or adjust UI-related resources and operations to better support multi-window mode.
     * Completion of the onPause() method does not mean that the activity leaves the Paused state.
     * Rather, the activity remains in this state until either the activity resumes or becomes completely invisible
     * to the user. If the activity resumes, the system once again invokes the onResume() callback.
     * If the activity returns from the Paused state to the Resumed state, the system keeps the Activity
     * instance resident in memory, recalling that instance when the system invokes onResume().
     * In this scenario, you don’t need to re-initialize components that were created during any
     * of the callback methods leading up to the Resumed state.
     */
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    /**
     * n the onStop() method, the app should release or adjust resources that are not needed while
     * the app is not visible to the user. For example, your app might pause animations or switch
     * from fine-grained to coarse-grained location updates. Using onStop() instead of onPause()
     * ensures that UI-related work continues, even when the user is viewing your activity in multi-window mode.
     * ou should also use onStop() to perform relatively CPU-intensive shutdown operations.
     * For example, if you can't find a more opportune time to save information to a database, you might do so during onStop().
     * When your activity enters the Stopped state, the Activity object is kept resident in memory: It maintains
     * all state and member information, but is not attached to the window manager. When the activity resumes,
     * the activity recalls this information. You don’t need to re-initialize components that were created
     * during any of the callback methods leading up to the Resumed state. The system also keeps
     * track of the current state for each View object in the layout, so if the user entered text into an
     * EditText widget, that content is retained so you don't need to save and restore it.
     * From the Stopped state, the activity either comes back to interact with the user, or the activity is finished running and goes away.
     * If the activity comes back, the system invokes onRestart(). If the Activity is finished running, the system calls onDestroy()
     */
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

}