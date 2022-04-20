package br.edu.ifpb.conta;

import java.text.DecimalFormat;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 20/04/2022, 10:01:15
 */
public class Dinheiro { //imutabilidade

    private final static int UNIDADE = 100;
    private final int centavos;
    public Dinheiro(int valor) {
        this.centavos = valor;
    }
    

    public Dinheiro somar(Dinheiro valor) { //nova de Dinheiro
        return new Dinheiro(
            this.centavos + valor.centavos
        );
    }

    public String emCentavos() {//  230 centavos
        return String.format(
            "%s",this.centavos
        );
    }

    public String emReais() {// R$ 2,30
        DecimalFormat decimal = new DecimalFormat("###,###.00");
        return String.format(
            "R$ %s",decimal.format(centavos / UNIDADE)
        );
    }
    public void validarValorPositivo() {
        if (this.centavos < 0) {
            throw new IllegalArgumentException("o valor não pode ser negativo");
        }
    }
}
