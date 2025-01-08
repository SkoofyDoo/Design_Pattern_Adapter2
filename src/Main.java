package art;

public class Main {
    public static void main(String[] args) {

        ModernPrinter mPrint = new ModernPrinterImpl();
        mPrint.printFormatted("Hello ", "Bold ", "Black ");
    }
}
