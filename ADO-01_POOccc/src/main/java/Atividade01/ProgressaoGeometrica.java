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
public class ProgressaoGeometrica {
    
    private int valorInicial;
    private int razao;

    public ProgressaoGeometrica(int valorInicial, int razao) {
        this.valorInicial = valorInicial;
        this.razao = razao;
    }
    
    public void proximoValor() {
        valorInicial = valorInicial * razao;
    }
    
    public int valorAtual() {
        
        return valorInicial;
    }
    
    
    public static void main(String[] args) {
        int quantidade = 5;
        int valorInicial = 1;
        int razao = 3;
        
        ProgressaoGeometrica pg = new ProgressaoGeometrica(valorInicial, razao);
        
        for (int i = 0; i < quantidade; i++) {
            System.out.print(pg.valorAtual() + " ");
            pg.proximoValor();
        }
        
    }
}
