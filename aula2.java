import java.util.Scanner;

public class aula2 {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");
    
        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
         boolean incluidoNoPlano = true;
         double notaDoFilme = 8.1; 
 
        //MEDIA CALCULADA PELAS 3 NOTAS DA JACK 

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento; 

        System.out.println(sinopse); 

        /*String senha = "123456";
        if (senha.equals("123456")) {
            System.out.println("Acesso autorizado");
        } else {
            System.out.println("Acesso Negado");
        }
            */

   

        int classificacao = (int) (media /2);
        System.out.println(classificacao + " estrelas");



    }   


}

class Condicional {
    public static void main(String[] args) {
        
        int anoDeLancamento = 1980;
         boolean incluidoNoPlano = true;
         double notaDoFilme = 8.1; 
         String tipoPlano = "PLUS";


        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos que os cliente esta curtindo! ");
        }else {
            System.out.println("Filme retro que vale a pensa assistis! ");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("PLUS")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }    
    
    }
}

class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual o ano de nascimento");

        int anoDeLancamento = leitura.nextInt();


    }
}
