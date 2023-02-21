package com.example.whatsapp.app

class Statusdata {

    var status =0
    lateinit var statusname :String
    lateinit var date: String

    constructor(status: Int, statusname: String, date: String) {
        this.status = status
        this.statusname = statusname
        this.date = date
    }
}
