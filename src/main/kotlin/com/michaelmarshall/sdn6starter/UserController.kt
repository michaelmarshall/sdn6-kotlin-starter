package com.michaelmarshall.sdn6starter

import kotlinx.coroutines.reactive.awaitFirstOrNull
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/user")
class UserController(
        val userRepo: UserRepository
){

    @GetMapping("/create/{name}")
    suspend fun create(@PathVariable("name") name: String): String{
        val user = User(name)
        userRepo.save(user).awaitFirstOrNull()
        return "user $name created"
    }

    @GetMapping("/get/{id}")
    suspend fun getOne(@PathVariable("id") id: String): String{
        val user = userRepo.findById(id).awaitFirstOrNull() ?: return "no user with that id"
        return user.name
    }
}