package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import model.Activity;

public class ActivitysDAOImpl implements ActivitysDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public ActivitysDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

	@Override
	public List<Activity> listAll() {
		String sql = "SELECT * FROM ATIVIDADES";
	    List<Activity> listActivity = jdbcTemplate.query(sql, new RowMapper<Activity>() {
	        @Override
	        public Activity mapRow(ResultSet rs, int rowNum) throws SQLException {
	        	Activity aActivity = new Activity();
	        	aActivity.setId(rs.getInt("id_atividade"));
	        	aActivity.setNomeAtividade(rs.getString("nome_atividade"));
	        	aActivity.setNomeCoordenador(rs.getString("id_coordenador"));
	        	aActivity.setNomeSetor(rs.getString("id_setor"));
	        	aActivity.setNumProcesso(rs.getString("num_processo"));
	        	aActivity.setDataInicio(rs.getString("data_inicio"));
	        	aActivity.setDataFim(rs.getString("data_fim"));
	        	aActivity.setCargaHoraria(rs.getInt("carga_horaria"));
	 
	            return aActivity;
	        }
	    });
	    for (Activity activity : listActivity) {
			String sql2 = "SELECT nome_servidor FROM SERVIDORES WHERE id_atividade=" + activity.getId();
			List<String> servidores = jdbcTemplate.query(sql2, new RowMapper<String>(){
				@Override
				public String mapRow(ResultSet rs, int rowNum) throws SQLException {
					return rs.getString("nome_servidor");
				}
			});
			activity.setServidores(servidores);
			String sql3 = "SELECT nome_aluno FROM ALUNOS WHERE id_atividade=" + activity.getId();
			List<String> alunos = jdbcTemplate.query(sql3, new RowMapper<String>(){
				@Override
				public String mapRow(ResultSet rs, int rowNum) throws SQLException {
					return rs.getString("nome_aluno");
				}
			});
			activity.setAlunos(alunos);
			String sql4 = "SELECT id_tag FROM TAGS_ATIVIDADE WHERE id_atividade=" + activity.getId();
			List<Integer> id_tags = jdbcTemplate.query(sql4, new RowMapper<Integer>(){
				@Override
				public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
					return rs.getInt("id_tag");
				}
			});
			for (Integer id_tag : id_tags) {
				String sql5 = "SELECT nome_tag FROM TAGS WHERE id_tag=" + id_tag;
				List<String> tags = jdbcTemplate.query(sql5, new RowMapper<String>(){
					@Override
					public String mapRow(ResultSet rs, int rowNum) throws SQLException {
						return rs.getString("nome_tag");
					}
				});
				activity.setTags(tags);
			}
		}
		return listActivity;
	}

	@Override
	public List<Activity> listByTags(List<String> tags) {
		List<Activity> listActivity = new ArrayList<Activity>();
		for (String tag_key : tags) {
			String sql_check = "SELECT id_tag FROM TAGS WHERE UPPER(nome_tag)=UPPER(" + tag_key + ");";
			int id_tag = jdbcTemplate.queryForObject(sql_check, new Object[] {tag_key}, Integer.class);
			String sql_id_activity = "SELECT id_atividade FROM TAGS_ATIVIDADE WHERE id_tag=" + id_tag;
			List<Integer> id_activitys = jdbcTemplate.query(sql_id_activity, new RowMapper<Integer>(){
				@Override
				public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
					return rs.getInt("id_atividade");
				}
			});
			for (Integer id_activity : id_activitys) {
				String sql = "SELECT * FROM ATIVIDADES WHERE id_atividade=" + id_activity;
			    Activity activity = jdbcTemplate.query(sql, new ResultSetExtractor<Activity>() {
			        @Override
			        public Activity extractData(ResultSet rs) throws SQLException, DataAccessException{
			        	if(rs.next()){
			        		Activity aActivity = new Activity();
			        		aActivity.setId(rs.getInt("id_atividade"));
				        	aActivity.setNomeAtividade(rs.getString("nome_atividade"));
				        	aActivity.setNomeCoordenador(rs.getString("id_coordenador"));
				        	aActivity.setNomeSetor(rs.getString("id_setor"));
				        	aActivity.setNumProcesso(rs.getString("num_processo"));
				        	aActivity.setDataInicio(rs.getString("data_inicio"));
				        	aActivity.setDataFim(rs.getString("data_fim"));
				        	aActivity.setCargaHoraria(rs.getInt("carga_horaria"));
				            return aActivity;
			        	}
			        	return null;
			        }
			    });
			    String sql2 = "SELECT nome_servidor FROM SERVIDORES WHERE id_atividade=" + id_activity;
				List<String> servidores = jdbcTemplate.query(sql2, new RowMapper<String>(){
					@Override
					public String mapRow(ResultSet rs, int rowNum) throws SQLException {
						return rs.getString("nome_servidor");
					}
				});
				activity.setServidores(servidores);
				String sql3 = "SELECT nome_aluno FROM ALUNOS WHERE id_atividade=" + tag_key;
				List<String> alunos = jdbcTemplate.query(sql3, new RowMapper<String>(){
					@Override
					public String mapRow(ResultSet rs, int rowNum) throws SQLException {
						return rs.getString("nome_aluno");
					}
				});
				activity.setAlunos(alunos);
				String sql4 = "SELECT id_tag FROM TAGS_ATIVIDADE WHERE id_atividade=" + id_activity;
				List<Integer> id_tags = jdbcTemplate.query(sql4, new RowMapper<Integer>(){
					@Override
					public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
						return rs.getInt("id_tag");
					}
				});
				for (Integer id : id_tags) {
					String sql5 = "SELECT nome_tag FROM TAGS WHERE id_tag=" + id;
					List<String> tags2 = jdbcTemplate.query(sql5, new RowMapper<String>(){
						@Override
						public String mapRow(ResultSet rs, int rowNum) throws SQLException {
							return rs.getString("nome_tag");
						}
					});
					activity.setTags(tags2);
				}
			}
		}
		return listActivity;
	}

	@Override
	public Activity get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertTag(int id_activity, String newTag) {
		String sql_check = "SELECT id_tag FROM TAGS WHERE nome_tag=" + newTag;
		int id_tag = jdbcTemplate.queryForObject(sql_check, new Object[] {newTag}, Integer.class);
		if(id_tag < 1){
			String sql = "INSERT INTO TAGS(nome_tag)"
	                + " VALUES (?)";
			jdbcTemplate.update(sql, newTag);
			String sql2= "SELECT id_tag FROM TAGS WHERE nome_tag=" + newTag;
			id_tag = jdbcTemplate.queryForObject(sql2, new Object[] {newTag}, Integer.class);
		}
		String sql3 = "INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)"
				+ "VALUES (?, ?)";
		jdbcTemplate.update(sql3, id_activity, id_tag);
	}

	@Override
	public void deleteTag(String nome_tag) {
		String sql= "SELECT id_tag FROM TAGS WHERE nome_tag=" + nome_tag;
		int id_tag = jdbcTemplate.queryForObject(sql, new Object[] {nome_tag}, Integer.class);
	    String sql2 = "DELETE FROM TAGS_ATIVIDADES WHERE =?";
	    jdbcTemplate.update(sql2, id_tag);
	}

}
