package com.develhope.ServiziFileUpload.services;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

@Service
public class FileStorageService {

    @Value("${fileDirectory}")
    private String fileRepositoryFolder;

    public String upload(MultipartFile file) throws IOException {
        String fileString = file.getOriginalFilename();
        String extension = FilenameUtils.getExtension(fileString);
        String randomFileName = UUID.randomUUID().toString();
        String completedName = randomFileName + "." + extension;
        File fileDirectory = new File(fileRepositoryFolder);
        if (!fileDirectory.exists()) {
            throw new IOException("directory doesn't exists");
        }
        if (!fileDirectory.isDirectory()) {
            throw new IOException("the path given is not a directory");
        }
        File directorySavedFile = new File(fileRepositoryFolder + File.separator + completedName);
        if (directorySavedFile.exists()) {
            throw new IOException("file already present");
        }
        file.transferTo(directorySavedFile);
        return completedName;
    }

    public byte[] download(String fileName, HttpServletResponse response) throws IOException {
        String extension = FilenameUtils.getExtension(fileName);
        switch (extension) {
            case "jpg", "jpeg":
                response.setContentType(MediaType.IMAGE_JPEG_VALUE);
                break;
            case "png":
                response.setContentType(MediaType.IMAGE_PNG_VALUE);
                break;
            case "gif":
                response.setContentType(MediaType.IMAGE_GIF_VALUE);
                break;
        }


        File file = new File(fileRepositoryFolder + File.separator + fileName);
        if (!file.exists()) {
            throw new IOException();
        }
        return IOUtils.toByteArray(new FileInputStream(file));
    }
}
