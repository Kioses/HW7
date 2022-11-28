package a1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		

		//Initialise some household
		List<HouseholdItem> householdItmes= new ArrayList<>();

		
		Electronic microwaveOven= new Electronic("Microwave Oven",37, 48, 27, 13, false);
		Electronic tv= new Electronic("TV",122, 73, 15, 18, true);
		
		Glass wineGlass= new Glass("Wine glasses",33,28,23,1);
		Glass coffeeTable= new Glass("Glass Coffee Table ",80,80,45,3);

		
		Furniture bed= new Furniture("Bed", "Metal", 205, 91, 94, 26);
		Furniture cupboard= new Furniture("Bookshelf", "Wood", 60, 31, 190, 25);
		
		
        List<HouseholdItem> namesList = Arrays.asList(microwaveOven,tv,wineGlass,coffeeTable,bed,cupboard );
        householdItmes.addAll(namesList);
        
        
        
        //Verbesserung von unten:
        for (HouseholdItem h : namesList) {
        	h.accept(new Costs());;
        } System.out.println();
        for (HouseholdItem h : namesList) {
        	h.accept(new Instructions());;
        }
        
        //Visitor magic:
//        microwaveOven.accept(new Costs());
//        tv.accept(new Costs());
//        wineGlass.accept(new Costs());
//        coffeeTable.accept(new Costs());
//        bed.accept(new Costs());
//        cupboard.accept(new Costs());
//		
//        System.out.println();
//        
//        microwaveOven.accept(new Instructions());
//        tv.accept(new Instructions());
//        wineGlass.accept(new Instructions());
//        coffeeTable.accept(new Instructions());
//        bed.accept(new Instructions());
//        cupboard.accept(new Instructions());
	}
	
}

