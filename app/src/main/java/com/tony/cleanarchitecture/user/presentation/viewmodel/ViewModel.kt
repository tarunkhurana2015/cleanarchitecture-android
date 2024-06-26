package com.tony.cleanarchitecture.user.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tony.cleanarchitecture.user.domain.repositoryInterface.UserRepository
import kotlinx.coroutines.launch

class ViewModel(
    val repository: UserRepository
) : ViewModel() {
    init {
        viewModelScope.launch {
            repository.getData()
        }

    }
}