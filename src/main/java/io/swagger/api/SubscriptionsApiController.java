package io.swagger.api;

import io.swagger.model.SubscriptionRequest;
import io.swagger.model.SubscriptionResponse;
import io.swagger.model.SubscriptionsResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.service.SubscriptionService;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-17T18:52:47.864Z[GMT]")
@RestController
public class SubscriptionsApiController implements SubscriptionsApi {

    private static final Logger log = LoggerFactory.getLogger(SubscriptionsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final SubscriptionService subscriptionService;

    @org.springframework.beans.factory.annotation.Autowired
    public SubscriptionsApiController(ObjectMapper objectMapper, HttpServletRequest request, SubscriptionService subscriptionService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.subscriptionService = subscriptionService;
    }

    public ResponseEntity<SubscriptionResponse> getSubscription(@Parameter(in = ParameterIn.PATH, description = "External identifier of the subscription", required=true, schema=@Schema()) @PathVariable("subscriptionRef") String subscriptionRef) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SubscriptionResponse>(objectMapper.readValue("{\n  \"SubscriptionRequest\" : {\n    \"$ref\" : \"#/components/examples/SubscriptionRequest\"\n  }\n}", SubscriptionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SubscriptionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SubscriptionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public List<SubscriptionRequest> getSubscriptions() {

        return subscriptionService.getSubscriptions();
    }

    public ResponseEntity<SubscriptionResponse> patchSubscription(@Parameter(in = ParameterIn.PATH, description = "External identifier of the subscription", required=true, schema=@Schema()) @PathVariable("subscriptionRef") String subscriptionRef,@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody SubscriptionRequest body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SubscriptionResponse>(objectMapper.readValue("{\n  \"SubscriptionRequest\" : {\n    \"$ref\" : \"#/components/examples/SubscriptionRequest\"\n  }\n}", SubscriptionResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SubscriptionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SubscriptionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<SubscriptionRequest> postSubscription(@Parameter(in = ParameterIn.DEFAULT, description = "Request", schema=@Schema()) @RequestBody SubscriptionRequest body) throws IOException {
        //SubscriptionRequest subscriptionRequest = objectMapper.readValue(String.valueOf(body),SubscriptionRequest.class);
        return new ResponseEntity<>(subscriptionService.subscribe(body),HttpStatus.OK);
    }

    public ResponseEntity<SubscriptionsResponse> searchSubscriptions(@Parameter(in = ParameterIn.QUERY, description = "External identifier of the deferred billing contract for the customer" ,schema=@Schema()) @Valid @RequestParam(value = "contractRef", required = false) String contractRef,@Parameter(in = ParameterIn.QUERY, description = "External identifier of the buyer" ,schema=@Schema()) @Valid @RequestParam(value = "customerRef", required = false) String customerRef,@Parameter(in = ParameterIn.QUERY, description = "Contract Status" ,schema=@Schema()) @Valid @RequestParam(value = "contractStatus", required = false) String contractStatus,@Parameter(in = ParameterIn.QUERY, description = "Limits the number of items on a page" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit,@Parameter(in = ParameterIn.QUERY, description = "Specifies the page number of the list to be displayed" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SubscriptionsResponse>(objectMapper.readValue("{\n  \"SubscriptionsResponse\" : {\n    \"$ref\" : \"#/components/examples/SubscriptionsResponse\"\n  }\n}", SubscriptionsResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SubscriptionsResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<SubscriptionsResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
