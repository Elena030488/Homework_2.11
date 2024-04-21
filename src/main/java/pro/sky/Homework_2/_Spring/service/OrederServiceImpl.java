package pro.sky.Homework_2._Spring.service;

import org.springframework.stereotype.Service;
import pro.sky.Homework_2._Spring.model.Cart;

import java.util.List;

@Service
public class OrederServiceImpl implements OrderService{
    private final Cart cart;

    public OrederServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItems(List<Integer> id) {
        return cart.addItems(id);
    }

    @Override
    public List<Integer> getItems() {
        return cart.getItems();
    }
}
