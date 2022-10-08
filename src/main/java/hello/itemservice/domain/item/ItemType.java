package hello.itemservice.domain.item;

import lombok.Data;


public enum ItemType {
    // ENUM 객체에서는 .values()로 뽑으면 된다. 알아서 어레이로 도출된다.
    BOOK("도서"),
    FOOD("음식"),
    ETC("기타");

    private final String description;


    ItemType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
