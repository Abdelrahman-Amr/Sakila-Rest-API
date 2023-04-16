package gov.iti.jets.controller;

import gov.iti.jets.dto.PaymentDto;
import gov.iti.jets.entity.Payment;
import gov.iti.jets.service.PaymentService;
import gov.iti.jets.service.RentalService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("payments")
public class PaymentController extends BaseControllerImpl<Payment, PaymentDto, Short>{
    private PaymentService paymentService;

    public PaymentController ()
    {
        paymentService = PaymentService.getInstance();
        baseService = paymentService;
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response update(@PathParam("id") Short id,  PaymentDto dto)
    {
        return  Response.serverError().status(Response.Status.BAD_REQUEST).entity("Payments can't be updated!!").build();
    }

}
