package org.mbds.unice.github.data.repository

import org.mbds.unice.github.data.api.ApiService
import org.mbds.unice.github.data.model.User

class UserRepository(
    private val apiService: ApiService
) {
    fun getUsers(): List<User> {
        return apiService.getUsers()
    }

    fun addRandomUser() {
        apiService.addRandomUser()
    }

    fun deleteUser(user: User) {
        apiService.deleteUser(user)
    }

    fun actifUser(user: User, actif : Boolean) {
        apiService.activer(user,actif)
    }
    fun sortByNameASC(yes : Boolean) {
        apiService.sortByNameASC(yes)
    }
    fun sortByDateASC(yes : Boolean) {
        apiService.sortByDateASC(yes)
    }
    fun sortByStatusACTIVE(yes : Boolean) {
        apiService.sortByStatusACTIVE(yes)
    }
}