/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade01;

import Atividade02.SequenciaNumerica;

/**
 *
 * @author jonata
 */
public class Fatorial extends SequenciaNumerica {

    private int increment;

    public Fatorial(int valorAtual) {
        super(valorAtual);
    }

       public void proximoValor() {
        increment++;
        this.valorAtual = this.valorAtual * increment;
    }

    public static void main(String[] args) {
        int quantidade = Integer.parseInt("5");
        int valorInicial = Integer.parseInt("1");

        Fatorial ft = new Fatorial(valorInicial);

        for (int i = 0; i < quantidade; i++) {
            System.out.print(ft.valorAtual() + " ");
            ft.proximoValor();
        }
    }

}
