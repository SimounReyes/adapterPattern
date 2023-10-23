package AdapterPattern;

public class Application {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        PowerOutlet laptopPlugIn = new LaptopAdapter(laptop);

        Refrigerator refrigerator = new Refrigerator();
        PowerOutlet refrigeratorPlugIn = new RefrigeratorAdapter(refrigerator);

        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
        PowerOutlet smartPhonePlugIn = new SmartphoneAdapter(smartphoneCharger);

        System.out.println(laptopPlugIn.plugIn());
        System.out.println(refrigeratorPlugIn.plugIn());
        System.out.println(smartPhonePlugIn.plugIn());
    }
}
