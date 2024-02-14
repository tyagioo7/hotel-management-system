package com.mytestproject.testartifact.impl;
import com.mytestproject.testartifact.Enums.FoodPrice;
import com.mytestproject.testartifact.api.implInterfaceOne;
import com.mytestproject.testartifact.models.OrderDetails;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

@Component
public class implementation implements implInterfaceOne {

    @Override
    public Response getOrderResponse(String item, int quantity) {
        try {
            if(item==null||item.isEmpty()){
                throw new Exception("item is empty!");
            }
            OrderDetails orderDetails = new OrderDetails();
            double total_price = FoodPrice.valueOf(item.toUpperCase()).mvalue*quantity;
            orderDetails.setAmount(total_price);
            orderDetails.setItem(item);
            orderDetails.setQuantity(quantity);
            Response response = Response
                    .status(Response.Status.OK)
                    .entity(orderDetails)
                    .build();
            return response;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity(e.getMessage())
                    .build();
        }
    }
}
