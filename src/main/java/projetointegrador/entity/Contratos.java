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
public class Contratos {
	private String setor;
	private Integer id;
	private Double valor;
	private Long coordenadas;

}
