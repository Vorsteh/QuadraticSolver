import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double a, b, c;
        System.out.println("Enter the value for a: ");
        a = s.nextDouble();

        System.out.println("Enter the value for b: ");
        b = s.nextDouble();

        System.out.println("Enter the value for c: ");
        c = s.nextDouble();

        Result x = solver(a, b, c);

        //System.out.printf("X1: %.2f | X2: %.2f", x.x1, x.x2);

        System.out.printf("Result{" +
                "x1=%.2f, " +
                "x2=%.2f}", x.x1, x.x2);
    }

    static class Result{
        double x1, x2;

        Result(double x1, double x2){
            this.x1 = x1;
            this.x2 = x2;
        }

        public double getX1() {
            return x1;
        }

        public void setX1(double x1) {
            this.x1 = x1;
        }

        public double getX2() {
            return x2;
        }

        public void setX2(double x2) {
            this.x2 = x2;
        }

        @Override
        public String toString() {
            return "result{" +
                    "x1=" + x1 +
                    ", x2=" + x2 +
                    '}';
        }
    }


    public static Result solver(double a, double b, double c){

        double x1, x2;
        double sqrt = Math.sqrt(Math.pow(b, 2) - (4 * a * c));
        x1 = (-b + (sqrt)) / (2*a);
        x2 = (-b - (sqrt)) / (2*a);

        return new Result(x1, x2);
    }
}
