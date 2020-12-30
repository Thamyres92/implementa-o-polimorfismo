package banco_superior.modelo;

public abstract class Conta {
	String numeroConta;
	String agencia;
	String nome;
	String cpf;
	private float saldo;
	boolean status;
	String dataAbertura;
	
	static final float TAXA_ADMINISTRACAO = 0.02f;

	public Conta(String numeroConta, String agencia, String nome, String cpf, String dataAbertura) {
		super();
		this.agencia = agencia; 
		this.numeroConta = numeroConta; 
		this.nome = nome; 
		this.cpf = cpf;
		this.dataAbertura = dataAbertura; 
		this.status = true;
		this.saldo = 0f;
		
		// TODO Auto-generated constructor stub
	}
	/* atribuindo */
	@Override
	public String toString() {
		return "Conta [numeroConta=" + numeroConta + ", agencia=" + agencia + ", nome=" + nome + ", cpf=" + cpf
				+ ", saldo=" + saldo + ", status=" + status + ", dataAbertura=" + dataAbertura + "]";
	}
	
	/* se o saldo for positive o valor será depositado */
	@SuppressWarnings("unused")
	public void depositar (float valorDepositado) {
		if (this.status == true && valorDepositado > 0) {
			this.saldo = saldo + valorDepositado;
		}	
	}
	
	/* destivando a conta (status negativo) */
	public void desativarConta () {
		this.status = false;  
	}
	
	/* sacando dinheiro (retirando o dinheiro da conta e calculando o saldo atual) */
	public void sacar (float valorSacado) {
		if (this.saldo >= valorSacado && valorSacado > 0 && this.status == true) {
			this.saldo = this.saldo - valorSacado;
		}
			}
	
	/* retornando saldo atual */
	public float getSaldo () {
		return this.saldo;
	}
	
	/* transferencia */
	public abstract void transferencia (Conta contaDestino, float valorTransferido);
}
