package com.lucas.cache.repository;

import com.lucas.cache.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
@Slf4j
public class ProductRepository {

    public List<Product> listAll() {
        log.info("c=ProductRepository, m=listAll");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Acesso ao banco de dados  e retornando a lista
        final Product product1 = Product.builder()
                .sku("product123")
                .price(new BigDecimal("10.00"))
                .description("Product 1")
                .build();

        final Product product2 = Product.builder()
                .sku("product987")
                .price(new BigDecimal("7.90"))
                .description("Product 2")
                .build();

        List<Product> products = List.of(product1, product2);


        return products;
    }

}
