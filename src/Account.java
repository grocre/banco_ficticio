package src;

public class Account {
    private float saldo;
    private int numero;
    private Person pessoa;

    public Account(Person pessoa, int numero){
        this.pessoa = pessoa;
        this.numero = numero;
    }

    public float mostraSaldo(){
        return this.saldo;
    }

    public void setSaldo(float valor){
        this.saldo =+ valor;
    }

    public boolean saca(float valor){
        if(valor > this.saldo){
            return false;
        } else {
            this.saldo =- valor;
            return true;
        }
    }

    public void deposita(float valor){
        this.saldo = this.saldo + valor;
    }

    public boolean transfere(float valor, Account a){
        if(valor > this.saldo){
            return false;
        } else {
            return true;
        }
    }

}
