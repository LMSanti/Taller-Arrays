import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        // Ejercicio 1.
        System.out.println("Ejercicio 1: Menu Interactivo.");
        boolean salir = false;
        do {
            System.out.println("Bienvenido al programa. ¿que operación desea realizar?");
            System.out.println("1. Para suma.");
            System.out.println("2. Para resta.");
            System.out.println("3. Para multiplicación.");
            System.out.println("4. Para división.");
            System.out.println("5. Para salir.");
            int opciones = scanner.nextInt();
            scanner.nextLine();

            switch (opciones) {
                case 1:
                    System.out.println("Eligio sumar.");
                    System.out.println("Ingrese un numero: ");
                    int sum1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese otro numero: ");
                    int sum2 = scanner.nextInt();
                    scanner.nextLine();
                    int suma = sum1 + sum2;
                    System.out.println("La suma es " + suma);
                    break;
                case 2:
                    System.out.println("Eligio restar.");
                    System.out.println("Ingrese un numero: ");
                    int res1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese otro numero: ");
                    int res2 = scanner.nextInt();
                    scanner.nextLine();
                    int resta = res1 - res2;
                    System.out.println("La resta es " + resta);
                    break;
                case 3:
                    System.out.println("Eligio multiplicación.");
                    System.out.println("Ingrese un numero: ");
                    int mul1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese otro numero: ");
                    int mul2 = scanner.nextInt();
                    scanner.nextLine();
                    int multi = mul1 * mul2;
                    System.out.println("La multiplicación es " + multi);
                    break;
                case 4:
                    System.out.println("Eligio división.");
                    System.out.println("Ingrese un numero: ");
                    int div1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Ingrese otro numero: ");
                    int div2 = scanner.nextInt();
                    scanner.nextLine();
                    if (div2 == 0) {
                        System.out.println("ERROR: No es posible dividir por 0.");
                    } else {
                        float divi = (float) div1 / div2;
                        System.out.println("La division es: " + divi);
                    }
                    break;
                case 5:
                    salir = true;
                    System.out.println("Hasta pronto.");

            }
        }
        while (!salir);

        System.out.println("-------------------------------------------------------");
        //Ejercicio 2

        System.out.println("Ejercicio 2: facturación de tienda.");
        System.out.println("Estos son los productos que ofrecemos con su respectivo precio x unidad: ");

        Object[][] productosYPrecios = new Object[4][2];

        productosYPrecios[0][0] = "Huevos";
        productosYPrecios[0][1] = 500;

        productosYPrecios[1][0] = "Libra de arroz";
        productosYPrecios[1][1] = 2000;

        productosYPrecios[2][0] = "Libra de azucar";
        productosYPrecios[2][1] = 1500;

        productosYPrecios[3][0] = "Libra de sal";
        productosYPrecios[3][1] = 2000;

        for (int i = 0; i < productosYPrecios.length; i++) {
            for (int j = 0; j < productosYPrecios[i].length; j++) {
                System.out.println(productosYPrecios[i][j]);
            }
            System.out.println();
        }

        System.out.println("Por favor ingresa la cantidad de unidades que deseas comprar de cada producto:");
        System.out.println("¿Cuantos huevos deseas llevar?");
        int CxHue = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¿Cuantas Libras de arroz deseas llevar?");
        int CxArr = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¿Cuanta Libras de azucar deseas llevar?");
        int CxAzu = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¿Cuantas Libras de Sal deseas llevar?");
        int CxSal = scanner.nextInt();
        scanner.nextLine();

        int PxH = (int) productosYPrecios[0][1] * CxHue;
        int PxArr = (int) productosYPrecios[1][1] * CxArr;
        int PxAzu = (int) productosYPrecios[2][1] * CxAzu;
        int PxSal = (int) productosYPrecios[3][1] * CxSal;
        int total = PxH + PxArr + PxAzu + PxSal;
        System.out.println("Usted llevará: " + CxHue + " Huevos. Total Huevos: $" + PxH);
        System.out.println("Usted llevará: " + CxArr + " Libras de arroz. Total Arroz: $" + PxArr);
        System.out.println("Usted llevará: " + CxAzu + " Libras de azucar. Total Azucar: $" + PxAzu);
        System.out.println("Usted llevará: " + CxSal + " Libras de sal. Total Sal: $" + PxSal);
        System.out.println("Total Factura: $" + total);

        System.out.println("-------------------------------------------------------");
        //Ejercicio 3
        System.out.println("Ejercicio 3: Notas de un curso.");
        System.out.println("Bienvenido, porfavor ingrese cuantas notas tiene hasta el momento: ");
        int cantidadNotasActual = scanner.nextInt();
        scanner.nextLine();
        int cantidadNotasFaltantes = 8 - cantidadNotasActual;
        int[] notasActuales = new int[cantidadNotasActual];
        for (int i = 0; i < cantidadNotasActual; i++) {
            System.out.println("Ingrese sus nota " + (i + 1) + ": ");
            notasActuales[i] = scanner.nextInt();
        }
        int suma = 0;
        for (int i = 0; i < notasActuales.length; i++) {
            suma += notasActuales[i];
        }
        float ocumulado = 608 - suma;
        float promFaltante = ocumulado/cantidadNotasFaltantes;
        if (promFaltante > 100){
            System.out.println("YA NO PUEDES APROBAR LA MATERIA. Tendrías que sacar un promedio de: " + promFaltante );
        }else {
            System.out.println("Para aprovar la materia, deberias sacar un promedio de: " + promFaltante + " en las " + cantidadNotasFaltantes + " notas que te faltan.");
        }

        System.out.println("-------------------------------------------------------");
        //Ejercicio 4
        System.out.println("Ejercicio 4: Calculadora de descuentos.");
        System.out.println("Estos son los productos que ofrecemos con su respectivo precio x unidad: ");

        Object[][] productosYPrecios4 = new Object[4][2];

        productosYPrecios4[0][0] = "Huevos";
        productosYPrecios4[0][1] = 10;

        productosYPrecios4[1][0] = "Libra de arroz";
        productosYPrecios4[1][1] = 100;

        productosYPrecios4[2][0] = "Libra de azucar";
        productosYPrecios4[2][1] = 80;

        productosYPrecios4[3][0] = "Libra de sal";
        productosYPrecios4[3][1] = 90;

        for (int i = 0; i < productosYPrecios4.length; i++) {
            for (int j = 0; j < productosYPrecios4[i].length; j++) {
                System.out.println(productosYPrecios4[i][j]);
            }
            System.out.println();

        }

        System.out.println("Por favor ingresa la cantidad de unidades que deseas comprar de cada producto:");
        System.out.println("¿Cuantos huevos deseas llevar?");
        int CxHue4 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¿Cuantas Libras de arroz deseas llevar?");
        int CxArr4 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¿Cuanta Libras de azucar deseas llevar?");
        int CxAzu4 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¿Cuantas Libras de Sal deseas llevar?");
        int CxSal4 = scanner.nextInt();
        scanner.nextLine();

        int PxH4 = (int) productosYPrecios4[0][1] * CxHue4;
        int PxArr4 = (int) productosYPrecios4[1][1] * CxArr4;
        int PxAzu4 = (int) productosYPrecios4[2][1] * CxAzu4;
        int PxSal4 = (int) productosYPrecios4[3][1] * CxSal4;
        int total4 = PxH4 + PxArr4 + PxAzu4 + PxSal4;
        System.out.println("Usted llevará: " + CxHue4 + " Huevos. Total Huevos: $" + PxH4);
        System.out.println("Usted llevará: " + CxArr4 + " Libras de arroz. Total Arroz: $" + PxArr4);
        System.out.println("Usted llevará: " + CxAzu4 + " Libras de azucar. Total Azucar: $" + PxAzu4);
        System.out.println("Usted llevará: " + CxSal4 + " Libras de sal. Total Sal: $" + PxSal4);
        System.out.println("Total Factura: $" + total4);

        float descuento = 0;
        float totalPagar = 0;
        if (total4 < 200){
            System.out.println("NO APLICA DESCUENTO. TOTAL A PAGAR: " + total4);
        } else if (total4 < 300){
            descuento = (float)((total4*10)/100);
            totalPagar = (total4-descuento);
            System.out.println("Descuento del 10%: $" + descuento);
            System.out.println("Total a pagar: $"+totalPagar);
        } else if (total4 < 500) {
            descuento = (float)((total4*15)/100);
            totalPagar = (total4-descuento);
            System.out.println("Descuento del 15%: $" + descuento);
            System.out.println("Total a pagar: $"+totalPagar);
        } else if (total4 < 1000) {
            descuento = (float)((total4*20)/100);
            totalPagar = (total4-descuento);
            System.out.println("Descuento del 20%: $" + descuento);
            System.out.println("Total a pagar: $"+totalPagar);
        } else if (total4 > 1000) {
            descuento = (float)((total4*25)/100);
            totalPagar = (total4-descuento);
            System.out.println("Descuento del 25%: $" + descuento);
            System.out.println("Total a pagar: $"+totalPagar);

        }

        System.out.println("-------------------------------------------------------");
        //Ejercicio 5
        System.out.println("Ejercicio 5: Busca palabras.");
        System.out.println("Ingrese un texto.");
        String cadena = scanner.nextLine();
        String cadena1 = cadena.toLowerCase();

        System.out.println("Ingrese la palabra que desea buscar: ");
        String palabra = scanner.nextLine();
        String palabra1 = palabra.toLowerCase();

        ArrayList<Integer> posiciones = new ArrayList<>();
        int posicion = cadena1.indexOf(palabra1);
        while (posicion>= 0){
            posiciones.add(posicion);
            posicion = cadena1.indexOf(palabra1, posicion + 1);
        }
        if(!posiciones.isEmpty()){
            System.out.println("La plabra '" +palabra1+ "' Se encuentra en las siguientes posiciones: ");
            for (int pos : posiciones) {
                int posicionFinal = pos + palabra1.length() - 1;
                System.out.println("Desde la "+ pos + " Hasta la " +posicionFinal );
            }
        }else {
            System.out.println("La palabra no está en el texto.");
        }

        System.out.println("-------------------------------------------------------");
        //Ejercicio 6
        System.out.println("Ejercicio 6: Búsqueda por coincidencia en arrays.");
        String[] nombres = {"andres", "felipe", "sandra", "santiago", "estefania", "melissa", "antony", "daniela", "alejandra"};
        System.out.println("Ingresa un nombre: ");
        String nombreIn = scanner.nextLine();
        boolean estaEnLista = false;
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreIn)) {
                System.out.println("El nombre está en la posicion: " + i);
                estaEnLista = true;
                break;
            }
        }
        if (!estaEnLista) {
            System.out.println("El nombre no está en la lista.");
        }


        System.out.println("-------------------------------------------------------");
        //Ejercicio 7
        System.out.println("Ejercicio 7: Transposición de una Matriz");
        int[][] matriz = {
                {1, 2},
                {3, 4}
        };
        System.out.println("Matriz Original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------");
        //Ejercicio 8
        System.out.println("Ejercicio 8: Verificar Matriz Simétrica");
        int[][] matriz1 = {
                {1, 2},
                {2, 1}
        };
        System.out.println("Matriz Original:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[j][i] + " ");
            }
            System.out.println();
        }
        int[][] matrizTranspuesta = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizTranspuesta[j][i] = matriz1[i][j];
            }
        }
        if(Arrays.deepEquals(matriz1, matrizTranspuesta)){
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz no es simetrica");
        }

        System.out.println("-------------------------------------------------------");
        //Ejercicio 9
        System.out.println("Ejercicio 9: Contar coincidencias en un Array");
        char[] letras = {'a','b','c','a','a','a','b','b','c','d'};
        int[] frecuencias = new int[26];

        for (char letra : letras) {
            int indice = letra - 'a';
            frecuencias[indice]++;
        }


        System.out.println("Las letras se repiten:");
        for (int i = 0; i < frecuencias.length; i++) {
            if (frecuencias[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + frecuencias[i]);
            }
        }


        System.out.println("-------------------------------------------------------");
        //Ejercicio 10
        System.out.println("Ejercicio 10: Invertir un Array");
        int[] numeros = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array: ");
        System.out.println(Arrays.toString(numeros));
        int n = numeros.length;
        for (int i = 0; i<n/2; i++){
            int j = numeros[i];
            numeros[i] = numeros[n-1-i];
            numeros[n-1-i] = j;
        }
        System.out.println("Array invertido: ");
        System.out.println(Arrays.toString(numeros));

        scanner.close();

        /* INVESTIGACION:
            1. ARRAYLIST: Un ArrayList en Java es una clase del paquete java.util
            que proporciona una estructura de datos similar a un array, pero con la
            capacidad de cambiar de tamaño dinámicamente. A diferencia de los arrays
            tradicionales, los ArrayList pueden crecer y reducir su tamaño
            automáticamente cuando se añaden o eliminan elementos.

            EJEMPLO:
         */
        System.out.println("-------------------------------------------------------");
        System.out.println("Ejemplo ARRAYLIST");
                // Crear un ArrayList de Strings
                ArrayList<String> nombs = new ArrayList<>();

                // Añadir elementos al ArrayList
                nombs.add("Ana");
                nombs.add("Juan");
                nombs.add("Luis");

                // Imprimir elementos del ArrayList
                System.out.println("Nombres: " + nombs);

                // Acceder a un elemento específico
                String primerNombre = nombs.get(0);
                System.out.println("Primer nombre: " + primerNombre);

                // Eliminar un elemento del ArrayList
                nombs.remove("Juan");
                System.out.println("Nombres después de eliminar a Juan: " + nombs);

                // Recorrer el ArrayList
                System.out.println("Recorriendo el ArrayList:");
                for (String nombre : nombs) {
                    System.out.println(nombre);
                }
            /*
            2. MAP: Un Map en Java es una colección que asocia claves a valores.
             No permite claves duplicadas; cada clave puede mapear a lo
             sumo un valor. Las implementaciones comunes de Map son:
             HashMap, TreeMap, y LinkedHashMap.

             EJEMPLO:
             */
        System.out.println("-------------------------------------------------------");
        System.out.println("Ejemplo MAP");
