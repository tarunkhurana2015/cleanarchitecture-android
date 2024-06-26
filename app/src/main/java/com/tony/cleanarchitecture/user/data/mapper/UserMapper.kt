package com.tony.cleanarchitecture.user.data.mapper

import com.tony.cleanarchitecture.user.data.model.UserDto
import com.tony.cleanarchitecture.user.domain.entity.UserEntity

fun UserDto.toUserEntity(): UserEntity {
    return UserEntity(
        name = name ?: "unknown"
    )
}