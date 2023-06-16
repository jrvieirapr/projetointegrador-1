package projetointegrador.entity;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

import lombok.ToString;

@Data

@ToString

@NoArgsConstructor

@AllArgsConstructor

public class ItensDanfe {
	private Integer id;
	private Danfe danfe;
	private Produto produto;
	private Double quantidade;
	private Double valorUnitario;
	private Double valorTotal;

}
