package reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import reggie.entity.ShoppingCart;
import reggie.mapper.ShoppingCartMapper;
import reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
