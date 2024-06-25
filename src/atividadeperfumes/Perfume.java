package atividadeperfumes;

//Classe Perfume que implementa a interface IProduto 
class Perfume implements IProduto {
 private int id;
 private String nome;
 private String marca;
 private String tipo;
 private float volume;
 private float preco;
 private int estoque;

 public Perfume(int id, String nome, String marca, String tipo, float volume, float preco, int estoque) {
     this.id = id;
     this.nome = nome;
     this.marca = marca;
     this.tipo = tipo;
     this.volume = volume;
     this.preco = preco;
     this.estoque = estoque;
 }

 // Getters e Setters
 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public String getMarca() {
     return marca;
 }

 public void setMarca(String marca) {
     this.marca = marca;
 }

 public String getTipo() {
     return tipo;
 }

 public void setTipo(String tipo) {
     this.tipo = tipo;
 }

 public float getVolume() {
     return volume;
 }

 public void setVolume(float volume) {
     this.volume = volume;
 }

 @Override
 public double getPreco() {
     return preco;
 }

 public void setPreco(float preco) {
     this.preco = preco;
 }

 public int getEstoque() {
     return estoque;
 }

 public void setEstoque(int estoque) {
     this.estoque = estoque;
 }

 @Override
 public String getDescricao() {
     return nome + " - " + marca + " - " + tipo;
 }
}
