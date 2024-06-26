package com.tony.cleanarchitecture.user.domain.repositoryInterface

import com.tony.cleanarchitecture.user.domain.entity.UserEntity

interface UserRepository {
    suspend fun getData(): List<UserEntity>
}