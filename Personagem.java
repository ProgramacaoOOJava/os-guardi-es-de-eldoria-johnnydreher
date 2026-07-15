public class Personagem {
    //Crio uma lista de classes válidas para o personagem, 
    // para que não seja possível criar um personagem uma função desconhecida.
    private enum ClasseValida {
        Mago, Guerreiro, Arqueiro
    }

    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = ClasseValida.valueOf(classe).name();//Caso seja adicionado um personagem
        //  com uma classe inválida, o programa irá lançar uma exceção.
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;

    }

    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: "+this.nome);
        System.out.println("Classe: "+this.classe);
        System.out.println("Nivel: "+this.nivel);      
        System.out.println("Pontos de Vida: "+this.pontosDeVida);
        System.out.println("Pode Base: "+this.poderBase); 

    }
}

