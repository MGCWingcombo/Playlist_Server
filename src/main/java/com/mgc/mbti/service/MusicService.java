package com.mgc.mbti.service;

import com.mgc.mbti.domain.Music;
import com.mgc.mbti.domain.Playlist;
import com.mgc.mbti.exception.exception.NotFoundTagException;
import com.mgc.mbti.repository.MusicRepository;
import com.mgc.mbti.repository.PlaylistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MusicService {

    private final PlaylistRepository playlistRepository;
    private final MusicRepository musicRepository;

    public List<Map<String,String>> getMusicList(String tag){
        Playlist playlist = playlistRepository.findByTag(tag);
        if (playlist == null)
            throw new NotFoundTagException();
        List<Music> musics = musicRepository.findAllByPlayList(playlist);
        List<Map<String, String>> musicList = musics.stream().map(
                music -> {
                    Map<String, String> map = Map.of("Music",music.getMusic(),"Artist",music.getArtist(),"url",music.getUrl(),"urlImg",music.getUrlImg());
                    return map;
                }
        ).collect(Collectors.toList());

        return musicList;
    }
}
