package com.gaurav.hotel.HotelService.respositories;

 import com.gaurav.hotel.HotelService.entities.Hotel;
 import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
