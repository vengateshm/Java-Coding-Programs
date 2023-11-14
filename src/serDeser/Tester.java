package serDeser;

import java.io.*;

public class Tester {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Mosh");
        e1.setDept("Testing");
        e1.setSalary(5000.0);

        FileOutputStream fos = new FileOutputStream("D:\\VengateshM\\e1.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e1);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("D:\\VengateshM\\e1.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee e = (Employee) ois.readObject();
        System.out.println(e.toString());
        ois.close();
        fis.close();

        Car c1 = new Car();
        c1.setMake("Nissan");
        c1.setModel("Renault");
        c1.setEngineChasisNo("CEADF567FG65QWE");

        FileOutputStream fos1 = new FileOutputStream("D:\\VengateshM\\c1.ser");
        ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
        oos1.writeObject(c1);
        oos1.close();
        fos1.close();

        FileInputStream fis1 = new FileInputStream("D:\\VengateshM\\c1.ser");
        ObjectInputStream ois1 = new ObjectInputStream(fis1);
        Car c = (Car) ois1.readObject();
        System.out.println(c.toString());
        ois1.close();
        fis1.close();
    }
}
