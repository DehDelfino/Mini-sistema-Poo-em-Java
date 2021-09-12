//1.	Classe Transacao
//a.	Contém os seguintes atributos privados:
//i.	descricao, do tipo String
//ii.	data, do tipo LocalDate
//iii.	valor, do tipo float (que pode ser positivo ou negativo)
//b.	Contém os seguintes métodos públicos:
//i.	Construtor, getters e setters (verificando se os dados estão validos)
//ii.	imprimir todos os dados da transação


import java.time.LocalDate;
// import java.time.ZoneId;
// import java.util.Date; 

public class Transacao  {

    private String descricao;
    private float valor;
    private LocalDate data;

    
    
    
    public Transacao(String descricao, float valor, LocalDate data) {
  
        this.descricao = descricao;
        this.valor = valor;
        this.data= LocalDate.now();
    
    }

    
    public LocalDate getData() {
        return this.data;
    }

    // public void setData(int dia,int mes,int ano) {
    //     String dMes = ""+mes;
    //     String dDia = ""+dia;
    //     if(mes < 10)
    //         dMes = "0"+mes;
    //     if(dia < 10)
    //         dDia = "0"+dia;
    //     this.data = LocalDate.parse(ano+"-"+dMes+"-"+dDia);
    // }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
      if (descricao.isEmpty()){
        this.descricao = "Transação realizada no dia:"+ data.getDayOfMonth()+"/"+data.getMonthValue()+"/"+data.getYear();
      }
        this.descricao = descricao;

    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        if (valor != 0){
            this.valor = valor;
        }

    }

    public void imprimir(){
      System.out.println("Descição: " + getDescricao());
      System.out.println("Valor da transferencia: " + getValor());
      System.out.println("Data: " +getData());
    }





    public void transacao(){
        
    }


}