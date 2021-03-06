package com.raizlabs.android.dbflow.converter;

import java.util.Calendar;

/**
 * Author: andrewgrosner
 * Description: Defines how we store and retrieve a {@link java.util.Calendar}
 */
public class CalendarConverter extends TypeConverter<Long, Calendar> {

    @Override
    public Long getDBValue(Calendar model) {
        return model == null ? null : model.getTimeInMillis();
    }

    @Override
    public Calendar getModelValue(Long data) {
        if (data != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(data);
            return calendar;
        } else {
            return null;
        }
    }
}
