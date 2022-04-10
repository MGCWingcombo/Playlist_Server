package com.mgc.mbti.exception;

import com.mgc.mbti.domain.response.CommonResult;
import com.mgc.mbti.exception.exception.NotFoundTagException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/exception")
public class ExceptionController {
    @GetMapping(value = "/not-found-tag")
    public CommonResult notFoundTag() {
        throw new NotFoundTagException();
    }

}

