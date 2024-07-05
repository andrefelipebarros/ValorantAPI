package valorant.api.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import valorant.api.Dto.DtoUsuarios;
import valorant.api.Model.Usuarios;
import valorant.api.Repository.RepositoryUsuarios;

@Service
public class ServiceUsuarios {
    @Autowired
    RepositoryUsuarios repositoryUsuarios;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Usuarios save(DtoUsuarios dtoUsuarios) {
        String hashSenha = bCryptPasswordEncoder.encode(dtoUsuarios.senha());

        Usuarios usuario = new Usuarios(dtoUsuarios.nome(), dtoUsuarios.email(), hashSenha);
        repositoryUsuarios.save(usuario);
        return usuario;
    }

    public Optional<Usuarios> findByEmail(String email) {
        return repositoryUsuarios.findByEmail(email);
    }

    public Usuarios validateCredentials(String email, String senha) {
        var usuario = repositoryUsuarios.findByEmail(email);

        if (usuario.isPresent()) {
            var data = usuario.get();

            if (bCryptPasswordEncoder.matches(senha, data.getSenha())) {
                return data;
            }
        }

        return null;
    }
}
