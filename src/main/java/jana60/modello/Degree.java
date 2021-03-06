package jana60.modello;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="degrees")
public class Degree {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name, level, address, email, website;
	

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public void setUniversit√†(Universita universita) {
		this.universita = universita;
	}

	@ManyToOne
	  @JoinColumn(name = "department_id")
	  private Universita universita;
	
	@OneToMany
	 @JoinColumn(name = "degree_id")
	 private List<Course> courses;

	public List<Course> getCourses() {
		return courses;
	}

	public Universita getUniversita() {
		return universita;
	}

	public void setUniversita(Universita universita) {
		this.universita = universita;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
	
	  public Universita getUniversit√†() {
		return universita;
	}

	public void setUniversti√†(Universita universita) {
		this.universita = universita;
	}

	public String getUniversitaName()
	{
		return this.universita.getName();
	}
}
