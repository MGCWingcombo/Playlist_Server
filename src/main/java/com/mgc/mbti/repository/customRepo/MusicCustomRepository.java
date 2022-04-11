package com.mgc.mbti.repository.customRepo;

import com.mgc.mbti.domain.Music;
import com.mgc.mbti.domain.Playlist;

import java.util.List;

public interface MusicCustomRepository {
    List<Music> findAllByPlayList (Playlist  playlist);

}
