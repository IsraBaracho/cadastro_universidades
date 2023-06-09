

public class MEC
{
    public void imprimeUniversidades(Universidade[] arrayUniversidade){
        for(int i = 0; i < arrayUniversidade.length; i++)
        {   if (arrayUniversidade[i] instanceof Publica){
            System.out.println("Informações Universidade Pública");        
            arrayUniversidade[i].imprimeInfo();
        }
        else if (arrayUniversidade[i] instanceof Privada){
            System.out.println("Informações Universidade Privada");        
            arrayUniversidade[i].imprimeInfo();
        }
        }
    }
    
    public void maisCara(Universidade[] arrayCara){
        double maiorMensalidade = 0;
        int colocacao = 0;
        for(int i = 0; i < arrayCara.length; i++){
            if(arrayCara[i] instanceof Privada){
                if(((Privada)arrayCara[i]).getValorMensalidade() >maiorMensalidade){
                    maiorMensalidade = ((Privada)arrayCara[i]).getValorMensalidade();
                    colocacao = i;
                }
            }
        }
        System.out.println("Universidade Privada mais cara é: ");
        arrayCara[colocacao].imprimeInfo();

    }
    
    public void universidadesDoSul(Universidade [] arrayUniversidadeDoSul){
        int flag = 0;
        
        for(int i = 0; i < arrayUniversidadeDoSul.length; i++){
            if(arrayUniversidadeDoSul[i] instanceof Publica){
                if((((Publica)arrayUniversidadeDoSul[i]).getEstado()).equalsIgnoreCase("RS")|| (((Publica)arrayUniversidadeDoSul[i]).getEstado()).equalsIgnoreCase("SC") ||(((Publica)arrayUniversidadeDoSul[i]).getEstado()).equalsIgnoreCase("PR")){
                    arrayUniversidadeDoSul[i].imprimeInfo();
                    flag = 1;
                }
            }
        }
        if (flag == 0){
            System.out.println("Nenhuma Universidade encontrada na região sul do país ");
        }
    }
}
