package com.hk.vmLifecycle

/*2021-02-17 08:27:43.201 399-399/com.hk.vmLifecycle I/System.out: OnCreate
2021-02-17 08:27:43.329 399-399/com.hk.vmLifecycle I/System.out: onStart
2021-02-17 08:27:43.339 399-399/com.hk.vmLifecycle I/System.out: onResume
2021-02-17 08:28:29.780 399-399/com.hk.vmLifecycle I/System.out: onPause
2021-02-17 08:28:29.832 399-399/com.hk.vmLifecycle I/System.out: onSaveInstanceState
2021-02-17 08:28:29.834 399-399/com.hk.vmLifecycle I/System.out: onStop
2021-02-17 08:28:47.916 399-399/com.hk.vmLifecycle I/System.out: onRestart
2021-02-17 08:28:47.920 399-399/com.hk.vmLifecycle I/System.out: onStart
2021-02-17 08:28:47.922 399-399/com.hk.vmLifecycle I/System.out: onResume
2021-02-17 08:28:52.475 399-399/com.hk.vmLifecycle I/System.out: onPause
2021-02-17 08:28:52.715 399-399/com.hk.vmLifecycle I/System.out: onStop
2021-02-17 08:28:52.717 399-399/com.hk.vmLifecycle I/System.out: onDestroy
2021-02-17 08:29:01.640 399-399/com.hk.vmLifecycle I/System.out: OnCreate
2021-02-17 08:29:01.671 399-399/com.hk.vmLifecycle I/System.out: onStart
2021-02-17 08:29:01.676 399-399/com.hk.vmLifecycle I/System.out: onResume
*/


/*
    Opens the First Activity and opens the SecondActivity on button click and go back from SecondActivity
    to  First Activity by back button press.


2021-03-28 02:14:58.479 27087-27087/com.hk.vmLifecycle D/FirstActivity: OnCreate
2021-03-28 02:14:58.602 27087-27087/com.hk.vmLifecycle D/FirstActivity: onStart
2021-03-28 02:14:58.605 27087-27087/com.hk.vmLifecycle D/FirstActivity: onResume
2021-03-28 02:15:19.581 27087-27087/com.hk.vmLifecycle D/FirstActivity: onPause
2021-03-28 02:15:19.596 27087-27087/com.hk.vmLifecycle D/SecondActivity: OnCreate
2021-03-28 02:15:19.618 27087-27087/com.hk.vmLifecycle D/SecondActivity: onStart
2021-03-28 02:15:19.619 27087-27087/com.hk.vmLifecycle D/SecondActivity: onResume
2021-03-28 02:15:20.196 27087-27087/com.hk.vmLifecycle D/FirstActivity: onStop
2021-03-28 02:15:20.198 27087-27087/com.hk.vmLifecycle D/FirstActivity: onSaveInstanceState
2021-03-28 02:15:51.663 27087-27087/com.hk.vmLifecycle D/SecondActivity: onPause
2021-03-28 02:15:51.669 27087-27087/com.hk.vmLifecycle D/FirstActivity: onRestart
2021-03-28 02:15:51.672 27087-27087/com.hk.vmLifecycle D/FirstActivity: onStart
2021-03-28 02:15:51.673 27087-27087/com.hk.vmLifecycle D/FirstActivity: onResume
2021-03-28 02:15:52.257 27087-27087/com.hk.vmLifecycle D/SecondActivity: onStop
2021-03-28 02:15:52.258 27087-27087/com.hk.vmLifecycle D/SecondActivity: onDestroy

*/