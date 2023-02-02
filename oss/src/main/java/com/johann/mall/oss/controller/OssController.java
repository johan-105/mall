package com.johann.mall.oss.controller;

import com.johann.mall.common.exception.RRException;
import com.johann.mall.common.utils.R;
import com.johann.mall.oss.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

@RestController
@RequestMapping("/oss")
public class OssController {

    @Autowired
    private OssService ossService;

    @PostMapping("upload")
    public R upload(@RequestParam("file") MultipartFile file, @RequestParam("module") String module
    ) {
        try {
            InputStream inputStream = file.getInputStream();
            //获取上传文件的原文件名
            String originalFilename = file.getOriginalFilename();
            String uploadUrl = ossService.upload(inputStream, module, originalFilename);
            //返回
            return R.ok().put("url", uploadUrl);
        } catch (Exception e) {
            throw new RRException("上传失败");
        }
    }

    @DeleteMapping("remove")
    public R removeFile(@RequestBody String url) {
        ossService.remove(url);
        return R.ok();
    }
}
