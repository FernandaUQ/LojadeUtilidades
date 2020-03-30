package entidades;

import java.util.Date;

/*----------------------------------------CLASSE DE ENTIDADE(OBJETO)---------------------------------------------------------------
 * Essa é uma representação de uma classe de entidades, onde o objeto é apresentado. 
 * Geralmente ela tem que ser representada da seguinte maneira:
 * Atributos 
 * Construtores com e sem argumentos
 * Getters e Setters
 * HashCode e Equals (quando necessário comparar algum atributo)
 * ToString (Quando necessário uma representação em String da classe)
 * 
 * Todos os itens acima serão explicados detalhadamente abaixo 
 * 
 * Obs: É possivel separar as classes em pacotes para organizar, manter a segurança e facilitar a manutenção.
 * Um código bem escrito com seus objetos e atributos bem especificados dispensa comentários.
 * 
 * */


public class Usuario {
	
	/* --------------------------------------------ATRIBUTOS------------------------------------------------------------
	 * Quando se obtem o objeto do problema, também obtem-se seus atributos. Eles podem ser especificados da seguinte maneira
	 * mod_Visibilidade mod_Acesso Tipo <nome da variavel>; Ex:
	 * private static String nome;
	 * Não utilizei o static pois não senti necessidade de buscar essa visibilidade para variavel,
	 * implicando que haverá outros metodos para isto.
	 *	-------------------------------------------------------------------------------------------------------------------*/
	
	private int Id;
	private String Nome, Endereco, Email, Telefone;
	

	/*------------------------------------------CONSTRUTORES--------------------------------------------------------------------
	 * O construtor é um metodo que impõe um padrão de instanciação de uma classe
	 * Abaixo é possivel ver uma sobrecarga de construtores
	 --------------------------------------------------------------------------------------------------------------------------*/
	
	/*Este é para instanciar a classe da seguinte maneira:
	 * Usuario user = new Usuario();
	 * Ou seja, sem a necessidade de argumentos; 
	 */
	public Usuario () {
	}

	/*E este para instanciar da seguinte maneira:
	 *  Usuario user = new Usuario (id, nome, endereco, email, telefone);
	 *  Ou seja, com argumentos.
	 */
	public Usuario(int id, String nome, String endereco, String email, String telefone) {
		Id = id;
		Nome = nome;
		Endereco = endereco;
		Email = email;
		Telefone = telefone;
	}

	/*----------------------------------GETTERS E SETTERS-----------------------------------------------------------
	 * SET -> Metodo para obtenção ou modificação de um atributo.
	 * GET -> Metodo para receber o valor ja obtido do atributo. 
	 * 
	 * Observe que no atributo Id não possuimos set, exatamente para evitar que o id seja modificado e haja inconsistencia.
	 -----------------------------------------------------------------------------------------------------------------*/
	
	public int getId() {
		return Id;
	}

	//A construção do get é apenas o retorno do valor do metodo.
	public String getNome() {
		return Nome;
	}
	
	//Já a do set é atribuição da mesma variavel a outra instanciada nos construtores
	//Para que os atributos da classe em si possuam um valor.
	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	
	
	/*----------------------------HASHCODE--------------------------------------------
	 * É uma ferramenta da JMV para mapear e facilitar a busca de uma informação. 
	 * É possivel escolher qualquer atributo para esse metodo e para o equals.
	 * Abaixo, como iremos comparar apenas o ID, para evitar inconsistencia.
	 ---------------------------------------------------------------------------*/
	
	/*
	 * Observe que esse é uma sobrescrita de outro metodo ja existente no java.
	 * Sua construção é feita por um numero, determinado pelo proprio java e um calculo entre os numeros e atributo
	 * Ele se torna uma especie de código, o código hash que serve para facilitar a busca e mapeamento.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		return result;
	}
	
	
	/*---------------------------------------------Equals--------------------------------
	 * É um metodo para comparação. Ele existe pois em java é comum comparar dois objetos com os mesmo valores
	 * e sua comparação retornar falsa, ou seja, não são iguais. 
	 * A sua construção é feita com comparadores
	 * sendo o primeiro codigo para comparar o valor e retornar verdadeiro se for igual
	 * o segundo o retorno para caso não seja igual
	 * Depois a busca da classe do objeto com a do outro objeto comparado
	 * Depois a criação do Usuario other para a comparação entre o atributo desses dois objetos.
	 * Caso sane todas as condições, o retorno é verdadeiro
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (Id != other.Id)
			return false;
		return true;
	}
	
	/*Esse é o metodo toString, na qual retorna uma string padrão para a classe. Neste há retorno dos atributos
	 * É possivel organizar da forma desejavel, observando as regras da construção de uma string.
	 * 
	 * Lembrando que também pode-se formatar a saída observando as limitações das strings
	 * 
	 */
	
	@Override
	public String toString() {
		return "Usuario [Id=" + Id + ", Nome=" + Nome + ", Endereco=" + Endereco + ", Email=" + Email + ", Telefone="
				+ Telefone + "]";
	}
	
	
	
	
	
	
	
	
	

}
