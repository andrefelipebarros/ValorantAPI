package valorant.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import valorant.api.Model.Personagens;

@Repository
public interface RepositoryPersonagens extends JpaRepository<Personagens, Long>{
    
}
