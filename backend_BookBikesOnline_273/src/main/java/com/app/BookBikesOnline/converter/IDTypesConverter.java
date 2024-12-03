package com.app.BookBikesOnline.converter;

import com.app.BookBikesOnline.enums.IDTypes;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class IDTypesConverter implements AttributeConverter<IDTypes, Integer> {

    @Override
    public Integer convertToDatabaseColumn(IDTypes iDTypes) {
        return iDTypes != null ? iDTypes.ordinal() : null;
    }

    @Override
    public IDTypes convertToEntityAttribute(Integer dbData) {
      if (dbData == null) {
        return null;
      }
		  return IDTypes.getIDTypes(dbData);
    }
}
