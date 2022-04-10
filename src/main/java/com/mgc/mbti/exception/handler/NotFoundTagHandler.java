package com.mgc.mbti.exception.handler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NotFoundTagHandler {
    public void handle(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.sendRedirect("/exception/not-found-tag");
    }
}
