package com.gaurav.hotel.HotelService.services;


import com.gaurav.hotel.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    //create

    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get single
    Hotel get(String id);

}
