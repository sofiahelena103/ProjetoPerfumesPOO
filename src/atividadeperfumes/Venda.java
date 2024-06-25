package atividadeperfumes;

import java.util.Date;
import java.util.List;

//Classe Venda
class Venda {
 private int id;
 private Date data;
 private Cliente cliente;
 private List<ItemVenda> itens;
 private double desconto;

 public Venda(int id, Date data, Cliente cliente, List<ItemVenda> itens, double desconto) {
     this.id = id;
     this.data = data;
     this.cliente = cliente;
     this.itens = itens;
     this.desconto = desconto;
 }

 // Getters e Setters
 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public Date getData() {
     return data;
 }

 public void setData(Date data) {
     this.data = data;
 }

 public Cliente getCliente() {
     return cliente;
 }

 public void setCliente(Cliente cliente) {
     this.cliente = cliente;
 }

 public List<ItemVenda> getItens() {
     return itens;
 }

 public void setItens(List<ItemVenda> itens) {
     this.itens = itens;
 }

 public double getDesconto() {
     return desconto;
 }

 public void setDesconto(double desconto) {
     this.desconto = desconto;
 }

 // Métodos para calcular o valor total e o valor final da venda
 public double getValorTotal() {
     double total = 0.0;
     for (ItemVenda item : itens) {
         total += item.getQuantidade() * item.getPrecoUnitario();
     }
     return total;
 }

 public double getTotal() {
     return getValorTotal() - desconto;
 }
}
