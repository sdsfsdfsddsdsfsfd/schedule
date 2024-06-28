package vo;

public class WorkSpaceVO {

	public int team_idx;
	public String leader, id, team_name, project_content, project_skill;

	public int getTeam_idx() {
		return team_idx;
	}

	public void setTeam_idx(int team_idx) {
		this.team_idx = team_idx;
	}

	public String getLeader() {
		return leader;
	}

	public void setLeader(String leader) {
		this.leader = leader;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public String getProject_content() {
		return project_content;
	}

	public void setProject_content(String project_content) {
		this.project_content = project_content;
	}

	public String getProject_skill() {
		return project_skill;
	}

	public void setProject_skill(String project_skill) {
		this.project_skill = project_skill;
	}

}
