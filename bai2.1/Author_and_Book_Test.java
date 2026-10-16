public class Author_and_Book_Test {
    public static void main(String[] args) {
        Author author = new Author("Nguyen Nhat Anh", "nhatanh@email.com", 'm');
        System.out.println("Thong tin tac gia: " + author);

        Book book1 = new Book("Mat Biec", author, 95000.0);
        System.out.println("Sach 1: " + book1);

        Book book2 = new Book("Cho Toi Xin Mot Ve Di Tuoi Tho", author, 85000.0, 150);
        System.out.println("Sach 2: " + book2);

        book2.setPrice(89000.0);
        book2.setQty(200);
        System.out.println("Sau khi cap nhat sach 2:");
        System.out.println("Ten sach: " + book2.getName());
        System.out.println("Gia moi: " + book2.getPrice());
        System.out.println("So luong moi: " + book2.getQty());

        System.out.println("Thong tin tac gia cua sach 2:");
        System.out.println("Ten tac gia: " + book2.getAuthorName());
        System.out.println("Email tac gia: " + book2.getAuthorEmail());
        System.out.println("Gioi tinh: " + book2.getAuthorGender());
    }
}