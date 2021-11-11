package Prototype.Test;

import AbstractFactory.Models.IranianGardenCreator;
import Prototype.Models.AbstractFlower;
import Prototype.Models.AbstractTree;
import Prototype.Models.Chenar;
import Prototype.Models.Khatmi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IranianGardenCreatorTest {
    AbstractFactory.Models.IranianGardenCreator iranianGardenCreator;

    @BeforeEach
    void setUp() {
        iranianGardenCreator = new IranianGardenCreator();
    }

    @Test
    void createTree() {
        AbstractTree tree = iranianGardenCreator.createTree();
        boolean isChenar = false;
        if (tree instanceof Chenar && tree != null) {
            isChenar = true;
        }
        assertTrue(isChenar);
    }

    @Test
    void createFlower() {
        AbstractFlower flower = iranianGardenCreator.createFlower();
        boolean isKhatmi = false;
        if (flower instanceof Khatmi && flower != null) {
            isKhatmi = true;
        }
        assertTrue(isKhatmi);
    }
}