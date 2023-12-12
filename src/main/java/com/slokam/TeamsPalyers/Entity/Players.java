package com.slokam.TeamsPalyers.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
public class Players {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer palyersId;
	private String playersName;
	public Integer getPalyersId() {
		return palyersId;
	}
	public void setPalyersId(Integer palyersId) {
		this.palyersId = palyersId;
	}
	public String getPlayersName() {
		return playersName;
	}
	public void setPlayersName(String playersName) {
		this.playersName = playersName;
	}
	@Override
	public String toString() {
		return "Players [palyersId=" + palyersId + ", playersName=" + playersName + "]";
	}
	public Players(Integer palyersId, String playersName) {
		super();
		this.palyersId = palyersId;
		this.playersName = playersName;
	}
	public Players() {
		super();
	}
	

}
