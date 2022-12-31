import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        functional fun = new functional();

        double[] store = new double[9];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 8; i++) //Ввод данных
        {
            if(i <= 2)
            {
                System.out.print("Введите координату для первой точки:");
            }
            else if (i <= 5)
            {
                System.out.print("Введите координату для второй точки:");
            }
            else
            {
                System.out.print("Введите координату для третей точки:");
            }
            store[i] = sc.nextDouble();
        }


        Point3d[] points = fun.inPuter(store); //Получение точек

        double[] lens = fun.DistanceTo(points); //Получение длин

        System.out.print("Площадь треугольника: ");
        System.out.print(fun.SquareCounter(lens)); //Получение и вывод площади

    }
}