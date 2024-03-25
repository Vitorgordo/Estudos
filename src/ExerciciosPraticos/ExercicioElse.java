package ExerciciosPraticos;

public class ExercicioElse {
    public static void main(String[] args) {

        //Começo dos int
        int idade1 = 14;
        int idade2 = 17;
        int idade3 = 24;
        int idade4 = 10;
        //Fim dos int

        //Começo boolean
        boolean CategoriaInfatil = idade4 < 15 && idade3 > 15;
        boolean CategoriaJuvenil = idade2 >= 15 && idade2 <18;
        boolean CategoriaAdulto = idade3 >= 18 && idade4 < 18;
        //Fim boolean
        //Começo else if e essas paradas
        if(CategoriaInfatil == true){
            System.out.println("Categoria Infantil");
        }else{
            System.out.println("Erro");
        }
        if (CategoriaJuvenil == true){
            System.out.println("Categoria Juvenil");
        }else{
            System.out.println("Erro");
        }
        if (CategoriaAdulto == true){
            System.out.println("Categoria Adulto");
        }else{
            System.out.println("Erro");
        }
        //FIm
    }
}
