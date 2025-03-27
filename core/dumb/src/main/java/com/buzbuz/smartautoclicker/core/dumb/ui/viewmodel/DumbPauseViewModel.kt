package com.buzbuz.smartautoclicker.core.dumb.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DumbPauseViewModel : ViewModel() {

    val isRandomized = MutableLiveData<Boolean>(true)
    val fixedPauseDurationMs = MutableLiveData<Long>(0)

    fun onRandomizedCheckedChanged(isChecked: Boolean) {
        isRandomized.value = isChecked
    }

    fun onFixedPauseDurationChanged(duration: String) {
        fixedPauseDurationMs.value = duration.toLongOrNull() ?: 0
    }
}