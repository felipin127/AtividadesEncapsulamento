public class EstoqueProduto {
    private String descricao;
    private int quantidade;
    private double valor;

    public void cadastrar(String descricao, int quantidade, double valor) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void removeQuantidade(int quantidade) {
        if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade indisponível no estoque.");
        }
    }

    public void exibirEstoque() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor unitário: R$" + valor);
        System.out.println("Valor total: R$" + (quantidade * valor));
    }

    // Getters e Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}