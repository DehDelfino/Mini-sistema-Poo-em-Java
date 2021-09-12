import java.util.ArrayList;
/*
2.	Classe ContaCorrente
a.	Contém os seguintes atributos privados:
i.	agencia, do tipo int
ii.	numero, do tipo int
iii.	array do tipo ArrayList de Transacao
iv.	cliente, do tipo Cliente
b.	Contém os seguintes métodos públicos:
i.	Construtor, getters e setters (verificando se os dados estão validos)
ii.	depositar um valor na conta (adicionar uma transação)
iii.	retirar um valor da conta (adicionar uma transação), desde que o saldo não fique negativo; deve retornar o valor efetivamente retirado. 
Ex. Saldo R$10,00 – retirar $25,00 – Transação criada vai ser de $-10. Saldo ficar 0
iv.	retornar o saldo da conta (somando todas as transações)
v.	extrato todos os dados da conta corrente, suas transações 
c.	Possui a seguinte invariante: o saldo nunca é negativo.
*/


public class ContaCorrente  {
  

    private ArrayList <Transacao> transacao ;
    private int agencia;
    private int numero; 
    private double saldo;
    private Cliente clientes;

    

    public ContaCorrente(int agencia, int numero, Cliente clientes) {
        transacao = new ArrayList<>();
        this.agencia = agencia;
        this.numero = numero;
        this.clientes = clientes;
    }




  public ArrayList<Transacao> getTransacao() {
    return this.transacao;
  }

  public void setTransacao(ArrayList<Transacao> transacao) {
    this.transacao = transacao;
  }

  

  public int getAgencia() {
    return this.agencia;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public Cliente getClientes() {
    return this.clientes;
  }

  public void setClientes(Cliente clientes) {
    this.clientes = clientes;
  }


  public double getSaldo() {
    return this.saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }





  public void depositar (float valor ){

  
    if (0 < valor && getSaldo() > valor){
      setSaldo( getSaldo() + valor);
    }


    for (Transacao T: transacao){

    }
      
  }

  


  public void retirar (double valor){

    //um valor da conta (adicionar uma transação), desde que o saldo não fique negativo; deve retornar o valor efetivamente retirado. 
    //Ex. Saldo R$10,00 – retirar $25,00 – Transação criada vai ser de $-10. Saldo ficar 0

    if (0 < valor && getSaldo() > valor){
      setSaldo( getSaldo() - valor);
    }
    
  }

  

  public void retornar (){
    //o saldo da conta (somando todas as transações)
    
  }

  public void extrato (){
    
	// Possui a seguinte invariante: o saldo nunca é negativo.

    
  }
 
}
   
