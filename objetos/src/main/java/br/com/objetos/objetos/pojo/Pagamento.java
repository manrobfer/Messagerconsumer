package br.com.objetos.objetos.pojo;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class pagamento implements Serializable {

    private Long id;
    private Long idUsuario;
    private Long idProduto;
    private String Cartao;


}
