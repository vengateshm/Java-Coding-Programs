package solid_principles.isp;

public class CanonPrinter implements IMultiFunction {
    @Override
    public void scan() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scanPhoto() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print() {
        System.out.println("Print");
    }

    @Override
    public void getPrintSpoolDetails() {
        System.out.println("Print spool details");
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
