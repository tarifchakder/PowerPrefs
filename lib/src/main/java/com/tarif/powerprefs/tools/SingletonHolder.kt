package com.tarif.powerprefs.tools

/**
 * @Author: Tarif Chakder
 * @Date: 26-01-2022
 */


open class SingletonHolder<T, in A>(creator: (A) -> T) {
    private var creator: ((A) -> T)? = creator
    @Volatile
    var pref: T? = null

    fun getInstance(arg: A) = pref ?: synchronized(this) {
        val i2 = pref
        if (i2 != null) i2
        else {
            val created = creator!!(arg)
            pref = created
            creator = null
            created
        }
    }
}
