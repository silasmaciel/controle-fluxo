public class PlanoOperadora {
    public static void main(String[] args) {
        
        String plano = "M";

        switch (plano) {
            case "T":
                System.out.println("5gb Youtube");
        
            case "M":
                System.out.println("WTZ e Instragram grátis");

            case "B":
                System.out.println("100 minutos de Ligação");
                
                default:
                break;
        }



    }
    
}



        /*if (plano == "B"){
            System.out.println("100 minutos de Ligação");
        }
        else if (plano == "M"){
            System.out.println("100 minutos de Ligação, " + "WTZ e Instragram grátis");   
        }
        else if (plano == "T"){
            System.out.println("100 minutos de Ligação, " + "WTZ e Instragram grátis, " + "5gb Youtube");
        }
 */