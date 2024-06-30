package homework.Lab5.pro1;

public class Validator {
    public static boolean validateBook(Book book) {
        if (book.getTitle().isEmpty() || book.getIsbn().isEmpty() || book.getPrice() <= 0) {
            return false;
        }

        String isbn = book.getIsbn();
        if (!(isbn.matches("\\d{10}") || isbn.matches("\\d{13}"))) {
            return false;
        }

        if (isbn.length() == 10 && !(isbn.charAt(0) == '0' || isbn.charAt(0) == '1')) {
            return false;
        }

        if (isbn.length() == 13 && !(isbn.startsWith("978") || isbn.startsWith("979"))) {
            return false;
        }

        String priceStr = String.format("%.2f", book.getPrice());
        if (!priceStr.matches("\\d+\\.\\d{2}") || book.getPrice() <= 0.49) {
            return false;
        }

        return true;
    }

    public static boolean validateCD(CD cd) {
        if (cd.getTitle().isEmpty() || cd.getPrice() <= 0) {
            return false;
        }

        String priceStr = String.format("%.2f", cd.getPrice());
        if (!priceStr.matches("\\d+\\.\\d{2}") || cd.getPrice() <= 0.49) {
            return false;
        }

        return true;
    }
}