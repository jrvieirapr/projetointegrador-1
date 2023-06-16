package projetointegrador.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

import lombok.ToString;

@Data

@ToString

@NoArgsConstructor

@AllArgsConstructor

public class Danfe {

	private Integer id;

	private Long chave;

	private Integer numeroNfe;

	private LocalDate dataEmissao;

	private Pessoa emissor;

	private Pessoa destinatario;

	private List<ItensDanfe> itens = new ArrayList<ItensDanfe>();

	public void addItens( Integer id, Produto produto, Double qtde, Double valorUnitario) {
		ItensDanfe ddf = new ItensDanfe();
		ddf.setId(id);
		ddf.setProduto(produto);
		ddf.setQuantidade(qtde);
		ddf.setValorUnitario(valorUnitario);
		ddf.setValorTotal(qtde * valorUnitario);
		ddf.setDanfe(this);
		this.itens.add(ddf);
	}

	public void removeDetalhe(Integer indice) {
		if(this.itens.size() > 0) {
			this.itens.remove(indice);
		}
	}
}
                                                                                                                                                                                                                                                                               