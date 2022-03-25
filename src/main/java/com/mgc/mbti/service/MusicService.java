package com.mgc.mbti.service;

import com.mgc.mbti.domain.Music;
import com.mgc.mbti.domain.Playlist;
import com.mgc.mbti.repository.MusicRepository;
import com.mgc.mbti.repository.PlaylistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MusicService {

    private final PlaylistRepository playlistRepository;
    private final MusicRepository musicRepository;

    public List<Map<String,String>> getMusicList(String tag){
        List<Music> musics= musicRepository.findAllByPlayList(playlistRepository.findByTag(tag));
        Random random = new Random();


        List<Map<String, String>> musicList = musics.stream().map(
                music -> {
                    Map<String, String> map = Map.of("Music",music.getMusic(),"Artist",music.getArtist(),"url",music.getUrl(),"urlImg",music.getUrlImg());
                    return map;
                }
        ).collect(Collectors.toList());
        /*
        while (true){
            if (musicList.size() == 8)
                break;
            else {
                int i = random.nextInt(musicList.size());
                musicList.remove(i);
            }
        }*/ // 8곡만 도려내는 기능이지만 최적화 이슈와 기능상 8곡만 보낼 이유가 없기에 삭제

        return musicList;
    }
}
