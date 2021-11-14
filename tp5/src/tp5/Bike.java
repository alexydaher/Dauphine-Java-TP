package tp5;

import java.util.Objects;

public class Bike extends Vehicle {
	static long value = 100;
	
	public Bike(String brand, Discount discount) {
		super(brand, value, discount);
	}
	
	public Bike(String brand) {
		this(brand, null);
	}
	
	@Override
	public String toString() {
		return super.getBrand();
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.getBrand());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		return Objects.equals(super.getBrand(), other.getBrand());
	}

	public long getValue() {
		if (super.getDiscount() != null) {
			return super.getDiscount().getValue();
		}
		return value;
	}
	
}
