package cliente;

import contas.Conta;

public class TestaCliente {

	public static void main(String[] args) {
		Cliente gabriel = new Cliente();
		gabriel.setNome("Gabriel");
		gabriel.setCPF("111.222.333-04");
		gabriel.setProfissao("dev falido");

		Conta contaGabriel = new Conta();
		contaGabriel.deposita(1000);

	};
}
