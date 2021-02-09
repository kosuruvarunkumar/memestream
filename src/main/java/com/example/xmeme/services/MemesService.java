package com.example.xmeme.services;

import com.example.xmeme.domain.Meme;
import com.example.xmeme.repositories.MemesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemesService {
    @Autowired
    private MemesRepository memesRepository;

    //todo: send json response
    public Long saveOrUpdateMeme(Meme meme) {
        Meme savedMame = memesRepository.save(meme);
        return savedMame.getId();
    }
}
