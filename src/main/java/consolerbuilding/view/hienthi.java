package consolerbuilding.view;

import java.util.List;
import java.util.Scanner;

import consolerbuilding.controler.BuildingControler;
import consolerbuilding.molder.input.BuildingSeachInput;
import consolerbuilding.molder.output.BuildingSeachOutput;

public class hienthi {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter your name: ");
//		String name = in.nextLine();
//		System.out.println("Enter your age");
//		String agestr = in.nextLine();
//		Integer age = agestr != null ? Integer.parseInt(agestr) : null;
		String name = null;
		Integer age = null;
		
		BuildingSeachInput buildingSeachInput = new BuildingSeachInput();
		buildingSeachInput.setName(name);
		buildingSeachInput.setAge(age);
		
		BuildingControler buildingControler = new BuildingControler();
		List<BuildingSeachOutput> result = buildingControler.getBuilding(buildingSeachInput);
		for (BuildingSeachOutput item : result) {
			System.out.println("id: " + item.getId());
			System.out.println("name: " + item.getName());
			System.out.println("age : " + item.getAge());
			System.out.println("full : " + item.getFull());
		}
	}
}
