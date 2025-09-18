package ru.skillbox;

public class MainFrog {

    public static void main(String[] args) {
        int xStep = 2;
        int yStep = 3;
        byte x = 5;
        byte y = 10;
        short z = (short) (x + y);
        System.out.println(z);
        byte s = (byte) 500;
        System.out.println(s);
// Создайте 3 переменных типа Frog и проинициализируйте их новыми объектами типа Frog. Заполните пропуски в коде:

        Frog[] frogs = new Frog[] {new Frog(), new Frog(), new Frog()};

        System.out.println(frogs.length);
// Переместите каждую из созданных лягушек на случайную позицию влево и вверх и выведите ее положение на экран, вызвав метод print. Заполните пропуски в коде и повторите этот блок кода столько раз, сколько это необходимо:
        int i = 0;

        for (i = 0; i <= frogs.length - 1; i = i + 1) {
            frogs[i].moveLeft(xStep);
            frogs[i].moveUp(yStep);
            frogs[i].print(i);
        }


        String original = "Каждый охотник желает знать, где сидит фазан";
        String modified = original.toUpperCase()
                .substring(11, 22)
                .strip();
        System.out.println(modified);

    }
    public static class Frog {
        int xPosition;
        int yPosition;
        boolean isAlive = true;

        void moveLeft(int offset) {
            xPosition = xPosition - offset;
        }

        void moveUp(int offset) {
            yPosition = yPosition + offset;
        }

        void print(int frogNumber) {
            System.out.println("frogs["+ frogNumber +"]: "
                    + "xPosition= " + xPosition
                    + "; yPosition= " + yPosition);
        }

    }
}


