package entidades;

public class Venda {
	
	private int id;
	private String produto;
	private Double ValorUnitario;
	private int Quantidade;
	
	//Observe como é instanciado uma classe como um atributo na classe
	//É possivel, inclusive instanciar como list
	private static Cliente cliente = new Cliente();
	private static Vendedor vendedor = new Vendedor();
	
	
	public Venda () {
		
	}

	public Venda(int id, String produto, Double valorUnitario, int quantidade, Cliente cliente, Vendedor vendedor) {
		super();
		this.id = id;
		this.produto = produto;
		ValorUnitario = valorUnitario;
		Quantidade = quantidade;
		this.cliente = cliente;
		this.vendedor = vendedor;
	}





	public int getId() {
		return id;
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public Double getValorUnitario() {
		return ValorUnitario;
	}


	public void setValorUnitario(Double valorUnitario) {
		ValorUnitario = valorUnitario;
	}
	
	

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	
	//Veja que mudo os getters para facilitar a identificação

	public String getCliente() {
		return cliente.getNome();
		
	}

	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public String getVendedor() {
		return vendedor.getNome();
	}


	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venda other = (Venda) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	/*Observe que uma classe pode haver metodos, por exemplo,
	 * nesta será implementados os metodos
	 * ValorTotal
	 * Comissão (2% do valor da venda)
	 */
	
	public  Double ValorTotal() {
		return ValorUnitario * Quantidade;
	}
	
	public  Double Comissao () {
		return  ValorTotal() * 0.02;
	}

	//Veja que é possivel adicionar valores dos metodos ao toString
	@Override
	public String toString() {
		return "Venda [id=" + id + ", produto=" + produto + ", ValorUnitario=" + ValorUnitario + ", Quantidade="
				+ Quantidade + ", getCliente()=" + getCliente() + ", getVendedor()=" + getVendedor() + ", ValorTotal()="
				+ ValorTotal() + "]";
	}





	
	
	
	
	
	
	

}
