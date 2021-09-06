import java.io.IOException;

public class Calculator {

    public String mathCalculation(String[] words) {
        int var1;
        int var2;
        int sum = 0;
        String result;

        // обработка ошибки ввода более 3-х операндов и только одного типа счисления
        if(words.length != 3 || isNumeric(words[0]) ^ isNumeric(words[2])) {
            try {
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Формат ввода не удовлетворяет заданию");
                System.exit(1);
            }
        }

        // нахождение операндов
        var1 = stringToDigit(words[0]);
        var2 = stringToDigit(words[2]);

        // обработка ошибок несоответствия вводимых чисел условию задачи
        if(var1 <= 0 || var1 > 10 || var2 <= 0 || var2 > 10) {
            try {
                throw new IOException();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Формат ввода не удовлетворяет заданию");
                System.exit(1);
            }
        }

        // определение оператора матиматического выражения и вычисление выражения
        switch (words[1]) {
            case "+": sum = var1 + var2; break;
            case "-": sum = var1 - var2; break;
            case "*": sum = var1 * var2; break;
            case "/": sum = var1 / var2; break;
            default:
                try {
                    throw new IOException();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Формат ввода не удовлетворяет заданию");
                    System.exit(1);
                }
        }

        // получение резултата согласно п.6 условия задачи
        if (!(isNumeric(words[0]))) {
            result = new ImplConvertingDigits().numberToRoman(sum);
        } else result = String.valueOf(sum);
        return result;
    }

    // определение является ли переменная числом
    public static boolean isNumeric (String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // преобразование строки в число
    int stringToDigit (String str) {
        int result;
        if (isNumeric(str)) {
            result = Integer.parseInt(str);
        } else result = new ImplConvertingDigits().stringToNumbers(str);
        return result;
    }

}
