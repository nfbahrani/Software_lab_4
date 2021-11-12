package Prototype.Test;

import Prototype.Models.ConcretePrototype1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcretePrototype1Test {
    ConcretePrototype1 concretePrototype1;

    @BeforeEach
    void setUp() {
        concretePrototype1 = new ConcretePrototype1();
    }

    @Test
    void clonePrototype() throws CloneNotSupportedException {
        concretePrototype1.setCode(1111);
        ConcretePrototype1 temp = concretePrototype1.clonePrototype();
        temp.setCode(2222);
        assertNotEquals(temp.getCode(), concretePrototype1.getCode());
    }
}