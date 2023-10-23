import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BugDao implements AutoCloseable {
	private Connection con;

	public BugDao() throws SQLException {
		con = DbUtil.getConnection();

	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub

	}

	public int addBug(Bug b) throws SQLException {
		String sql = "INSERT INTO bugs(id,title,description,status,assigned_to,created,modified) VALUES(default,?,?,'open', ?,now() ,now()";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, b.getTitle());
			stmt.setString(2, b.getDescription());
			stmt.setInt(3, b.getAssigned_to());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
}
