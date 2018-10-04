package okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities;

import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Types.TypeFactoryInterface;

public class Categories implements NewsNCategoriesInterface {


    private String categoryName;

    public Categories(String categoryName) {
        this.categoryName = categoryName;
    }

    public Categories() {
    }

    @Override
    public String getName() {
        return categoryName;
    }

    @Override
    public int type(TypeFactoryInterface typeFactoryInterface) {
        return typeFactoryInterface.type(this);
    }
}
