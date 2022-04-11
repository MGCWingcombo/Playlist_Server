package com.mgc.mbti.controller;

import com.mgc.mbti.domain.response.ResponseService;
import com.mgc.mbti.domain.response.SingleResult;
import com.mgc.mbti.service.MusicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/playlist")
@RequiredArgsConstructor
public class MusicController {

    private final ResponseService responseService;
    private final MusicService musicService;

    @GetMapping("/{tag}")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public SingleResult <List<Map<String,String>>> mbtiMusic (@PathVariable String tag){
        return responseService.getSingleResult(musicService.getMusicList(tag));
    }
}
