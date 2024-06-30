package homework.Lab5.pro1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Effective Java", "0134685997", 45.50);
        CD cd = new CD("Thriller", 15.99);

        System.out.println("Book validation: " + Validator.validateBook(book));
        System.out.println("CD validation: " + Validator.validateCD(cd));
    }
}
