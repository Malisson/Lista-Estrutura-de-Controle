package Exercicios;
import javax.swing.*;
public class medias {
    public static void main (String args []){             
          String mediaAlunos  = "MÉDIA DOS ALUNOS\n"; 
          int contAprovados = 0; 
          int contReprovados = 0;
          int contExame = 0;
          double mediaAluno = 0.0;
          double mediasala = 0.0;
          double nota1inf;
          double nota2inf;
          for(int i = 0; i < 6; i++){         
             String nota1 = JOptionPane.showInputDialog ((i+1)+"º Aluno - Digite a primeira nota");
             nota1inf = Double.parseDouble(nota1);
             String nota2 = JOptionPane.showInputDialog((i+1)+"º Aluno - Digite a segunda nota"); 
             nota2inf = Double.parseDouble(nota2); 
             mediaAluno = (nota1inf + nota2inf) / 2;
             mediasala += (nota1inf + nota2inf) / 6 ;
             if(mediaAluno < 3){
                mediaAlunos +="\nMédia aluno "+(i+1)+": "+mediaAluno+" REPROVADO";  
                contReprovados++;                     
             }
              else  
                if(mediaAluno <= 7){
                   mediaAlunos +="\nMédia aluno "+(i+1)+": "+mediaAluno+" EM EXAME";  
                   contExame++;
                }
              else  
                   if(mediaAluno > 7){ 
                      mediaAlunos +="\nMédia aluno "+(i+1)+": "+mediaAluno+" APROVADO";     
                      contAprovados++;  
                   }  
          }
          System.out.println(mediaAlunos);
          System.out.println("\nAlunos aprovados: "+contAprovados); 
          System.out.println("Alunos em exame: "+contExame); 
          System.out.println("Alunos reprovados: "+contReprovados);
          System.out.println("\nMédia da Classe: "+ mediasala);
    }
}