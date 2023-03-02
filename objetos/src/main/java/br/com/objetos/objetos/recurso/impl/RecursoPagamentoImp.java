package br.com.objetos.objetos.recurso.impl;

import br.com.objetos.objetos.recurso.Pagamentos;
import br.com.objetos.objetos.servico.ServicosPagamento;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/pagamentos")
public class PagamentoImp implements Pagamentos {

    @Autowired
    private ServicosPagamento servicosPagamento;
    @Override
    public ResponseEntity<Pagamentos> pagamentos(Pagamentos pagamento) {

        servicosPagamento.enviaPagamento(pagamento);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
