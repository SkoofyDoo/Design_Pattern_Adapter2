package art;

public class PrinterAdapter implements ModernPrinter {

    private final OldPrinter oldPrinter;

    public PrinterAdapter(OldPrinter oldPrinter) {
        this.oldPrinter = oldPrinter;
    }


    // Adapterparameter
    @Override
    public void printFormatted(String message, String font, String color) {
        System.out.println("Formatting ignored. Using Old Printer");
        // Ausgabe des alten Printers mit Adapter
        oldPrinter.print(message);
    }
}
