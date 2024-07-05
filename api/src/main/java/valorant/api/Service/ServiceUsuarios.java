package valorant.api.Service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import valorant.api.Dto.DtoUsuarios;
import valorant.api.Model.Usuarios;
import valorant.api.Repository.RepositoryUsuarios;

@Service
public class ServiceUsuarios {
    @Autowired
    RepositoryUsuarios repositoryUsuarios;

    public void save(DtoUsuarios dtoUsuarios) {
        Usuarios usuario = new Usuarios();
        BeanUtils.copyProperties(dtoUsuarios, usuario);

        repositoryUsuarios.save(usuario);
    }
}
