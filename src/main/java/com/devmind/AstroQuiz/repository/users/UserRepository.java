package com.devmind.AstroQuiz.repository.users;

import com.devmind.AstroQuiz.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    User findByUserName(String userName);
}
