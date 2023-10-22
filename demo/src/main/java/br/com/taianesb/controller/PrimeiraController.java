package br.com.taianesb.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {

    @GetMapping("/primeiroMetodo")
    public String primeiroMetodo() {
        return "Meu primeiro método api rest...";
    }

    @GetMapping("/primeiroMetodoPathVariable/{id}")
    public String primeiroMetodoPathVariable(@PathVariable String id) {
        return "O parâmetro é: " + id;
    }

    @GetMapping("/primeiroMetodoRequestParam")
    public String primeiroMetodoRequestParam(@RequestParam String id) {
        return "O parâmetro é: " + id;
    }

    @GetMapping("/primeiroMetodoRequestParam2")
    public String primeiroMetodoRequestParam2(@RequestParam Map<String, String> allParams) {
        return "Os parâmetro são: " + allParams.entrySet();
    }

    @PostMapping("primeiroMetodoBodyParam")
    public String primeiroMetodoBodyParam(@RequestBody Usuario usuario) {
        return "O parâmetro é: " + usuario.username;
    }

    @PostMapping("primeiroMetodoComHeaders")
    public String primeiroMetodoComHeaders(@RequestHeader("name") String name) {
        return "O parâmetro é: " + name;
    }

    @PostMapping("primeiroMetodoComListaDeHeaders")
    public String primeiroMetodoComListaDeHeaders(@RequestHeader Map<String, String> headers) {
        return "Os parâmetros são: " + headers.entrySet();
    }

    @GetMapping("/primeiroMetodoResponseEntity")
    public ResponseEntity<Object> primeiroMetodoResponseEntity() {
        return ResponseEntity.status(200).body("Mensagem de erro...");
    }

    @GetMapping("/primeiroMetodoResponseEntity2/{id}")
    public ResponseEntity<Object> primeiroMetodoResponseEntity2(@PathVariable Long id) {
        var usuario = new Usuario("taiane");

        if(id > 5) {
            return ResponseEntity.status(HttpStatus.OK).body(usuario);
        }
        return ResponseEntity.badRequest().body("Id menor que 5...");
    }
    
    record Usuario(String username) {}

}
