package okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Types;

import android.view.View;

import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Viewholders.AbstractRecyclerViewHolder;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Viewholders.CategoriesViewHolder;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Viewholders.CourseViewHolder;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Viewholders.NewsViewHolder;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Viewholders.RecommendViewHolder;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.exceptions.TypeNotSupportedException;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.Categories;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.Courses;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.News;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.Recommend;

public class TypeFactoryList implements TypeFactoryInterface {


    @Override
    public int type(Categories categories) {
        return CategoriesViewHolder.LAYOUT;
    }

    @Override
    public int type(News news) {
        return NewsViewHolder.LAYOUT;
    }

    @Override
    public int type(Recommend recommend) {
        return RecommendViewHolder.LAYOUT;
    }

    @Override
    public int type(Courses courses) {
        return CourseViewHolder.LAYOUT;
    }

    @Override
    public AbstractRecyclerViewHolder createViewHolder(View parent, int type) {

        AbstractRecyclerViewHolder createdView;
        switch (type){
            case NewsViewHolder.LAYOUT:
                createdView = new NewsViewHolder(parent);
                break;
            case CourseViewHolder.LAYOUT:
                createdView = new CourseViewHolder(parent);
                break;
            case CategoriesViewHolder.LAYOUT:
                createdView = new CategoriesViewHolder(parent);
                break;
            case RecommendViewHolder.LAYOUT:
                createdView = new RecommendViewHolder(parent);
                break;
            default:
                throw TypeNotSupportedException.create("It not supported");
        }
        return createdView;
    }

}
