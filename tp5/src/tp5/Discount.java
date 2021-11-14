package tp5;

import java.util.Objects;

public class Discount {
	private long value;
	
	public Discount(int value) {
		if (value < 0) {
			throw new IllegalArgumentException("");
		}
		this.value = value;
	}
	
	public long getValue() {
		return this.value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Discount other = (Discount) obj;
		return value == other.value;
	}
	
}
