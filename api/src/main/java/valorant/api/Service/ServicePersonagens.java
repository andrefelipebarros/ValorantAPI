package valorant.api.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import valorant.api.Dto.DtoPersonagens;
import valorant.api.Model.Personagens;
import valorant.api.Repository.RepositoryPersonagens;

import java.util.List;

@Service
public class ServicePersonagens {
    @Autowired
    private RepositoryPersonagens repositoryPersonagens;

    public List<Personagens> listAll() {
        return repositoryPersonagens.findAll();
    }

    public void save(DtoPersonagens dtoPersonagens) {
        Personagens personagens = new Personagens();
        BeanUtils.copyProperties(dtoPersonagens, personagens);

        repositoryPersonagens.save(personagens);
    }
}
