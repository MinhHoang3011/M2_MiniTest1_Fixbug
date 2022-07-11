import Model.Book;
import Model.FictionBook;
import Model.ProgrammingBook;

public class Manager {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new ProgrammingBook("101","500 Bài Hát Thiếu Nhi", 50, "Minh Hoàng", "Java","All");
        books[1] = new ProgrammingBook("102","500 Bài Hát Thiếu Niên", 500, "Minh Hoàng", "PHP","All");
        books[2] = new ProgrammingBook("103","500 Bài Hát Thanh Niên", 50, "Minh Hoàng", "C++","All");
        books[3] = new ProgrammingBook("104","500 Bài Hát Thành Niên", 500, "Minh Hoàng", "C#","All");
        books[4] = new ProgrammingBook("105","500 Bài Hát Cao Niên", 50, "Minh Hoàng", "Python","All");

        books[5] = new FictionBook("111","500 Bài Hát Con Gà", 90, "Minh Hoàng","Viễn tưởng 1");
        books[6] = new FictionBook("121","500 Bài Hát Con Vịt", 900, "Minh Hoàng","Ngôn tình");
        books[7] = new FictionBook("131","500 Bài Hát Con Cò", 90, "Minh Hoàng", "Trinh Thám");
        books[8] = new FictionBook("141","500 Bài Hát Con Hạc", 900, "Minh Hoàng", "Kinh Dị");
        books[9] = new FictionBook("151","500 Bài Hát Con Ngỗng", 90, "Minh Hoàng", "Tiên Hiệp");
        System.out.println("Tổng tiền của 10 cuốn sách : " +getSumTotalPrice(books) + " $"   );
        int count = countByLanguage(books,"Java");
        System.out.println("Số cuốn sách có ngôn ngữ là Java : " + count + " Quyển");
        int count1 = countByCategory(books,"Viễn tưởng 1");
        System.out.println("Số cuốn sách thuộc thể loại viễn tưởng 1 : " + count1 + " Quyển");
        System.out.println("Số sách ở Fiction rẻ hơn 100$ : " + countByPrice(books) + " Quyển");
    }
    public static int getSumTotalPrice(Book books[]){
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getPrice();
        }
        return sum;
    }
    public static int countByLanguage(Book books[], String language){
        int count =0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof ProgrammingBook) {
                String language1 = ((ProgrammingBook)books[i]).getLanguage();
                if (language1.equals("Java"))
                    count++;
            }
        }
        return count;
    }
    public  static int countByCategory(Book books[], String category){
        int count=0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook) {
                String category1 =((FictionBook)books[i]).getCategory();
                if (category1.equals("Viễn tưởng 1"))
                    count++;
            }
        }
        return count;
    }
    public static int countByPrice(Book books[]){
        int count=0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook){
                double countPrice = ((FictionBook)books[i]).getPrice();
            if (countPrice < 100){
                count++;
                }
            }
        }
        return count;
    }
}
