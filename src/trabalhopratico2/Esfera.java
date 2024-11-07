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
public class Esfera extends FiguraGeometrica implements FigurasCirculares {

    float raio;

    //CONSTRUTOR
    public Esfera(float[] posicao, float[] cor, float[] tamanho) {
        super(posicao, cor, tamanho);
        this.raio = tamanho[0];
    }

    //GET REFERENTE À INTERFACE FIGURASCIRCULARES
    @Override
    public float getRaio() {
        return raio;
    }

    //GET REFERENTE À INTERFACE FIGURASCIRCULARES
    @Override
    public void setRaio(float raio) {
        this.raio = raio;
    }
}
