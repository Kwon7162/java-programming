package org.example.Head02_oopProgramming.oopConcept.example07;

public class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // 내부 상태 보호를 위해 getter/setter 혹은 읽기 전용 메소드만 공개
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    // 가격 변경 기능은 내부 로직 검증을 거쳐야 하므로, private setPrice 등 활용
    public void changePrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
        }
    }

    public double getPrice() {
        return price;
    }
}
