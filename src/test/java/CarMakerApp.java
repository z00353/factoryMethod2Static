public class CarMakerApp {
    public static void main(String[] args) {
        // Calling static factory methods
        System.out.println(WheelMaker.factoryMethod().deliverProduct() + " created");
        System.out.println(CoupeMaker.factoryMethod().deliverProduct() + " created");
    }
}
