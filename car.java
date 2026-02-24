package collection;
public class car {
		String brand,color;
		double price;
		int manufacturingYear;
		car(){
		}
		car(String brand,String color,double price ,int manufacturingYear){
			this.brand = brand;
			this.price = price;
			this.color = color;
			this.manufacturingYear=manufacturingYear;
		}
		public String toString() {
		return "Car [brand=" + brand + "\tcolor=" + color + "\tprice=" + price + "\tmanufacturingYear=" + manufacturingYear + "]";
		}
}