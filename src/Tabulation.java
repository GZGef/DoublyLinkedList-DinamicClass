package Lab_1.src;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.*;

public class Tabulation {
    public static double myFunction(double x1) {
        return (x1 * Math.sin(x1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        out.println("Введите начальную и конечную координаты: ");

        /*try {
            double x1 = input.nextDouble();
            double x2 = input.nextDouble();

            out.println("Введите шаг: ");
            double h = input.nextDouble();

            out.println("x1 = " + x1 + '\n' + "x2 = " + x2);
            out.println("Шаг = " + h);

            out.println("\n\t\tТабулирование функции 'x*sin(x)'");
            for (;x1 < x2; x1 += h) {
                out.printf("F(%.2f) = %.5f", x1, myFunction(x1));
                out.println();
            }
        }
        catch (InputMismatchException e) {
            out.println("Координата должна быть представлена в виде десятичного числа!");
        }*/

        if (input.hasNextDouble() && input.hasNextDouble()) {
            double x1 = input.nextDouble();
            double x2 = input.nextDouble();

            out.println("Введите шаг: ");
            double h = input.nextDouble();

            out.println("x1 = " + x1 + '\n' + "x2 = " + x2);
            out.println("Шаг = " + h);

            out.println("\n\t\tТабулирование функции 'x*sin(x)'");
            for (;x1 < x2; x1 += h) {
                out.printf("F(%.2f) = %.5f", x1, myFunction(x1));
                out.println();
            }
        }
        else {
            out.println("Координата должна быть представлена в виде десятичного числа!");
        }
    }
}