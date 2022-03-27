package dio.projeto.banco;
public class Main {

	public static void main(String[] args) {
		Cliente vitor = new Cliente();
		vitor.setNome("Vitor");
		
		
		Conta ccorrente = new ContaCorrente(vitor);
		
		Conta cpoupanca = new ContaPoupanca(vitor);
		
		ccorrente.depositar(100);
		ccorrente.transferir(100, cpoupanca);
		
		ccorrente.imprimirExtrato();
		cpoupanca.imprimirExtrato();

	}

}
