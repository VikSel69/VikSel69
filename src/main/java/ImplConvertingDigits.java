public class ImplConvertingDigits implements ConvertingDigits {

    // преобразование арабских чисел в римские и обратно,
    // через использование массива строк
    @Override
    public String numberToRoman(Integer num) {
        if(num <= 0) {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                e.printStackTrace();
                System.out.println("Результат выражения римских чисел меньше еденицы");
                System.exit(1);
            }

        }
        return ConvertingDigits.ROMAN_NUM[num - 1];
    }

    @Override
    public Integer stringToNumbers(String a) {
        int result = 1;
        for (String i : ConvertingDigits.ROMAN_NUM) {
            if (!(a.equals(i))) {
                result++;
            } else break;
        }
        return result;
    }
}
