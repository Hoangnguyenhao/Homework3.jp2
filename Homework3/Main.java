//lớp Generic
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(123);
        System.out.println("Int: " + integerBox.getItem());

        Box<String> stringBox = new Box<>();
        stringBox.setItem("hello");
        System.out.println("String: " + stringBox.getItem());
    }
}
//Generic trong Java là một tính năng cho định nghĩa các lớp
//giao diện và phương thức với tham số kiểu