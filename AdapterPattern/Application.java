package AdapterPattern;

public class Application {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        PowerOutlet laptopPlugIn = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorPlugIn = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartPhonePlugIn = new SmartphoneAdapter(smartphoneCharger);

        System.out.println("Plugging in the Laptop!");
        System.out.println(laptopPlugIn.plugIn());
        System.out.println("\nPlugging in the Refrigerator!");
        System.out.println(refrigeratorPlugIn.plugIn());
        System.out.println("\nPlugging in the Smart Phone!");
        System.out.println(smartPhonePlugIn.plugIn());


    }
}
