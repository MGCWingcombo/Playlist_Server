package com.mgc.mbti.exception;

import com.mgc.mbti.domain.response.CommonResult;
import com.mgc.mbti.domain.response.ResponseService;
import com.mgc.mbti.exception.exception.NotFoundTagException;
import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@RestControllerAdvice
public class ExceptionAdvice {

    private final ResponseService responseService;
    private final MessageSource messageSource;

    // code정보에 해당하는 메시지를 조회합니다.
    private String getMessage(String code) {
        return getMessage(code, null);
    }

    // code정보, 추가 argument로 현재 locale에 맞는 메시지를 조회합니다.
    private String getMessage(String code, Object[] args) {
        return messageSource.getMessage(code, args, LocaleContextHolder.getLocale());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public CommonResult defaultException(HttpServletRequest request, Exception e) {
        return responseService.getFailResult(Integer.valueOf(getMessage("unKnown.code")), e.getMessage());
    }

    // Tag를 찾지 못했습니다.
    @ExceptionHandler(NotFoundTagException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public CommonResult notFoundTagException(HttpServletRequest req, NotFoundTagException e) {
        return responseService.getFailResult(Integer.valueOf(getMessage("not-found-tag.code")), getMessage("not-found-tag.msg"));
    }
}
