package com.ssafy.specialized.domain.dto.Reservation;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ReservationRequestDTO {

    private int userIdx;

    private int storeIdx;

    private String history;

    private LocalDateTime time;

}
