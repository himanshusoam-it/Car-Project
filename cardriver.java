package collection;
import java.util.*;
public class cardriver{
		public static void main(String []args){	
		Scanner Sc = new Scanner(System.in);
		service service = new service();
		service.load(); //load initialize car
		System.out.println("======Welcome to Car project======");
		String continueChoice;
		do {
			System.out.println("Press 0==> Exit");
			System.out.println("Press 1==> Add Car");
			System.out.println("Press 2==> Access all Cars");
			System.out.println("Press 3==>Access cars of brand name");
			System.out.println("Press 4==>Access all cars on brand and price");
			System.out.println("Press 5==>Access all cars in a price range");
			System.out.println("Press 6==>Access all cars of year 2015 and newer of tata brand in white colour");
			System.out.println("Press 7==>List all the brands of car available");
			System.out.println("Press 8==>Count the number of cars available for a particular brand");
			System.out.println("Press 9==>Count the number of cars available in all brands");
			System.out.println("Press 10==>Count the number of Car available in from each manufacturing years");
			System.out.println("Press 11==>Count the number of cars available in each color");
			System.out.println("Press 12==>Sort all cars on price low to high");
			System.out.println("Press 13==>Sort all cars on price high to low");
			System.out.println("Press 14==>Sort all cars on year of manufacturing from new to old order");
			int choice  = Integer.parseInt(Sc.nextLine()) ;
			switch(choice) {
			case 0:
				System.out.println("Thank you for using Shirt Project! Application Exiting...");
				System.exit(0);
				break;
			case 1:
				service.AddCar();
				break;
			case 2:
				service.access();
				break;
			case 3:
				service.brand();
				break;
			case 4:
				service.BrandAndPrice();
				break;
			case 5:
				service.pricerange();
				break;
			case 6:
				service.tataCar();
				break;
			case 7:
				service.availble();
				break;
			case 8:
				service.countCarByBrand();
				break;
			case 9:
				service.countCarsByAllBrands();
				break;
			case 10:
				service.manufacturingyear();
				break;
			case 11:
				service.countCarsByAllcolor();
				break;
			case 12:
				service.carsonpricelowtohigh();
				break;
			case 13:
				service.carsonpricehightolow();
				break;
			case 14:
				service.yearofmanufacturingfromnewtooldorder();
				break;
			}
			System.out.println("Do you want to continue? (yes/no)");
			continueChoice = Sc.nextLine();
			}while(continueChoice.equalsIgnoreCase("yes"));
			System.out.println("======Thank You Application Ends!!======");
	}
}