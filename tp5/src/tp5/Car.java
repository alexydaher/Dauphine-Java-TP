package tp5;

import java.util.Objects;

public class Car extends Vehicle {
	private int vetuste;
	
	public Car(String brand, long value, int vetuste, Discount discount) {
		super(brand, value, discount);
		if (vetuste < 0) {
			throw new IllegalArgumentException("vetuste must be positive");
		}
		if (value - vetuste * 100 <= 0) {
			throw new IllegalArgumentException("vatuste is too high");
		}
		this.vetuste = vetuste;
	}
	
	public Car(String brand, long value) {
		this(brand, value, 0, null);
	}
	
	public Car(String brand, long value, Discount discount) {
		this(brand, value, 0, discount);
	}
	
	public Car(String brand, long value, int vetuste) {
		this(brand, value, vetuste, null);
	}
	
	public long getValue() {
		if (super.getDiscount() != null) {
			return super.getDiscount().getValue();
		}
		return super.getValue() - this.vetuste * 1000;
	}
	
	public int getVetuste() {
		return this.vetuste;
	}
	
	public void setVetuste(int vetuste) {
		if (vetuste * 1000 > this.getValue()) {
			throw new IllegalArgumentException("");
		}
		this.vetuste = vetuste;
	}
	
	public boolean equals(Car c) {
		
		if (this.getBrand().equals(c.getBrand()) 
				&& this.getValue() == c.getValue()
				&& this.vetuste == c.vetuste) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getBrand(), this.getValue(), vetuste);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(this.getBrand(), other.getBrand()) && this.getValue() == other.getValue() && vetuste == other.vetuste;
	}

	@Override
	public String toString() {
		return "(" + this.getBrand() + ", " + this.getValue() + ", " + this.vetuste + ")";
	}
	
}
