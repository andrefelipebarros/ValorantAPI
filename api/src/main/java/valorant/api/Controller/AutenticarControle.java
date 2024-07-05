package valorant.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import valorant.api.Dto.DtoLogin;
import valorant.api.Dto.DtoUsuarios;
import valorant.api.Service.ServiceUsuarios;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/auth")
public class AutenticarControle {
    @Autowired
    private ServiceUsuarios serviceUsuarios;

    @PostMapping("/register")
    public ResponseEntity<String> postMethodName(@RequestBody DtoUsuarios request) {
        var usuario = serviceUsuarios.findByEmail(request.email());

        if (usuario.isPresent())
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário com esse email já existe.");

        serviceUsuarios.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).body("Usuário criado com sucesso!");
    }
    
    @PostMapping("/login")
    public ResponseEntity<String> postMethodName(@RequestBody DtoLogin request) {
        var user = serviceUsuarios.validateCredentials(request.email(), request.senha());

        if (user == null) {
            return ResponseEntity.badRequest().body("Credenciais passadas são inválidas.");
        }

        return ResponseEntity.ok().body("Usuário logado com sucesso!");
    }
    
}
