package com.pemwa.mvvmpattern.base

import androidx.lifecycle.ViewModel
import com.pemwa.mvvmpattern.injection.component.DaggerViewModelInjector
import com.pemwa.mvvmpattern.injection.component.ViewModelInjector
import com.pemwa.mvvmpattern.injection.module.NetworkModule
import com.pemwa.mvvmpattern.ui.post.PostListViewModel

abstract class BaseViewModel: ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}