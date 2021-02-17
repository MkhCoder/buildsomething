package buildsomething.controller

import buildsomething.model.Youtuber
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class YoutuberController {

    @GetMapping("/youtuber/{name}")
    fun getYoutuber(@PathVariable("name") name: String): ResponseEntity<Youtuber> {
        val youtuber = Youtuber(handle = "razor",
        name = "Ayaan",
        videoLinks = listOf("video1.mpg"))
        return ResponseEntity.ok(youtuber)
    }
}

