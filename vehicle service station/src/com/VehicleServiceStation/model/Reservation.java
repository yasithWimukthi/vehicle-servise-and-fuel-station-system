/**
 * VEHICLE SERVICE AND FUEL SATATION MANAGEMENT SYSTEM
 * @author yasith wimukthi
 * IT 19966922
 * 
 * Y2S1 2.2
 * OOP
 *
 */

package com.VehicleServiceStation.model;

public class Reservation {
	
	private String reservationID;
	private String brand;
	private String vehicleModel;
	private String edition;
	private String transmission;
	private String bodyType;
	private String date;
	
	//DEFAULT CONSTRUCTOR
	public Reservation() {
		super();
	}

	// OVERLOADED CONSTRUCTOR WITHOUT reservationID FIELD
	public Reservation(String brand, String vehicleModel, String edition, String transmission, String bodyType,
			String date) {
		super();
		this.brand = brand;
		this.vehicleModel = vehicleModel;
		this.edition = edition;
		this.transmission = transmission;
		this.bodyType = bodyType;
		this.date = date;
	}

	// OVERLOADED CONSTRUCTOR WITH ALL FIELDS
	public Reservation(String reservationID, String brand, String vehicleModel, String edition, String transmission,
			String bodyType, String date) {
		super();
		this.reservationID = reservationID;
		this.brand = brand;
		this.vehicleModel = vehicleModel;
		this.edition = edition;
		this.transmission = transmission;
		this.bodyType = bodyType;
		this.date = date;
	}

	public String getReservationID() {
		return reservationID;
	}

	public void setReservationID(String reservationID) {
		this.reservationID = reservationID;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	//OVERRIDE toString METHOD
	@Override
	public String toString() {
		return "Reservation [reservationID=" + reservationID + ", brand=" + brand + ", vehicleModel=" + vehicleModel
				+ ", edition=" + edition + ", transmission=" + transmission + ", bodyType=" + bodyType + ", date="
				+ date + "]";
	}
	
	
	

}
