package my.edu.utem.ftmk.dad.restorderapp.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name ="ordertype")
public class OrderType {  //OrderType entity
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //The annotation represents the field as the primary key and the value of the key auto incremental
	@Column (name="OrderTypeID") //The name of @Column refers to the column named orderTypeId in the table OrderType.
	private int orderTypeID;
	@Column (name="code")
	private String code;
	@Column (name="name")
	private String name;
	
	public int getOrderTypeID() {
		return orderTypeID;
	}
	public void setOrderTypeID(int orderTypeID) {
		this.orderTypeID = orderTypeID;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}