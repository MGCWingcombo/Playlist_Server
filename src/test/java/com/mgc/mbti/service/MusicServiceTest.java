package com.mgc.mbti.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MusicServiceTest {

    @Autowired
    private MusicService musicService;



    @Test
    void getMusicList() {
        //given
        List<Map<String,String>> list;

        //when
        list = musicService.getMusicList("entj");

        //than
        list.forEach(System.out::println);
    }



}