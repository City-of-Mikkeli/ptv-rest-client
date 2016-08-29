/**
 * PTV Open Api
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fi.otavanopisto.ptv.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import fi.otavanopisto.ptv.client.model.VmOpenApiLanguageItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiServiceHour
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T14:14:11.100+03:00")
public class VmOpenApiServiceHour   {
  @JsonProperty("serviceHourType")
  private String serviceHourType = null;

  @JsonProperty("exceptionHourType")
  private String exceptionHourType = null;

  @JsonProperty("validFrom")
  private OffsetDateTime validFrom = null;

  @JsonProperty("validTo")
  private OffsetDateTime validTo = null;

  @JsonProperty("monday")
  private Boolean monday = null;

  @JsonProperty("tuesday")
  private Boolean tuesday = null;

  @JsonProperty("wednesday")
  private Boolean wednesday = null;

  @JsonProperty("thursday")
  private Boolean thursday = null;

  @JsonProperty("friday")
  private Boolean friday = null;

  @JsonProperty("saturday")
  private Boolean saturday = null;

  @JsonProperty("sunday")
  private Boolean sunday = null;

  @JsonProperty("opens")
  private String opens = null;

  @JsonProperty("closes")
  private String closes = null;

  @JsonProperty("additionalInformation")
  private List<VmOpenApiLanguageItem> additionalInformation = new ArrayList<VmOpenApiLanguageItem>();

  public VmOpenApiServiceHour serviceHourType(String serviceHourType) {
    this.serviceHourType = serviceHourType;
    return this;
  }

   /**
   * Get serviceHourType
   * @return serviceHourType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getServiceHourType() {
    return serviceHourType;
  }

  public void setServiceHourType(String serviceHourType) {
    this.serviceHourType = serviceHourType;
  }

  public VmOpenApiServiceHour exceptionHourType(String exceptionHourType) {
    this.exceptionHourType = exceptionHourType;
    return this;
  }

   /**
   * Get exceptionHourType
   * @return exceptionHourType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExceptionHourType() {
    return exceptionHourType;
  }

  public void setExceptionHourType(String exceptionHourType) {
    this.exceptionHourType = exceptionHourType;
  }

  public VmOpenApiServiceHour validFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Get validFrom
   * @return validFrom
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }

  public VmOpenApiServiceHour validTo(OffsetDateTime validTo) {
    this.validTo = validTo;
    return this;
  }

   /**
   * Get validTo
   * @return validTo
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getValidTo() {
    return validTo;
  }

  public void setValidTo(OffsetDateTime validTo) {
    this.validTo = validTo;
  }

  public VmOpenApiServiceHour monday(Boolean monday) {
    this.monday = monday;
    return this;
  }

   /**
   * Get monday
   * @return monday
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMonday() {
    return monday;
  }

  public void setMonday(Boolean monday) {
    this.monday = monday;
  }

  public VmOpenApiServiceHour tuesday(Boolean tuesday) {
    this.tuesday = tuesday;
    return this;
  }

   /**
   * Get tuesday
   * @return tuesday
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getTuesday() {
    return tuesday;
  }

  public void setTuesday(Boolean tuesday) {
    this.tuesday = tuesday;
  }

  public VmOpenApiServiceHour wednesday(Boolean wednesday) {
    this.wednesday = wednesday;
    return this;
  }

   /**
   * Get wednesday
   * @return wednesday
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getWednesday() {
    return wednesday;
  }

  public void setWednesday(Boolean wednesday) {
    this.wednesday = wednesday;
  }

  public VmOpenApiServiceHour thursday(Boolean thursday) {
    this.thursday = thursday;
    return this;
  }

   /**
   * Get thursday
   * @return thursday
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getThursday() {
    return thursday;
  }

  public void setThursday(Boolean thursday) {
    this.thursday = thursday;
  }

  public VmOpenApiServiceHour friday(Boolean friday) {
    this.friday = friday;
    return this;
  }

   /**
   * Get friday
   * @return friday
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getFriday() {
    return friday;
  }

  public void setFriday(Boolean friday) {
    this.friday = friday;
  }

  public VmOpenApiServiceHour saturday(Boolean saturday) {
    this.saturday = saturday;
    return this;
  }

   /**
   * Get saturday
   * @return saturday
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSaturday() {
    return saturday;
  }

  public void setSaturday(Boolean saturday) {
    this.saturday = saturday;
  }

  public VmOpenApiServiceHour sunday(Boolean sunday) {
    this.sunday = sunday;
    return this;
  }

   /**
   * Get sunday
   * @return sunday
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSunday() {
    return sunday;
  }

  public void setSunday(Boolean sunday) {
    this.sunday = sunday;
  }

  public VmOpenApiServiceHour opens(String opens) {
    this.opens = opens;
    return this;
  }

   /**
   * Get opens
   * @return opens
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOpens() {
    return opens;
  }

  public void setOpens(String opens) {
    this.opens = opens;
  }

  public VmOpenApiServiceHour closes(String closes) {
    this.closes = closes;
    return this;
  }

   /**
   * Get closes
   * @return closes
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCloses() {
    return closes;
  }

  public void setCloses(String closes) {
    this.closes = closes;
  }

  public VmOpenApiServiceHour additionalInformation(List<VmOpenApiLanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
    return this;
  }

  public VmOpenApiServiceHour addAdditionalInformationItem(VmOpenApiLanguageItem additionalInformationItem) {
    this.additionalInformation.add(additionalInformationItem);
    return this;
  }

   /**
   * Get additionalInformation
   * @return additionalInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLanguageItem> getAdditionalInformation() {
    return additionalInformation;
  }

  public void setAdditionalInformation(List<VmOpenApiLanguageItem> additionalInformation) {
    this.additionalInformation = additionalInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiServiceHour vmOpenApiServiceHour = (VmOpenApiServiceHour) o;
    return Objects.equals(this.serviceHourType, vmOpenApiServiceHour.serviceHourType) &&
        Objects.equals(this.exceptionHourType, vmOpenApiServiceHour.exceptionHourType) &&
        Objects.equals(this.validFrom, vmOpenApiServiceHour.validFrom) &&
        Objects.equals(this.validTo, vmOpenApiServiceHour.validTo) &&
        Objects.equals(this.monday, vmOpenApiServiceHour.monday) &&
        Objects.equals(this.tuesday, vmOpenApiServiceHour.tuesday) &&
        Objects.equals(this.wednesday, vmOpenApiServiceHour.wednesday) &&
        Objects.equals(this.thursday, vmOpenApiServiceHour.thursday) &&
        Objects.equals(this.friday, vmOpenApiServiceHour.friday) &&
        Objects.equals(this.saturday, vmOpenApiServiceHour.saturday) &&
        Objects.equals(this.sunday, vmOpenApiServiceHour.sunday) &&
        Objects.equals(this.opens, vmOpenApiServiceHour.opens) &&
        Objects.equals(this.closes, vmOpenApiServiceHour.closes) &&
        Objects.equals(this.additionalInformation, vmOpenApiServiceHour.additionalInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceHourType, exceptionHourType, validFrom, validTo, monday, tuesday, wednesday, thursday, friday, saturday, sunday, opens, closes, additionalInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiServiceHour {\n");
    
    sb.append("    serviceHourType: ").append(toIndentedString(serviceHourType)).append("\n");
    sb.append("    exceptionHourType: ").append(toIndentedString(exceptionHourType)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
    sb.append("    monday: ").append(toIndentedString(monday)).append("\n");
    sb.append("    tuesday: ").append(toIndentedString(tuesday)).append("\n");
    sb.append("    wednesday: ").append(toIndentedString(wednesday)).append("\n");
    sb.append("    thursday: ").append(toIndentedString(thursday)).append("\n");
    sb.append("    friday: ").append(toIndentedString(friday)).append("\n");
    sb.append("    saturday: ").append(toIndentedString(saturday)).append("\n");
    sb.append("    sunday: ").append(toIndentedString(sunday)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    closes: ").append(toIndentedString(closes)).append("\n");
    sb.append("    additionalInformation: ").append(toIndentedString(additionalInformation)).append("\n");
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

