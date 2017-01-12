package example.card_view_demo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tzia on 12-Jan-17.
 */

public class MyViewHolder extends RecyclerView.ViewHolder
{
    public ImageView lockImageView;
    public TextView levelNameTextView, levelDescriptionTextView;
    public Button levelButton;

    public MyViewHolder( View itemView )
    {
        super( itemView );


        lockImageView= (ImageView) itemView.findViewById( R.id.card_lock_imageview );
        levelNameTextView= (TextView) itemView.findViewById( R.id.level_name_textview );
        levelDescriptionTextView= (TextView) itemView.findViewById( R.id.level_description_textview );
        levelButton= (Button) itemView.findViewById( R.id.level_button );

    }


}
