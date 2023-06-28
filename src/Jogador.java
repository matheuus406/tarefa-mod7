public class Jogador {
    private String nome;
    private String idade;
    private String posicao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public void posicaoJogador (String posicao) {
        setPosicao(posicao);
    }
    public void idadeJogador (String idade) {
        setIdade(idade);
    }
}
