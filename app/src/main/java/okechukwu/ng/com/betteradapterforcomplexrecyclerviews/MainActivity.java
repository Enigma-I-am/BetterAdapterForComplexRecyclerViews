package okechukwu.ng.com.betteradapterforcomplexrecyclerviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.NewsViewHolderAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Types.TypeFactoryInterface;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Types.TypeFactoryList;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Types.Visitable;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.Categories;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.Courses;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.News;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.Recommend;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.parent_recyclerview)
    RecyclerView ParentRecyclerview;





    private final String[] messages = {
            "Check out content like Fragmented Podcast to expose yourself to the knowledge, ideas, " +
                    "and opinions of experts in your field",
            "Look at Open Source Projects like Android Architecture Blueprints to see how experts" +
                    " design and build Apps",
            "Write lots of Code and Example Apps. Writing good Quality Code in an efficient manner "
                    + "is a Skill to be practiced like any other.",
            "If at first something doesn't make any sense, find another explanation. We all " +
                    "learn/teach different from each other. Find an explanation that speaks to you."
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        TypeFactoryInterface typeFactory = new TypeFactoryList();
        List<Visitable> elementList = Arrays.asList(
                new News(),
                new Courses(),
                new Categories(),
                new Recommend()
        );

        ParentRecyclerview.setLayoutManager(new LinearLayoutManager(this));
        ParentRecyclerview.setAdapter(new MainAdapter(elementList,typeFactory));





    }





}
