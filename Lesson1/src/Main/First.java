package Main;

public class First {

    public static void main(String[] args) {
//        printHW();
           testVar();
    }

        public static void printHW() {
        System.out.println("Hello, world!");
    }

        public static void testVar() {
            int varA;
            varA = 3;
            int varB = 7;
            long varC = 3_000_000_000l;
            long resultA = varB / varA * varC;
            System.out.println(resultA);

            int varI;
            varI = 3;
            double resultB = varB / (double)varA;
            System.out.println(resultB);

            double doubleVarA = 4.0;
            float floatVarB = 4F;
            System.out.println(doubleVarA / floatVarB);

            byte a = 127;
            a++;
            System.out.println(a);}
}