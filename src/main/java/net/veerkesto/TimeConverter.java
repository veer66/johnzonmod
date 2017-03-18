package net.veerkesto;

import org.apache.johnzon.mapper.Converter;

import java.sql.Time;
import java.text.SimpleDateFormat;

public class TimeConverter implements Converter<Time> {
    public String toString(Time time) {
        return new SimpleDateFormat("HHmm").format(time);
    }

    public Time fromString(String s) {
        return Time.valueOf(s);
    }
}
