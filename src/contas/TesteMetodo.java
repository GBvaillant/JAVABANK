package contas;

public class TesteMetodo {

	public static void main(String[] args) {
		Conta conta01 = new Conta();

		conta01.deposita(100);
		conta01.deposita(200);

		System.out.println(conta01.getSaldo());

		conta01.saca(500);
		System.out.println("SALDO CONTA 01 ANTES DA TRANSIÇÃO: R$" + conta01.getSaldo());

		Conta conta02 = new Conta();
		conta02.deposita(500);
		System.out.println("Conta 02 saldo antes da transição: R$" + conta02.getSaldo());

		conta02.transfere(200, conta01);

		System.out.println("Saldo conta 02 depois da transição: R$" + conta02.getSaldo());
		System.out.println("Saldo conta 01 depois da transição: R$" + conta01.getSaldo());

	}

}