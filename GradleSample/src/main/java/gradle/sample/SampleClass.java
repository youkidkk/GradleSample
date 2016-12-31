package gradle.sample;

@SuppressWarnings("javadoc")
public class SampleClass {

    public int sampleMethod(int intValue) {
        return intValue * 2;
    }

    /**
     * メインメソッド
     * @param args 実行時引数
     */
    public static void main(String[] args) {
        System.out.println("Gradle Samle Execute!!!");

        int number = 100;
        if (args.length > 0) {
            try {
                number = Integer.parseInt(args[0]);
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Parameter error.");
            }
        }
        System.out.println("Result : " + new SampleClass().sampleMethod(number));
    }

}
