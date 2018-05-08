package com.example.demo.graphql

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.example.demo.dao.PersonDao
import com.example.demo.data.Person
import com.example.demo.graphql.input.PersonInput
import org.springframework.stereotype.Component

@Component
class Mutation(
        private val personDao: PersonDao
): GraphQLMutationResolver {
    fun personCreate(input: PersonInput) =
            personDao.createPerson(input.name)
}