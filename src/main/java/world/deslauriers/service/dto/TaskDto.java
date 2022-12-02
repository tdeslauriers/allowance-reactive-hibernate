package world.deslauriers.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.micronaut.serde.annotation.Serdeable;

import java.time.LocalDate;

@Serdeable
public record TaskDto(
        Long id,
        String task,
        String cadence,
        @JsonFormat(pattern="yyyy-MM-dd") LocalDate date,
        Boolean isComplete,
        Boolean isQuality,
        Long ttaId,
        Long aid
) {
}
