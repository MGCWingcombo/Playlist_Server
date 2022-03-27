package com.mgc.mbti.service;

import com.mgc.mbti.domain.Music;
import com.mgc.mbti.domain.Playlist;
import com.mgc.mbti.repository.MusicRepository;
import com.mgc.mbti.repository.PlaylistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MusicService {

    private final PlaylistRepository playlistRepository;
    private final MusicRepository musicRepository;

    public List<Map<String,String>> getMusicList(String tag){
        Page<Music> musicPage = musicRepository.findAllByPlayList(playlistRepository.findByTag(tag), PageRequest.of(0,24));

        List<Map<String, String>> musicList = musicPage.stream().map(
                music -> {
                    Map<String, String> map = Map.of("Music",music.getMusic(),"Artist",music.getArtist(),"url",music.getUrl(),"urlImg",music.getUrlImg());
                    return map;
                }
        ).collect(Collectors.toList());

        Collections.shuffle(musicList);

        return musicList;
    }
}
