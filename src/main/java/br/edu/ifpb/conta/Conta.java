package br.edu.ifpb.conta;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 20/04/2022, 08:47:48
 */

// tipos e classes
public abstract class Conta { //contrato
    
    protected Dinheiro saldo; //caracteristicas
    public abstract void depositar(Dinheiro valor); //{ //comportamento
    public abstract void sacar(Dinheiro valor);//{ //comportamento
    public Dinheiro verificarSaldo() {
        return this.saldo;
    }
    
}
 



