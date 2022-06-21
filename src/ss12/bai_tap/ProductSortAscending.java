package ss12.bai_tap;

import java.util.Comparator;

public class ProductSortAscending extends Product implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice() - o2.getPrice();
    }
}
