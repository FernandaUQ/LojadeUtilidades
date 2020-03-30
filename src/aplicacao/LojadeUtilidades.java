package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Cliente;
import entidades.Usuario;
import entidades.Venda;
import entidades.Vendedor;

public class LojadeUtilidades {

	public static void main(String[] args) {
		/* Classe Main com o mesmo nome do projeto para evitar problemas de compilação
		 * Nessa parte é onde colocamos os comandos para execução principal do 
		 * 
		 */
		
		/*Instanciação de Dados	 */
		
			
		List<Venda> venda = new ArrayList<>();
		
		Cliente user1 = new Cliente(01, "Joana da Silva", "QS 13 Casa 22 Taguatinga-DF", "Joana@gmail.com", "(61) 1111-1111", 3450.50, 8400.00);
		
		Vendedor user2 = new Vendedor(02, "Luana Souza" , "QNN 4 Cj H Casa 13 Ceilandia-DF", "luana@gmail.com", "(61) 3333-3333", "Eletronicos", "Vendedora", 2500.00);
		Venda venda1 = new Venda(11, "TV Led 60", 2599.90, 2, user1, user2);
		Venda venda2 = new Venda(12, "Notebook Asus", 3559.90, 1, user1, user2);
		
		venda.add(venda1);
		venda.add(venda2);
		
		for (Venda v : venda) {
			System.out.println(v.toString());
		}
			
			

			
			

	}

}
