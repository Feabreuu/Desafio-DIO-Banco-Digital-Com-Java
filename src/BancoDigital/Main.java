package BancoDigital;

public class Main {

	public static void main(String[] args) {
		Cliente Fernanda = new Cliente();
		Fernanda.setNome("Fernanda");
		
		
		Conta cc = new ContaCorrente(Fernanda);       
		Conta poupanca = new ContaPoupanca(Fernanda);

		cc.depositar(100);
		cc.transferir(50, poupanca);

		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
