import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personagem> herois = new ArrayList<>();
        herois.add(new Mago("Gandalf", 10, 100, 50.0));
        herois.add(new Guerreiro("Conan", 8, 120, 40.0));
        herois.add(new Arqueiro("Legolas", 9, 90, 45.0));


        for (Personagem heroi : herois) {
            heroi.exibirStatus();
            heroi.usarHabilidadeEspecial();
        }

    }
}
