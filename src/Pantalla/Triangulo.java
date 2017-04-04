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
public class Triangulo {
    private Punto punto1;

    /**
     * Segundo punto del triángulo
     */
    private Punto punto2;

    /**
     * Tercer punto del triángulo
     */
    private Punto punto3;

    /**
     * Color de las lineas
     */
    private Color colorLineas;

    /**
     * Color del relleno
     */
    private Color colorRelleno;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Inicializa el triángulo
     
     */
    public void inicializar( Punto elPunto1, Punto elPunto2, Punto elPunto3, Color relleno, Color lineas )
    {
        //Inicializa los puntos
        punto1 = elPunto1;
        punto2 = elPunto2;
        punto3 = elPunto3;

        //Inicializa los colores
        colorRelleno = relleno;
        colorLineas = lineas;
    }

    /**
     * Devuelve el punto 1 del triángulo
     
     */
    public Punto darPunto1( )
    {
        return punto1;
    }

    /**
     * Devuelve el punto 2 del triángulo
    
     */
    public Punto darPunto2( )
    {
        return punto2;
    }

    /**
     * Devuelve el punto 3 del triángulo
     
     */
    public Punto darPunto3( )
    {
        return punto3;
    }

    /**
     * Devuelve el color de las líneas del triángulo
     * @return Color de las líneas
     */
    public Color darColorLineas( )
    {
        return colorLineas;
    }

    /**
     * Devuelve el color del relleno del triángulo
   
     */
    public Color darColorRelleno( )
    {
        return colorRelleno;
    }

    /**
     * Devuelve el perímetro del triángulo.
   
     */
    public double darPerimetro( )
    {
        //Devuelve la suma de todos los lados
        return darLado1( ) + darLado2( ) + darLado3( );
    }

    
    public double darArea( )
    {
        //Calcula el valor S para la formula
        double perimetro = darPerimetro( );
        double s = perimetro / 2;

        //Calcula las restas para cada uno de los lados
        double valorLado1 = s - darLado1( );
        double valorLado2 = s - darLado2( );
        double valorLado3 = s - darLado3( );

        //Calcula y devuelve el área
        // RaizCuadrada( s * (s - Lado1) * (s - Lado2) * (s - Lado3) )
        double area = Math.sqrt( s * valorLado1 * valorLado2 * valorLado3 );
        return area;
    }

    /**
     * Calcula la altura del triángulo, teniendo en cuenta como base la línea entre el punto 1 y 2
    */
    public double darAltura( )
    {
        double area = darArea( );
        double base = darLado1( );
        double altura = ( area / base ) * 2;
        return altura;
    }

    /**
     * Calcula la distancia entre el punto 1 y 2
    */
    private double darLado1( )
    {
        //Calcula las restas
        double valorX = Math.pow( punto1.darX( ) - punto2.darX( ), 2 );
        double valorY = Math.pow( punto1.darY( ) - punto2.darY( ), 2 );

        //calcula la distancia
        double distancia = Math.sqrt( valorX + valorY );
        return distancia;
    }

    /**
     * Calcula la distancia entre el punto 2 y 3
    */
    private double darLado2( )
    {
        //Calcula las restas
        double valorX = Math.pow( punto2.darX( ) - punto3.darX( ), 2 );
        double valorY = Math.pow( punto2.darY( ) - punto3.darY( ), 2 );

        //calcula la distancia
        double distancia = Math.sqrt( valorX + valorY );
        return distancia;
    }

    /**
     * Calcula la distancia entre el punto 3 y 1
    */
    private double darLado3( )
    {
        //Calcula las restas
        double valorX = Math.pow( punto3.darX( ) - punto1.darX( ), 2 );
        double valorY = Math.pow( punto3.darY( ) - punto1.darY( ), 2 );

        //calcula la distancia
        double distancia = Math.sqrt( valorX + valorY );
        return distancia;
    }

    /**
     * Método para la extensión 1
    */
    public String metodo1( )
    {
        return "respuesta1";
    }

    /**
     * Método para la extensión2
   */
    public String metodo2( )
    {
        return "respuesta2";
    }

}
 
