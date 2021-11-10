package AbstractFactory.Models;

public class IranianGardenCreator implements AbstractGardenCreator {
    @Override
    public AbstractTree createTree() {
//        return new Chenar();
    }

    @Override
    public AbstractFlower createFlower() {
//        return new Khatmi();
    }
}
