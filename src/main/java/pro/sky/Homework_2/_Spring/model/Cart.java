package pro.sky.Homework_2._Spring.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private final List<Integer> items = new ArrayList<>();

    public List<Integer> addItems(List<Integer> id) {
        items.addAll(id);
        return items;
    }
    public List<Integer> getItems() {
        return items;
    }
}
