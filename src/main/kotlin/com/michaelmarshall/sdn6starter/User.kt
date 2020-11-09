package com.michaelmarshall.sdn6starter

import org.springframework.data.neo4j.core.schema.Id
import org.springframework.data.neo4j.core.schema.Node
import java.util.*

@Node
class User(
        val name: String,
){
    @Id
    var uuid: String = UUID.randomUUID().toString()
}