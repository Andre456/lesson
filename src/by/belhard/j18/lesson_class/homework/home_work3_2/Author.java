package by.belhard.j18.lesson_class.homework.home_work3_2;

public class Author {
   String nameAuthor;
   String surnameAuthor;
   int ageAuthor;


    public Author(String nameAuthor, String surnameAuthor, int ageAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
        this.ageAuthor = ageAuthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getSurnameAuthor() {
        return surnameAuthor;
    }

    public void setSurnameAuthor(String surnameAuthor) {
        this.surnameAuthor = surnameAuthor;
    }

    public int getAgeAuthor() {
        return ageAuthor;
    }

    public void setAgeAuthor(int ageAuthor) {
        this.ageAuthor = ageAuthor;
    }
}

