package com.michaelmarshall.sdn6starter

import org.springframework.data.neo4j.repository.ReactiveNeo4jRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface UserRepository : ReactiveNeo4jRepository<User, String>
