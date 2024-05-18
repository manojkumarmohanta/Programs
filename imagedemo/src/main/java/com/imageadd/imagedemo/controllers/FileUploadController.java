package com.imageadd.imagedemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.imageadd.imagedemo.helper.FileUploadHelper;

@RestController
public class FileUploadController {

    @Autowired
    private FileUploadHelper fileUploadHelper;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file){
        try{
            if(file.isEmpty()){
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("something went wrong !");
            }

            if(!file.getContentType().equals("image/jpeg")){
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only image can be uploaded !");
            }

            boolean bo = fileUploadHelper.uploadFile(file);
            if(bo){
                return ResponseEntity.ok("File uploaded");
            }
             
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Wrong Wrong !!!");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return ResponseEntity.ok("running.....");
    }

}
