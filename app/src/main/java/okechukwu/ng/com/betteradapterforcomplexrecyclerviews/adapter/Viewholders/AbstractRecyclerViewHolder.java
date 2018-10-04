package okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.List;

import butterknife.ButterKnife;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.News;

public abstract class AbstractRecyclerViewHolder<T> extends RecyclerView.ViewHolder {
    public AbstractRecyclerViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }

    public abstract void bind(T element);


}
