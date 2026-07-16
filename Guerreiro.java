public class Guerreiro extends Personagem {
    public Guerreiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        //Uso a classe "Guerreiro" como parâmetro para a superclasse, garantindo que o personagem seja criado com a classe correta.
        super(nome, "Guerreiro", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Guerreiro " + this.nome + " ataca com Espada Flamejante!");
    }
}
