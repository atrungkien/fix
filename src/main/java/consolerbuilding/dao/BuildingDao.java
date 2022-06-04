package consolerbuilding.dao;

import java.util.List;

import consolerbuilding.dao.Entity.BuildingEntity;

public interface BuildingDao {
	List<BuildingEntity> getBuilding (String name, Integer age);
}
