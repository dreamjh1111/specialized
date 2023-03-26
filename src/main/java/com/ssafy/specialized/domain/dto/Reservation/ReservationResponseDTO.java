package com.ssafy.specialized.domain.dto.Reservation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ReservationResponseDTO {

    private int idx;

    private int userIdx;

    private int storeIdx;

    private String history;

    private LocalDateTime time;

    private LocalDateTime createdAt;

    private boolean isConfirmed;

}
