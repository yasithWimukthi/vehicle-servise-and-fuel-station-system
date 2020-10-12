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

public class Feedback {
	
	private String feedbackID;
	private String name;
	private String email;
	private String message;
	
	/** DEFAULT CONSTRUCTOR*/
	public Feedback() {
		super();
	}
	
	/** OVERLOADED CONSTUCTOR WITH ALL FIELDS*/ 
	public Feedback(String feedbackID, String name, String email, String message) {
		super();
		this.feedbackID = feedbackID;
		this.name = name;
		this.email = email;
		this.message = message;
	}

	/** OVERLOADED CONSTUCTOR WITHOUT feedbackID FIELD*/ 
	public Feedback(String name, String email, String message) {
		super();
		this.name = name;
		this.email = email;
		this.message = message;
	}

	public String getFeedbackID() {
		return feedbackID;
	}

	public void setFeedbackID(String feedbackID) {
		this.feedbackID = feedbackID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	/** OVERRIDE toString() METHOD*/
	@Override
	public String toString() {
		return "Feedback [feedbackID=" + feedbackID + ", name=" + name + ", email=" + email + ", message=" + message
				+ "]";
	}
	
	
}
