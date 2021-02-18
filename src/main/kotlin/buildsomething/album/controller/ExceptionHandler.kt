package buildsomething.album.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.PathVariable

@ControllerAdvice
class ExceptionHandler {

    //Todo customException
    @ExceptionHandler(Exception::class)
    fun handleError(e: Exception): ResponseEntity <String>{
        // ErrorDetail
      return ResponseEntity(e.message , HttpStatus.NOT_FOUND);
    }

}