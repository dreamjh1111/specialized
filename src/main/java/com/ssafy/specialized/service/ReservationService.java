package com.ssafy.specialized.service;

import com.ssafy.specialized.domain.dto.Reservation.*;

import java.util.List;

public interface ReservationService {

    ReservationResponseDTO createReservation(ReservationRequestDTO reservationRequestDto);
//    ReservationResponseDTO deleteReservation(int reservationId);
//    List<ReservationDTO> getMyReservations(int userId);
//    List<LocalDateTime> getAvailableReservationTimes(int storeId);
}
