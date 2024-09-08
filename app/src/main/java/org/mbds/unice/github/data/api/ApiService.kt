package org.mbds.unice.github.data.api

import org.mbds.unice.github.data.model.User

interface ApiService {
    fun getUsers(): List<User>
    fun addRandomUser()
    fun deleteUser(username: User)
    fun activer(user: User,yes : Boolean)
    fun sortByNameASC(yes : Boolean)
    fun sortByDateASC(yes : Boolean)
    fun sortByStatusACTIVE(yes : Boolean)
}