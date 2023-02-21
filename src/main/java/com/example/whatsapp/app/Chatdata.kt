package com.example.whatsapp.app

import java.sql.Time

class Chatdata {

    var profile =0
   lateinit var name :String
   lateinit var msg:String
   lateinit var Time:String

    constructor(profile: Int, name: String, msg: String, Time: String) {
        this.profile = profile
        this.name = name
        this.msg = msg
        this.Time = Time
    }


}
