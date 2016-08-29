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
import fi.otavanopisto.ptv.client.model.VmOpenApiAttachmentWithType;
import fi.otavanopisto.ptv.client.model.VmOpenApiLanguageItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiServiceHour;
import fi.otavanopisto.ptv.client.model.VmOpenApiSupport;
import fi.otavanopisto.ptv.client.model.VmOpenApiWebPage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiElectronicChannel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T14:14:11.100+03:00")
public class VmOpenApiElectronicChannel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("serviceChannelType")
  private String serviceChannelType = null;

  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("serviceChannelNames")
  private List<VmOpenApiLocalizedListItem> serviceChannelNames = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("serviceChannelDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceChannelDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("webPages")
  private List<VmOpenApiWebPage> webPages = new ArrayList<VmOpenApiWebPage>();

  @JsonProperty("serviceHours")
  private List<VmOpenApiServiceHour> serviceHours = new ArrayList<VmOpenApiServiceHour>();

  @JsonProperty("supportContacts")
  private List<VmOpenApiSupport> supportContacts = new ArrayList<VmOpenApiSupport>();

  @JsonProperty("signatureQuantity")
  private Integer signatureQuantity = null;

  @JsonProperty("requiresSignature")
  private Boolean requiresSignature = null;

  @JsonProperty("requiresAuthentication")
  private Boolean requiresAuthentication = null;

  @JsonProperty("urls")
  private List<VmOpenApiLanguageItem> urls = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("attachments")
  private List<VmOpenApiAttachmentWithType> attachments = new ArrayList<VmOpenApiAttachmentWithType>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public VmOpenApiElectronicChannel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VmOpenApiElectronicChannel serviceChannelType(String serviceChannelType) {
    this.serviceChannelType = serviceChannelType;
    return this;
  }

   /**
   * Get serviceChannelType
   * @return serviceChannelType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getServiceChannelType() {
    return serviceChannelType;
  }

  public void setServiceChannelType(String serviceChannelType) {
    this.serviceChannelType = serviceChannelType;
  }

  public VmOpenApiElectronicChannel organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public VmOpenApiElectronicChannel serviceChannelNames(List<VmOpenApiLocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public VmOpenApiElectronicChannel addServiceChannelNamesItem(VmOpenApiLocalizedListItem serviceChannelNamesItem) {
    this.serviceChannelNames.add(serviceChannelNamesItem);
    return this;
  }

   /**
   * Get serviceChannelNames
   * @return serviceChannelNames
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLocalizedListItem> getServiceChannelNames() {
    return serviceChannelNames;
  }

  public void setServiceChannelNames(List<VmOpenApiLocalizedListItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  public VmOpenApiElectronicChannel serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public VmOpenApiElectronicChannel addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
    this.serviceChannelDescriptions.add(serviceChannelDescriptionsItem);
    return this;
  }

   /**
   * Get serviceChannelDescriptions
   * @return serviceChannelDescriptions
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<VmOpenApiLocalizedListItem> getServiceChannelDescriptions() {
    return serviceChannelDescriptions;
  }

  public void setServiceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
  }

  public VmOpenApiElectronicChannel webPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
    return this;
  }

  public VmOpenApiElectronicChannel addWebPagesItem(VmOpenApiWebPage webPagesItem) {
    this.webPages.add(webPagesItem);
    return this;
  }

   /**
   * Get webPages
   * @return webPages
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiWebPage> getWebPages() {
    return webPages;
  }

  public void setWebPages(List<VmOpenApiWebPage> webPages) {
    this.webPages = webPages;
  }

  public VmOpenApiElectronicChannel serviceHours(List<VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
    return this;
  }

  public VmOpenApiElectronicChannel addServiceHoursItem(VmOpenApiServiceHour serviceHoursItem) {
    this.serviceHours.add(serviceHoursItem);
    return this;
  }

   /**
   * Get serviceHours
   * @return serviceHours
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiServiceHour> getServiceHours() {
    return serviceHours;
  }

  public void setServiceHours(List<VmOpenApiServiceHour> serviceHours) {
    this.serviceHours = serviceHours;
  }

  public VmOpenApiElectronicChannel supportContacts(List<VmOpenApiSupport> supportContacts) {
    this.supportContacts = supportContacts;
    return this;
  }

  public VmOpenApiElectronicChannel addSupportContactsItem(VmOpenApiSupport supportContactsItem) {
    this.supportContacts.add(supportContactsItem);
    return this;
  }

   /**
   * Get supportContacts
   * @return supportContacts
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiSupport> getSupportContacts() {
    return supportContacts;
  }

  public void setSupportContacts(List<VmOpenApiSupport> supportContacts) {
    this.supportContacts = supportContacts;
  }

  public VmOpenApiElectronicChannel signatureQuantity(Integer signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
    return this;
  }

   /**
   * Get signatureQuantity
   * @return signatureQuantity
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSignatureQuantity() {
    return signatureQuantity;
  }

  public void setSignatureQuantity(Integer signatureQuantity) {
    this.signatureQuantity = signatureQuantity;
  }

  public VmOpenApiElectronicChannel requiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
    return this;
  }

   /**
   * Get requiresSignature
   * @return requiresSignature
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRequiresSignature() {
    return requiresSignature;
  }

  public void setRequiresSignature(Boolean requiresSignature) {
    this.requiresSignature = requiresSignature;
  }

  public VmOpenApiElectronicChannel requiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
    return this;
  }

   /**
   * Get requiresAuthentication
   * @return requiresAuthentication
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRequiresAuthentication() {
    return requiresAuthentication;
  }

  public void setRequiresAuthentication(Boolean requiresAuthentication) {
    this.requiresAuthentication = requiresAuthentication;
  }

  public VmOpenApiElectronicChannel urls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
    return this;
  }

  public VmOpenApiElectronicChannel addUrlsItem(VmOpenApiLanguageItem urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiLanguageItem> getUrls() {
    return urls;
  }

  public void setUrls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
  }

  public VmOpenApiElectronicChannel attachments(List<VmOpenApiAttachmentWithType> attachments) {
    this.attachments = attachments;
    return this;
  }

  public VmOpenApiElectronicChannel addAttachmentsItem(VmOpenApiAttachmentWithType attachmentsItem) {
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<VmOpenApiAttachmentWithType> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<VmOpenApiAttachmentWithType> attachments) {
    this.attachments = attachments;
  }

  public VmOpenApiElectronicChannel publishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
    return this;
  }

   /**
   * Get publishingStatus
   * @return publishingStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getPublishingStatus() {
    return publishingStatus;
  }

  public void setPublishingStatus(String publishingStatus) {
    this.publishingStatus = publishingStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiElectronicChannel vmOpenApiElectronicChannel = (VmOpenApiElectronicChannel) o;
    return Objects.equals(this.id, vmOpenApiElectronicChannel.id) &&
        Objects.equals(this.serviceChannelType, vmOpenApiElectronicChannel.serviceChannelType) &&
        Objects.equals(this.organizationId, vmOpenApiElectronicChannel.organizationId) &&
        Objects.equals(this.serviceChannelNames, vmOpenApiElectronicChannel.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, vmOpenApiElectronicChannel.serviceChannelDescriptions) &&
        Objects.equals(this.webPages, vmOpenApiElectronicChannel.webPages) &&
        Objects.equals(this.serviceHours, vmOpenApiElectronicChannel.serviceHours) &&
        Objects.equals(this.supportContacts, vmOpenApiElectronicChannel.supportContacts) &&
        Objects.equals(this.signatureQuantity, vmOpenApiElectronicChannel.signatureQuantity) &&
        Objects.equals(this.requiresSignature, vmOpenApiElectronicChannel.requiresSignature) &&
        Objects.equals(this.requiresAuthentication, vmOpenApiElectronicChannel.requiresAuthentication) &&
        Objects.equals(this.urls, vmOpenApiElectronicChannel.urls) &&
        Objects.equals(this.attachments, vmOpenApiElectronicChannel.attachments) &&
        Objects.equals(this.publishingStatus, vmOpenApiElectronicChannel.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serviceChannelType, organizationId, serviceChannelNames, serviceChannelDescriptions, webPages, serviceHours, supportContacts, signatureQuantity, requiresSignature, requiresAuthentication, urls, attachments, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiElectronicChannel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceChannelType: ").append(toIndentedString(serviceChannelType)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    webPages: ").append(toIndentedString(webPages)).append("\n");
    sb.append("    serviceHours: ").append(toIndentedString(serviceHours)).append("\n");
    sb.append("    supportContacts: ").append(toIndentedString(supportContacts)).append("\n");
    sb.append("    signatureQuantity: ").append(toIndentedString(signatureQuantity)).append("\n");
    sb.append("    requiresSignature: ").append(toIndentedString(requiresSignature)).append("\n");
    sb.append("    requiresAuthentication: ").append(toIndentedString(requiresAuthentication)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    publishingStatus: ").append(toIndentedString(publishingStatus)).append("\n");
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

