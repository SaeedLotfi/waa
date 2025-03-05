package com.saeed.waa;

import com.saeed.waa.entities.User;
import com.saeed.waa.repos.UserRepo;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserRepo userRepo;

    public DataInitializer(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void run(String... args) {
        if (userRepo.count() == 0) { // Avoid duplicate entries
            User user1 = new User();
            user1.setName("Saeed Lotfi");
            user1.setUsername("admin");
            user1.setPassword("password");
            userRepo.save(user1);

            User user2 = new User();
            user2.setName("Awais Waheed");
            user1.setUsername("user");
            user1.setPassword("password");
            userRepo.save(user2);

            System.out.println("✅ Users added.");
        } else {
            System.out.println("✅ Users already exist. Skipping initialization.");
        }
    }
}
