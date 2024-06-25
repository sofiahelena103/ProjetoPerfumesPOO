package atividadeperfumes;

//Classe base Produto
public abstract class Produto {
 protected int id;
 protected String nome;
 protected float preco;
 
 public Produto(int id, String nome, float preco) {
     this.id = id;
     this.nome = nome;
     this.preco = preco;
 }
 
 public abstract float calcularPrecoFinal();
}