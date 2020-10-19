package floweb.siteproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import floweb.siteproject.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
