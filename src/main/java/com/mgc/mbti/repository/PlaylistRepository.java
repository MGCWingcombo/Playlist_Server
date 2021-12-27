package com.mgc.mbti.repository;

import com.mgc.mbti.domain.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist,Long> {
    Playlist findByTag (String tag);
}
