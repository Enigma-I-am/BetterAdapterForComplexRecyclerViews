package okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities;

import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Types.TypeFactoryInterface;

public class Recommend implements Course {
    private String bookName;
    private String authorName;

    public Recommend(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public Recommend() {
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
