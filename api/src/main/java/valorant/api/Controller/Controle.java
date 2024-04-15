package valorant.api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import valorant.api.Model.Personagens;
import valorant.api.Repository.RepositoryPersonagens;

@RestController
public class Controle {
    @Autowired
    private RepositoryPersonagens repPersonagens;

    @GetMapping("/Personagem")
    public List<Personagens> getPersonagem(){
        return repPersonagens.findAll();
    }

    @PostMapping("/Personagem")
    public ResponseEntity<?> postPersonagem(@RequestBody Personagens personagem){
        //Criando uma variável que armazena uma entidade(Personagem) 
        //Sendo armazenada no repositório
        Personagens savePerson = repPersonagens.save(personagem);
        //Retorna se a Entidade(Personagem) foi salvo (OK) no Banco
        return ResponseEntity.ok(savePerson);
}
}
