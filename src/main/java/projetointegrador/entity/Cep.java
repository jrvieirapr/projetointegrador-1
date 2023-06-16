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
public class Cep {
	
	private Integer id;
	private String cep;
	private String logradouro;
	private Municipio municipio;
	private Bairro bairro;
}
