package exerciciossala;

import java.util.Scanner;

public class d0205e003 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);//puxando impressora
        
        int i=0, genero;//inicializando variaveis
        double idadegirlf=0, idadegirl, idademanf=0, idademan, idadeoutro, idadeoutrof=0; 
        double alturagirl, alturagirlf=0;
        double countgirl=0, countman=0, countoutro=0, outro=0;
        double mediaalturagirl, mediaidade, percent, mediaidademan;
        
        for(i=0; i<1000; i++){//repetição para 1000 habitantes
            System.out.println("Qual o seu genero: \n0- Masculino\n1- Feminino \n2- outro\n ");
            genero = ler.nextInt();
          
            switch(genero){//condição para entrada de genero e consequentemente perguntas atribuidas para aquele genero
                case 0://caso0
                    System.out.println("Qual a sua idade: ");
                    idadegirl = ler.nextInt();
                    idadegirlf = idadegirlf + idadegirl;//somando o total de idade
                            
                    if(idadegirl >= 18 && idadegirl <=35){//condição para pessoas entre 18 a 35 anos
                    countgirl++;
                    }
                    
                    System.out.println("Qual a sua altura: ");
                    alturagirl = ler.nextFloat();
                    alturagirlf = alturagirlf + alturagirl;
                    break;//finalizando caso
                    
                case 1://caso2
                    System.out.println("Qual a sua idade: ");
                    idademan = ler.nextInt();
                    idademanf = idademanf + idademan;
                    
                    if(idademan >= 18 && idademan <=35){
                    countman++;
                    }
                    break;
                    
                case 2: 
                    outro++;
                    System.out.println("Qual a sua idade: ");
                    idadeoutro = ler.nextInt();
                    
                    idadeoutrof = idadeoutrof + idadeoutro;
                    
                    if(idadeoutro >= 18 && idadeoutro <=35){
                    countoutro++;
                    }
                    break;
                default://quando nao existe esse tipo de caso
                    System.out.printf("Não existe essa opção!");
            }    
        }
        mediaidade = (idademanf + idadegirlf + idadeoutrof)/5;//calculando a media dos dados obtidos
        System.out.printf("A idade media do grupo: %f", mediaidade);
        
        mediaalturagirl = (alturagirlf/countgirl);
        System.out.printf("A idade media de altura entre as mulheres: %f",mediaalturagirl);
        
        mediaidademan = idademanf / countman;
        System.out.printf("A idade media dos homens: %f", mediaidademan);
       
        System.out.printf("Total de pessoas como OUTRO: %f", outro);
        
        percent = (((countgirl*100)/5)+((countman*100)/5)+((countoutro*100)/5));
        System.out.printf("Pessoas entre 18 e 35 anos: %f", percent); 
    }   
}
