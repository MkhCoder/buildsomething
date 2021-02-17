package buildsomething.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class YoutuberController {

    @GetMapping("/youtuber/{name}")
    fun getYoutuber(@PathVariable("name") name: String) : ResponseEntity<String>{
        return ResponseEntity.ok("Hello $name")
    }
}

