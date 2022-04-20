package br.edu.ifpb.conta;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 20/04/2022, 09:56:36
 */
public class Poupanca extends Conta{ // é uma
    public Poupanca() {
        this(new Dinheiro(0));
    }
    //ctor principal
    public Poupanca(Dinheiro dinheiro) {
        //pré-condição
//        if(saldo < 0) throw  new IllegalArgumentException("o valor não pode ser negativo");
        dinheiro.validarValorPositivo();
        this.saldo = dinheiro;
    }

    @Override
    public void depositar(Dinheiro valor) {
        //pré-condição
//        if(valor<=0) throw  new IllegalArgumentException("o saldo não pode ser negativo");
        valor.validarValorPositivo();
        this.saldo = saldo.somar(valor);
    }

    @Override
    public void sacar(Dinheiro valor) {
    }

    
}