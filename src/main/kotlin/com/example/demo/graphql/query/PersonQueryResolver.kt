package com.example.demo.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.example.demo.dao.PersonDao
import com.example.demo.data.Person
import org.springframework.stereotype.Component

@Component
class PersonQueryResolver(
        private val personDao: PersonDao
): GraphQLQueryResolver {
    fun person(id: String) =
            personDao.getPersonById(id)

    fun personsByName(name: String) =
            personDao.getPersonsByName(name)
}