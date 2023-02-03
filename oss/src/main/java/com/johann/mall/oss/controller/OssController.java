package com.johann.mall.oss.controller;

import com.johann.mall.common.utils.R;
import com.johann.mall.oss.service.OssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/oss")
public class OssController {

    @Autowired
    private OssService ossService;

    @PostMapping("upload")
    public R upload(@RequestParam("file") MultipartFile file) {
        String uploadUrl = ossService.upload(file);
        return R.ok().put("url", uploadUrl);

    }

    @DeleteMapping("remove")
    public R removeFile(@RequestBody String url) {
        ossService.remove(url);
        return R.ok();
    }
}
