package br.edu.ifpb.main;

import br.edu.ifpb.conta.Dinheiro;
import br.edu.ifpb.conta.Poupanca;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 20/04/2022, 09:17:57
 */
public  class Main{
    public static void main(String[] args) {
        Poupanca conta  = new Poupanca(
            new Dinheiro(2389) //em centavos
        );
        Dinheiro saldo = conta.verificarSaldo();
        String centavos = saldo.emCentavos();
        System.out.println(saldo.emCentavos());
        System.out.println(saldo.emReais());
    }
}
