package okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities;

import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Types.TypeFactoryInterface;

public class News implements NewsNCategoriesInterface {

    private String newsTitle;

    public News(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public News() {
    }

    @Override
    public String getName() {
        return newsTitle;
    }

    @Override
    public int type(TypeFactoryInterface typeFactoryInterface) {
        return typeFactoryInterface.type(this);
    }
}
