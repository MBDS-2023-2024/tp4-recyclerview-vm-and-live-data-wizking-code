package org.mbds.unice.github.data.api

import org.mbds.unice.github.data.model.User

class FakeApiService : ApiService {
    private val _users = FakeApiServiceGenerator.FAKE_USERS
    private val _usersRandom = FakeApiServiceGenerator.FAKE_USERS_RANDOM

    /**
     * Return a list of [User]
     * Those users must be generated by [FakeApiServiceGenerator]
     */
    override fun getUsers(): List<User> {
        return _users.toList()
    }


    /**
     * Generate a random [User] and add it [FakeApiService.users] list.
     * This user must be get from the [FakeApiServiceGenerator.FAKE_USERS_RANDOM] list.
     */
    override fun addRandomUser() {
        _users.add(_usersRandom.random())
    }

    /**
     * Delete a [User] from the [FakeApiService.users] list.
     */
    override fun deleteUser(username: User) {
        _users.remove(username)
    }

    override fun sortByNameASC(yes: Boolean) {
        if (yes) {
            _users.sortBy { it.login }
        } else {
            _users.sortByDescending { it.login }
        }
    }

    override fun sortByDateASC(yes: Boolean) {
        if (yes) {
            _users.sortBy { it.createdDate }
        } else {
            _users.sortByDescending { it.createdDate }
        }
    }

    override fun sortByStatusACTIVE(yes: Boolean) {
        if (yes) {
            _users.sortBy { it.isactif }
        } else {
            _users.sortByDescending { it.isactif }
        }
    }

    override fun searchByName(name: String): List<User> {
        val user = _users.filter {
            it.login.contains(name ?: "", ignoreCase = true)
        }.toMutableList()
        return user
    }

    override fun activer(user: User, yes: Boolean) {
        _users.remove(user)
        _users.add(User(user.id, user.login, user.avatarUrl, yes, user.createdDate))
    }
}