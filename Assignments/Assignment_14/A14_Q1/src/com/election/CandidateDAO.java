package com.election;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CandidateDAO implements AutoCloseable{
	private Connection con;
	@Override
	public void close() throws Exception {
		
	}
	public CandidateDAO() throws SQLException {
		con = DbUtil.getConnection();
	}

	// Add new Candidate
	public int save(Candidate c) throws SQLException {
		String sql = "Insert into candidates values(default,?,?,0)";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	// Delete Candidate
	public int deleteById(int id) throws SQLException {
		String sql = "Delete from candidates where id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	// Update Candidate
	public int update(Candidate c) throws SQLException{
		String sql = "update candidates set name = ?,party = ? where id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3,c.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	// show all candidates
	public List<Candidate> showAll() throws SQLException {
		String sql = "select * from candidates";
		List<Candidate> list = new ArrayList<Candidate>();
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					Candidate c = new Candidate();
					c.setId(rs.getInt("id"));
					c.setName(rs.getString("name"));
					c.setParty(rs.getString("party"));
					c.setVotes(rs.getInt("votes"));
					list.add(c);
				}
			}
		}
		return list;
	}
	
	// Get party-wise total votes
	public List<PartyVotes> getPartyWiseVotes() throws SQLException{
		String sql = "select party,sum(votes) from candidates group by party";
		List<PartyVotes> list = new ArrayList<PartyVotes>();
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					PartyVotes pv = new PartyVotes();
					pv.setParty(rs.getString("party"));
					pv.setVotes(rs.getInt("sum(votes)"));
					list.add(pv);
				}
			}
		}
		return list;
		
	}
	
	// Increment Candidate votes
	public int incrementVotes(int id) throws SQLException {
		String sql = "update candidates set votes = votes +1 where id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)){
			stmt.setInt(1,id);
			int cnt =stmt.executeUpdate();
			return cnt;
		}
	}

	// get all candidates of given party
		public List<Candidate> findByParty(String givenParty) throws SQLException {
			List<Candidate> list = new ArrayList<>();
			String sql = "SELECT * FROM candidates WHERE party=?";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				stmt.setString(1, givenParty);
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String party = rs.getString("party");
						int votes = rs.getInt("votes");
						Candidate c = new Candidate(id, name, party, votes);
						list.add(c);
					}
				} // rs.close();
			} // stmt.close();
			return list;
		}
}
