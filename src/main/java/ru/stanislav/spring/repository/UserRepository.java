package ru.stanislav.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.stanislav.spring.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
