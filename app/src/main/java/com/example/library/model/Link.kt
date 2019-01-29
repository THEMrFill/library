package com.example.library.model

class Link() {
    var href: String = ""
    var name: String? = null
    var templated: Boolean? = null

    constructor(href: String): this() {
        this.href = href
    }
    constructor(href: String, tempplated: Boolean): this(href) {
        this.templated = templated
    }
    constructor(href: String, name: String, tempplated: Boolean): this(href, tempplated) {
        this.name = name
    }
}