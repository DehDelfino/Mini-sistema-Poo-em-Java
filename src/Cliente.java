import java.util.ArrayList;

public class Cliente {
//3.	Classe Cliente
//a.	Contém os seguintes atributos privados:
//i.	nome, do tipo String
//ii.	conta correntes , do tipo ArrayList de ContaCorrente
//b.	Contém os seguintes métodos públicos:
//i.	construtor (que também constrói o array de ContaCorrente), getters e setters

// ---------------------------------------------------------------------------------------

//ii.	operar, que chama ao menos 3 vez os métodos para depositar, retirar, verificar saldo e imprimir os dados da respectiva conta corrente
//iii.	saldo total, com o da conta correntes.
//iv.	Imprimir: que imprime todos os dados do cliente e das respectivas contas.
    
    private String nome;
    private ArrayList <ContaCorrente> contaCorrentes;

    public Cliente(String nome) {
        this.nome = nome;
        contaCorrentes = new ArrayList<>();
    }
   

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<ContaCorrente> getContaCorrentes() {
        return this.contaCorrentes;
    }

    public void setContaCorrentes(ArrayList<ContaCorrente> contaCorrentes) {
        this.contaCorrentes = contaCorrentes;
    }

    public void operar(){
        //, que chama ao menos 3 vezes os métodos para depositar,
        // retirar, verificar saldo e imprimir os dados da respectiva conta corrente
        for(ContaCorrente contas: contaCorrentes){
            contas.depositar(valor);

        }
 
    
    }
    
    public void saldoTotal(){
        //, com o da conta correntes.

    }

    public void imprimir(){
        System.out.println("Dados"  + getContaCorrentes());



    }
    


}


