public class Mago extends Personagem {
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase) {
        //Uso a classe "Mago" como parâmetro para a superclasse, garantindo que o personagem seja criado com a classe correta.
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Mago " + this.nome + " lança uma bola de fogo!");
    }
    
}
