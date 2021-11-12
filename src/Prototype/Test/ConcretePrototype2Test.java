package Prototype.Test;

import Prototype.Models.ConcretePrototype2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcretePrototype2Test {
    ConcretePrototype2 concretePrototype2;

    @BeforeEach
    void setUp() {
        concretePrototype2 = new ConcretePrototype2();
    }

    @Test
    void clonePrototype() throws CloneNotSupportedException {
        concretePrototype2.setCode(1111);
        ConcretePrototype2 temp = concretePrototype2.clonePrototype();
        temp.setCode(2222);
        assertNotEquals(temp.getCode(), concretePrototype2.getCode());
    }
}