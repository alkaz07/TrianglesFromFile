import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Triangle> triangles = readListFromFile("imput triangles.txt");
        System.out.println(triangles);
        double s = totalArea(triangles);
        System.out.println("общая площадь равна "+s);
    }

    private static double totalArea(ArrayList<Triangle> triangles) {
        return triangles.stream()
                        .mapToDouble(Triangle::calculateArea)
                        .sum();
    }

    public static ArrayList<Triangle> readListFromFile(String s) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(s));
        ArrayList<Triangle> triangles = new ArrayList<>();
        while (scanner.hasNext()){
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double c = scanner.nextDouble();
            if(Triangle.checkTriangleValid(a, b, c)) {
                Triangle tr = new Triangle(a, b, c);
                triangles.add(tr);
            }
        }
        scanner.close();
        return triangles;
    }
}