package com.app.BookBikesOnline.function;

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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.BookBikesOnline.repository.VerficationRepository;
import com.app.BookBikesOnline.repository.PaymentRepository;
import com.app.BookBikesOnline.repository.CustomerRepository;
import com.app.BookBikesOnline.repository.InsuranceRepository;
import com.app.BookBikesOnline.repository.ServiceCrewRepository;
import com.app.BookBikesOnline.repository.ReturnRentedBikeRepository;
import com.app.BookBikesOnline.repository.BookingRepository;
import com.app.BookBikesOnline.repository.RoadsideAssistanceRepository;
import com.app.BookBikesOnline.repository.ExtendBookingRepository;
import com.app.BookBikesOnline.repository.RentalCompanyRepository;
import com.app.BookBikesOnline.repository.ReturnBikeInspectionRepository;
import com.app.BookBikesOnline.repository.BikeRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
