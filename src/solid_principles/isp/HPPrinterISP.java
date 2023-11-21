package solid_principles.isp;

public class HPPrinterISP implements IPrint, IScan {
    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void printSpoolDetails() {
        System.out.println("Print spool details");
    }

    @Override
    public void scan() {
        System.out.println("Scan");
    }

    @Override
    public void scanPhoto() {
        System.out.println("Scan photo");
    }
}
