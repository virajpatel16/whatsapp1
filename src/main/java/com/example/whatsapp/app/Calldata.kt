package com.example.whatsapp.app

class Calldata {
    var photo=0
    lateinit var callname:String
    var aerrow=0
    lateinit var late:String
    var voicecall=0

   public constructor(photo: Int, callname: String, aerrow: Int, late: String, get: Int) {
        this.photo = photo
        this.callname = callname
        this.aerrow = aerrow
        this.late = late
        this.voicecall=voicecall
    }
}
