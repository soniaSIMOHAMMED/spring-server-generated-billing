/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.34).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ErrorResponse;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.Invoice;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-17T18:52:47.864Z[GMT]")
@Validated
public interface InvoicesApi {

    @Operation(summary = "", description = "Returns a list of Invoices", security = {
        @SecurityRequirement(name = "ApiKey"),
@SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write",
"admin"        })    }, tags={ "PHASE 2", "Invoices" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully returned a list of Invoices", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse2001.class))),
        
        @ApiResponse(responseCode = "401", description = "ERROR - Not authenticated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "ERROR - Access token does not have the required scope", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "500", description = "ERROR - Internal Server error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/invoices",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse2001> invoicesGet(@Parameter(in = ParameterIn.QUERY, description = "External identifier of subscription" ,schema=@Schema()) @Valid @RequestParam(value = "subscriptionId", required = false) String subscriptionId, @Parameter(in = ParameterIn.QUERY, description = "External identifier of the deferred billing contract for the customer" ,schema=@Schema()) @Valid @RequestParam(value = "contractRef", required = false) String contractRef, @Parameter(in = ParameterIn.QUERY, description = "External identifier of the buyer" ,schema=@Schema()) @Valid @RequestParam(value = "customerRef", required = false) String customerRef, @Parameter(in = ParameterIn.QUERY, description = "IDExternal identifier of the Customer's contact" ,schema=@Schema()) @Valid @RequestParam(value = "contactRef", required = false) String contactRef, @Parameter(in = ParameterIn.QUERY, description = "Limits the number of items on a page" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit, @Parameter(in = ParameterIn.QUERY, description = "Specifies the page number of the list to be displayed" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset);


    @Operation(summary = "", description = "Returns an invoice", security = {
        @SecurityRequirement(name = "ApiKey"),
@SecurityRequirement(name = "OAuth2", scopes = {
            "read",
"write",
"admin"        })    }, tags={ "PHASE 2", "Invoices" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully returned a list of invoices", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Invoice.class))),
        
        @ApiResponse(responseCode = "401", description = "ERROR - Not authenticated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "403", description = "ERROR - Access token does not have the required scope", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))),
        
        @ApiResponse(responseCode = "500", description = "ERROR - Internal Server error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))) })
    @RequestMapping(value = "/invoices/{invoiceRef}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Invoice> invoicesInvoiceRefGet(@Parameter(in = ParameterIn.PATH, description = "External identifier of the invoice", required=true, schema=@Schema()) @PathVariable("invoiceRef") String invoiceRef);

}

