package by.belhard.j18.lesson_class.homework.home_work3_2;



public class Main {
    public static void main(String[] args) {
Book book = new Book("100years", 650, BookFormat.PAPER);
Book book1 = new Book("100years", 650, BookFormat.PAPER);
Author b = new Author("Andre", "White", 1980);
        System.out.println("Name Book "+book.getNameBook()+" "+book.getNumberOfPages()+
                " "+BookFormat.PAPER+ " "+ b.getNameAuthor()+" "+b.getSurnameAuthor()+ " " +b.getAgeAuthor());



    }
}

