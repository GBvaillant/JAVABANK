package contas;

public class TesteReferencia {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(30000);

		System.out.println("Saldo: " + primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta();
		segundaConta.deposita(1000);

		if (primeiraConta.getSaldo() < 500) {
			System.out.println("Você é pobre");
		} else {
			System.out.println("Me empresta uma grana aí");
		}
	}

}
