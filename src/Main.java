import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Rectangulo> Rectangulo = new ArrayList<>();
        ArrayList<Triangulo> Triangulo = new ArrayList<>();
        ArrayList<Circulo> Circulo = new ArrayList<>();

        // Crear 3 objetos de cada figura
        for (int i = 0; i < 3; i++) {
            System.out.println("\nIngrese datos para el rectángulo " + (i+1) + ":");
            System.out.print("Base: ");
            double base = teclado.nextDouble();
            System.out.print("Altura: ");
            double altura = teclado.nextDouble();
            Rectangulo.add(new Rectangulo(base, altura));

            System.out.println("\nIngrese datos para el triángulo " + (i+1) + ":");
            System.out.print("Base: ");
            base = teclado.nextDouble();
            System.out.print("Altura: ");
            altura = teclado.nextDouble();
            System.out.print("Lado 1: ");
            double lado1 = teclado.nextDouble();
            System.out.print("Lado 2: ");
            double lado2 = teclado.nextDouble();
            System.out.print("Lado 3: ");
            double lado3 = teclado.nextDouble();
            Triangulo.add(new Triangulo(base, altura, lado1, lado2, lado3));

            System.out.println("\nIngrese datos para el círculo " + (i+1) + ":");
            System.out.print("Radio: ");
            double radio = teclado.nextDouble();
            Circulo.add(new Circulo(radio));
        }

        int opcion;
        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Calcular áreas de rectángulos");
            System.out.println("2. Calcular perímetros de rectángulos");
            System.out.println("3. Calcular áreas de triángulos");
            System.out.println("4. Calcular perímetros de triángulos");
            System.out.println("5. Calcular áreas de círculos");
            System.out.println("6. Calcular perímetros de círculos");
            System.out.println("7. Salir");
            System.out.print("\nElija una opción: ");

            opcion =teclado.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < Rectangulo.size(); i++) {
                        System.out.printf("Área del rectángulo %d: %.2f%n",
                                i+1, Rectangulo.get(i).CalcularArea());
                    }
                    break;
                case 2:
                    for (int i = 0; i < Rectangulo.size(); i++) {
                        System.out.printf("Perímetro del rectángulo %d: %.2f%n",
                                i+1, Rectangulo.get(i).CalcularPerimetro());
                    }
                    break;
                case 3:
                    for (int i = 0; i < Triangulo.size(); i++) {
                        System.out.printf("Área del triángulo %d: %.2f%n",
                                i+1, Triangulo.get(i).CalcularArea());
                    }
                    break;
                case 4:
                    for (int i = 0; i < Triangulo.size(); i++) {
                        System.out.printf("Perímetro del triángulo %d: %.2f%n",
                                i+1, Triangulo.get(i).CalcularPerimetro());
                        System.out.print("\n--------------------------------------------------------------------------------------------------------------------------------- ");
                    }
                    break;
                case 5:
                    for (int i = 0; i < Circulo.size(); i++) {
                        System.out.printf("Área del círculo %d: %.2f%n",
                                i+1, Circulo.get(i).CalcularArea());
                    }
                    break;
                case 6:
                    for (int i = 0; i < Circulo.size(); i++) {
                        System.out.printf("Perímetro del círculo %d: %.2f%n",
                                i+1, Circulo.get(i).CalcularPerimetro());
                    }
                    break;
                case 7:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 7);

        teclado.close();
    }


    }
