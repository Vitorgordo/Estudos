package ExerciciosPraticos;

public class ExercicioDevDojoOrEAnd {
    public static void main(String[] args) {
        //Doubles
        double Salario = 1300.00;
        double Salario2 = 2500.00;
        double Salario3 = 3500.00;
        double Salario4 = 4500.00;
        //FIm Double
        //boolean
        boolean resultado1 = Salario < 1400;
        boolean resultado2 = Salario2 > 1400 && Salario2 < 3000;
        boolean resultado3 = Salario3 > 3000 && Salario3 < 4000;
        boolean resultado4 = Salario4 > 4000 && Salario4 < 5000;
        //fim boolean
        //começo if else if e else
        if (resultado1 == true) {
            System.out.println("Você não precisa pagar impostos!");
        } else if (resultado1 == false) {
            System.out.println("Você precisa pagar impostos!");
        } else {
            System.out.println("Erro!!");
        }
        if (resultado2 == true) {
            String imposto = String.valueOf(Salario2 /3.50);
            System.out.println("Você precisa pagar impostos! " +imposto);
        } else if (resultado2 == false) {
            System.out.println("Você não precisa pagar impostos!");
        } else {
            System.out.println("Erro!!");
        }
        if(resultado3 == true){
            String imposto2 = String.valueOf( Salario3 / 3.50);
            System.out.println("Você precisa pagar impostos! " +imposto2);
        } else if (resultado3 == false) {
            System.out.println("Você não precisa pagar impostos!");
        } else {
            System.out.println("Erro!!");
        }
        if(resultado4 == true){
            String imposto3 = String.valueOf(Salario3 / 3.50);
            System.out.println("Você precisa pagar impostos! " +imposto3);
        } else if (resultado3 == false) {
            System.out.println("Você não precisa pagar impostos!");
        } else {
            System.out.println("Erro!!");
        }
    }
}
