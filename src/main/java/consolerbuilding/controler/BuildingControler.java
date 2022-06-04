package consolerbuilding.controler;

import java.util.List;

import consolerbuilding.molder.input.BuildingSeachInput;
import consolerbuilding.molder.output.BuildingSeachOutput;
import consolerbuilding.service.BuildingService;
import consolerbuilding.service.impl.BuildingSeviceImpl;

public class BuildingControler {
	
		private BuildingService buildingService = new BuildingSeviceImpl(); 
		
		public List<BuildingSeachOutput> getBuilding(BuildingSeachInput buildingSeachInput) {
			List<BuildingSeachOutput> result = buildingService.getBuilding(buildingSeachInput);
			return result;
		}
}
