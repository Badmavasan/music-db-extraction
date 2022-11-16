package fr.is2a4.music;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Music {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String artist;
	private String link;
	private String track;

}
