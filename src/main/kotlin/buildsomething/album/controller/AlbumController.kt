package buildsomething.album.controller

import buildsomething.album.model.Album
import buildsomething.album.service.AlbumService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.io.ClassPathResource
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/album")
class AlbumController @Autowired constructor(val albumService: AlbumService) {

    @PostMapping("/")
    fun addPic(@RequestBody album: Album) {
        albumService.addAlbum(album)
    }

    @GetMapping(path = ["/{id}"])
    fun getAlbum(@PathVariable id: Int): String {
        val res =  albumService.getAlbum(id = id)
        if(res.size > 0) {
            return "/album/pic/${res.get(0).content}"
        } else {
            throw RuntimeException("Not Found")
        }
    }

    @GetMapping(path = ["/pic/{name}"], produces = [MediaType.IMAGE_PNG_VALUE])
    @ResponseBody
    fun getPic(@PathVariable name: String): ByteArray {
        val res = ClassPathResource("/$name")
        return res.file.readBytes()
    }
}