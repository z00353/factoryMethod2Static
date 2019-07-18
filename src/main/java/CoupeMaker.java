public class CoupeMaker {
    //Static methods can not be overridden by subclasses
    public static Product factoryMethod() {
        return new Coupe();
    }
}
