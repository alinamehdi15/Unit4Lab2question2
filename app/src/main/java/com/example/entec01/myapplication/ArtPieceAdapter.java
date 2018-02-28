package com.example.entec01.myapplication;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


/**
 * Created by Entec01 on 2/7/2018.
 */

public class ArtPieceAdapter extends RecyclerView.Adapter <ArtPieceAdapter.ViewHolder> {

    private List<ArtPiece> artPieceList;
    private Context context;

    public ArtPieceAdapter(List<ArtPiece> artPieceList) {
        this.artPieceList = artPieceList;
    }
//inflates the rows and returns a holder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View artPieceView = inflater.inflate(R.layout.art_piece_row, parent, false);

        return new ViewHolder(artPieceView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ArtPiece artPiece = artPieceList.get(position);
        holder.NameTextView.setText ( artPiece.getName());
        holder.ArtistTextView.setText ( artPiece.getArtist());
        holder.YearTextView.setText ( Integer.toString(artPiece.getYear()));
        holder.imageView.setImageResource(artPiece.getPictureID());
    }

    @Override
    public int getItemCount() {

        return artPieceList.size();
    }

    //holds all the field in one row
    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView NameTextView;
        public TextView ArtistTextView;
        public TextView YearTextView;
        public Button CheckItOutButtonButton;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            NameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
            ArtistTextView = (TextView) itemView.findViewById(R.id.artistTextView);
            YearTextView = (TextView) itemView.findViewById(R.id.yearTextView);
            CheckItOutButtonButton = (Button) itemView.findViewById(R.id.checkItOutButton);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

}