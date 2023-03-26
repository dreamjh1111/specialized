package com.ssafy.specialized.service;

import com.ssafy.specialized.domain.dto.Reservation.ReservationRequestDTO;
import com.ssafy.specialized.domain.dto.Reservation.ReservationResponseDTO;
import com.ssafy.specialized.domain.entity.Reservation;
import com.ssafy.specialized.domain.entity.Store;
import com.ssafy.specialized.domain.entity.User;
import com.ssafy.specialized.repository.ReservationRepository;
import com.ssafy.specialized.repository.ReviewRepository;
import com.ssafy.specialized.repository.StoreRepository;
import com.ssafy.specialized.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor

public class ReservationServiceImpl implements ReservationService{

    @Autowired
    private final ReservationRepository reservationRepository;


    public ReservationResponseDTO createReservation(ReservationRequestDTO reservationRequestDto) {
        Reservation reservation = Reservation.builder()
                .reserver(User.builder().idx(reservationRequestDto.getUserIdx()).build())
                .store(Store.builder().idx(reservationRequestDto.getStoreIdx()).build())
                .history(reservationRequestDto.getHistory())
                .time(reservationRequestDto.getTime())
                .createdAt(LocalDateTime.now())
                .isConfirmed(false)
                .build();

        Reservation savedReservation = reservationRepository.save(reservation);

        return ReservationResponseDTO.builder()
                .idx(savedReservation.getIdx())
                .userIdx(savedReservation.getReserver().getIdx())
                .storeIdx(savedReservation.getStore().getIdx())
                .history(savedReservation.getHistory())
                .time(savedReservation.getTime())
                .createdAt(savedReservation.getCreatedAt())
                .isConfirmed(savedReservation.isConfirmed())
                .build();
    }
}

