package okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Types;

import android.view.View;

import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Viewholders.AbstractRecyclerViewHolder;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.Categories;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.Courses;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.News;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.Recommend;

public interface TypeFactoryInterface {

    int type(Categories categories);

    int type(News news);

    int type(Recommend recommend);

    int type(Courses courses);

    AbstractRecyclerViewHolder createViewHolder(View parent, int type);
}
