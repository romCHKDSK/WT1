package assignment.z12_15;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        final ProgrammerBook other = (ProgrammerBook) obj;
        if (!super.equals(obj)) {
            return false;
        }

        if (this.language != other.language || this.level != other.level) {
            return false;
        }
        return true;
    }

    public ProgrammerBook(String isbn, String title, String author, int price, int edition, String language, int level) {
        super(isbn, title, author, price, edition);
        this.language = language;
        this.level = level;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^
                this.language.hashCode() ^
                this.level;
    }

    @Override
    public String toString() {
        return String.format("%s %s lv.%d",
                super.toString(), this.language, this.level);
    }
}
