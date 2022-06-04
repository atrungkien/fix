package consolerbuilding.service.impl;

import java.util.ArrayList;
import java.util.List;

import consolerbuilding.dao.BuildingDao;
import consolerbuilding.dao.Entity.BuildingEntity;
import consolerbuilding.dao.impl.BuildingDaoImpl;
import consolerbuilding.molder.input.BuildingSeachInput;
import consolerbuilding.molder.output.BuildingSeachOutput;
import consolerbuilding.service.BuildingService;

public class BuildingSeviceImpl implements BuildingService  {
	
	private BuildingDao buildingdao = new BuildingDaoImpl();

	@Override
	public List<BuildingSeachOutput> getBuilding(BuildingSeachInput buildingSeachInput) {
		List<BuildingSeachOutput> result = new ArrayList<>();
		List<BuildingEntity> buildingEntities = buildingdao.getBuilding(buildingSeachInput.getName(), buildingSeachInput.getAge());
			for (BuildingEntity item : buildingEntities) {
				BuildingSeachOutput buildingSeachOutput = new BuildingSeachOutput();
				buildingSeachOutput.setId(item.getId());
				buildingSeachOutput.setName(item.getName());
				buildingSeachOutput.setAge(item.getAge());
				buildingSeachOutput.setFull(item.getBirthday() + "----" + item.getCourse()+"---"+ item.getThanht());
				result.add(buildingSeachOutput);
			}
		return result;
	}

	
}
