package com.onlineShopping.ProductService;

import com.onlineShopping.ProductService.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
class ProductSeviceApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ObjectMapper objectMapper;
	@Container
     static MongoDBContainer mongoDBContainer= new MongoDBContainer();
	@DynamicPropertySource
	static  void  setProperties(DynamicPropertyRegistry dynamicPropertyRegistry)
	{
		dynamicPropertyRegistry.add("spring.data.mongo.uri",mongoDBContainer::getReplicaSetUrl);
	}

	@Test
	void shouldCreateProduct() throws Exception {
		Product product = getProduct();
		String productAsString= objectMapper.writeValueAsString(product);
		mockMvc.perform(MockMvcRequestBuilders.post("/")
				.contentType(MediaType.APPLICATION_JSON).content(productAsString)).andExpect(status().isCreated());
		;
	}

	private Product getProduct() {
		return Product.builder().id("7859").name("Iphone 14").
				description("50 mp camera , fast charging,mpre secure").status("ACTIVE").price(78945.00).build();
	}


}
