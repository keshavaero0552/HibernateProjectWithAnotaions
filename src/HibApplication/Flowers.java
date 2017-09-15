
package HibApplication;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="flower")
public class Flowers {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="flowerid")
	int Flowerid;
	@Column(name="flowerType")
	String flowerType;
	@Column(name="sales")
	float sales;
	@ManyToOne(cascade={CascadeType.REFRESH,CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="shop_id")
	private Shop shop;
	
	
	


	

	public Flowers() {
		super();
	}
	
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public int getFlowerid() {
		return Flowerid;
	}
	public void setFlowerid(int flowerid) {
		Flowerid = flowerid;
	}
	public String getFlowerType() {
		return flowerType;
	}
	public void setFlowerType(String flowerType) {
		this.flowerType = flowerType;
	}
	public float getSales() {
		return sales;
	}
	public void setSales(float sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return "Flowers [Flowerid=" + Flowerid + ", flowerType=" + flowerType + ", sales=" + sales + ", shop=" + shop
				+ "]";
	}



	

	
	
	
}
	
	
	
	