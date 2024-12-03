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

@Entity(name = "Customer")
@Table(name = "\"Customer\"", schema =  "\"bookbikesonline\"")
@Data
                        
public class Customer {
	public Customer () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"CustomerID\"", nullable = true )
  private Integer customerID;
	  
  @Column(name = "\"CustomerName\"", nullable = true )
  private String customerName;
  
	  
  @Column(name = "\"CustomerPhoneNumber\"", nullable = true )
  private Long customerPhoneNumber;
  
	  
  @Column(name = "\"CusrtomerAddress\"", nullable = true )
  private String cusrtomerAddress;
  
  
  
  
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"CustomerBookings\"",
            joinColumns = @JoinColumn( name="\"CustomerID\""),
            inverseJoinColumns = @JoinColumn( name="\"BookingID\""), schema = "\"bookbikesonline\"")
private List<Booking> bookings = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"CustomerReturns\"",
            joinColumns = @JoinColumn( name="\"CustomerID\""),
            inverseJoinColumns = @JoinColumn( name="\"BookingID\""), schema = "\"bookbikesonline\"")
private List<ReturnRentedBike> returns = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"CustomerExtendRental\"",
            joinColumns = @JoinColumn( name="\"CustomerID\""),
            inverseJoinColumns = @JoinColumn( name="\"BookingID\""), schema = "\"bookbikesonline\"")
private List<ExtendBooking> extendRental = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Customer [" 
  + "CustomerID= " + customerID  + ", " 
  + "CustomerName= " + customerName  + ", " 
  + "CustomerPhoneNumber= " + customerPhoneNumber  + ", " 
  + "CusrtomerAddress= " + cusrtomerAddress 
 + "]";
	}
	
}