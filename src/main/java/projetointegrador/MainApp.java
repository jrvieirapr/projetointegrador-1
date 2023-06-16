package projetointegrador;

import java.time.LocalDate;

import projetointegrador.entity.Cep;
import projetointegrador.entity.Danfe;
import projetointegrador.entity.ItensDanfe;
import projetointegrador.entity.Estado;
import projetointegrador.entity.Municipio;
import projetointegrador.entity.Pais;
import projetointegrador.entity.Pessoa;
import projetointegrador.entity.Produto;

public class MainApp {

	public static void main(String[] args) {
		
// criar localizaçao pais > esstado > municipio > cep
		
		Pais brasil = new Pais();
		brasil.setId(1);
		brasil.setNome("Brasil");
		
		Pais argentina = new Pais();
		argentina.setId(2);
		argentina.setNome("Argentina");
		
		Estado parana = new Estado();
		parana.setId(1);
		parana.setEstado("Paraná");
		parana.setPais(brasil);
		
		Estado corrientes = new Estado();
		parana.setId(2);
		parana.setEstado("Corrientes");
		parana.setPais(brasil);
		
		Municipio castro = new Municipio();
		castro.setId(1);
		castro.setNome("Castro");
		castro.setEstado(parana);
		
		Municipio corrientescity = new Municipio();
		castro.setId(2);
		castro.setNome("corrientescity");
		castro.setEstado(corrientes);

		Cep drjorge = new Cep();
		drjorge.setId(1);
		drjorge.setCep("84165-000");
		drjorge.setLogradouro("Dr. Jorge Xavier da Silva");
		drjorge.setMunicipio(castro);
		
		Cep ruax = new Cep();
		ruax.setId(2);
		ruax.setCep("00000-000");
		ruax.setLogradouro("RUa X");
		ruax.setMunicipio(corrientescity);
		
		// criar emissor e destinatario
		
		Pessoa emissor = new Pessoa();
		emissor.setId(1);
		emissor.setNomeRazaoSocial("Emissor");
		emissor.setRgIe("0.000.000-0");
		emissor.setCpfCNPJ("000.000.000-00");
		emissor.setTelefone("(00) 0 0000-0000");
		emissor.setEmail("emissor@emssor.com.br");
		emissor.setCep(drjorge);
		
		Pessoa destinatario = new Pessoa();
		destinatario.setId(2);
		destinatario.setNomeRazaoSocial("destinatario");
		destinatario.setRgIe("1.111.111-1");
		destinatario.setCpfCNPJ("111.111.111-11");
		destinatario.setTelefone("(11) 1 1111-1111");
		destinatario.setEmail("destinatario@destinatario.com.br");
		destinatario.setCep(ruax);
		
		// criar produtos
		
		Produto produto1 = new Produto();
		produto1.setId(1);
		produto1.setNome("Gabiroba");
		
		Produto produto2 = new Produto();
		produto2.setId(2);
		produto2.setNome("Japecanga");
		
		Produto produto3 = new Produto();
		produto3.setId(3);
		produto3.setNome("Carquejinha do Campo");
		
		Produto produto4 = new Produto();
		produto4.setId(4);
		produto4.setNome("Espinheira Santa");
		
		// criar danfe
		
		Danfe nf1 = new Danfe();
		nf1.setChave(1l);
		nf1.setDataEmissao(LocalDate.now());
		nf1.setEmissor(emissor);
		nf1.setDestinatario(destinatario);
		nf1.setNumeroNfe(1);
		nf1.setId(1);
		
		// adicionar produtos na nfe
		
		nf1.addItens(1, produto4, 10.0, 50.0);
		nf1.addItens(2, produto1, 5.0, 25.0);
		
		for(ItensDanfe id : nf1.getItens()) {
			System.out.println(id.getProduto().getNome());
		}
		
		//imprimir danfe
		
		
		
	}

}
