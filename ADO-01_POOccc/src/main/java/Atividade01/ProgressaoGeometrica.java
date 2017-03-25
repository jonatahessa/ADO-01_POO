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
public class ProgressaoGeometrica extends SequenciaNumerica {
    
    private int razao;

    public ProgressaoGeometrica(int valorAtual, int razao) {
        super(valorAtual);
        this.razao = razao;
    }

    public void proximoValor() {
        this.valorAtual = this.valorAtual * razao;
    }
        
    public static void main(String[] args) {
        int quantidade = Integer.parseInt("5");
        int valorInicial = Integer.parseInt("1");
        int razao = Integer.parseInt("3");
        
        ProgressaoGeometrica pg = new ProgressaoGeometrica(valorInicial, razao);
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print(pg.valorAtual() + " ");
            pg.proximoValor();
        }
        
    }
}
