/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author LEGION
 */
public class FiguraGeometrica {
    //Arrays para os respetivos atributos de uma figura geométrica;

    float[] posicao;
    float[] cor;
    float[] tamanho;

    //CONSTRUTOR
    public FiguraGeometrica(float[] posicao, float[] cor, float[] tamanho) {
        this.posicao = posicao;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    //GET POSIÇÃO
    public float[] getPosicao() {
        return posicao;
    }

    //GET COR
    public float[] getCor() {
        return cor;
    }

    //GET TAMANHO
    public float[] getTamanho() {
        return tamanho;
    }

    //SET POSIÇÃO
    public void setPosicao(float[] posicao) {
        this.posicao = posicao;
    }
    //SET COR

    public void setCor(float[] cor) {
        this.cor = cor;
    }

    //SET TAMANHO
    public void setTamanho(float[] tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "posicao=" + Arrays.toString(posicao) + ", cor=" + Arrays.toString(cor) + ", tamanho=" + Arrays.toString(tamanho) + '}';
    }

}
