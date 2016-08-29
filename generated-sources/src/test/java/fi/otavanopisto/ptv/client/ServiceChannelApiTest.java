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


package fi.otavanopisto.ptv.client;

import fi.otavanopisto.ptv.ApiException;
import fi.otavanopisto.ptv.client.model.IVmError;
import fi.otavanopisto.ptv.client.model.VmOpenApiServiceChannels;
import fi.otavanopisto.ptv.client.model.VmOpenApiElectronicChannelIn;
import fi.otavanopisto.ptv.client.model.VmOpenApiGuidPage;
import java.time.OffsetDateTime;
import fi.otavanopisto.ptv.client.model.VmOpenApiPhoneChannelIn;
import fi.otavanopisto.ptv.client.model.VmOpenApiPrintableFormChannelIn;
import fi.otavanopisto.ptv.client.model.VmOpenApiServiceLocationChannelIn;
import fi.otavanopisto.ptv.client.model.VmOpenApiWebPageChannelIn;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ServiceChannelApi
 */
public class ServiceChannelApiTest {

    private final ServiceChannelApi api = new ServiceChannelApi();

    
    /**
     * Fetches all the information related to a single service channel.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiServiceChannelByIdGetTest() throws ApiException {
        String id = null;
        // VmOpenApiServiceChannels response = api.apiServiceChannelByIdGet(id);

        // TODO: test validations
    }
    
    /**
     * Creates a new electronic channel with the data provided as input.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiServiceChannelEChannelPostTest() throws ApiException {
        VmOpenApiElectronicChannelIn request = null;
        // VmOpenApiElectronicChannelIn response = api.apiServiceChannelEChannelPost(request);

        // TODO: test validations
    }
    
    /**
     * Gets all published service channels within PTV as a list of service channel ids.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiServiceChannelGetTest() throws ApiException {
        OffsetDateTime date = null;
        Integer page = null;
        // VmOpenApiGuidPage response = api.apiServiceChannelGet(date, page);

        // TODO: test validations
    }
    
    /**
     * Gets a list of published service channels for defined organization.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiServiceChannelOrganizationByOrganizationIdGetTest() throws ApiException {
        String organizationId = null;
        OffsetDateTime date = null;
        // List<VmOpenApiServiceChannels> response = api.apiServiceChannelOrganizationByOrganizationIdGet(organizationId, date);

        // TODO: test validations
    }
    
    /**
     * Gets a list of certain type of published service channels for defined organization.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiServiceChannelOrganizationByOrganizationIdTypeByTypeGetTest() throws ApiException {
        String organizationId = null;
        String type = null;
        OffsetDateTime date = null;
        // List<VmOpenApiServiceChannels> response = api.apiServiceChannelOrganizationByOrganizationIdTypeByTypeGet(organizationId, type, date);

        // TODO: test validations
    }
    
    /**
     * Creates a new phone channel with the data provided as input.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiServiceChannelPhonePostTest() throws ApiException {
        VmOpenApiPhoneChannelIn request = null;
        // VmOpenApiPhoneChannelIn response = api.apiServiceChannelPhonePost(request);

        // TODO: test validations
    }
    
    /**
     * Creates a new printable form channel with the data provided as input.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiServiceChannelPrintableFormPostTest() throws ApiException {
        VmOpenApiPrintableFormChannelIn request = null;
        // VmOpenApiPrintableFormChannelIn response = api.apiServiceChannelPrintableFormPost(request);

        // TODO: test validations
    }
    
    /**
     * Creates a new service location channel with the data provided as input.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiServiceChannelServiceLocationPostTest() throws ApiException {
        VmOpenApiServiceLocationChannelIn request = null;
        // VmOpenApiServiceLocationChannelIn response = api.apiServiceChannelServiceLocationPost(request);

        // TODO: test validations
    }
    
    /**
     * Gets a list of certain type of published service channels.              Service channels created/modified after certain date can be fetched by adding date as query string parameter.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiServiceChannelTypeByTypeGetTest() throws ApiException {
        String type = null;
        OffsetDateTime date = null;
        // List<VmOpenApiServiceChannels> response = api.apiServiceChannelTypeByTypeGet(type, date);

        // TODO: test validations
    }
    
    /**
     * Creates a new web page channel with the data provided as input.
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiServiceChannelWebPagePostTest() throws ApiException {
        VmOpenApiWebPageChannelIn request = null;
        // VmOpenApiWebPageChannelIn response = api.apiServiceChannelWebPagePost(request);

        // TODO: test validations
    }
    
}
