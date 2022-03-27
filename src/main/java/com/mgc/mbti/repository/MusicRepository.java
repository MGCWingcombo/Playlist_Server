package com.mgc.mbti.repository;

import com.mgc.mbti.domain.Music;
import com.mgc.mbti.domain.Playlist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface MusicRepository extends JpaRepository<Music, Long> {
    List<Music> findAllByPlayList (Playlist playlist);

    Page<Music> findAllByPlayList (Playlist playlist, Pageable pageable);
}
