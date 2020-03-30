package entidades;

import java.util.Date;

/*----------------------------------------CLASSE DE ENTIDADE(OBJETO)---------------------------------------------------------------
 * Essa � uma representa��o de uma classe de entidades, onde o objeto � apresentado. 
 * Geralmente ela tem que ser representada da seguinte maneira:
 * Atributos 
 * Construtores com e sem argumentos
 * Getters e Setters
 * HashCode e Equals (quando necess�rio comparar algum atributo)
 * ToString (Quando necess�rio uma representa��o em String da classe)
 * 
 * Todos os itens acima ser�o explicados detalhadamente abaixo 
 * 
 * Obs: � possivel separar as classes em pacotes para organizar, manter a seguran�a e facilitar a manuten��o.
 * Um c�digo bem escrito com seus objetos e atributos bem especificados dispensa coment�rios.
 * 
 * */


public class Usuario {
	
	/* --------------------------------------------ATRIBUTOS------------------------------------------------------------
	 * Quando se obtem o objeto do problema, tamb�m obtem-se seus atributos. Eles podem ser especificados da seguinte maneira
	 * mod_Visibilidade mod_Acesso Tipo <nome da variavel>; Ex:
	 * private static String nome;
	 * N�o utilizei o static pois n�o senti necessidade de buscar essa visibilidade para variavel,
	 * implicando que haver� outros metodos para isto.
	 *	-------------------------------------------------------------------------------------------------------------------*/
	
	private int Id;
	private String Nome, Endereco, Email, Telefone;
	

	/*------------------------------------------CONSTRUTORES--------------------------------------------------------------------
	 * O construtor � um metodo que imp�e um padr�o de instancia��o de uma classe
	 * Abaixo � possivel ver uma sobrecarga de construtores
	 --------------------------------------------------------------------------------------------------------------------------*/
	
	/*Este � para instanciar a classe da seguinte maneira:
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
	 * SET -> Metodo para obten��o ou modifica��o de um atributo.
	 * GET -> Metodo para receber o valor ja obtido do atributo. 
	 * 
	 * Observe que no atributo Id n�o possuimos set, exatamente para evitar que o id seja modificado e haja inconsistencia.
	 -----------------------------------------------------------------------------------------------------------------*/
	
	public int getId() {
		return Id;
	}

	//A constru��o do get � apenas o retorno do valor do metodo.
	public String getNome() {
		return Nome;
	}
	
	//J� a do set � atribui��o da mesma variavel a outra instanciada nos construtores
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
	 * � uma ferramenta da JMV para mapear e facilitar a busca de uma informa��o. 
	 * � possivel escolher qualquer atributo para esse metodo e para o equals.
	 * Abaixo, como iremos comparar apenas o ID, para evitar inconsistencia.
	 ---------------------------------------------------------------------------*/
	
	/*
	 * Observe que esse � uma sobrescrita de outro metodo ja existente no java.
	 * Sua constru��o � feita por um numero, determinado pelo proprio java e um calculo entre os numeros e atributo
	 * Ele se torna uma especie de c�digo, o c�digo hash que serve para facilitar a busca e mapeamento.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		return result;
	}
	
	
	/*---------------------------------------------Equals--------------------------------
	 * � um metodo para compara��o. Ele existe pois em java � comum comparar dois objetos com os mesmo valores
	 * e sua compara��o retornar falsa, ou seja, n�o s�o iguais. 
	 * A sua constru��o � feita com comparadores
	 * sendo o primeiro codigo para comparar o valor e retornar verdadeiro se for igual
	 * o segundo o retorno para caso n�o seja igual
	 * Depois a busca da classe do objeto com a do outro objeto comparado
	 * Depois a cria��o do Usuario other para a compara��o entre o atributo desses dois objetos.
	 * Caso sane todas as condi��es, o retorno � verdadeiro
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
	
	/*Esse � o metodo toString, na qual retorna uma string padr�o para a classe. Neste h� retorno dos atributos
	 * � possivel organizar da forma desejavel, observando as regras da constru��o de uma string.
	 * 
	 * Lembrando que tamb�m pode-se formatar a sa�da observando as limita��es das strings
	 * 
	 */
	
	@Override
	public String toString() {
		return "Usuario [Id=" + Id + ", Nome=" + Nome + ", Endereco=" + Endereco + ", Email=" + Email + ", Telefone="
				+ Telefone + "]";
	}
	
	
	
	
	
	
	
	
	

}
