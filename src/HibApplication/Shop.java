package HibApplication;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="shop")
public class Shop {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name ="id")
	private int id;
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy="shop" ,cascade={CascadeType.REFRESH,CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST})
	List<Manager> managers;
	@OneToMany(mappedBy="shop" ,cascade={CascadeType.REFRESH,CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST})
	List<Flowers> flowers;
	
	public List<Flowers> getFlowers() {
		return flowers;
	}
	public void setFlowers(List<Flowers> flowers) {
		this.flowers = flowers;
	}
	public List<Manager> getManagers() {
		return managers;
	}
	public void setManagers(List<Manager> managers) {
		this.managers = managers;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", name=" + name + "]";
	}
	public Shop() {
		super();
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
