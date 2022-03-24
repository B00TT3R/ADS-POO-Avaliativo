public class Dono{
     public static void main(String[] args){        
        Casa minha = new Casa("Tamarindos", 1.6f, 240.5f );

        minha.escreverrua();
        minha.tamanhomuro();
        minha.area();
        System.out.println(minha.funcaorua("A rua e: "));
        System.out.println(minha.funcaomuro("O tamanho do muro e: "));
        System.out.println(minha.funcaoarea("A area: "));
    }
}