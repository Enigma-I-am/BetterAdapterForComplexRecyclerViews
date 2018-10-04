package okechukwu.ng.com.betteradapterforcomplexrecyclerviews;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Types.TypeFactoryInterface;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Types.TypeFactoryList;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Types.Visitable;
import okechukwu.ng.com.betteradapterforcomplexrecyclerviews.adapter.Viewholders.AbstractRecyclerViewHolder;



public class MainAdapter extends RecyclerView.Adapter<AbstractRecyclerViewHolder> {

    private final List<Visitable> element;
    private final TypeFactoryInterface typeFactory;

    public MainAdapter(List<Visitable> element, TypeFactoryInterface typeFactory) {
        this.element = element;
        this.typeFactory = typeFactory;
    }

    @NonNull
    @Override
    public AbstractRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType,parent,false);
        return typeFactory.createViewHolder(view,viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull AbstractRecyclerViewHolder holder, int position) {
        holder.bind(element.get(position));
    }

    @Override
    public int getItemViewType(int position) {
        return element.get(position).type(typeFactory);
    }

    @Override
    public int getItemCount() {
        return element.size();
    }
}
