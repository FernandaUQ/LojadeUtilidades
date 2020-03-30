package entidades;


/* Essa será mais uma classe de entidade, mas essa será uma extensão da classe usuario, ou seja a classe filha
 * Aqui aprenderemos mais sobre herança
 * 
 * Quando se deseja herdar atributos e metodos de outras classes, basta incluir o extends depois do nome da classe 
 * e posteriormente o nome da classe que deseja herdar. Veja a sintaxe:
 * 
 * public class Classe extends ClassePai { }
  */

public class Cliente extends Usuario {
	
	/*Caso seja necessário criar algum atributo a mais, 
	 * Basta cria-lo normalmente, sem necessidade de repetir as da classe pai. 
	 */
	
	private Double renda, limiteCredito;
	/*Observe que o tipo do atributo está com a letra maiuscula, 
	 * pois não é um tipo primitivo, podendo assim aceitar valor nulo.
	 * O tipo primitivo não aceita valor nulo pois é uma referencia a valores ja existentes no processador.
	 */
	
	
	
	//Cria-se os construtores normalmente
	public Cliente () {
		
	}
	
	public Cliente(int id, String nome, String endereco, String email, String telefone, Double renda, Double limiteCredito) {
		//A palavra super resgatará os atributos da classe pai
		super(id, nome, endereco, email, telefone);
		this.renda = renda;
		this.limiteCredito = limiteCredito;
	}

	
	//Mesma coisa para getters e setters dos novos atributos
	


	public Double getRenda() {
		return renda;
	}


	public void setRenda(Double renda) {
		this.renda = renda;
	}


	public Double getLimiteCredito() {
		return limiteCredito;
	}


	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	//Também é possivel buscar o to string da classe pai e adicionar os atributos adicionais
	
	@Override
	public String toString() {
		return "Cliente [" + "Dados do Cliente:  " + super.toString() + "renda= " + renda + ", limiteCredito= " + limiteCredito + "]";
	}
	
	
	


	
	
	

	
	
	
	

}
