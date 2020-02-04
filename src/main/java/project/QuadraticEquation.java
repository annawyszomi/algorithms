package project;

public class QuadraticEquation {
    public void quadraticEquation(double a, double b, double c) {
        double root1, root2;
        double delta = b * b - (4 * a * c);
        if (a == 0) {
            System.out.println("Variable a can not equal 0");
            return;
        } else {

            if (delta < 0) {
                System.out.println("Delta equals 0, there are no zeros if a quadratic function");

            } else if (delta == 0) {
                root1 = -b / (2 * a);
                System.out.printf("root= %.2f", root1);

            } else {
                root1 = (-b - Math.sqrt(delta) / (2 * a));
                root2 = (-b + Math.sqrt(delta) / (2 * a));
                System.out.printf("root1 = %.2f and root2 = %.2f", root1, root2);
            }
        }
    }
}
