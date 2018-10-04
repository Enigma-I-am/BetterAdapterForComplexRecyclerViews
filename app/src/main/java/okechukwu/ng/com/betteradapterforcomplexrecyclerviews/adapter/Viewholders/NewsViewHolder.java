package okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Viewholders;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.NewsViewHolderAdapter;
import butterknife.BindView;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.R;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.News;

public class NewsViewHolder extends AbstractRecyclerViewHolder<News> {


    private Random random;



    private final String[] NEWS = {
            "6:30AM 06/01/2017",
            "9:26PM 04/22/2013",
            "2:01PM 12/02/2015",
            "2:43AM 09/7/2018",
    };

    private static final int sizeOfCollection = 12;

    private ArrayList<News> ActivityNews = new ArrayList<>();


    @LayoutRes
    public static final int LAYOUT = R.layout.news_viewholder_rv;

    @BindView(R.id.newsRV)
    RecyclerView recyclerView;

    public NewsViewHolder(View itemView) {
        super(itemView);

        for (int i =0; i < sizeOfCollection;i++){

            random = new Random();
            int randone = random.nextInt(4);
            News newsArray = new News(NEWS[randone]);
            ActivityNews.add(newsArray);
        }
    }

    @Override
    public void bind(News news) {


        NewsViewHolderAdapter adapter = new NewsViewHolderAdapter(ActivityNews);
        recyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext(),LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(adapter);
        SnapHelper snapHelper = new LinearSnapHelper();
        snapHelper.attachToRecyclerView(recyclerView);

    }





}
