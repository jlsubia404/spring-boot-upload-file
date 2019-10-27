package com.jlsubia.uploadfile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.jlsubia.uploadfile.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class UploadFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadFileApplication.class, args);
	}

}
