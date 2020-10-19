package floweb.siteproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import floweb.siteproject.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
