//SistemaMedida.java

import javax.sql.rowset.CachedRowSet;

public class SistemaMedida {

    public static void main(String[] args) {

        String sigla = "M";

        switch (sigla) {
            case "P":{
                System.out.println("Pequeno");
                break;
        }
            case "M":{
                System.out.println("Medio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
                System.out.println("Indefinido");

    }
    }
}



       //Utilizanfo If e Else
       /* if (sigla == "P")
            System.out.println("Pequeno");
        else if (sigla == "M")
            System.out.println("Medio");
        else if (sigla == "G")
            System.out.println("Grande");

        else 
            System.out.println("Indefinido");
 */
 