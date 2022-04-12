package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "wanafunzi")
public class Mwanafunzi {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name ="jinala_mwanzo")
	private String jinaLaMwanzo;
	
	@Column(name ="jinala_mwisho")
	private String jinaLaMwisho;
	
	@Column(name ="barua_pepe")
	private String baruapepe;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getJinaLaMwanzo() {
		return jinaLaMwanzo;
	}
	public void setJinaLaMwanzo(String jinaLaMwanzo) {
		this.jinaLaMwanzo = jinaLaMwanzo;
	}
	public String getJinaLaMwisho() {
		return jinaLaMwisho;
	}
	public void setJinaLaMwisho(String jinaLaMwisho) {
		this.jinaLaMwisho = jinaLaMwisho;
	}
	public String getBaruapepe() {
		return baruapepe;
	}
	public void setBaruapepe(String baruapepe) {
		this.baruapepe = baruapepe;
	}

	
}
