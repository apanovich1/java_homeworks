/*Написать иерархию классов «Фигуры».
Фигура -> Треугольник -> Прямоугольник -> Круг.
Реализовать ф-ю подсчета площади для каждого типа фигуры и
подсчет периметра. Создать массив из 5 фигур. Вывести на экран
сумму периметра всех фигур в массиве.
*/
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(3, 4, 5);
        shapes[1] = new Rectangle(2, 6);
        shapes[2] = new Circle(4);
        shapes[3] = new Triangle(6, 8, 10);
        shapes[4] = new Rectangle(5, 7);

        double totalPerimeter = 0.0;

        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }

        System.out.println("Sum of perimeters of all shapes in the array: " + totalPerimeter);
    }
}

