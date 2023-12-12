package com.slokam.TeamsPalyers.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer teamId;
  
	private String teamName;
	@NotNull
	private Integer cups;
	private String grade;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="fk",referencedColumnName = "teamId")
	private List<Players> playersList;
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getCups() {
		return cups;
	}
	public void setCups(Integer cups) {
		this.cups = cups;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public List<Players> getPlayersList() {
		return playersList;
	}
	public void setPlayersList(List<Players> playersList) {
		this.playersList = playersList;
	}
	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", cups=" + cups + ", grade=" + grade
				+ ", playersList=" + playersList + "]";
	}
	public Team(Integer teamId, String teamName, Integer cups, String grade, List<Players> playersList) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.cups = cups;
		this.grade = grade;
		this.playersList = playersList;
	}
	public Team() {
		super();
	}


	
	

}
