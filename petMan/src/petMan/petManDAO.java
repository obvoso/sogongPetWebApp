package petMan;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utils.databaseUtils;

public class petManDAO {
	
	public int join(String name, String birth, String type, String kind, String master, String phone) {
		String SQL = "insert into petMan values (?,?,?,?,?,?)";
		try {
			Connection conn = databaseUtils.getConnection();
			PreparedStatement pstm = conn.prepareStatement(SQL);
			pstm.setString(1, name);
			pstm.setString(2, birth);
			pstm.setString(3, type);
			pstm.setString(4, kind);
			pstm.setString(5, master);
			pstm.setString(6, phone);
			return pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
}
