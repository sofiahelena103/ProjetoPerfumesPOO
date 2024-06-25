package atividadeperfumes;

import java.util.Date;

//Classe Cliente
class Cliente {
 private int id;
 private String nome;
 private String endereco;
 private String telefone;
 private String email;
 private String cpf;
 private Date dataCadastro;

 public Cliente(int id, String nome, String endereco, String telefone, String email, String cpf, Date dataCadastro) {
     this.id = id;
     this.nome = nome;
     this.endereco = endereco;
     this.telefone = telefone;
     this.email = email;
     this.cpf = cpf;
     this.dataCadastro = dataCadastro;
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

 public String getEndereco() {
     return endereco;
 }

 public void setEndereco(String endereco) {
     this.endereco = endereco;
 }

 public String getTelefone() {
     return telefone;
 }

 public void setTelefone(String telefone) {
     this.telefone = telefone;
 }

 public String getEmail() {
     return email;
 }

 public void setEmail(String email) {
     this.email = email;
 }

 public String getCpf() {
     return cpf;
 }

 public void setCpf(String cpf) {
     this.cpf = cpf;
 }

 public Date getDataCadastro() {
     return dataCadastro;
 }

 public void setDataCadastro(Date dataCadastro) {
     this.dataCadastro = dataCadastro;
 }
}