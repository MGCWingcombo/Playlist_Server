package com.mgc.mbti.repository.customRepo;

import com.mgc.mbti.domain.Playlist;
import com.mgc.mbti.dto.MusicDto;

import java.util.List;

public interface MusicCustomRepository {
    List<MusicDto> findAllByPlayList (Playlist playlist);

}
