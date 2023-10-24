import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
		String sql = "INSERT INTO bugs(title,description,status,assigned_to,created,modified) VALUES(?,?,'open',?,now(),now())";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, b.getTitle());
			stmt.setString(2, b.getDescription());
			stmt.setInt(3, b.getAssigned_to());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	public int updateBugStatus(int id) throws SQLException {
		String sql = "update bugs set status = 'closed',modified = now() where id = ?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	public List<BugHandler> showOpenBugs() throws SQLException {
		String sql = "select name,created from members,bugs where members.id=bugs.id and status = 'open' order by created";
		List<BugHandler> list = new ArrayList<BugHandler>();
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					BugHandler bh = new BugHandler();
					bh.setName(rs.getString("name"));
					bh.setCreated(rs.getDate("created"));
					list.add(bh);
				}
			}
		}
		return list;
	}

	public List<Report> showReport() throws SQLException {
		String sql = "select name,count(assigned_to) from bugs,members where members.id=bugs.assigned_to and status = 'open' group by members.name";
		List<Report> list = new ArrayList<>();
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
					Report report = new Report();
					report.setName(rs.getString("name"));
					report.setCount(rs.getInt("count(assigned_to)"));
					list.add(report);
				}
				
			}
		}
		return list;

	}

	public List<Member> showMembers() throws SQLException {
		String sql = "select * from members";
		List<Member> list = new ArrayList<>();
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try(ResultSet rs = stmt.executeQuery()){
				while(rs.next()) {
					Member m = new Member();
					m.setId(rs.getInt("id"));
					m.setName(rs.getString("name"));
					m.setDesignation(rs.getString("designation"));
					list.add(m);
				}
				
			}
		}
		return list;

	}
	
	public int updateAssignedMember(int bid,int mid) throws SQLException {
		String sql = "update bugs set assigned_to=?,modified = now() where id=?;";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, mid);
			stmt.setInt(2, bid);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

}
