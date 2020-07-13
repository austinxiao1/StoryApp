package com.kbs.storyapp.utils

import androidx.annotation.MainThread
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

fun <T> LiveData<T>.immutable(): LiveData<T> {
    return this
}

@MainThread
fun <T> Fragment.observe(liveData: LiveData<T>, observer: (t: T) -> Unit) {
    liveData.observe(viewLifecycleOwner, Observer { observer(it) })
}