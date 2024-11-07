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
public class Cilindro extends FiguraGeometrica implements FigurasCirculares {

    float raio;
    float altura;

    //CONSTRUTOR
    public Cilindro(float[] posicao, float[] cor, float[] tamanho) {
        super(posicao, cor, tamanho);
        this.altura = tamanho[0];
        this.raio = tamanho[1];
    }

    // GET ALTURA
    public float getAltura() {
        return altura;
    }

    // GET ALTURA
    public void setAltura(float altura) {
        this.altura = altura;
    }

    //GET DA INTERFACE FIGURASCIRCULARES
    @Override
    public float getRaio() {
        return raio;
    }

    //GET DA INTERFACE FIGURASCIRCULARES
    @Override
    public void setRaio(float raio) {
        this.raio = raio;
    }

}
