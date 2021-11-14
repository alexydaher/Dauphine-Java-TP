package tp5;

import java.util.Objects;

public abstract class Vehicle {
	private final String brand;
	private long value;
	private Discount discount;
	
	public Vehicle(String brand, long value, Discount discount) {
		this.brand = Objects.requireNonNull(brand);
		if (value < 0)
			throw new IllegalArgumentException("value must be positive");
		this.value = value;
		this.discount = discount;
	}
	
	protected String getBrand() {
		return this.brand;
	}
	
	protected Discount getDiscount() {
		return this.discount;
	}
	
	protected long getValue() {
		return this.value;
	}

	protected void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
}
