package com.burak.mongodb.config;

import com.burak.mongodb.document.Users;
import com.burak.mongodb.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            int count = 0;
            do {
                userRepository.save(new Users(count+1, "Burak" + (count+1), "Development" + (count+1), 1000L));
                count++;
            }
            while (count<100);

        };
    }
}
