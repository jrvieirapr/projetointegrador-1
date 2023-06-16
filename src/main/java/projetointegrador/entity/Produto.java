package projetointegrador.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import projetointegrador.enums.TipoEnum;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {
	
	private Integer id;
	private String nome;
	private TipoEnum tipo;
	private String descricao;
	private Double valor;
	private Integer pontos;

	private List<AtividadesTuristicas> atividades = new ArrayList<AtividadesTuristicas>();
}
