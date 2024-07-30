import java.util.Arrays;

public class BinarySearch {
    public static Product binarySearch(Product[] products, String target) {
        Arrays.sort(products, (p1, p2) -> p1.getProductName().compareTo(p2.getProductName())); // Ensure the array is sorted

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Product midProduct = products[mid];

            int comparison = midProduct.getProductName().compareTo(target);
            if (comparison == 0) {
                return midProduct;
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
