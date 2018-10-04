package okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Viewholders;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import butterknife.BindView;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.R;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.Recommend;

public class RecommendViewHolder extends AbstractRecyclerViewHolder<Recommend> {


    @LayoutRes
    public static final int LAYOUT = R.layout.recommend_viewholder_rv;

    @BindView(R.id.recommendRV)
    RecyclerView recyclerView;

    public RecommendViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bind(Recommend element) {

    }


}
