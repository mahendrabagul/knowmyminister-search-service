package com.knowmyminister.searchservice.knowmyministersearchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@EnableElasticsearchRepositories(basePackages = "com.knowmyminister.searchservice")

@SpringBootApplication public class KnowmyministerSearchServiceApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(KnowmyministerSearchServiceApplication.class, args);
    }
}
