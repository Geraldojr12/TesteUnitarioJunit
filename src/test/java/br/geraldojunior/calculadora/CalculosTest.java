package br.geraldojunior.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculosTest {

    @Test
    public void retornarZeroQuandoNadaInformado(){

    Calculos numerosASomar = new Calculos();

    double esperado = 0;
    double atual = numerosASomar.soma();

        Assertions.assertEquals(esperado,atual);


    }


    @Test
    public void retornarSomaQuandoValoresInformados(){
        Calculos numerosASomar = new Calculos();
        double atual = numerosASomar.soma(15);
        double esperado = 25;
        Assertions.assertEquals(esperado,atual);

    }
    @Test
    public void verificaNumeroPar(){
        Calculos paraVerificar = new Calculos();
        boolean informaNumeroPar = paraVerificar.informaNumeroPar(4);
        Assertions.assertTrue(informaNumeroPar);
    }

    @Test
    public void retornaRaizQuadrada(){
        Calculos numeroACalcular = new Calculos();
        double atual = numeroACalcular.raizQuadradaDeDoisNumeros(144);
        double esperado = 12;
        Assertions.assertEquals(esperado,atual);
    }

}