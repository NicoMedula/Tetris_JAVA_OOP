package com.example.Pieces;

import com.example.IPiece;
import com.example.PiecesStats;

public class PieceStick extends PiecesStats
            implements IPiece{

    @Override
    public boolean getPieza() {
        
        piezas = new int[4][1];

        piezas[0][0] =1;
        piezas[1][0] =1;
        piezas[2][0] =1;
        piezas[3][0] =1;

        return true;
        
    }

    
}
