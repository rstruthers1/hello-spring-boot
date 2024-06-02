package com.example.hello.services;

import org.springframework.stereotype.Service;

@Service
public class HtmlWrapperService {

    public String wrapWithPre(String content) {
        return "<pre>" + content + "</pre>";
    }
}
