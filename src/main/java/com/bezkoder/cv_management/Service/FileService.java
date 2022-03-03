package com.bezkoder.cv_management.Service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {

    String uploadFileCv(MultipartFile FILECV) throws IOException;
}
