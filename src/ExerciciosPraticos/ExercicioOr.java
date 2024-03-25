package ExerciciosPraticos;

public class ExercicioOr {
    public static void main(String[] args) {
        double ContaCorrente = 200;
        double ContaPoupanca = 10000;
        float ValorPlaystation = 5000;
        boolean Conclusao = ContaCorrente > ValorPlaystation || ContaPoupanca > ValorPlaystation;

        System.out.println("Playstation 5 é adiquirivel? " +Conclusao);
    }
}
