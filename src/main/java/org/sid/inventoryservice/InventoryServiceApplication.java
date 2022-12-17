package org.sid.inventoryservice;

import org.sid.inventoryservice.entities.Product;
import org.sid.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;





@RestController
@SpringBootApplication
@EnableEurekaClient



public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	// cetter methode prend l'interface product Reposityr
CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration restConfiguration){
	restConfiguration.exposeIdsFor(Product.class);
		return args -> {
			restConfiguration.exposeIdsFor(Product.class);
			productRepository.saveAll(
					List.of(
							Product.builder().name("computer").qunatity(12).price(1200)	.build(),
							Product.builder().name("Printer").qunatity(10).price(4000)	.build(),
							Product.builder().name("Screen Samsung").qunatity(22).price(6000)	.build(),
							Product.builder().name("USB").qunatity(45).price(300)	.build()
					)	);
		};
		}
}

