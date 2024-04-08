package contas;

import cliente.Cliente;

public class TesteGetterSetter {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setNumero(13);
		System.out.println(conta.getNumero());
		
		Cliente cliente = new Cliente();
		cliente.setCPF("111.222.333-04");
		conta.setTitular(cliente);
		
		System.out.println(conta.getTitular().getCPF());
	}

}
