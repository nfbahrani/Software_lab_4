package Prototype.Test;

import AbstractFactory.Models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class JapaneseGardenCreatorTest {
    public JapaneseGardenCreator japaneseGardenCreator;

    @BeforeEach
    void setUp() {
        japaneseGardenCreator = new JapaneseGardenCreator();
    }

    @Test
    void createTree() {
        AbstractTree tree = japaneseGardenCreator.createTree();
        boolean isJ1Tree = false;
        if (tree instanceof J1 && tree != null) {
            isJ1Tree = true;
        }
        assertTrue(isJ1Tree);
    }

    @Test
    void createFlower() {
        AbstractFlower flower = japaneseGardenCreator.createFlower();
        boolean isG1Flower = false;
        if (flower instanceof G1 && flower != null) {
            isG1Flower = true;
        }
        assertTrue(isG1Flower);
    }
}