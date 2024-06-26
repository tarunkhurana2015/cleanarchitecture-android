package com.tony.cleanarchitecture.user.data.api

import com.tony.cleanarchitecture.user.data.model.UserDto

interface Api {
    fun getData(): List<UserDto>
}