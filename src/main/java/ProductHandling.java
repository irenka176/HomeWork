import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * ProductProcessing
 */
public class ProductHandling {
    /**
     * @param products list of products
     * @param price    price
     * @return list of discounted products which price is greater than price
     */
    public static ArrayList<Product> getDiscountedProducts(Product[] products, String type, float price) {
        if (products == null) {
            throw new NullPointerException("Products is null");
        }
        return Arrays.stream(products).filter(product -> product.price > price & Objects.equals(product.type, type))
                .collect(Collectors.toCollection(ArrayList::new));

    }

    /**
     * @param products list of products
     * @param type     type
     * @return product with min price
     */
    public static Product getProductWithMinPrice(Product[] products, String type) {
        AtomicReference<Product> response = null;
        if (products == null) {
            throw new NullPointerException("Products is null");
        }
        var minPrice = Arrays.stream(products).filter(product -> Objects.equals(product.type, type))
                .mapToDouble(product -> product.price).min().stream().findFirst().getAsDouble();
        var result = Arrays.stream(products)
                .filter(product -> product.price == minPrice).findFirst();
        if (result.isEmpty())
            throw new NullPointerException("Product " + type + " not found");
        return result.get();
    }

    /**
     * @param products list of products
     * @param count    count
     * @return list of last products
     */
    public static ArrayList<Product> getLastProducts(Product[] products, int count) {
        if (products == null) {
            throw new NullPointerException("Products is null");
        }
        return Arrays.stream(products).sorted(Comparator.comparing(product -> product.createDate))
                .limit(count).collect(Collectors.toCollection(ArrayList::new));
    }

    /**
     * @param products list of products
     * @param type     type
     * @param minPrice min price
     * @return sum of prices
     */
    public static float getProductSum(Product[] products, String type, float minPrice) {
        if (products == null) {
            throw new NullPointerException("Products is null");
        }
        var currentYear = GetYear(new Date());
        return (float) Arrays.stream(products).filter(product -> Objects.equals(product.type, type)
                        & (ProductHandling.GetYear(product.createDate) == currentYear)
                        & (product.price < minPrice))
                .mapToDouble(product -> product.price).summaryStatistics().getSum();
    }

    /**
     * @param date date
     * @return year
     */
    private static int GetYear(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }
}
