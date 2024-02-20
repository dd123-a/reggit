package reggie.dto;

import reggie.entity.OrderDetail;
import reggie.entity.Orders;
import lombok.Data;
import reggie.entity.OrderDetail;

import java.util.List;

@Data
public class OrdersDto extends Orders {

    private String userName;

    private String phone;

    private String address;

    private String consignee;

    private List<OrderDetail> orderDetails;
	
}
