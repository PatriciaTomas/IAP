/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import trabalhopratico2.*;

/**
 *
 * @author LEGION
 */
public class TrabalhoPratico2 {

    /**
     * Inicializa vetor com tamanho 0; Cada array vai guardar as respetivas
     * figuras criadas pelo utilizador;
     */
    static Caixa Caixas[] = new Caixa[0];
    static Cone Cones[] = new Cone[0];
    static Cilindro Cilindros[] = new Cilindro[0];
    static Esfera Esferas[] = new Esfera[0];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int opcao = -1;
        Scanner teclado = new Scanner(System.in);

        //O ciclo repete-se até o utilizador escolher a opção sair;
        while (opcao != 0) {
            System.out.println("1- Criar esfera");
            System.out.println("2- Criar cubo");
            System.out.println("3- Criar cone");
            System.out.println("4- Criar cilindro");
            System.out.println("5- Gerar X3D");
            System.out.println("0- Sair");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1: //Cria uma Esfera
                    criarEsfera();
                    break;
                case 2: //cria uma caixa
                    criarCubo();
                    break;
                case 3:// Cria um cone
                    criarCone();
                    break;
                case 4:// cria um cilindro
                    criarCilindro();
                    break;
                case 5://gera o código x3d das figuras criadas
                    escreverX3D();
                    break;

            }

        }

    }

    /**
     * o método criarEsfera() cria um objeto do tipo Esfera com os atributos
     * posicão, cor e tamanho; newEsfera cria uma nova esfera e guarda-a no
     * array Esferas; i é o indice do vetor;
     */
    public static void criarEsfera() {
        float[] cores = escolherC
        float[] posicoes = escolherPosicao();
        float[] tamanhos = escolherTamanho("esfera");

        Esfera e1 = new Esfera(posicoes, cores, tamanhos);
        int tamanhoArrayEsferas = Esferas.length;
        Esfera[] newEsfera = new Esfera[tamanhoArrayEsferas + 1];

        for (int i = 0; i < tamanhoArrayEsferas; i++) {
            newEsfera[i] = Esferas[i];

        }
        newEsfera[tamanhoArrayEsferas] = e1;
        Esferas = newEsfera;
        for (int i = 0; i < tamanhoArrayEsferas; i++) {
            Esfera e = Esferas[i];
           System.out.println(e.toString());
        }

        System.out.println("Lista Esferas: " + Arrays.toString(Esferas));
    }

    public static void criarCubo() {
        float[] cores = escolherCor();
        float[] posicoes = escolherPosicao();
        float[] tamanhos = escolherTamanho("cubo");
        Caixa c1 = new Caixa(posicoes, cores, tamanhos);

        int tamanhoArrayCaixas = Caixas.length;
        Caixa[] newCaixa = new Caixa[tamanhoArrayCaixas + 1];

        for (int i = 0; i < tamanhoArrayCaixas; i++) {
            newCaixa[i] = Caixas[i];

        }
        newCaixa[tamanhoArrayCaixas] = c1;
        Caixas = newCaixa;
        for (int i = 0; i < tamanhoArrayCaixas; i++) {
            Caixa c = Caixas[i];
            System.out.println(c.toString());
        }
        System.out.println("Caixas: " + Arrays.toString(Caixas));
    }

    public static void criarCone() {
        float[] cores = escolherCor();
        float[] posicoes = escolherPosicao();
        float[] tamanhos = escolherTamanho("cone");
        Cone n1 = new Cone(posicoes, cores, tamanhos);

        int tamanhoArrayCones = Cones.length;
        Cone[] newCone = new Cone[tamanhoArrayCones + 1];

        for (int i = 0; i < tamanhoArrayCones; i++) {
            newCone[i] = Cones[i];

        }
        newCone[tamanhoArrayCones] = n1;
        Cones = newCone;
        for (int i = 0; i < tamanhoArrayCones; i++) {
            Cone n = Cones[i];
            System.out.println(n.toString());
        }
        System.out.println("Cones: " + Arrays.toString(Cones));
    }

    public static void criarCilindro() {
        float[] cores = escolherCor();
        float[] posicoes = escolherPosicao();
        float[] tamanhos = escolherTamanho("cilindro");
        Cilindro l1 = new Cilindro(posicoes, cores, tamanhos);

        int tamanhoArrayCilindros = Cilindros.length;
        Cilindro[] newCilindro = new Cilindro[tamanhoArrayCilindros + 1];

        for (int i = 0; i < tamanhoArrayCilindros; i++) {
            newCilindro[i] = Cilindros[i];

        }
        newCilindro[tamanhoArrayCilindros] = l1;
        Cilindros = newCilindro;
        for (int i = 0; i < tamanhoArrayCilindros; i++) {
            Cilindro l = Cilindros[i];
            System.out.println(l.toString());
        }

        System.out.println("Cilindros: " + Arrays.toString(Cilindros));
    }

    // método escreverX3D() escreve o código dos objetos em X3D;
    public static void escreverX3D() {

        /**
         * string1- contém o html com o cabeçalho da página web; box - contém o
         * html que cria uma caixa; cone- contém o html que cria um cone;
         * cylinder- contém o html que cria um cilindro; sphere- contém o html
         * que cria uma esfera;
         */
        String string1, box, cone, cylinder, sphere, string2, str;

        box = "";
        cone = "";
        cylinder = "";
        sphere = "";
        /**
         * Este ciclo for vai igualar cada variavel a uma posição do Array
         * Caixas para que estas variaveis possam ser lidas dentro da string
         * correspondente
         */
        for (int i = 0; i < Caixas.length; i++) {
            Caixa c = Caixas[i];
            float x = c.getPosicao()[0];
            float y = c.getPosicao()[1];
            float z = c.getPosicao()[2];
            float r = c.getCor()[0];
            float g = c.getCor()[1];
            float b = c.getCor()[2];
            float lado = c.getLado();

            box += "               <transform translation='" + x + "," + y + "," + z + "'" + "> \n"
                    + "                <shape> \n"
                    + "                   <appearance>\n"
                    + "                   <material diffuseColor='" + r + "," + g + "," + b + "'" + "></material>\n"
                    + "                   </appearance> \n"
                    + "                   <box size='" + lado + "," + lado + "," + lado + "'" + "></box> \n"
                    + "                </shape> \n"
                    + "            </transform> \n";

        }

        for (int i = 0; i < Cones.length; i++) {
            Cone n = Cones[i];
            float x = n.getPosicao()[0];
            float y = n.getPosicao()[1];
            float z = n.getPosicao()[2];
            float r = n.getCor()[0];
            float g = n.getCor()[1];
            float b = n.getCor()[2];
            float altura = n.getAltura();
            float raio = n.getRaio();

            cone += "               <transform translation='" + x + "," + y + "," + z + "'" + "> \n"
                    + "                <shape> \n"
                    + "                   <appearance>\n"
                    + "                   <material diffuseColor='" + r + "," + g + "," + b + "'" + "></material>\n"
                    + "                   </appearance> \n"
                    + "                   <cone height ='" + altura + "'" + "></cone> \n"
                    + "                   <cone bottomRadius ='" + raio + "'" + "></cone> \n"
                    + "                </shape> \n"
                    + "            </transform> \n";
        }

        for (int i = 0; i < Cilindros.length; i++) {
            Cilindro l = Cilindros[i];
            float x = l.getPosicao()[0];
            float y = l.getPosicao()[1];
            float z = l.getPosicao()[2];
            float r = l.getCor()[0];
            float g = l.getCor()[1];
            float b = l.getCor()[2];
            float altura = l.getAltura();
            float raio = l.getRaio();

            cylinder += "               <transform translation='" + x + "," + y + "," + z + "'" + "> \n"
                    + "                <shape> \n"
                    + "                   <appearance>\n"
                    + "                   <material diffuseColor='" + r + "," + g + "," + b + "'" + "></material>\n"
                    + "                   <ImageTexture url='earth-topo.png'><ImageTexture/>\n"
                    + "                   </appearance> \n"
                    + "                   <cylinder height ='" + altura + "'" + "></cylinder> \n"
                    + "                   <cylinder radius ='" + raio + "'" + "></cylinder> \n"
                    + "                </shape> \n"
                    + "            </transform> \n";

        }

        for (int i = 0; i < Esferas.length; i++) {
            Esfera e = Esferas[i];
            float x = e.getPosicao()[0];
            float y = e.getPosicao()[1];
            float z = e.getPosicao()[2];
            float r = e.getCor()[0];
            float g = e.getCor()[1];
            float b = e.getCor()[2];
            float raio = e.getRaio();

            sphere += "               <transform translation='" + x + "," + y + "," + z + "'" + "> \n"
                    + "                <shape> \n"
                    + "                   <appearance>\n"
                    + "                   <material diffuseColor='" + r + "," + g + "," + b + "'" + "></material>\n"
                    + "                   </appearance> \n"
                    + "                   <sphere radius='" + raio + "'" + "></sphere> \n"
                    + "                </shape> \n"
                    + "            </transform> \n";

        }

        string1 = "<html> \n"
                + "   <head> \n"
                + "       <title>Trabalho IaP - Modelação 3D</title> \n"
                + "       <script type='text/javascript' src='http://www.x3dom.org/download/x3dom.js'> </script> \n"
                + "       <link rel='stylesheet' type='text/css' href='http://www.x3dom.org/download/x3dom.css'> </link> \n"
                + "   </head> \n"
                + "   <body> \n"
                + "       <h1>Primeiro projeto</h1> \n"
                + "       <p>Projeto de modelação 3D</p> \n"
                + "       <x3d width='900' height='600'> \n"
                + "       <scene> \n";

        string2 = "       </scene> \n"
                + "       </x3d> \n"
                + "   </body> \n"
                + "</html>";

        str = string1 + box + cone + cylinder + sphere + string2;

        /**
         * Mostra o resultado do html: System.out.println(str);
         */
        System.out.println(str);

        try {
            Files.write(Paths.get("E:\\NetBeansProjects\\TrabalhoPratico2\\src\\trabalhopratico2\\3D.html"),
                    str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * método escolherPosicao() que define a posição espacial do objeto na tela;
     * x,y,z- variaveis para a posição;
     *
     * @return posicao array que guarda as variaveis que definem a posição da
     * figura geometrica;
     */
    public static float[] escolherPosicao() {
        System.out.println("Escolha uma posição:");
        System.out.println("Insira o valor de x: ");
        int x = Le.umInt();
        System.out.println("Insira o valor de y: ");
        int y = Le.umInt();
        System.out.println("Insira o valor de z: ");
        int z = Le.umInt();

        float[] posicao = new float[]{x, y, z};
        return posicao;

    }

    /**
     * método escolherCor() define a cor do objeto; r,g,b- variaveis para a cor;
     *
     * @return cor guarda o espetro RGB que define a cor da figura;
     */
    public static float[] escolherCor() {
        System.out.println("Escolha uma cor:");
        System.out.println("Insira o valor de R (entre 0 e 1): ");
        float r = Le.umFloat();
        System.out.println("Insira o valor de G (entre 0 e 1): ");
        float g = Le.umFloat();
        System.out.println("Insira o valor de B (entre 0 e 1): ");
        float b = Le.umFloat();

        float[] cor = new float[]{r, g, b};
        return cor;
    }

    /**
     * o método escolherTamanho() define o tamanho do objeto para cada tipo de
     * figura geometrica; lado,raio,altura- variaveis para o tamanho;
     *
     * @param tipoFigura
     * @return tamanhoCaixa, tamanhoFigurasCirculares, tamanhoEsfera
     */
    public static float[] escolherTamanho(String tipoFigura) {
        System.out.println("Escolha um tamanho para o/a " + tipoFigura + " :");
        if (tipoFigura.equals("cubo")) {
            System.out.println("Insira o valor da aresta");
            int lado = Le.umInt();
            float[] tamanhoCaixa = {lado};
            return tamanhoCaixa;

        } else if (tipoFigura.equals("cilindro") || tipoFigura.equals("cone")) {
            System.out.println("Insira o valor da altura");
            int altura = Le.umInt();
            System.out.println("Insira o valor do raio");
            int raio = Le.umInt();
            float[] tamanhoFigurasCirculares = {altura, raio};
            return tamanhoFigurasCirculares;

        } else {
            System.out.println("Insira o valor do raio");
            int raio = Le.umInt();
            float[] tamanhoEsfera = {raio};
            return tamanhoEsfera;
        }

    }

}
