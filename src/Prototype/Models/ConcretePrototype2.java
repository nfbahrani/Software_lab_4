package Prototype.Models;

import java.util.Random;

public class ConcretePrototype2 implements Prototype, java.lang.Cloneable {
    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    private int code;

    public ConcretePrototype2(int code) {
        this.code = code;
    }

    @Override
    public Prototype clonePrototype() throws CloneNotSupportedException {
        return (ConcretePrototype2) this.clone();
    }
}
