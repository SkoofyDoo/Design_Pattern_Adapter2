package art;

public class ModernPrinterImpl implements ModernPrinter{


    @Override
    public void  printFormatted(String message, String font, String color) {
        System.out.println("New Connected: " + message + "Font: " + font + "Color: " + color);
    }
}






