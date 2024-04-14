package valorant.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import valorant.api.Model.Personagens;
import valorant.api.Repository.RepositoryPersonagens;

public class Controle {
    @Autowired
    private RepositoryPersonagens resPersonagens;
    @GetMapping("/personagem")
    public List<Personagens> adicionarPersonagem(){
        return resPersonagens.findAll();
    }
}