// Crear un HashMap para almacenar nombres y edades
        HashMap<String, Integer> edades = new HashMap<>();

        // Añadir elementos al HashMap
        edades.put("Ana", 25);
        edades.put("Juan", 30);
        edades.put("Luis", 22);

        // Imprimir elementos del HashMap
        System.out.println("Edades: " + edades);

        // Acceder a un valor específico usando su clave
        int edadDeAna = edades.get("Ana");
        System.out.println("Edad de Ana: " + edadDeAna);

        // Eliminar un elemento del HashMap
        edades.remove("Juan");
        System.out.println("Edades después de eliminar a Juan: " + edades);

        // Recorrer el HashMap
        System.out.println("Recorriendo el HashMap:");
        for (HashMap.Entry<String, Integer> entry : edades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /*
        3. Programación Orientada a Objetos (POO) :es un paradigma de
        programación basado en el concepto de "objetos", que pueden contener
         datos (campos o atributos) y código (métodos o funciones). Los principios
         clave de la POO son:

        Encapsulación: Agrupar datos y métodos que operan sobre esos datos
        dentro de una clase.
        Herencia: Permitir que las nuevas clases hereden propiedades y
        métodos de clases existentes.
        Polimorfismo: Permitir que una clase se comporte como otra clase a
        través de interfaces o herencia.
        Abstracción: Ocultar los detalles complejos y mostrar solo la
        funcionalidad necesaria.

        EJEMPLO:
         */

        System.out.println("-------------------------------------------------------");
        System.out.println("Ejemplo POO");
        class Persona{
            String nombre;
            int edad;
        }
        Persona persona1 = new Persona();
        persona1.nombre = "Ana";
        persona1.edad = 25;

        // Crear otro objeto de la clase Persona
        Persona persona2 = new Persona();
        persona2.nombre = "Juan";
        persona2.edad = 30;

        // Imprimir la información de los objetos
        System.out.println("Nombre: " + persona1.nombre + ", Edad: " + persona1.edad);
        System.out.println("Nombre: " + persona2.nombre + ", Edad: " + persona2.edad);

    }
}