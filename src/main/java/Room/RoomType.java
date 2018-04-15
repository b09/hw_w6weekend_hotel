package Room;

public enum RoomType {
    SINGLE(1, 10),
    DOUBLE(2, 20);

    private int roomCapacity;
    private int price;

    RoomType(int roomCapacity, int price) {
        this.roomCapacity = roomCapacity;
        this.price = price;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public int getPrice() {
        return price;
    }
}
