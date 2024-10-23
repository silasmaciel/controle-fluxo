 //CaixaEletronico.java
public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
       
        double saldo = 25.0;
        double valorSolicitado = 30.0;

            if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
                System.out.println(saldo);
            }
            else
                System.out.println("Sem saldo!");
      
    }
}
