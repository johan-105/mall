package com.johann.mall.oss.service;

import java.io.InputStream;

public interface OssService {
    String upload(InputStream inputStream, String originalFilename);


    /**
     * 阿里云oss 文件删除
     * @param url 文件的url地址
     */
    void remove(String url);
}
