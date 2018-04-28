package by.htp.carparking.domain;

public class Order extends Entity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5731960048387459760L;
	
	private int idUser;
	private int idCar;
	
	
	
	public Order(int id, int idUser, int idCar) {
		super(id);
		this.idUser = idUser;
		this.idCar = idCar;
	}
	
	
	public Order() {
		super();
	}


	public Order(int id) {
		super(id);	
	}


	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getIdCar() {
		return idCar;
	}
	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}

	@Override
	public String toString() {
		return "Order [ id=" + super.getId() + " user_id=" + idUser + ", car_id=" + idCar + ", dateStart= , dateEnd=]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idCar;
		result = prime * result + idUser;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (idCar != other.idCar)
			return false;
		if (idUser != other.idUser)
			return false;
		return true;
	}
	
	
	

}
