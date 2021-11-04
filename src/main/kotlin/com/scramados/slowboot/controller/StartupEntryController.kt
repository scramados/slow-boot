package com.scramados.slowboot.controller

import com.scramados.slowboot.repository.StartupEntryRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class StartupEntryController(private val repository: StartupEntryRepository) {

    @GetMapping("/")
    fun blog(model: Model): String {
        model["title"] = "List of startups"
        model["entries"] = repository.findAllByOrderByAddedAtDesc()
        return "entries"
    }
}