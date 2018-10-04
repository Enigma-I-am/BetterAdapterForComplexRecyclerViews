package okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter;

import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.R;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.enities.News;

public class NewsViewHolderAdapter extends RecyclerView.Adapter<NewsViewHolderAdapter.ViewHolder> {

    private List<Object> mMovieObjects = new ArrayList<>();
    ArrayList<News> news = new ArrayList<>();


    public void addNewsList(ArrayList<News> news1){

            int currentSize = mMovieObjects.size();
            int amountInserted = news.size();
            mMovieObjects.add(news1);
            news = news1;
            notifyItemRangeInserted(currentSize, amountInserted);

    }



    public NewsViewHolderAdapter(ArrayList<News> news) {
        this.news = news;
    }

    @NonNull
    @Override
    public NewsViewHolderAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_viewholder_item,parent,false);
        return new NewsViewHolderAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolderAdapter.ViewHolder holder, int position) {
        int cardBackGround = holder.getRandonColor(position);
        holder.newsText.setText(news.get(position).getName());
        holder.newsCard.setCardBackgroundColor(cardBackGround);

    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    public List<Object> getmMovieObjects() {
        return mMovieObjects;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView newsCard;
        TextView newsText;
        public ViewHolder(View itemView) {
            super(itemView);
            newsCard = itemView.findViewById(R.id.new_card_view);
            newsText = itemView.findViewById(R.id.news_text);
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
