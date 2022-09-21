public class Calc {

    private static final Converter converter = new Converter();

    public static String calculate(String[] args) {
        if (args.length != 3) throw new IllegalArgumentException();
        try {
            int result = calculate(Integer.parseInt(args[0]), Integer.parseInt(args[2]), args[1]);
            return String.valueOf(result);
        } catch (NumberFormatException e) {
            int result = calculate(converter.toArNumber(args[0]), converter.toArNumber(args[2]), args[1]);
            return converter.toRomeNumber(result);
        }
    }

    private static int calculate(int Num1, int Num2, String sum) {
        if (Num1 < 1 || Num1 > 10 || Num2 < 1 || Num2 > 10) throw new IllegalArgumentException();
        switch (sum) {
            case "+":
                return Num1 + Num2;
            case "/":
                return Num1 / Num2;
            case "*":
                return Num1 * Num2;
            case "-":
                return Num1 - Num2;
            default:
                throw new IllegalArgumentException();
        }
    }

}
