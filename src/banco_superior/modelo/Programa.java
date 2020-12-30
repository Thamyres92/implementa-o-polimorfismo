package banco_superior.modelo;

public class Programa {
	
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente("22222", "AG", "Ana", "15236832521", "29/12/2020");
		Conta c2 = new ContaPoupanca("85643", "AG", "José", "25638456975", "29/12/2020");
		
		System.out.println("CONTAS CRIADAS SEM SALDOS: ");
		System.out.println(c1);
		System.out.println(c2);
		
		c1.depositar(1000f);
		c2.depositar(100f);
		
		System.out.println("CONTAS CRIADAS COM SALDO: ");
		System.out.println(c1);
		System.out.println(c2);
		
		
		c1.transferencia(c2, 100f);
		
		
		
		System.out.println("CONTAS APÓS TRANSFERÊNCIAS: ");
		System.out.println(c1);
		System.out.println(c2);
		
		
	}
}
