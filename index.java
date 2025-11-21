import java.util.Scanner;

/**
 * Quadratic Equation Solver
 * Author: YOUR NAME
 * Description:
 * This program reads three coefficients (a, b, c)
 * and calculates the roots of the quadratic equation:
 *      ax² + bx + c = 0
 */
public class Index {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = s.nextDouble();

        System.out.print("Enter b: ");
        double b = s.nextDouble();

        System.out.print("Enter c: ");
        double c = s.nextDouble();

        double d = b * b - 4 * a * c; // discriminant

        if (d > 0) {
            System.out.println("Root 1: " + ((-b + Math.sqrt(d)) / (2 * a)));
            System.out.println("Root 2: " + ((-b - Math.sqrt(d)) / (2 * a)));
        } else if (d == 0) {
            System.out.println("Root: " + (-b / (2 * a)));
        } else {
            System.out.println("Roots are imaginary");
        }

        s.close();
    }
}
