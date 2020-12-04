package Springboot.CEN4010.Repository;

import java.util.Optional;

import Springboot.CEN4010.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByMobile(String mobile);
}
