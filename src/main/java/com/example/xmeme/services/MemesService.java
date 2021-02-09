package com.example.xmeme.services;

import com.example.xmeme.domain.Meme;
import com.example.xmeme.repositories.MemesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class MemesService {
    @Autowired
    private MemesRepository memesRepository;

    //todo: send json response
    public Long saveOrUpdateMeme(Meme meme) {
        Meme savedMame = memesRepository.save(meme);
        return savedMame.getId();
    }

    public List<Meme> getTop100Memes() {
//        List<Meme> memesList= new ArrayList<Meme>(memesRepository.findAll());
        return memesRepository.findTop100ByOrderByCreatedDateDesc();

    }

    public Meme findMemeByIdentifier(Long id) {
        return memesRepository.findMemeById(id);
    }
}
