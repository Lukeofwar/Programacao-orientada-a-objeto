package aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status() { 
        System.out.println("carga" + this.carga);
        System.out.println("Uma caneta " + this.cor);
        System.out.println(" está tampada? " + this.tampada);
        System.out.println("modelo" + this.modelo);
        System.out.println("ponta" + this.ponta);
        
    }        
      void rabiscar() {      
       if (this.tampada == true) {
           System.out.println("ERRO! não posso rabiscar");
       } else {
           System.out.println("Estou Rabiscando");
       }      
    }
      void tampar() {
        this.tampada = true
          
      }
      void destampar() {
        this.tampada = false
          
      }

}