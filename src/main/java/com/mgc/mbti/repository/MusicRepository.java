package com.mgc.mbti.repository;

import com.mgc.mbti.domain.Music;
import com.mgc.mbti.repository.customRepo.MusicCustomRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends JpaRepository<Music, Long> , MusicCustomRepository {
}
