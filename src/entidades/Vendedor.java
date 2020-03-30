package entidades;


/* Essa será mais uma classe de entidade, mas essa será uma extensão da classe usuario, ou seja a classe filha
 * Aqui aprenderemos mais sobre herança
 * 
 * Quando se deseja herdar atributos e metodos de outras classes, basta incluir o extends depois do nome da classe 
 * e posteriormente o nome da classe que deseja herdar. Veja a sintaxe:
 * 
 * public class Classe extends ClassePai { }
  */

public class Vendedor extends Usuario {
	
	/*Caso seja necessário criar algum atributo a mais, 
	 * Basta cria-lo normalmente, sem necessidade de repetir as da classe pai. 
	 */
	
	private String Departamento, Funcao;
	private Double Salario;
	/*Observe que o tipo do atributo está com a letra maiuscula, 
	 * pois não é um tipo primitivo, podendo assim aceitar valor nulo.
	 * O tipo primitivo não aceita valor nulo pois é uma referencia a valores ja existentes no processador.
	 */
	
	
	
	//Cria-se os construtores normalmente
	
	public Vendedor() {
		
	}
	
	public Vendedor(int id, String nome, String endereco, String email, String telefone, String departamento, String funcao, Double salario) {
		//A palavra super resgatará os atributos da classe pai
		super(id, nome, endereco, email, telefone);
		Departamento = departamento;
		Funcao = funcao;
		Salario = salario;
	}

	//Mesma coisa para getters e setters dos novos atributos
	
	public String getDepartamento() {
		return Departamento;
	}

	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}

	public String getFuncao() {
		return Funcao;
	}

	public void setFuncao(String funcao) {
		Funcao = funcao;
	}

	public Double getSalario() {
		return Salario;
	}

	public void setSalario(Double salario) {
		Salario = salario;
	}

	
	
	//Também é possivel buscar o to string da classe pai e adicionar os atributos adicionais
	@Override
	public String toString() {
		return "Vendedor [ toString()=" + super.toString() + "Departamento=" + Departamento + ", Funcao=" + Funcao + ", Salario=" + Salario
				+ "]";
	}
	
		
	

}
