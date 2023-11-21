package solid_principles.isp;

public class CanonPrinterISP implements IPrint, IFax {
    @Override
    public void fax() {
        System.out.println("Fax");
    }

    @Override
    public void internetFax() {
        System.out.println("Internet Fax");
    }

    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void printSpoolDetails() {
        System.out.println("Print spool details ");
    }
}
