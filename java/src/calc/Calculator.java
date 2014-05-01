package calc;

public class Calculator {

    public static final String SEPARATOR_REGEX = "(,|\n)";
    public static final String INVALID_CONSECUTIVE_SEPARATORS_REGEX = ".*(,|\n){2,}.*";

    public static int add(String numbers) {
        if (numbers.isEmpty())
            return 0;

        if (numbers.matches(INVALID_CONSECUTIVE_SEPARATORS_REGEX))
            throw new RuntimeException("Invalid string format. Found more than one separator in a row");

        String[] splitNumbers = numbers.split(SEPARATOR_REGEX);
        return sumAll(splitNumbers);
    }

    private static int sumAll(String[] splitNumbers) {
        int sum = 0;
        for (String number : splitNumbers) {
            sum += toInt(number);
        }
        return sum;
    }

    private static Integer toInt(String numbers) {
        return Integer.valueOf(numbers);
    }
}
