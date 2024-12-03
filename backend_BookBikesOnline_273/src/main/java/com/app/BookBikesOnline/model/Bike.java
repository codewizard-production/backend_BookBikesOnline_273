package com.app.BookBikesOnline.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.BookBikesOnline.model.RoadsideAssistance;
import com.app.BookBikesOnline.model.Verfication;
import com.app.BookBikesOnline.model.Payment;
import com.app.BookBikesOnline.model.ServiceCrew;
import com.app.BookBikesOnline.model.Insurance;
import com.app.BookBikesOnline.model.ExtendBooking;
import com.app.BookBikesOnline.model.Booking;
import com.app.BookBikesOnline.model.RentalCompany;
import com.app.BookBikesOnline.model.ReturnBikeInspection;
import com.app.BookBikesOnline.model.Customer;
import com.app.BookBikesOnline.model.Bike;
import com.app.BookBikesOnline.model.ReturnRentedBike;
import com.app.BookBikesOnline.enums.IDTypes;
import com.app.BookBikesOnline.converter.IDTypesConverter;
import com.app.BookBikesOnline.converter.DurationConverter;
import com.app.BookBikesOnline.converter.UUIDToByteConverter;
import com.app.BookBikesOnline.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Bike")
@Table(name = "\"Bike\"", schema =  "\"bookbikesonline\"")
@Data
                        
public class Bike {
	public Bike () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"BikeID\"", nullable = true )
  private Integer bikeID;
	  
  @Column(name = "\"Manufacturer\"", nullable = true )
  private String manufacturer;
  
	  
  @Column(name = "\"Model\"", nullable = true )
  private String model;
  
	  
  @Column(name = "\"YearOfRegistration\"", nullable = true )
  @Temporal(value = TemporalType.DATE)
  private Date yearOfRegistration;  
  
	  
  @Column(name = "\"Color\"", nullable = true )
  private String color;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Bike [" 
  + "BikeID= " + bikeID  + ", " 
  + "Manufacturer= " + manufacturer  + ", " 
  + "Model= " + model  + ", " 
  + "YearOfRegistration= " + yearOfRegistration  + ", " 
  + "Color= " + color 
 + "]";
	}
	
}