public class exc {
    
}


 class Perfil {
    public static void main(String[] args) {
        System.out.println("Olá, Kevin");
        System.out.println("Tudo bem ?");
    }
    
}

class Estudos {
    public static void main(String[] args) {
        System.out.println("Estudar Java todos os dias");
    }
}


class Soma {
    public static void main(String[] args) {
        System.out.println(5+10);
    }
}


class Subtracao {
    public static void main(String[] args) {
        System.out.println(10-5);
    }
}


class multiplicacao {

    public static void main(String[] args) {
        System.out.println(10*5);
    }
}


class convert {
    public static void main(String[] args) {
        
    double temperatrura  = 30.4;

    System.out.println((temperatrura *1.8) + 32 );

    }

}


class notas {
    public static void main(String[] args) {
        double nota1 = 8.59;
        double nota2 = 8.50;

        System.out.println ( (nota1 + nota2 ) /2 );
    }

    
}   


class casting {
    
    public static void main(String[] args) {
        
        double numero1 = 10.89;
        
        int resultado = (int) Math.round(numero1);

        System.out.println(resultado);
    }
}


class letra {
    public static void main(String[] args) {
        char umaLetra = 'A';
        String resultado = (umaLetra ) + " Luiza vai comer batata frita hoje";

        System.out.println(resultado);



    }
}



class produto {

    public static void main(String[] args) {
        double precoProduto = 10.50;
        int quantidade = 165;

        System.out.println((precoProduto * quantidade));
    }
}


class dolar {
    public static void main(String[] args) {
        double dolaR = 4.94;
        int doLar = (int) Math.round(dolaR);
        System.out.println((doLar * 50));
    }
}