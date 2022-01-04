package com.mgc.mbti.service;

import com.mgc.mbti.domain.Music;
import com.mgc.mbti.domain.Playlist;
import com.mgc.mbti.repository.MusicRepository;
import com.mgc.mbti.repository.PlaylistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class MusicService {

    private final PlaylistRepository playlistRepository;
    private final MusicRepository musicRepository;

    public List<Map<String,String>> getMusicList(String tag){
        Playlist playlist = playlistRepository.findByTag(tag);
        List<Music> musics= musicRepository.findAllByPlayList(playlist);
        List<Map<String, String>> musicList = new ArrayList<>();
        //Random random = new Random();

        for (Music music : musics) {
            Map<String, String> map = new HashMap<>();
            map.put("Music", music.getMusic());
            map.put("Artist", music.getArtist());
            map.put("url", music.getUrl());
            map.put("urlImg", music.getUrlImg());
            musicList.add(map);
        }
        /*
        while (true){
            if (musicList.size() == 8)
                break;
            else {
                int i = random.nextInt(musicList.size());
                musicList.remove(i);
            }
        }*/
        return musicList;
    }
}
