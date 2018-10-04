package okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities;

import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Types.TypeFactoryInterface;

public class Courses implements Course {

    private String bookName;
    private String authorName;

    public Courses() {
    }

    public Courses(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public String getBookname() {
        return bookName;
    }

    @Override
    public String getAuthorName() {
        return authorName;
    }

    @Override
    public int type(TypeFactoryInterface typeFactoryInterface) {
        return typeFactoryInterface.type(this);
    }
}
