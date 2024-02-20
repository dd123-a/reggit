package reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import reggie.entity.OrderDetail;
import reggie.mapper.OrderDetailMapper;
import reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}