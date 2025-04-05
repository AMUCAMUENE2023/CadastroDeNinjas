package dev.java10x.CadastroDeNinjas;

import jakarta.persistence.*;


@Entity
@Table(name = "tb_cadastro")

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// para passar uma estrategia de como ira incrementar  de gerar ids da identidade
    long id;
    String nome;
    String email;
    int idade;

    public NinjaModel(){

    }

    public NinjaModel(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }



    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }
}
