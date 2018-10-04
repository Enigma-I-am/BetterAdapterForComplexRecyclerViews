package okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Viewholders;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.R;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.CoursesViewHolderAdapter;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.Courses;

public class CourseViewHolder extends AbstractRecyclerViewHolder<Courses> {


    private Random random;

    private final String[] NAMES = {
            "48 Laws of IDFWY",
            "How far nah",
            "Ndi Dorm",
            "I like it"
    };
    private final String[] AUTHOR = {
            "Nwagba Odera",
            "Nwagba Chisom",
            "Nwagba Kenechukwu",
            "Nwagba Okechukwu"
    };


    private static final int sizeOfCollection = 12;

    ArrayList<Courses> courses = new ArrayList<>();


    @LayoutRes
    public static final int LAYOUT = R.layout.course_viewholder_rv;


    @BindView(R.id.courseRV)
    RecyclerView recyclerView;

    public CourseViewHolder(View itemView) {
        super(itemView);

        for (int i = 0; i<sizeOfCollection; i++){

            random = new Random();
            int randone = random.nextInt(4);
            int randtwo = random.nextInt(4);

            Courses randcourses = new Courses(NAMES[randone],AUTHOR[randtwo]);
            courses.add(randcourses);

        }

    }

    @Override
    public void bind(Courses element) {


        CoursesViewHolderAdapter coursesViewHolderAdapter = new CoursesViewHolderAdapter(courses);
        recyclerView.setLayoutManager(new GridLayoutManager(itemView.getContext(),2,GridLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(coursesViewHolderAdapter);



    }


}
