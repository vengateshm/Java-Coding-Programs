package serDeser;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car implements Externalizable {
    private String make;
    private String model;
    private String engineChasisNo;

    public Car() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngineChasisNo() {
        return engineChasisNo;
    }

    public void setEngineChasisNo(String engineChasisNo) {
        this.engineChasisNo = engineChasisNo;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(make);
        out.writeUTF(model);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.make = in.readUTF();
        this.model = in.readUTF();
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engineChasisNo='" + engineChasisNo + '\'' +
                '}';
    }
}
