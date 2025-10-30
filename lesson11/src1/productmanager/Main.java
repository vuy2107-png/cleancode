package productmanager;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        // Thêm sản phẩm
        manager.addProduct(new Product(1, "Iphone", 20000));
        manager.addProduct(new Product(2, "Samsung", 18000));
        manager.addProduct(new Product(3, "Oppo", 15000));

        System.out.println("=== Danh sách sản phẩm ban đầu ===");
        manager.displayProducts();

        // Sửa sản phẩm
        manager.editProduct(2, "Samsung S24", 22000);

        // Xóa sản phẩm
        manager.deleteProduct(3);

        System.out.println("\n=== Sau khi sửa và xóa ===");
        manager.displayProducts();

        // Tìm kiếm
        System.out.println("\n=== Tìm kiếm theo tên 'iphone' ===");
        manager.searchByName("iphone");

        // Sắp xếp tăng dần
        System.out.println("\n=== Sắp xếp tăng dần theo giá ===");
        manager.sortByPriceAscending();
        manager.displayProducts();

        // Sắp xếp giảm dần
        System.out.println("\n=== Sắp xếp giảm dần theo giá ===");
        manager.sortByPriceDescending();
        manager.displayProducts();
    }
}
