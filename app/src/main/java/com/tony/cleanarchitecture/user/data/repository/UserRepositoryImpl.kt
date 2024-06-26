package com.tony.cleanarchitecture.user.data.repository

import com.tony.cleanarchitecture.user.data.api.Api
import com.tony.cleanarchitecture.user.data.mapper.toUserEntity
import com.tony.cleanarchitecture.user.domain.entity.UserEntity
import com.tony.cleanarchitecture.user.domain.repositoryInterface.UserRepository

class UserRepositoryImpl(
    val api: Api
): UserRepository {
    override suspend fun getData(): List<UserEntity> {
        return api.getData().map { it.toUserEntity() }
    }
}