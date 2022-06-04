package consolerbuilding.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import consolerbuilding.Constant.BuildingConstant;
import consolerbuilding.Utills.BuildingUtills;
import consolerbuilding.dao.BuildingDao;
import consolerbuilding.dao.Entity.BuildingEntity;

public class BuildingDaoImpl implements BuildingDao {
	
	   
	   
	@Override
	public List<BuildingEntity> getBuilding(String name, Integer age) {
		List<BuildingEntity> result = new ArrayList<>();
		StringBuilder sql = new StringBuilder("SELECT * FROM sisostudent "+BuildingConstant.WHERE_ONE_EQUA_ONE+"");
				if (name != null && name != "") {
					sql.append("and name like '%"+name+"%'");
				}
				if (age != null) {
					sql.append("and age = "+age+"");
				}
		
		      try(Connection conn = BuildingUtills.getconnection();
		         Statement stmt = conn.createStatement();
		         ResultSet rs = stmt.executeQuery(sql.toString());
		      ) {		      
		         while(rs.next()){
		            BuildingEntity buildingEntity = new BuildingEntity();
		            System.out.print("ID: " + rs.getInt("id"));
		            System.out.print(", Age: " + rs.getInt("age"));
		            System.out.print(", Birthday: " + rs.getInt("birthday"));
		            System.out.print(", Name: " + rs.getString("Name"));
		            System.out.println(", Thanht: " + rs.getString("thanht"));
		            result.add(buildingEntity);
		         }
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		return null;
	}

}
