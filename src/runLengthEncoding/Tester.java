package runLengthEncoding;

public class Tester {
    public static void main(String[] args){
        String compressed = RunLengthEncoding.compress1("AA EEE");
        System.out.println(compressed);
        String decompressed = RunLengthEncoding.decompress1(compressed);
        System.out.println(decompressed);
    }
}
