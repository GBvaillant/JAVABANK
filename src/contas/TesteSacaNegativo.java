package contas;

public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta01 = new Conta();
		
		conta01.deposita(100);
		
		conta01.saca(20);
		
		System.out.println(conta01.getSaldo());
		
	}

}
