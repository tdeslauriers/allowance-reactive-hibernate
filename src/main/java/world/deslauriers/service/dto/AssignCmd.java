package world.deslauriers.service.dto;

import io.micronaut.core.annotation.NonNull;
import io.micronaut.serde.annotation.Serdeable;

@Serdeable
public record AssignCmd(
        @NonNull Long allowanceId,
        @NonNull Long tasktypeId
) {
}