package aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    public void status() { 
        System.out.println("carga" + this.carga);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("está tampada? " + this.tampada);
        System.out.println("modelo" + this.modelo);
        System.out.println("ponta" + this.ponta);
       
        
    }        
      public void rabiscar() {      
       if (this.tampada == true) {
           System.out.println("ERRO! não posso rabiscar");
       } else {
           System.out.println("Estou Rabiscando");
       }      
    }
      protected void tampar() {
        this.tampada = true
          
      } 
      protected void destampar() {
        this.tampada = false
          
      }

}