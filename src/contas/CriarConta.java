package contas;

public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(200);
		System.out.println("Saldo: " + primeiraConta.getSaldo());

		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());

		Conta segundaConta = new Conta();
		segundaConta.deposita(50);
		System.out.println(segundaConta.getSaldo());
	}

}
 