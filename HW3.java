public class HW3 {
    public static void main(String[] args) {
        double[] numbers = {3.1, 2.78, -5.77, -1.61, 2.6, -3.33, 4.9,
                -0.1, 1.4, -8.57, 3.14, -1.732, 6.6, -2.36, 5.12, };
        double sum = 0;
        int counter = 0;
        boolean findNegative = false;

        for (double number: numbers) {
            if (findNegative) {
                if (number > 0) {
                    sum += number;
                    counter++;
                }
            } else if (number < 0) {
                findNegative = true;
            }
        }
            double average = (counter > 0) ? sum / counter:0;
            System.out.println("Среднее арифметическое положительных чисел = " + (average));
        }
    }

