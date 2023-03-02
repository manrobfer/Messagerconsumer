package br.com.objetos.objetos.recurso;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public interface Pagamentos {

    @PostMapping
    ResponseEntity<Pagamentos> pagamentos(@RequestBody Pagamentos pagamentos);
}
