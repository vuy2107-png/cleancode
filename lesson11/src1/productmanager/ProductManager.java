package productmanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private List<Product> productList = new ArrayList<>();

    // Thêm sản phẩm
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Sửa sản phẩm theo id
    public void editProduct(int id, String newName, double newPrice) {
        for (Product p : productList) {
            if (p.getId() == id) {
                p.setName(newName);
                p.setPrice(newPrice);
                System.out.println("Đã sửa sản phẩm có id " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có id " + id);
    }

    // Xóa sản phẩm theo id
    public void deleteProduct(int id) {
        Product productToRemove = null;
        for (Product p : productList) {
            if (p.getId() == id) {
                productToRemove = p;
                break;
            }
        }
        if (productToRemove != null) {
            productList.remove(productToRemove);
            System.out.println("Đã xóa sản phẩm có id " + id);
        } else {
            System.out.println("Không tìm thấy sản phẩm có id " + id);
        }
    }

    // Hiển thị danh sách sản phẩm
    public void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            for (Product p : productList) {
                System.out.println(p);
            }
        }
    }

    // Tìm kiếm sản phẩm theo tên
    public void searchByName(String name) {
        boolean found = false;
        for (Product p : productList) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm nào có tên chứa: " + name);
        }
    }

    // Sắp xếp tăng dần theo giá
    public void sortByPriceAscending() {
        productList.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("Đã sắp xếp tăng dần theo giá!");
    }

    // Sắp xếp giảm dần theo giá
    public void sortByPriceDescending() {
        productList.sort(Comparator.comparingDouble(Product::getPrice).reversed());
        System.out.println("Đã sắp xếp giảm dần theo giá!");
    }
}
