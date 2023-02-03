package com.johann.mall.oss.service;

import org.springframework.web.multipart.MultipartFile;

public interface OssService {
    String upload(MultipartFile file);


    /**
     * 阿里云oss 文件删除
     * @param url 文件的url地址
     */
    void remove(String url);
}
