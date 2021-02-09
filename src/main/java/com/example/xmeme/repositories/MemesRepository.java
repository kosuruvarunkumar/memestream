package com.example.xmeme.repositories;

import com.example.xmeme.domain.Meme;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemesRepository extends CrudRepository<Meme, Long> {
    Meme findMemeById(Long id);
    List<Meme> findTop100ByOrderByCreatedDateDesc();
}
