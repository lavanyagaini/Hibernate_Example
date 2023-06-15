package youtube_hibernate_1;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity 		//@Entity(name="alien_table")
//@Table(name="alien_table")    //--->this only for changing of table name
public class Alien {
	@Id
	private int id;
	//@Transient
	//private String name;
	
	private  AlienNames name;
	
	@Column(name="alien_color")
	private String color;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public String getColor() {
		return color;
	}
	public AlienNames getName() {
		return name;
	}
	public void setName(AlienNames name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	
	
}
