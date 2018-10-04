package okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter;

import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.R;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.Courses;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.News;

public class CoursesViewHolderAdapter extends RecyclerView.Adapter<CoursesViewHolderAdapter.ViewHolder> {

    private List<Object> mMovieObjects = new ArrayList<>();
    ArrayList<Courses> courses = new ArrayList<>();

    public void addNewsList(ArrayList<Courses> courses1){

        int currentSize = mMovieObjects.size();
        int amountInserted = courses.size();
        mMovieObjects.add(courses1);
        courses = courses1;
        notifyItemRangeInserted(currentSize, amountInserted);

    }

    public CoursesViewHolderAdapter(ArrayList<Courses> courses) {
        this.courses = courses;
    }

    @NonNull
    @Override
    public CoursesViewHolderAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.courses_viewholder_item,parent,false);
        return new CoursesViewHolderAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoursesViewHolderAdapter.ViewHolder holder, int position) {

        int imageViewColour = holder.getRandonColor(position);
        holder.view.setBackgroundColor(imageViewColour);
        holder.nameText.setText(courses.get(position).getBookname());
        holder.authorText.setText(courses.get(position).getAuthorName());

    }

    @Override
    public int getItemCount() {
        return courses.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        View view;
        TextView nameText;
        TextView authorText;

        public ViewHolder(View itemView) {
            super(itemView);

            view = itemView.findViewById(R.id.imageview);
            nameText = itemView.findViewById(R.id.nametext);
            authorText = itemView.findViewById(R.id.authortext);

        }

        private int getRandonColor(int priority) {

            if (priority > 7) {
                priority = priority % 7;
            }

            switch (priority) {
                case 0:
                    return ContextCompat.getColor(itemView.getContext(), R.color.colorAccent);

                case 1:
                    return ContextCompat.getColor(itemView.getContext(), R.color.materialblue);

                case 2:
                    return ContextCompat.getColor(itemView.getContext(), R.color.materialblueGray);

                case 3:
                    return ContextCompat.getColor(itemView.getContext(), R.color.materialgreen);

                case 4:
                    return ContextCompat.getColor(itemView.getContext(), R.color.materialpink);

                case 5:
                    return ContextCompat.getColor(itemView.getContext(), R.color.materialyellow);

                case 6:
                    return ContextCompat.getColor(itemView.getContext(), R.color.materialred);

                default:
                    return ContextCompat.getColor(itemView.getContext(), R.color.materialgreen);


            }

        }


    }
}
