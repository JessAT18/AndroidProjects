package com.jessica.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variablesYConstantes()
        //tiposDeDatos()
        sentenciaIf()
    }

    /*
    Variables y constantes
    */

    private fun variablesYConstantes(){
        // Variables
        var myFirstVariable = "Hello World!"
        println(myFirstVariable)
        //Constantes
        val myFirstConst = "Jessica"
        println(myFirstConst)
    }

    /*
    Aqui vamos a hablar de tipos de datos (data types)
    */

    private fun tiposDeDatos(){
        //String
        val myString: String = "Hola soy Jessica"
        val myString2 = "Hola soy Jessica"
        val myString3 = myString + " " + myString2
        println(myString3)

        //Enteros (Byte, Short, Int, Long)
        val myInt: Int = 1
        val myInt2 = 2
        val myInt3: Int
        myInt3 = myInt + myInt2
        println(myInt3)

        //Decimales (Float, Double)
        val myFloat: Float = 1.5f
        val myDouble: Double = 1.5
        val myDouble2: Double = 2.6
        val myDouble3: Double = 1.0
        val myDouble4: Double = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        //Boolean (bool)
        val myBoolean: Boolean = true
        val myBoolean2: Boolean = false
        println(myBoolean == myBoolean2)
        println(myBoolean && myBoolean2)
    }
    /*
    Aqui vamos a hablar de la sentencia if
    */

    private fun sentenciaIf(){
        val myNumber = 71

        // Operadores condicionales
        // > mayor que
        // < menor que
        // >= (> =) mayor o igual que
        // <= (< =) menor o igual que
        // == (= =) igualdad
        // != (! =) desigualdad

        // Operadores lógicos
        // && operador "y"
        // || operador "o"
        // ! operador "no"

        if (!(myNumber <= 10 && myNumber > 5) || myNumber == 53) {
            println("$myNumber es menor o igual que 10 y mayor que 5 o es igual a 53")
        } else if (myNumber == 60) {
            println("$myNumber es igual a 60")
        } else if (myNumber != 70) {
            println("$myNumber no es igual a 70")
        } else {
            print("$myNumber es mayor que 10 o menor o igual que 5 y no es igual a 53")
        }

    }
}