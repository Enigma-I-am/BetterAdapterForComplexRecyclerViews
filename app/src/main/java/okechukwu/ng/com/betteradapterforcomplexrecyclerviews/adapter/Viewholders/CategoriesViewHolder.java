package okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Viewholders;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import butterknife.BindView;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.R;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.Categories;

public class CategoriesViewHolder extends AbstractRecyclerViewHolder<Categories> {

    @LayoutRes
    public static final int LAYOUT = R.layout.categories_viewholder_rv;


    @BindView(R.id.categoriesRV)
    RecyclerView recyclerView;

    public CategoriesViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bind(Categories element) {

    }


}
