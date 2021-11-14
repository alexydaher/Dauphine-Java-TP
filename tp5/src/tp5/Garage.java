package tp5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Garage {
	private static int id = 0;
	private final int idGarage;
	private ArrayList<Vehicle> vehicles;
	
	public Garage() {
		this.vehicles = new ArrayList<Vehicle>();
		idGarage = id++;
	}
	
	public void add(Vehicle v1) {
		Objects.requireNonNull(v1);
		this.vehicles.add(v1);
		Collections.sort(this.vehicles, new Comparator<Vehicle>() {
			@Override
			public int compare(Vehicle o1, Vehicle o2) {
				if (o1.getClass() != o2.getClass()) {
					return (int) (long) (o1.getValue() - o2.getValue());
				}
				if (o1.getBrand().compareTo(o2.getBrand()) != 0) {
					return o1.getBrand().compareTo(o2.getBrand());
				}
				if (o1.getValue() != o2.getValue()) {
					return (int) (long) (o1.getValue() - o2.getValue()); 
				}
				if (o1.getDiscount() == null) {
					return -1;
				}
				if (o2.getDiscount() == null) {
					return 1;
				}
				if (!o1.getDiscount().equals(o2.getDiscount())) {
					return (int) (long) (o1.getDiscount().getValue() - o2.getDiscount().getValue());
				}
				return 0;
			}
		});
	}
	
	public int getId() {
		return idGarage;
	}
	
	public long getValue() {
		long value = 0;
		for (Vehicle vehicle : vehicles) {
			value += vehicle.getValue();
		}
		return value;
	}
	
	public Vehicle firstCarByBrand(String brand) {
		Objects.requireNonNull(brand);
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getBrand().equals(brand)) {
				return vehicle; 
			}
		}
		return null;
	}
	
	public void remove(Vehicle vehicle) {
		Objects.requireNonNull(vehicle);
		for (int c = 0; c < vehicles.size(); c++) {
			if (vehicle.equals(vehicles.get(c))) {
				this.vehicles.remove(c);
				return;
			}
		}
		throw new IllegalStateException("");
	}
	
	public void protectionism(String brand) {
		for (int c = 0; c < vehicles.size(); c++) {
			if (this.vehicles.get(c).getBrand().equals(brand)) {
				this.vehicles.remove(c);
				c--;
			}
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (vehicles.isEmpty()) {
			return "";
		}
		sb.append("[");
		if (vehicles.size() == 1) {
			return vehicles.get(0).toString();
		}
		for (int i = 0; i < vehicles.size(); i++) {
			sb.append(", ");
			sb.append(vehicles.get(i).toString());
		}
		sb.append("]");
		return sb.toString();
	}

	public boolean equals(Garage g) {
		Objects.requireNonNull(g);
		return this.vehicles.equals(g.vehicles);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idGarage, vehicles);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Garage other = (Garage) obj;
		return idGarage == other.idGarage && Objects.equals(vehicles, other.vehicles);
	}

}
