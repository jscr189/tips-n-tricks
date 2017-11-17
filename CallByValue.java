class Car{
    String brand;
    Car(String b){
        brand=b;
    }
}
public class CallByValue {
    public static void main(String args[]) {
		Car car1 = new Car("BMW");
		System.out.println("Brand of Car Inside main() before: " + car1.brand);
		printBrand(car1);//Here reference of car object is passed as value
		System.out.println("Brand of Car Inside main() after printBrand: " + car1.brand);
		printBrandAgain(car1);//As reference value is passed by value, assigning it to new reference will not change original value
		System.out.println("Brand of Car Inside main() after printBrandAgain: " + car1.brand);
	}
    
	public static void printBrand(Car car2) {
		car2.brand = "Maruti";
		System.out.println("Brand of Car Inside printBrand(): " + car2.brand);
	}

	public static void printBrandAgain(Car car3) {
		car3 = new Car("Mercedes");
		System.out.println("Brand of Car Inside printBrandAgain(): " + car3.brand);
	}
}