/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade01;

/**
 *
 * @author jonata
 */
public class Fatorial {

    private int inicial;
    private int increment;

    public Fatorial() {
        this.inicial = 1;
    }

    public void proximoValor() {
        increment++;
        inicial = inicial * increment;
    }

    public int valorAtual() {
        return inicial;
    }

    public static void main(String[] args) {
        int quantidade = 20;

        Fatorial ft = new Fatorial();

        for (int i = 0; i < quantidade; i++) {
            System.out.print(ft.valorAtual() + " ");
            ft.proximoValor();
        }
    }

}
