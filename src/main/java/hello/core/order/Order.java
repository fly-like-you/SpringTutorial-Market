package hello.core.order;

public class Order {
    private Long memberId;
    private String itemName;
    private int itemmPrice;
    private int discountPrice;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemmPrice() {
        return itemmPrice;
    }

    public void setItemmPrice(int itemmPrice) {
        this.itemmPrice = itemmPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Order(Long memberId, String itemName, int itemmPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemmPrice = itemmPrice;
        this.discountPrice = discountPrice;
    }

    public int calculatePrice(){
        return itemmPrice - discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemmPrice=" + itemmPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
