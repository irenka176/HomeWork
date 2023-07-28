import java.util.Date;

public class Main {

    private static Product[] getProducts() {
        Product[] products;
        products = new Product[50];
        for (int i = 0; i < products.length; i++) {
            products[i] = new Product();
            if (i % 2 == 0)
                products[i].type = "Book";
            else
                products[i].type = "Magazine";
            products[i].price = 20 + 10 * i;
            products[i].createDate = Date.from(new Date().toInstant().plusSeconds(-i * 10000));
        }
        for (int i = 0; i < products.length; i++) {
            products[i].discount = i % 3 == 0;
        }
        return products;
    }

    public static void main(String[] args) {
        Product[] products = getProducts();
        System.out.println("Products with price greater than 250");
        ProductHandling.getDiscountedProducts(products, "Book", 250)
                .forEach(product -> System.out.println(product.type + " " + product.price));
        System.out.println("Products with min price");
        var productWithMinPrice = ProductHandling.getProductWithMinPrice(products, "Book");
        System.out.println(productWithMinPrice.type + " " + productWithMinPrice.price);
        System.out.println("Last 3 products");
        var lastProducts = ProductHandling.getLastProducts(products, 3);
        lastProducts.forEach(product -> System.out.println(product.type + " " + product.price + " " + product.createDate));
        System.out.println("Sum of prices");
        var sum = ProductHandling.getProductSum(products, "Book", 75);
        System.out.println(sum);
    }
}