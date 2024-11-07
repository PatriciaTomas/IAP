/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico2;

import java.util.Arrays;

/**
 *
 * @author LEGION
 */
/**
 * A classe caixa providencia os métodos getter (retorna o valor da variável) e
 * setter (define o valor da variavel).
 */
public class Caixa extends FiguraGeometrica {

    //variavel que define o tamanho de uma aresta de uma caixa;
    float lado;

    //CONSTRUTOR
    public Caixa(float[] posicao, float[] cor, float[] tamanho) {
        super(posicao, cor, tamanho);
        this.lado = tamanho[0];
    }

    //GETTER
    public float getLado() {
        return lado;
    }

    //SETTER
    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Caixa{" + "lado=" + lado + super.toString() + '}';
    }

}
