package atividadeperfumes;

//Classe ItemVenda
class ItemVenda {
 private Perfume produto;
 private int quantidade;
 private double precoUnitario;

 public ItemVenda(Perfume produto, int quantidade, double precoUnitario) {
     this.produto = produto;
     this.quantidade = quantidade;
     this.precoUnitario = precoUnitario;
 }

 // Getters e Setters
 public Perfume getProduto() {
     return produto;
 }

 public void setProduto(Perfume produto) {
     this.produto = produto;
 }

 public int getQuantidade() {
     return quantidade;
 }

 public void setQuantidade(int quantidade) {
     this.quantidade = quantidade;
 }

 public double getPrecoUnitario() {
     return precoUnitario;
 }

 public void setPrecoUnitario(double precoUnitario) {
     this.precoUnitario = precoUnitario;
 }
}