package com.itgenius.springdemo.controllers

import com.itgenius.springdemo.models.Demodata
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class DemoController {

    // Method GET
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello, Spring Boot!"
    }

    @GetMapping("/about")
    fun about(): String {
        return "About, Spring Boot!"
    }

    // Method GET All Demodata
    @GetMapping("/demodata")
    fun getDemodata(): List<Demodata> {
        return listOf(
            Demodata(
                1,
                "John Doe",
                "john@email.com",
                "0812345678",
                "123 Main St."
            ),
            Demodata(
                2,
                "Jane Doe",
                "jane@email.com",
                "0812345679",
                "124 Main St."
            ),
        )
    }

    // Method GET Demodata by ID
    @GetMapping("/demodata/{id}")
    fun getDemodataById(@PathVariable id: Int): Demodata {
        return Demodata(
            id,
            "John Doe",
            "john@email.com",
            "0812345678",
            "123 Main St."
        )
    }

    // Post Method
    @PostMapping("/demodata")
    fun createDemodata(@RequestBody demodata: Demodata): Demodata {
        return demodata
    }

    // Put Method
    @PutMapping("/demodata/{id}")
    fun updateDemodata(@PathVariable id: Int, @RequestBody demodata: Demodata): Demodata {
        return demodata.copy(id = id)
    }

    // Delete Method
    @DeleteMapping("/demodata/{id}")
    fun deleteDemodata(@PathVariable id: Int): String {
        return "Delete Demodata ID: $id"
    }

}