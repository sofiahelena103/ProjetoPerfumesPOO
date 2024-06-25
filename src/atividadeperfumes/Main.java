package atividadeperfumes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando objetos Perfume com valores específicos
        Perfume perfume1 = new Perfume(1, "Coco Mademoiselle", "Chanel", "Âmbar Floral Feminino", 100.0f, 500.0f, 10);
        Perfume perfume2 = new Perfume(2, "Miss Dior Eau de Parfum", "Dior", "Âmbar Floral Feminino", 50.0f, 450.0f, 5);

        Cliente cliente = new Cliente(1, "Helen", "Rua Exemplo", "123456789", "helemtp@email.com", "12345678900", new Date());

        // Criando itens de venda
        ItemVenda item1 = new ItemVenda(perfume1, 2, perfume1.getPreco());
        ItemVenda item2 = new ItemVenda(perfume2, 1, perfume2.getPreco());

        // Adicionando itens a uma lista
        List<ItemVenda> itensVenda = new ArrayList<>();
        itensVenda.add(item1);
        itensVenda.add(item2);

        // Criando uma venda com os itens e o cliente
        Venda venda = new Venda(1, new Date(), cliente, itensVenda, 50.0);

        // Exibindo informações da venda
        System.out.println("Cliente: " + venda.getCliente().getNome());
        System.out.println("Data da Venda: " + venda.getData());
        System.out.println("Itens da Venda:");
        for (ItemVenda item : venda.getItens()) {
            Perfume perfume = item.getProduto();
            System.out.println("Produto: " + perfume.getNome());
            System.out.println("Marca: " + perfume.getMarca());
            System.out.println("Tipo: " + perfume.getTipo());
            System.out.println("Quantidade: " + item.getQuantidade());
            System.out.println("Preço Unitário: " + item.getPrecoUnitario());
            System.out.println("Subtotal: " + item.getQuantidade() * item.getPrecoUnitario());
            System.out.println();
        }
        System.out.println("Valor Total: " + venda.getValorTotal());
        System.out.println("Desconto: " + venda.getDesconto());
        System.out.println("Valor Final: " + venda.getTotal());
    }
}