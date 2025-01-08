package art;

public class OldPrinterImpl implements OldPrinter {

    @Override
    public void print(String message) {
        System.out.println("Old Connected: " + message);
    }


}
