package com.marcosbarbero.tryout.kotlin.pet

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinPetProjectApplication

fun main(args: Array<String>) {
    runApplication<KotlinPetProjectApplication>(*args)
}
