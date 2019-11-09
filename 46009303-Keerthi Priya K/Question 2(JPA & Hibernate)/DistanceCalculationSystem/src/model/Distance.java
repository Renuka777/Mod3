package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="distance_calculator")
public class Distance {
	
	int distance_id;
	String source;
	String destination;
	double dist_in_km;
	double dist_in_miles;
	public Distance() {
		super();
	}
	public Distance(int distance_id, String source, String destination, double dist_in_km, double dist_in_miles) {
		super();
		this.distance_id = distance_id;
		this.source = source;
		this.destination = destination;
		this.dist_in_km = dist_in_km;
		this.dist_in_miles = dist_in_miles;
	}
	public int getDistance_id() {
		return distance_id;
	}
	public void setDistance_id(int distance_id) {
		this.distance_id = distance_id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getDist_in_km() {
		return dist_in_km;
	}
	public void setDist_in_km(double dist_in_km) {
		this.dist_in_km = dist_in_km;
	}
	public double getDist_in_miles() {
		return dist_in_miles;
	}
	public void setDist_in_miles(double dist_in_miles) {
		this.dist_in_miles = dist_in_miles;
	}
	
	
}
