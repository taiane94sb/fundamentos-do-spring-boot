package br.com.taianesb.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

}
