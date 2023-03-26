package com.ssafy.specialized.controller;

import com.ssafy.specialized.domain.dto.Reservation.*;
import com.ssafy.specialized.service.ReservationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/reservations")
public class ReservationController {
    @Autowired
    private final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping("/create")
    public ResponseEntity<ReservationResponseDTO> createReservation(@RequestBody ReservationRequestDTO reservationRequestDto) {
        ReservationResponseDTO reservationResponseDto = reservationService.createReservation(reservationRequestDto);
        return ResponseEntity.ok(reservationResponseDto);
    }

//    @DeleteMapping("/{reservationId}")
//    public ResponseEntity<Void> cancelReservation(@PathVariable Long reservationId) {
//        reservationService.cancelReservation(reservationId);
//        return ResponseEntity.noContent().build();
//    }
//
//    @GetMapping("/{reservationId}")
//    public ResponseEntity<ReservationResponseDTO> getReservation(@PathVariable Long reservationId) {
//        ReservationResponseDTO reservationResponseDto = reservationService.getReservation(reservationId);
//        return ResponseEntity.ok(reservationResponseDto);
//    }
//
//    @GetMapping("/stores/{storeId}")
//    public ResponseEntity<List<ReservationResponseDTO>> getStoreReservations(
//            @PathVariable Long storeId,
//            @RequestParam(required = false) LocalDateTime date) {
//        List<ReservationResponseDTO> reservations = reservationService.getStoreReservations(storeId, date);
//        return ResponseEntity.ok(reservations);
//    }
}