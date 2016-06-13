package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import model.Activity;

public class ActivitysDAOImpl implements ActivitysDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public ActivitysDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public List<Activity> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Activity> listByTags(List<String> tags) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Activity get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertTag(int id_activity, String newTag) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTag(int id_tag) {
		// TODO Auto-generated method stub
		
	}

}
