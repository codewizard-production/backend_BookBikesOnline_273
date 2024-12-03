package com.app.BookBikesOnline.enums;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmEnumeration;

@EdmEnumeration	  
public enum IDTypes{
	    Adhar,
	    Passport,
	    Pancard; 
    public int value(IDTypes iDTypes) {
        return iDTypes.ordinal();
    }
    public static IDTypes getIDTypes(int ordinal) {
        for(IDTypes iDTypes : IDTypes.values())
                if(iDTypes.ordinal() == ordinal)
                        return iDTypes;
        return null;
    }
}


