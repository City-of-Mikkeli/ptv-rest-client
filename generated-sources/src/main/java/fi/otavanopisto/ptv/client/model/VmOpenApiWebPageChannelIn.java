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
import fi.otavanopisto.ptv.client.model.VmOpenApiLocalizedListItem;
import fi.otavanopisto.ptv.client.model.VmOpenApiSupport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * VmOpenApiWebPageChannelIn
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T14:14:11.100+03:00")
public class VmOpenApiWebPageChannelIn   {
  @JsonProperty("organizationId")
  private String organizationId = null;

  @JsonProperty("serviceChannelNames")
  private List<VmOpenApiLanguageItem> serviceChannelNames = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("serviceChannelDescriptions")
  private List<VmOpenApiLocalizedListItem> serviceChannelDescriptions = new ArrayList<VmOpenApiLocalizedListItem>();

  @JsonProperty("urls")
  private List<VmOpenApiLanguageItem> urls = new ArrayList<VmOpenApiLanguageItem>();

  @JsonProperty("supportContacts")
  private List<VmOpenApiSupport> supportContacts = new ArrayList<VmOpenApiSupport>();

  @JsonProperty("languages")
  private List<String> languages = new ArrayList<String>();

  @JsonProperty("publishingStatus")
  private String publishingStatus = null;

  public VmOpenApiWebPageChannelIn organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * Get organizationId
   * @return organizationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public VmOpenApiWebPageChannelIn serviceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
    return this;
  }

  public VmOpenApiWebPageChannelIn addServiceChannelNamesItem(VmOpenApiLanguageItem serviceChannelNamesItem) {
    this.serviceChannelNames.add(serviceChannelNamesItem);
    return this;
  }

   /**
   * Get serviceChannelNames
   * @return serviceChannelNames
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<VmOpenApiLanguageItem> getServiceChannelNames() {
    return serviceChannelNames;
  }

  public void setServiceChannelNames(List<VmOpenApiLanguageItem> serviceChannelNames) {
    this.serviceChannelNames = serviceChannelNames;
  }

  public VmOpenApiWebPageChannelIn serviceChannelDescriptions(List<VmOpenApiLocalizedListItem> serviceChannelDescriptions) {
    this.serviceChannelDescriptions = serviceChannelDescriptions;
    return this;
  }

  public VmOpenApiWebPageChannelIn addServiceChannelDescriptionsItem(VmOpenApiLocalizedListItem serviceChannelDescriptionsItem) {
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

  public VmOpenApiWebPageChannelIn urls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
    return this;
  }

  public VmOpenApiWebPageChannelIn addUrlsItem(VmOpenApiLanguageItem urlsItem) {
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<VmOpenApiLanguageItem> getUrls() {
    return urls;
  }

  public void setUrls(List<VmOpenApiLanguageItem> urls) {
    this.urls = urls;
  }

  public VmOpenApiWebPageChannelIn supportContacts(List<VmOpenApiSupport> supportContacts) {
    this.supportContacts = supportContacts;
    return this;
  }

  public VmOpenApiWebPageChannelIn addSupportContactsItem(VmOpenApiSupport supportContactsItem) {
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

  public VmOpenApiWebPageChannelIn languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public VmOpenApiWebPageChannelIn addLanguagesItem(String languagesItem) {
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }

  public VmOpenApiWebPageChannelIn publishingStatus(String publishingStatus) {
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
    VmOpenApiWebPageChannelIn vmOpenApiWebPageChannelIn = (VmOpenApiWebPageChannelIn) o;
    return Objects.equals(this.organizationId, vmOpenApiWebPageChannelIn.organizationId) &&
        Objects.equals(this.serviceChannelNames, vmOpenApiWebPageChannelIn.serviceChannelNames) &&
        Objects.equals(this.serviceChannelDescriptions, vmOpenApiWebPageChannelIn.serviceChannelDescriptions) &&
        Objects.equals(this.urls, vmOpenApiWebPageChannelIn.urls) &&
        Objects.equals(this.supportContacts, vmOpenApiWebPageChannelIn.supportContacts) &&
        Objects.equals(this.languages, vmOpenApiWebPageChannelIn.languages) &&
        Objects.equals(this.publishingStatus, vmOpenApiWebPageChannelIn.publishingStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, serviceChannelNames, serviceChannelDescriptions, urls, supportContacts, languages, publishingStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiWebPageChannelIn {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    serviceChannelNames: ").append(toIndentedString(serviceChannelNames)).append("\n");
    sb.append("    serviceChannelDescriptions: ").append(toIndentedString(serviceChannelDescriptions)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    supportContacts: ").append(toIndentedString(supportContacts)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
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

