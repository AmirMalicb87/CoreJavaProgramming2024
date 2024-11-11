package two;

public class SecondProgram {
    public static void main(String[] args) {
        byte firstNumber = 127;
        byte secondNumber = -128;

        short shortNumber = 32767;
        short secondShortNumber = -32768;
        System.out.println(firstNumber);
        short shortNumber3 = firstNumber;
        System.out.println(shortNumber3);
        short shortyBroj = 89;
        byte bytBroj =(byte) shortyBroj;

        int number = 23;

        long longNumber = 234l;

        double doubleNumber = 3.14;

        float floatNumber = 3.14f;

        char slovo = 'A';
        char novoSlovo = 66;
        int noviBroj = slovo;
        System.out.println("NOVI BROJ = " + noviBroj);
        System.out.println("NOVI SLOVO = " + novoSlovo);
        char separator = ';';
        int separatorNumber = separator;
        System.out.println("SEPARATOR = " + separator + "  SEPARATOR NUMBER= " + separatorNumber);

        boolean condition = true;
        System.out.println(condition);
    }
}
