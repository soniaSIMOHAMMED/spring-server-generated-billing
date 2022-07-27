package io.swagger.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.threeten.bp.LocalDate;

@Data
public class ContractEvent {
    @JsonProperty("contractType")
    private String contractType = null;

    @JsonProperty("createdAt")
    private String createdAt = null;

    @JsonProperty("signedAt")
    private String signedAt = null;

    @JsonProperty("activatedAt")
    private String activatedAt = null;

    @JsonProperty("expireAt")
    private String expireAt = null;

    @JsonProperty("status")
    private String status = null;
}
