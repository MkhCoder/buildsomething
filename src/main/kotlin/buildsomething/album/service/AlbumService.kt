package buildsomething.album.service

import buildsomething.album.model.Album
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.core.io.ClassPathResource
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.RowMapper
import org.springframework.stereotype.Service

@Service
class AlbumService @Autowired constructor(val jdbcTemplate: JdbcTemplate) {

    fun addAlbum(album: Album) {
        jdbcTemplate.update("insert into TBL_ALBUM (NAME, CONTENT) values (?, ?)", album.name, album.content)
    }

    fun getAlbum(id: Int): MutableList<Album> {
        return jdbcTemplate.query("select ID, NAME, CONTENT from TBL_ALBUM where ID = ?", RowMapper{rs, _ -> Album(rs.getInt("ID"), rs.getString("name"), rs.getString("content")) }, id)
    }
}