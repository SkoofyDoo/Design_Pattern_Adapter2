import art.*;

public class Main {
    public static void main(String[] args) {


        // Alter Printer
        OldPrinter oldPrinter = new OldPrinterImpl();

        // Erzeugung adapter
        ModernPrinter adapter = new PrinterAdapter(oldPrinter);

        // Ausgabe mit adapter
        adapter.printFormatted("Text", "Bold", "Black");












    }
}

