public class functional {

    public Point3d[] inPuter (double[] numbers) //Преобразует набор чисел в 3 Point3d/точки с координатами
    {
        Point3d[] AllCoords = new Point3d[3];
        for(int i = 0; i <= 2; i++)
        {
            AllCoords[i] = new Point3d(numbers[i*3], numbers[(i*3)+1], numbers[(i*3)+2]);
        }

        //Проверка на существование треугольника
        if ((AllCoords[0].getX() == AllCoords[1].getX() & AllCoords[0].getY() == AllCoords[1].getY() & AllCoords[0].getZ() == AllCoords[1].getZ()) | (AllCoords[0].getX() == AllCoords[2].getX() & AllCoords[0].getY() == AllCoords[2].getY() &AllCoords[0].getZ() == AllCoords[2].getZ()) | (AllCoords[1].getX() == AllCoords[2].getX() & AllCoords[1].getY() == AllCoords[2].getY() & AllCoords[1].getZ() == AllCoords[2].getZ()))
        {
            System.out.print("Заданный треугольник не существует");
            System.exit(1);
        }
        return AllCoords;
    }

    public double[] DistanceTo (Point3d[] docks) //Измерение расстояния между точками
    {
        double[] lenghts = new double[3];
        lenghts[0] = (Math.sqrt(Math.pow(docks[0].getX() - docks[1].getX(), 2) + Math.pow(docks[0].getY() - docks[1].getY(), 2) + Math.pow(docks[0].getZ() - docks[1].getZ(), 2)));
        lenghts[1] = (Math.sqrt(Math.pow(docks[1].getX() - docks[2].getX(), 2) + Math.pow(docks[1].getY() - docks[2].getY(), 2) + Math.pow(docks[1].getZ() - docks[2].getZ(), 2)));
        lenghts[2] = (Math.sqrt(Math.pow(docks[0].getX() - docks[2].getX(), 2) + Math.pow(docks[0].getY() - docks[2].getY(), 2) + Math.pow(docks[0].getZ() - docks[2].getZ(), 2)));

        double scale = Math.pow(10, 2);

        for(int i = 0; i <= 2; i++) //Округление результатов
        {
            lenghts[i] = Math.ceil(lenghts[i] * scale) / scale;
        }

        return lenghts;
    }

    public double SquareCounter (double[] lens) //Возвращает площадь треугольника, принимает длинны
    {
        double scale = Math.pow(10, 2);
        double p = (lens[0] + lens[1] + lens[2])/2;
        p = Math.ceil(p * scale) / scale;
        return Math.ceil((Math.sqrt(p * (p - lens[0]) * (p - lens[1]) * (p - lens[2]))) * scale) / scale;
    }
}
