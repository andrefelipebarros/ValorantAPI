package valorant.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import valorant.api.Dto.DtoPersonagens;
import valorant.api.Model.Personagens;
import valorant.api.Service.ServicePersonagens;

import java.util.List;

@RestController
public class Controle {
    @Autowired
    private ServicePersonagens servicePersonagens;

    @GetMapping("/Personagem")
    public List<Personagens> getPersonagem() {
        return servicePersonagens.listAll();
    }

    @PostMapping("/Personagem")
    public ResponseEntity<Personagens> postPersonagem(@RequestBody DtoPersonagens dtoPersonagens) {
        // Invoca o metodo desacoplado para salvar o personagem
        // e emseguida retorna status CREATED (201)
        servicePersonagens.save(dtoPersonagens);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
