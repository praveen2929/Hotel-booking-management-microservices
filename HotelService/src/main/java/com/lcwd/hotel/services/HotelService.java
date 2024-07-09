package com.lcwd.hotel.services;


import com.lcwd.hotel.entities.Hotel;
import java.util.List;
public interface HotelService  {

    //Create

    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();


    //get single
    Hotel get(String id);


}
