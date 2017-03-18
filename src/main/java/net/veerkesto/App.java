package net.veerkesto;

import org.apache.johnzon.mapper.JohnzonConverter;
import org.apache.johnzon.mapper.Mapper;
import org.apache.johnzon.mapper.MapperBuilder;

import java.sql.Time;

class Toto {
    public int x;
    public String y;

    @JohnzonConverter(TimeConverter.class)
    public Time t1;
}


public class App 
{
    public static void main( String[] args )
    {
        Toto toto = new Toto();
        toto.x = 10;
        toto.y = "xxxx";
        toto.t1 = Time.valueOf("10:11:12");
        Mapper mapper = new MapperBuilder().build();
        mapper.writeObject(toto, System.out);
    }
}
