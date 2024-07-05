package valorant.api.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import valorant.api.Model.Usuarios;

@Repository
public interface RepositoryUsuarios extends JpaRepository<Usuarios, Long> {
    Optional<Usuarios> findByEmail(String email);
}
