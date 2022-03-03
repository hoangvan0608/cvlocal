package com.bezkoder.cv_management.Utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {

    public boolean isFileOrFolderExist(String path) throws IOException {
        return new File(path).exists();
    }

    public boolean isTypeFilePdf(MultipartFile file) {
        return file.getContentType().toLowerCase().contains("pdf");
    }

    public void createNewMultiPartFile(String path, MultipartFile multipartFile)
            throws IllegalStateException, IOException {
        // write file
        File file = new File(path);
        multipartFile.transferTo(file);
    }

    public String getFormatFile(String input) {
        String[] results = input.split("\\.");
        return results[results.length - 1];
    }

    public static String PATH_CVURL = "C:\\Users\\TAV\\OneDrive\\Desktop\\FILECV\\";

    public static   String saveFile(MultipartFile file) {
        File folder = new File(PATH_CVURL);
        if (!folder.exists()) folder.mkdirs();
        Path path = Paths.get(PATH_CVURL);
        try {
            String fileName = System.currentTimeMillis() +  file.getOriginalFilename();
            Files.copy(file.getInputStream(), path.resolve(fileName));
            return fileName;
        } catch (Exception e) {
            throw new RuntimeException("Could not store the file. Error: " + e.getMessage());
        }
    }
}
