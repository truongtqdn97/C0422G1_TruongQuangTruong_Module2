package ss12.bai_tap.util;

import ss12.bai_tap.model.Product;

import java.util.Comparator;

public class ProductSortDescending extends Product implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
