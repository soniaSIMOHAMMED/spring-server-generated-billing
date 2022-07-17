package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OperationResponseInvoice
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-17T18:52:47.864Z[GMT]")


public class OperationResponseInvoice   {
  @JsonProperty("invoiceRef")
  private String invoiceRef = null;

  @JsonProperty("createdAt")
  private LocalDate createdAt = null;

  public OperationResponseInvoice invoiceRef(String invoiceRef) {
    this.invoiceRef = invoiceRef;
    return this;
  }

  /**
   * Get invoiceRef
   * @return invoiceRef
   **/
  @Schema(description = "")
  
    public String getInvoiceRef() {
    return invoiceRef;
  }

  public void setInvoiceRef(String invoiceRef) {
    this.invoiceRef = invoiceRef;
  }

  public OperationResponseInvoice createdAt(LocalDate createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationResponseInvoice operationResponseInvoice = (OperationResponseInvoice) o;
    return Objects.equals(this.invoiceRef, operationResponseInvoice.invoiceRef) &&
        Objects.equals(this.createdAt, operationResponseInvoice.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceRef, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationResponseInvoice {\n");
    
    sb.append("    invoiceRef: ").append(toIndentedString(invoiceRef)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
