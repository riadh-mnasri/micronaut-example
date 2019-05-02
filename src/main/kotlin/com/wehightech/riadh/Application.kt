package com.wehightech.riadh

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("com.wehightech.riadh")
                .mainClass(Application.javaClass)
                .start()
    }
}