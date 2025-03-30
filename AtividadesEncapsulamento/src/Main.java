public class Main {
    public static void main(String[] args) {
        // Testando EstoqueProduto
        EstoqueProduto produto = new EstoqueProduto();
        produto.cadastrar("Notebook", 10, 3500.00);
        produto.exibirEstoque();
        produto.removeQuantidade(2);
        produto.exibirEstoque();

        // Testando Estudante
        Estudante estudante = new Estudante();
        estudante.cadastrar("João Silva", "123.456.789-00", "Engenharia", 22);
        estudante.exibirCadastro();

        // Testando Carro
        Carro carro = new Carro();
        carro.setMarca("Ford");
        carro.setModelo("Fiesta");
        carro.setCor("Vermelho");
        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo() + " - " + carro.getCor());
    }
}