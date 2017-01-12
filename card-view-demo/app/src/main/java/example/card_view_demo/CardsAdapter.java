package example.card_view_demo;

import android.content.ContentResolver;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by tzia on 12-Jan-17.
 */

public class CardsAdapter extends RecyclerView.Adapter<MyViewHolder>
{

    private Context context;
    private List<CardModel> cardModelList;


    public CardsAdapter( Context context, List<CardModel> cardModelList )
    {
        this.context = context;
        this.cardModelList = cardModelList;
    }

    @Override public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType )
    {

        View itemView = LayoutInflater.from( context )
                .inflate( R.layout.card_item, parent, false );
        itemView.setMinimumWidth( parent.getMeasuredWidth() );
        return new MyViewHolder( itemView );
    }

    @Override public void onBindViewHolder( MyViewHolder holder, int position )
    {
        holder.levelDescriptionTextView.setText( cardModelList.get( position ).getLevelDescription() );

        holder.levelNameTextView.setText( cardModelList.get( position ).getLevelName() );

        Picasso.with( context ).load( R.drawable.lock ).into( holder.lockImageView );
    }

    @Override public int getItemCount()
    {
        return cardModelList.size();
    }
}
