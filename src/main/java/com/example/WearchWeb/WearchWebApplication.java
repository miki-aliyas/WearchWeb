package com.example.WearchWeb;

import com.example.WearchWeb.model.repository.CategoryRepository;
import com.example.WearchWeb.model.repository.ClothesItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WearchWebApplication {

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	ClothesItemRepository clothesItemRepository;

	@RequestMapping("/")
	String home() {
		return "Hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(WearchWebApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
	//	動作確認
		return (args -> {
			System.out.println(categoryRepository.findAll());
			System.out.println(clothesItemRepository.findAll());
		});
	}
}
