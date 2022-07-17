package io.swagger.api;

import io.swagger.model.ErrorResponse;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.Invoice;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-17T18:52:47.864Z[GMT]")
@RestController
public class InvoicesApiController implements InvoicesApi {

    private static final Logger log = LoggerFactory.getLogger(InvoicesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InvoicesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse2001> invoicesGet(@Parameter(in = ParameterIn.QUERY, description = "External identifier of subscription" ,schema=@Schema()) @Valid @RequestParam(value = "subscriptionId", required = false) String subscriptionId,@Parameter(in = ParameterIn.QUERY, description = "External identifier of the deferred billing contract for the customer" ,schema=@Schema()) @Valid @RequestParam(value = "contractRef", required = false) String contractRef,@Parameter(in = ParameterIn.QUERY, description = "External identifier of the buyer" ,schema=@Schema()) @Valid @RequestParam(value = "customerRef", required = false) String customerRef,@Parameter(in = ParameterIn.QUERY, description = "IDExternal identifier of the Customer's contact" ,schema=@Schema()) @Valid @RequestParam(value = "contactRef", required = false) String contactRef,@Parameter(in = ParameterIn.QUERY, description = "Limits the number of items on a page" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit,@Parameter(in = ParameterIn.QUERY, description = "Specifies the page number of the list to be displayed" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse2001>(objectMapper.readValue("{\n  \"invoices\" : [ {\n    \"operations\" : [ {\n      \"$ref\" : \"#/components/examples/OperationResponse\"\n    }, {\n      \"$ref\" : \"#/components/examples/OperationResponse\"\n    } ],\n    \"invoiceId\" : \"invoiceId\",\n    \"subscription\" : {\n      \"SubscriptionRequest\" : {\n        \"$ref\" : \"#/components/examples/SubscriptionRequest\"\n      }\n    }\n  }, {\n    \"operations\" : [ {\n      \"$ref\" : \"#/components/examples/OperationResponse\"\n    }, {\n      \"$ref\" : \"#/components/examples/OperationResponse\"\n    } ],\n    \"invoiceId\" : \"invoiceId\",\n    \"subscription\" : {\n      \"SubscriptionRequest\" : {\n        \"$ref\" : \"#/components/examples/SubscriptionRequest\"\n      }\n    }\n  } ]\n}", InlineResponse2001.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse2001>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Invoice> invoicesInvoiceRefGet(@Parameter(in = ParameterIn.PATH, description = "External identifier of the invoice", required=true, schema=@Schema()) @PathVariable("invoiceRef") String invoiceRef) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Invoice>(objectMapper.readValue("{\n  \"operations\" : [ {\n    \"$ref\" : \"#/components/examples/OperationResponse\"\n  }, {\n    \"$ref\" : \"#/components/examples/OperationResponse\"\n  } ],\n  \"invoiceId\" : \"invoiceId\",\n  \"subscription\" : {\n    \"SubscriptionRequest\" : {\n      \"$ref\" : \"#/components/examples/SubscriptionRequest\"\n    }\n  }\n}", Invoice.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Invoice>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Invoice>(HttpStatus.NOT_IMPLEMENTED);
    }

}
