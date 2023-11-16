package com.example.smartlearning.Service;

import com.example.smartlearning.Contents;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigInteger;
import java.util.List;

public interface ContentServiceInterface {
    Contents addContent(Contents contents);

    List<Contents> getContent();
}
