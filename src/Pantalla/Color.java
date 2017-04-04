/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantalla;

/**
 *
 * @author Carlos
 */
public class Color {
   
    /**
     * color rojo
     */
    private int rojo;

    /**
     * color verde
     */
    private int verde;

    /**
     * color azul
     */
    private int azul;

    /**
     * Inicializa el color
    */
    public void inicializar( int elRojo, int elVerde, int elAzul )
    {
        rojo = elRojo;
        verde = elVerde;
        azul = elAzul;
    }

    /**
     * Devuelve la cantidad de rojo (R) en el color
     */
    public int darRojo( )
    {
        return rojo;
    }

    /**
     * Cambia la cantidad de rojo*/
    public void cambiarRojo( int elRojo )
    {
        rojo = elRojo;
    }

    /**
     * Devuelve la cantidad de verde */
    public int darVerde( )
    {
        return verde;
    }

    /**
     * Cambia la cantidad de verde (G) 
     */
    public void cambiarVerde( int elVerde )
    {
        verde = elVerde;
    }

    /**
     * Devuelve la cantidad de azul (B) 
     */
    public int darAzul( )
    {
        return azul;
    }

    /**
     * Cambia la cantidad de azul 
     */
    public void cambiarAzul( int elAzul )
    {
        azul = elAzul;
    }
}
