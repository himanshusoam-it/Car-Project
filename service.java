package collection;
import java.util.*;
public class service {
	Scanner Sc = new Scanner(System.in);
	List<car> cars=new ArrayList<>();
	public void load() {
		cars.add(new car("Maruti", "White", 650000, 2020));
		cars.add(new car("Hyundai", "Black", 850000.98, 2021));
		cars.add(new car("Tata", "Blue", 780000.76, 2019));
		cars.add(new car("Tata", "White", 780000.76, 2014));
		cars.add(new car("Honda", "Red", 920000.34, 2022));
		cars.add(new car("Toyota", "Silver", 1100000.23, 2021));
		cars.add(new car("Kia", "Grey", 980000.65, 2023));
		cars.add(new car("Mahindra", "Brown", 1250000.09, 2020));
		cars.add(new car("Skoda", "White", 1350000.23, 2022));
		cars.add(new car("Volkswagen", "Black", 1400000.744, 2021));
		cars.add(new car("Renault", "Yellow", 720000.74, 2018));
		cars.add(new car("Nissan", "Blue", 760000.67, 2015));
	}
	public void AddCar() {
	    String continueAddCar;
	    do {
	        System.out.println("Enter Brand Name -");
	        String brand = Sc.nextLine();
	        System.out.println("Enter the Color -");
	        String color = Sc.nextLine();
	        System.out.println("Enter the Price");
	        double price = Double.parseDouble(Sc.nextLine());
	        System.out.println("Enter the manufacturingYear -");
	        int manufacturingYear = Integer.parseInt(Sc.nextLine());
	        car newcar = new car(brand, color, price, manufacturingYear);
	        cars.add(newcar);
	        System.out.println("Car added successfully: ");
	        System.out.println("Do you want to continue Add Car? (yes/no)");
	        continueAddCar = Sc.nextLine();
	    } while (continueAddCar.equalsIgnoreCase("yes"));
	}
	public void access() {
		if(cars.isEmpty()) {
			System.out.println("No Car available.");
			return;
		}
		for(car x: cars) {
			System.out.println(x);
		}
		System.out.println("All Car are Access");
	}
	public void brand() {
		System.out.println("Enter the brand name to search:");
		String brand = Sc.nextLine();
		int x=0;
		for (car s : cars) {
			if (s.brand.equalsIgnoreCase(brand)) {
				System.out.println(s);
				x=1;
			}
		}
		if(x==0) {
			System.out.println("No Car found for the brand: " + brand);
		}
		else {
			System.out.println("All Car accessed successfully for brand: " + brand);
		}
	}
	public void BrandAndPrice() {
		System.out.println("All car on brand and price ");
		for(car s : cars) {
			System.out.println("Brand is - "+s.brand+"\tand price is -"+s.price);
			}
		}
	public void pricerange() {
	    System.out.println("Enter The price Range - ");
	    double range = Double.parseDouble(Sc.nextLine());
	    int x=0 ;
	    for (car s : cars) {
	        if (s.price <= range) {
	            System.out.println(s); 
	            x = 1;
	        }
	    }
	    if (x==0) {
	        System.out.println("No Available Car on Price Range");
	    }
	}
	public void tataCar() {
		int x =0;
		for(car s : cars) {
			if(s.color.equalsIgnoreCase("white")&&s.manufacturingYear<=2015&&s.brand.equalsIgnoreCase("tata")) {
				System.out.println(s);
				x=1;
			}
		}
		if(x==0) {
			System.out.println("No car Availbe");
		}
	}
	public void availble() {
		int count= 0;
		for(car s : cars) {
			count++;
			System.out.println(count+". "+s.brand);
		}
	}
	public void countCarByBrand() {
	    System.out.println("Enter Brand Name -");
	    String brandName = Sc.nextLine();
	    int count = 0;
	    for (car c : cars) {
	        if (c.brand.equalsIgnoreCase(brandName)) {
	            count++;
	        }
	    }
	    System.out.println("Total cars of " + brandName + " = " + count);
	}
	public void countCarsByAllBrands() {
	    Map<String, Integer> brandCount = new HashMap<>();
	    for (car c : cars) {
	        if (brandCount.containsKey(c.brand)) {
	            brandCount.put(c.brand, brandCount.get(c.brand) + 1);
	        } else {
	            brandCount.put(c.brand, 1);
	        }
	    }
	    for (String brand : brandCount.keySet()) {
	        System.out.println(brand + " = " + brandCount.get(brand));
	    }
	}
	public void manufacturingyear() {
		int count=0;
		System.out.println("enter the year - ");
		int year=Integer.parseInt(Sc.nextLine());
		int y =0;
		for(car s : cars) {
			if(s.manufacturingYear==year) {
				y++;
				System.out.println(s);
				count=1;
			}
		}
		System.out.println("Total availble car in year - "+y);
		if(count ==0) {
			System.out.println(" Not Cars Availble in this year ");
		}
	}
	public void countCarsByAllcolor() {
		Map<String, Integer> colorCount = new HashMap<>();
	    for (car c : cars) {
	        if (colorCount.containsKey(c.color)) {
	        	colorCount.put(c.color, colorCount.get(c.color) + 1);
	        } else {
	        	colorCount.put(c.color, 1);
	        }
	    }
	    for (String color : colorCount.keySet()) {
	        System.out.println(color + " = " + colorCount.get(color));
	    }
	}
	public void carsonpricelowtohigh() {
	    Collections.sort(cars, new Comparator<car>() {
	        public int compare(car c1, car c2) {
	            return Double.compare(c1.price, c2.price);
	        }
	    });
	    for (car c : cars) {
	        System.out.println(c);
	    }
	}
	public void carsonpricehightolow() {
	    Collections.sort(cars, new Comparator<car>() {
	        public int compare(car c1, car c2) {
	            return Double.compare(c2.price, c1.price);
	        }
	    });
	    for (car c : cars) {
	        System.out.println(c);
	    }
	}
	public void yearofmanufacturingfromnewtooldorder() {
		Collections.sort(cars, new Comparator<car>() {
	        public int compare(car c1, car c2) {
	            return Double.compare(c2.manufacturingYear, c1.manufacturingYear);
	        }
	    });
	    for (car c : cars) {
	        System.out.println(c);
	    }
	}
	}