package skillnest;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius, fahrenheit, kelvin;
        System.out.println("Selecciones temperatura: ");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Celsius a Kelvin");
        System.out.println("3. Fahrenheit a Celsius");
        System.out.println("4. Fahrenheit a Kelvin");
        System.out.println("5. Kelvin a Celsius");
        System.out.println("6. Kelvin a Fahrenheit");
        System.out.println("Ingrese la opcion: ");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese la temperatura en Celsius: ");
                celsius = sc.nextDouble();
                fahrenheit = CelsiusToFahrenheit(celsius);
                System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
                break;
            case 2:
                System.out.println("Ingrese la temperatura en Celsius: ");
                celsius = sc.nextDouble();
                kelvin = CelsiusToKelvin(celsius);
                System.out.println("La temperatura en Kelvin es: " + kelvin);
                break;
            case 3:
                System.out.println("Ingrese la temperatura en Fahrenheit: ");
                fahrenheit = sc.nextDouble();
                celsius = FahrenheitToCelsius(fahrenheit);
                System.out.println("La temperatura en Celsius es: " + celsius);
                break;
            case 4:
                System.out.println("Ingrese la temperatura en Fahrenheit: ");
                fahrenheit = sc.nextDouble();
                kelvin = fahrenheitToKelvin(fahrenheit);
                System.out.println("La temperatura en Kelvin es: " + kelvin);
                break;
            case 5:
                System.out.println("Ingrese la temperatura en Kelvin: ");
                kelvin = sc.nextDouble();
                celsius = kelvinToCelsius(kelvin);
                System.out.println("La temperatura en Celsius es: " + celsius);
                break;
            case 6:
                System.out.println("Ingrese la temperatura en Kelvin: ");
                kelvin = sc.nextDouble();
                fahrenheit = kelvinToFahrenheit(kelvin);
                System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

        sc.close();

    }

    /*
    * Calculo de temperatura de celcius a Fahrenheit
    * @param celsius
    * @return fahrenheit
     */
    public static double CelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
    /*
    * Calculo de temperatura de celcius a Kelvin
    * @param celsius
    * @return kelvin
     */
    public static double CelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    /*
     * Calculo de temperatura de Fahrenheit a Celsius
     * @param fahrenheit
     * @return celsius
     */
    public static double FahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    /*
     * Calculo de temperatura de Fahrenheit a Kelvin
     * @param fahrenheit
     * @return kelvin
     */
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }
    /*
     * Calculo de temperatura de Kelvin a Fahrenheit
     * @param kelvin
     * @return fahrenheit
     */
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

}