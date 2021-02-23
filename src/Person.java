package src;

public class Person {
    private String nome;
    private int cpf;

    public Person(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String mostraNome(){
        return this.nome;
    }

    public int mostraCPF(){
        return this.cpf;
    }
}
