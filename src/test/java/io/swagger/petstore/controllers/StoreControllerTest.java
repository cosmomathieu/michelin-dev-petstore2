/*
 * SwaggerPetstoreOpenAPI30Lib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.swagger.petstore.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import io.apimatic.core.utilities.TestHelper;
import io.swagger.petstore.DateTimeHelper;
import io.swagger.petstore.SwaggerPetstoreOpenAPI30Client;
import io.swagger.petstore.exceptions.ApiException;
import io.swagger.petstore.models.StatusEnum;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class StoreControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static SwaggerPetstoreOpenAPI30Client client;
    
    /**
     * Controller instance (for all tests).
     */
    private static StoreController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getStoreController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * Returns a map of status codes to quantities.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestGetInventory() throws Exception {

        // Set callback and perform API call
        try {
            controller.getInventory();
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

    /**
     * Place a new order in the store.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestPlaceOrder() throws Exception {
        // Parameters for the API call
        Long id = 10L;
        Long petId = 198772L;
        Integer quantity = 7;
        LocalDateTime shipDate = null;
        StatusEnum status = null;
        Boolean complete = null;

        // Set callback and perform API call
        try {
            controller.placeOrder(id, petId, quantity, shipDate, status, complete);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

}
