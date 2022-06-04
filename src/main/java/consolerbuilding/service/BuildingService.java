package consolerbuilding.service;

import java.util.List;

import consolerbuilding.molder.input.BuildingSeachInput;
import consolerbuilding.molder.output.BuildingSeachOutput;

public interface BuildingService {
	 List<BuildingSeachOutput> getBuilding (BuildingSeachInput buildingSeachInput);
}
