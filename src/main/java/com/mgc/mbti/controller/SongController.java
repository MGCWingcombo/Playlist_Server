package com.mgc.mbti.controller;

import com.mgc.mbti.domain.response.CommonResult;
import com.mgc.mbti.domain.response.SingleResult;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/mbti-test")
@RequiredArgsConstructor
public class SongController {

    @PostMapping("/{MBTI}")
    public SingleResult<Map<String,String>> mbtiSong (@PathVariable String MBTI){
        return null;
    }

    @GetMapping("/hello")
    public String hello(){
        return "안녕하세요. 현재 서버시간은 "+new Date() + "입니다.";
    }
}
