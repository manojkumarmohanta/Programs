package moblog.bubun.moblogproject;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Places {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String heading;
    private String description;
	
	public Places(int id, String heading, String description) {
		super();
		this.id = id;
		this.heading = heading;
		this.description = description;
	}
	
	public Places() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Places [id=" + id + ", heading=" + heading + ", description=" + description + "]";
	}
	
    

}
