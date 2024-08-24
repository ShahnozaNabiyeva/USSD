package com.shahnoza.ussd

import java.io.Serializable

class MyObject:Serializable {
    var name:String? = null
    var code:String? = null
    var about:String? = null
    constructor()
    constructor(name: String?, code: String?, about: String?) {
        this.name = name
        this.code = code
        this.about = about
    }

}
