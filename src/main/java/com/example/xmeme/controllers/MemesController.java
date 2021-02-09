package com.example.xmeme.controllers;

import com.example.xmeme.domain.Meme;
import com.example.xmeme.services.MemesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/memes")
@CrossOrigin
public class MemesController {
    @Autowired
    MemesService memesService;

    @PostMapping("/")
    public ResponseEntity<?> addMeme(@Valid @RequestBody Meme meme) {
        return new ResponseEntity<Long>(memesService.saveOrUpdateMeme(meme), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<?> getTop100Memes() {
        return new ResponseEntity<List<Meme>>(memesService.getTop100Memes(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findMemeByIdentifier(@PathVariable Long id) {
        return new ResponseEntity<Meme>(memesService.findMemeByIdentifier(id), HttpStatus.OK);
    }
}
