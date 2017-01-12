package example.card_view_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import android.support.v7.widget.RecyclerView;
;

import java.util.ArrayList;

import java.util.List;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        RecyclerView recyclerView = (RecyclerView) findViewById( R.id.recyclerView );


        recyclerView.setHasFixedSize( true );


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager( this, LinearLayoutManager.HORIZONTAL, false );






        recyclerView.setLayoutManager( layoutManager );




        List<CardModel> cardModels = new ArrayList<>();

        cardModels.add( new CardModel( "Level1", "this is level1 ", false, false ) );
        cardModels.add( new CardModel( "Level2", "this is level2 ", false, false ) );
        cardModels.add( new CardModel( "Level3", "this is level3 ", false, false ) );


        CardsAdapter cardsAdapter = new CardsAdapter( this, cardModels );

        recyclerView.setAdapter( cardsAdapter );

        cardsAdapter.notifyDataSetChanged();


    }
}
