package HibApplication;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="manager")
public class Manager {
	
	@Id 
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="mid")
	int mid;
	@Column(name="name")
	String name;
	
	@ManyToOne
	@JoinColumn(name="shop_id")
	private Shop shop;
	
	
	public Manager() {
		super();
	}
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", shop=" + shop + "]";
	}

	

}
