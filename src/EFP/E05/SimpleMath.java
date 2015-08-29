package EFP.E05;

import EFP.Console;

public class SimpleMath {

    protected Console console;

    protected Calculator calculator;

    public SimpleMath (Console console, Calculator calculator) {
        this.console = console;
        this.calculator = calculator;
    }

    public void start() {
        console.print("What is the first number? ");
        String first = console.readLine();
        Integer firstNumber = getIntegerFromString(first);

        console.print("What is the second number? ");
        String second = console.readLine();
        Integer secondNumber = getIntegerFromString(second);

        console.println(resultMessage(firstNumber, secondNumber));
    }

    protected Integer getIntegerFromString(String numericString) {
        return Integer.parseInt(numericString);
    }

    protected String resultMessage(Integer first, Integer second) {
        String lineSeparator = System.getProperty("line.separator");

        String sumMessage = sumMessage(first, second);
        String subtractMessage = subtractMessage(first, second);
        String multiplyMessage = multiplyMessage(first, second);
        String divideMessage = divideMessage(first, second);

        return String.format("%s%s%s%s%s%s%s",
                sumMessage, lineSeparator,
                subtractMessage, lineSeparator,
                multiplyMessage, lineSeparator,
                divideMessage);
    }

    protected String sumMessage(Integer first, Integer second) {
        Integer sum = calculator.add(first, second);

        return String.format("%s + %s = %s", first, second, sum);
    }

    protected String subtractMessage(Integer first, Integer second) {
        Integer difference = calculator.subtract(first, second);

        return String.format("%s - %s = %s", first, second, difference);
    }

    protected String multiplyMessage(Integer first, Integer second) {
        Integer product = calculator.multiply(first, second);

        return String.format("%s * %s = %s", first, second, product);
    }

    protected String divideMessage(Integer first, Integer second) {
        Integer quotient = calculator.divide(first, second);

        return String.format("%s / %s = %s", first, second, quotient);
    }
}
