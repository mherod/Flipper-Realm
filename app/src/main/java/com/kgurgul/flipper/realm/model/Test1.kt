package com.kgurgul.flipper.realm.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Test1(
    @PrimaryKey
    var id: Long = 0
) : RealmObject() {
    var nameTest: String? = null
    var valueTest: Int? = null
}