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
public class Clientes {
	private Pessoa pessoa;
	private String interesse;
	private String obs;
	
}
