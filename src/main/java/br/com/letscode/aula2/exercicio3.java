package br.com.letscode.aula2;

public class exercicio3 {
    public static void main(String[] args) {
        String[] alunos = {"ALINE", "MÁRIO", "SÉRGIO", "SHIRLEY"};
        String[] notas = {"9.0", "DEZ", "4.5", "7.0"};

        System.out.println("ALUNO(A)      NOTA");
        System.out.println("=========     =====");
        for(int i=0; i<4; i++){
            if(alunos[i].length() == 6){
                System.out.println(alunos[i] + "         " + notas[i]);
            }
            else if(alunos[i].length()== 7){
                System.out.println(alunos[i] + "        " + notas[i]);
            }
            else {
                System.out.println(alunos[i] + "          " + notas[i]);
            }
        }
    }
}
