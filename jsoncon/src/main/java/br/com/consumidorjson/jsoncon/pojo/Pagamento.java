package br.com.consumidorjson.jsoncon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pagamento implements Serializable {

    private Long id;
    private Long idUsuario;
    private Long idProduto;
    private String CartaoNumero;


}
