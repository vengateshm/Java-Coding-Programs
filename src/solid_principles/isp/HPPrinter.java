package solid_principles.isp;

public class HPPrinter implements IMultiFunction {
    @Override
    public void scan() {
        System.out.println("Scan");
    }

    @Override
    public void scanPhoto() {
        System.out.println("Scan Photo");
    }

    @Override
    public void print() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void getPrintSpoolDetails() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void internetFax() {
        throw new UnsupportedOperationException();
    }
}
