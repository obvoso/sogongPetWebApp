package petMan;

import java.sql.*;

import utils.databaseUtils;

public class PetManDAO {
	
	public int join(PetManDTO newPet) {
		String SQL = "insert into petMan values (?,?,?,?,?,?)";
		try {
			Connection conn = databaseUtils.getConnection();
			PreparedStatement pstm = conn.prepareStatement(SQL);
			pstm.setString(1, newPet.name);
			pstm.setString(2, newPet.birth);
			pstm.setString(3, newPet.type);
			pstm.setString(4, newPet.kind);
			pstm.setString(5, newPet.master);
			pstm.setString(6, newPet.phone);
			return pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public GetPetList search(String SQL) {
		
		GetPetList petList = new GetPetList();
		try {
			Connection conn = databaseUtils.getConnection();
			PreparedStatement pstm = conn.prepareStatement(SQL);
			ResultSet rs = pstm.executeQuery();
			
			while (rs.next()) {
				petList.setNameList(rs.getString(1));
				petList.setBirthList(rs.getString(2));
				petList.setTypeList(rs.getString(3));
				petList.setKindList(rs.getString(4));
				petList.setMasterList(rs.getString(5));
				petList.setPhoneList(rs.getString(6));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return petList;
	}
}
