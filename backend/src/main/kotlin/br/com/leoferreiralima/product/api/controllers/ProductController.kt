package br.com.leoferreiralima.product.api.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController {

    @GetMapping
    fun hello(@RequestParam name: String): String {
        return "Hello $name"
    }
}