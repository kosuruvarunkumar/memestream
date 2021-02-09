package com.example.xmeme.repositories;

import com.example.xmeme.domain.Meme;
import org.springframework.data.repository.CrudRepository;

public interface MemesRepository extends CrudRepository<Meme, Long> {
}
