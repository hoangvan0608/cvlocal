package com.bezkoder.cv_management.Service.impl;

import com.bezkoder.cv_management.Service.FileService;
import com.bezkoder.cv_management.Utils.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;


@Service
public class FileServiceImpl implements FileService {
    private FileUtils fileManager = new FileUtils();
    private String linkFolder = "C:\\Users\\TAV\\OneDrive\\Desktop\\FILECV";

    @Override
    public String uploadFileCv(MultipartFile file) throws IOException {

        String nameFile = new Date().getTime() + "." + fileManager.getFormatFile(file.getOriginalFilename());

        String path = linkFolder + "\\" + nameFile;

        fileManager.createNewMultiPartFile(path, file);
        // TODO save link file to database

        // return link uploaded file
        return nameFile;
    }





}
