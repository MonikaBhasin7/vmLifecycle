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






Launch Modes -
    1. Standard -This is the default launch mode of activity. If you don’t set any launch mode to your activity, it will use the standard mode by default. It creates a new instance of activity every time even if activity instance is already present.
                 Suppose we have A, B, C, and D activities and your activity B has standard launch mode. Now again launching activity B
                 State of Activity Stack before launch B
                 A →B→ C→D
                 State of Activity Stack after launch B
                 A → B → C→D→ B
                 We can see that new instance of B is created again.


    2. Single Top - If an instance of activity already exists at the top of the current task, a new instance
                    will not be created and the Android system will route the intent information through onNewIntent().
                    If an instance is not present on top of the task then a new instance will be created.
                    Suppose we have A, B, C, and D activities. A →B →C →D
                    If we launch C then a new instance of C will be created as it is not on top.
                    So it will look like A →B →C →D →C
                    Now suppose we have A →B →C →D →C like this
                    then we if again launch C activity then in this case new instance will not be created.
                    Instead, we will receive the callback on onNewIntent() method.




   Add Fragments without Backstack
   -------------------------------
2021-03-29 21:32:07.959 23549-23549/com.hk.vmLifecycle D/F-A: onAttach
2021-03-29 21:32:07.959 23549-23549/com.hk.vmLifecycle D/F-A: onCreate
2021-03-29 21:32:07.967 23549-23549/com.hk.vmLifecycle D/F-A: onCreateView
2021-03-29 21:32:07.967 23549-23549/com.hk.vmLifecycle D/F-A: onActivityCreated
2021-03-29 21:32:07.967 23549-23549/com.hk.vmLifecycle D/F-A: onStart
2021-03-29 21:32:07.968 23549-23549/com.hk.vmLifecycle D/F-A: onResume
2021-03-29 21:32:13.591 23549-23549/com.hk.vmLifecycle D/F-B: onAttach
2021-03-29 21:32:13.591 23549-23549/com.hk.vmLifecycle D/F-B: onCreate
2021-03-29 21:32:13.597 23549-23549/com.hk.vmLifecycle D/F-B: onCreateView
2021-03-29 21:32:13.597 23549-23549/com.hk.vmLifecycle D/F-B: onActivityCreated
2021-03-29 21:32:13.597 23549-23549/com.hk.vmLifecycle D/F-B: onStart
2021-03-29 21:32:13.597 23549-23549/com.hk.vmLifecycle D/F-B: onResume
2021-03-29 21:32:22.094 23549-23549/com.hk.vmLifecycle D/F-A: onPause
2021-03-29 21:32:22.094 23549-23549/com.hk.vmLifecycle D/F-B: onPause
2021-03-29 21:32:22.709 23549-23549/com.hk.vmLifecycle D/F-A: onStop
2021-03-29 21:32:22.709 23549-23549/com.hk.vmLifecycle D/F-B: onStop
2021-03-29 21:32:22.711 23549-23549/com.hk.vmLifecycle D/F-A: onDestroyView
2021-03-29 21:32:22.712 23549-23549/com.hk.vmLifecycle D/F-A: onDestroy
2021-03-29 21:32:22.712 23549-23549/com.hk.vmLifecycle D/F-A: onDetach
2021-03-29 21:32:22.712 23549-23549/com.hk.vmLifecycle D/F-B: onDestroyView
2021-03-29 21:32:22.713 23549-23549/com.hk.vmLifecycle D/F-B: onDestroy
2021-03-29 21:32:22.713 23549-23549/com.hk.vmLifecycle D/F-B: onDetach


Replace with BackStack
-----------------------


2021-03-29 21:34:04.267 23549-23549/com.hk.vmLifecycle D/F-A: onAttach
2021-03-29 21:34:04.267 23549-23549/com.hk.vmLifecycle D/F-A: onCreate
2021-03-29 21:34:04.277 23549-23549/com.hk.vmLifecycle D/F-A: onCreateView
2021-03-29 21:34:04.278 23549-23549/com.hk.vmLifecycle D/F-A: onActivityCreated
2021-03-29 21:34:04.278 23549-23549/com.hk.vmLifecycle D/F-A: onStart
2021-03-29 21:34:04.278 23549-23549/com.hk.vmLifecycle D/F-A: onResume
2021-03-29 21:34:08.031 23549-23549/com.hk.vmLifecycle D/F-B: onAttach
2021-03-29 21:34:08.031 23549-23549/com.hk.vmLifecycle D/F-B: onCreate
2021-03-29 21:34:08.032 23549-23549/com.hk.vmLifecycle D/F-A: onPause
2021-03-29 21:34:08.032 23549-23549/com.hk.vmLifecycle D/F-A: onStop
2021-03-29 21:34:08.032 23549-23549/com.hk.vmLifecycle D/F-A: onDestroyView
2021-03-29 21:34:08.040 23549-23549/com.hk.vmLifecycle D/F-B: onCreateView
2021-03-29 21:34:08.041 23549-23549/com.hk.vmLifecycle D/F-B: onActivityCreated
2021-03-29 21:34:08.041 23549-23549/com.hk.vmLifecycle D/F-B: onStart
2021-03-29 21:34:08.041 23549-23549/com.hk.vmLifecycle D/F-B: onResume
2021-03-29 21:35:05.395 23549-23549/com.hk.vmLifecycle D/F-B: onPause
2021-03-29 21:35:05.395 23549-23549/com.hk.vmLifecycle D/F-B: onStop
2021-03-29 21:35:05.395 23549-23549/com.hk.vmLifecycle D/F-B: onDestroyView
2021-03-29 21:35:05.397 23549-23549/com.hk.vmLifecycle D/F-B: onDestroy
2021-03-29 21:35:05.397 23549-23549/com.hk.vmLifecycle D/F-B: onDetach
2021-03-29 21:35:05.405 23549-23549/com.hk.vmLifecycle D/F-A: onCreateView
2021-03-29 21:35:05.405 23549-23549/com.hk.vmLifecycle D/F-A: onActivityCreated
2021-03-29 21:35:05.406 23549-23549/com.hk.vmLifecycle D/F-A: onStart
2021-03-29 21:35:05.406 23549-23549/com.hk.vmLifecycle D/F-A: onResume
2021-03-29 21:35:46.399 23549-23549/com.hk.vmLifecycle D/F-A: onPause
2021-03-29 21:35:46.399 23549-23549/com.hk.vmLifecycle D/F-A: onStop
2021-03-29 21:35:46.399 23549-23549/com.hk.vmLifecycle D/F-A: onDestroyView
2021-03-29 21:35:46.400 23549-23549/com.hk.vmLifecycle D/F-A: onDestroy
2021-03-29 21:35:46.400 23549-23549/com.hk.vmLifecycle D/F-A: onDetach



*/