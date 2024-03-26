package ExerciciosPraticos;

public class ExercicioDeFixacao {
    public static void main(String[] args) {
        //Exercício de fixação
        int Idade = 35;
        double Salario = 16700.50;
        boolean IsDentroDeSucesso = Idade >= 35 && Salario >= 10000;
        boolean IsDentroDeQuaseSucesso = Idade < 25 && Salario >= 5000;
        System.out.println("Estou em uma posição boa? " +IsDentroDeSucesso);
        System.out.println("Estou em uma posição boa? " +IsDentroDeQuaseSucesso);
    }
}
