public class Arqueiro extends Personagem {
    public Arqueiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        //Uso a classe "Arqueiro" como parâmetro para a superclasse, garantindo que o personagem seja criado com a classe correta.
        super(nome, "Arqueiro", nivel, pontosDeVida, poderBase);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("Arqueiro " + this.nome + " dispara uma flecha certeira!");
    }
    
}
