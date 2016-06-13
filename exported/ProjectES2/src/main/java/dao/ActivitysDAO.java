package dao;

import java.util.List;

import model.Activity;

public interface ActivitysDAO {
	/*List all activitys*/
	public List<Activity> listAll();
	/*List all activitys related with this tags*/
	public List<Activity> listByTags(List<String> tags);
	/*Get only one Activity*/
	public Activity get(int id);
	/*Insert a new tag in database and add a relationship with this activity*/
	public void insertTag(int id_activity, String newTag);
	/*delete one from database. Cascade clean references.*/
	public void deleteTag(String nome_tag);
}
