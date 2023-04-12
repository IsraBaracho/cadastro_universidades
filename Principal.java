import java.util.Scanner;
public class Principal
{
    public static void main(String args[])
    {
        Scanner leia =  new Scanner(System.in);
        
        int tamanho;
        System.out.println ("****CADESTRE NO PORTAL DO MEC UMA UNIVERSIDADE****");
        System.out.println("Qual a quantidade de Universidades? ");
        tamanho = leia.nextInt();
        
        Universidade [] universidades = new Universidade[tamanho];
        
        int opcao, quantAlunos, quantProfessores;
        String nome, estado, cidade;
        estado = null;
        
        double valorMensalidade;
        valorMensalidade=0;
        for(int i = 0; i < universidades.length; i++){
        
        System.out.println ("Selecione a opcao de instituicao que quer cadastrar: ");
        
        System.out.println ("1 - Publica ");
        System.out.println ("2 - Privada ");
        opcao = leia.nextInt();
        leia.nextLine();
        
        System.out.println("Digite o nome: ");
        nome = leia.nextLine();
        
        System.out.println("Digite quantos alunos a universidade possui: ");
        quantAlunos = leia.nextInt();
        leia.nextLine();
        System.out.println("Digite quantos professores a universidade possui: ");
        quantProfessores = leia.nextInt();
        leia.nextLine();
        
        switch(opcao){
            
            case 1:
                System.out.println("Digite o UF da Universidade: ");
                estado = leia.nextLine();
                System.out.println("Digite a cidade da Universidade: ");
                cidade = leia.nextLine();
                universidades[i] = new Publica(nome, quantAlunos, quantProfessores, estado, cidade);
                break;
                case 2:
                System.out.println("Digite o Valor da mensalidade: R$ ");
                valorMensalidade = leia.nextDouble();
                universidades[i] = new Privada(nome, quantAlunos, quantProfessores, valorMensalidade);
                break;
                
                default: 
                    System.out.println("Opção inválida");
                
            
        }
    }
    
    MEC obj = new MEC();
        System.out.println("-- UNIVERSIDADES REGISTRADAS --");
        obj.imprimeUniversidades(universidades);
        System.out.println("");
        
              
        System.out.println("--UNIVERSIDADE MAIS CARA REGISTRADA--");
        obj.maisCara(universidades);
        System.out.println("");
        
        System.out.println("--UNIVERSIDADE DO SUL DO BRASIL--");
        obj.universidadesDoSul(universidades);
        System.out.println("");
        
         
    
    }
    
   
}
