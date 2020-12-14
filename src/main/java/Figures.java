    class MySquare {
        // Цикл for вложенный в цикл for. ( Построение квадрата из звездочек - * )

        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {

                // Выводим одну строку из 9 звездочек.
                for (int j = 0; j < 10; j++) {
                    System.out.print("*");
                }

                // Переход на новую строку.
                System.out.println();
            }
        }
    }



    class MyTriangle {
        // Построение треугольника из звездочек - *

        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {

                for (int j = -1; j < i; j++) {
                    System.out.print("*");
                }

                // Переход на новую строку.
                System.out.println();
            }
        }
    }

    class MyEquilateralTriangle {
        // Равносторонний треугольник из звездочек - *

        public static void main(String[] args) {
            int num = 10;
            for (int i = 1; i <= num; ++i){

                for (int j = num; j > i; --j)
                    System.out.print(" ");

                for (int j = 1; j < 2 * i; ++j)
                    System.out.print("*");

                System.out.println();
            }
        }
    }



    class MyRhombus {
        // Ромб из звездочек - *

        public static void main(String[] args) {
            int num = 20;
            for (int i = 1; i < num/2; ++i){ //Сделать ромб в 2 раза меньше num/2
                for (int j = num/2; j > i; --j)
                    System.out.print(" ");

                for (int j = 1; j < 2 * i; ++j)
                    System.out.print("*");

                System.out.println();
            }
            for (int i = num/2; i >= 1; --i){ //Сделать ромб в 2 раза меньше num/2

                for (int j = num/2; j > i; --j)
                    System.out.print(" ");

                for (int j = 1; j < i*2; ++j)
                    System.out.print("*");

                System.out.println();
            }
        }

    }
