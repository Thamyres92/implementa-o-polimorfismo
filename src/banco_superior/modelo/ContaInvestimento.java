package banco_superior.modelo;

public class ContaInvestimento extends Conta {

	public ContaInvestimento(String numeroConta, String agencia, String nome, String cpf, String dataAbertura) {
		super(numeroConta, agencia, nome, cpf, dataAbertura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void transferencia(Conta contaDestino, float valorTransferido) {
		// TODO Auto-generated method stub
		if (contaDestino instanceof ContaInvestimento) {
			this.sacar(valorTransferido+(valorTransferido*Conta.TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
		} else if (contaDestino instanceof ContaCorrente) {
			this.sacar(valorTransferido+(valorTransferido*Conta.TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
		} else {
			this.sacar(valorTransferido+(valorTransferido*Conta.TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
		}
		
	}
	

	
}
