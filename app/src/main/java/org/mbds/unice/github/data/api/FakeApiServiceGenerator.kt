package org.mbds.unice.github.data.api

import org.mbds.unice.github.data.model.User
import java.util.*

object FakeApiServiceGenerator {

    @JvmField
    var FAKE_USERS = mutableListOf(
        User("001", "Jake", "https://www.freeiconspng.com/uploads/person-icon-red-31.png"),
        User("002", "Paul", "https://www.seekpng.com/png/detail/17-176376_person-free-download-and-person-icon-png.png"),
        User("003", "Phil", "https://www.vhv.rs/dpng/f/10-101667_person-icon-png.png"),
        User("004", "Guillaume", "https://www.freeiconspng.com/uploads/person-icon-red-31.png"),
        User("005", "Francis", "https://api.adorable.io/AVATARS/512/5.png"),
        User("006", "George", "https://www.freeiconspng.com/uploads/person-icon-red-31.png"),
        User("007", "Louis", "https://api.adorable.io/AVATARS/512/7.png"),
        User("008", "Mateo", "https://www.freeiconspng.com/uploads/person-icon-red-31.png"),
        User("009", "April", "https://api.adorable.io/AVATARS/512/9.png"),
        User("010", "Louise", "https://www.seekpng.com/png/detail/17-176376_person-free-download-and-person-icon-png.png"),
        User("011", "Elodie", "https://api.adorable.io/AVATARS/512/11.png"),
        User("012", "Helene", "https://www.freeiconspng.com/uploads/person-icon-red-31.png"),
        User("013", "Fanny", "https://www.seekpng.com/png/detail/17-176376_person-free-download-and-person-icon-png.png"),
        User("014", "Laura", "https://api.adorable.io/AVATARS/512/14.png"),
        User("015", "Gertrude", "https://www.freeiconspng.com/uploads/person-icon-red-31.png"),
        User("016", "Chloé", "https://www.seekpng.com/png/detail/17-176376_person-free-download-and-person-icon-png.png"),
        User("017", "April", "https://www.freeiconspng.com/uploads/person-icon-red-31.png"),
        User("018", "Marie", "https://www.seekpng.com/png/detail/17-176376_person-free-download-and-person-icon-png.png"),
        User("019", "Henri", "https://www.freeiconspng.com/uploads/person-icon-red-31.png"),
        User("020", "Rémi", "https://www.freeiconspng.com/uploads/person-icon-red-31.png")
    )

    @JvmField
    var FAKE_USERS_RANDOM = Arrays.asList(
        User("021", "Lea", "https://api.adorable.io/AVATARS/512/21.png"),
        User("022", "Geoffrey", "https://api.adorable.io/AVATARS/512/22.png"),
        User("023", "Simon", "https://api.adorable.io/AVATARS/512/23.png"),
        User("024", "André", "https://api.adorable.io/AVATARS/512/24.png"),
        User("025", "Leopold", "https://api.adorable.io/AVATARS/512/25.png")
    )
}