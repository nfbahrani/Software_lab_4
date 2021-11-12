package Prototype.Models;

public class Client {
    public Prototype getPrototype() {
        return prototype;
    }

    public Prototype createPrototype(int type) {
        switch (type) {
            case 1:
                this.prototype = new ConcretePrototype1();
                break;
            case 2:
                this.prototype = new ConcretePrototype2();
                break;
            default:
                break;
        }
        return null;
    }

    Prototype prototype;

    public Prototype clone(){
        try {
            return this.prototype.clonePrototype();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
