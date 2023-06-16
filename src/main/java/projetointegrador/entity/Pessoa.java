package projetointegrador.entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;

import lombok.ToString;

@Data

@ToString

@NoArgsConstructor

@AllArgsConstructor
@Builder
public class Pessoa {
	private String OBS;

    private Integer id;

    private String nomeRazaoSocial;

    private String cpfCNPJ;

    private String RgIe;

    private String email;
    
    private String senha;

    private String telefone;

    private Cep cep;

    
    
}
