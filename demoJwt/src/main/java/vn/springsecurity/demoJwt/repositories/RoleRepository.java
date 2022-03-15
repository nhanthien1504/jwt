package vn.springsecurity.demoJwt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.springsecurity.demoJwt.common.ERole;
import vn.springsecurity.demoJwt.entities.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    /**
     * Find role by name
     *
     * @param name
     * @return Role
     */
    Optional<Role> findByName(ERole name);
}
