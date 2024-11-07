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
public class Cone extends FiguraGeometrica implements FigurasCirculares {

    float altura;
    float raio;

    //CONSTRUTOR
    public Cone(float[] posicao, float[] cor, float[] tamanho) {
        super(posicao, cor, tamanho);
        this.altura = tamanho[0];
        this.raio = tamanho[1];
    }

    /**
     * SET
     *
     * @return altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * SET
     *
     * @param altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * GET RAIO REFERENTE INTERFACE FIGURASCIRCULARES
     *
     * @return raio
     */
    @Override
    public float getRaio() {
        return raio;
    }

    /**
     * SET RAIO DA REFERENTE FIGURASCIRCULARES
     *
     * @param raio
     */
    @Override
    public void setRaio(float raio) {
        this.raio = raio;
    }

}
