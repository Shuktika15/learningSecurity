package dev.suki.learningsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearningSecurityApplication {
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(LearningSecurityApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            userRepository.save(
                    User.builder()
                            .username("suki")
                            .password("$2a$10$vR0admnow1oxCL3tT7eB..PS/aoiQ7a6LhfscCcrzA2EtScMLiCA.")
                            .role("USER")
                            .build()
            );
        };
    }
}
