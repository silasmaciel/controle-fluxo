public class EstruturaForArray {
    public static void main(String[] args) {
        //OBS: em arrays o indice de elemento inica com "ZERO"

        String alunos[] = {"SILAS", "FELIPE", "RAFAEL", "JOÃO"};

        //Exemplo 01
        //for (int x=0; x<alunos.length; x++){
           // System.out.println("O Aluno no indice x= " + x + " é " + alunos [x]);
        
           //Exemplo 02
           for (String aluno : alunos) {
            System.out.println("Nome do aluno é : " + aluno);
           }
        
        }
    }
