package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Necessary for e-Invoicing &amp; e-Reporting
 */
@Schema(description = "Necessary for e-Invoicing & e-Reporting")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-17T18:52:47.864Z[GMT]")


public class BusinessSellerEFacturation   {
  @JsonProperty("siren")
  private String siren = null;

  @JsonProperty("tvaIntracommunautaire")
  private String tvaIntracommunautaire = null;

  @JsonProperty("country")
  private String country = null;

  public BusinessSellerEFacturation siren(String siren) {
    this.siren = siren;
    return this;
  }

  /**
   * Get siren
   * @return siren
   **/
  @Schema(example = "356000000", description = "")
  
    public String getSiren() {
    return siren;
  }

  public void setSiren(String siren) {
    this.siren = siren;
  }

  public BusinessSellerEFacturation tvaIntracommunautaire(String tvaIntracommunautaire) {
    this.tvaIntracommunautaire = tvaIntracommunautaire;
    return this;
  }

  /**
   * Get tvaIntracommunautaire
   * @return tvaIntracommunautaire
   **/
  @Schema(example = "FR39356000000", description = "")
  
    public String getTvaIntracommunautaire() {
    return tvaIntracommunautaire;
  }

  public void setTvaIntracommunautaire(String tvaIntracommunautaire) {
    this.tvaIntracommunautaire = tvaIntracommunautaire;
  }

  public BusinessSellerEFacturation country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   **/
  @Schema(example = "FRANCE", description = "")
  
    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessSellerEFacturation businessSellerEFacturation = (BusinessSellerEFacturation) o;
    return Objects.equals(this.siren, businessSellerEFacturation.siren) &&
        Objects.equals(this.tvaIntracommunautaire, businessSellerEFacturation.tvaIntracommunautaire) &&
        Objects.equals(this.country, businessSellerEFacturation.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(siren, tvaIntracommunautaire, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessSellerEFacturation {\n");
    
    sb.append("    siren: ").append(toIndentedString(siren)).append("\n");
    sb.append("    tvaIntracommunautaire: ").append(toIndentedString(tvaIntracommunautaire)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
