package vn.springsecurity.demoJwt.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.springsecurity.demoJwt.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * Find user by user name
     *
     * @param username
     * @return User
     */
    User findByUsername(String username);

    /**
     * Check exists an user by user name
     *
     * @param username
     * @return Boolean
     */
    Boolean existsByUsername(String username);

    /**
     * Check exists an user email
     *
     * @param email
     * @return Boolean
     */
    Boolean existsByEmail(String email);
}