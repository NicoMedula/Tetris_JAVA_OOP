package com.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.Pieces.PieceStick;
import com.example.Pieces.PieceT;

public class TetrisTest {

    // Test "Probando entorno"

    @Test
    public void validar_la_clase_tetris_Test(){
        Tetris t1 = new Tetris();
        assertNotNull(t1);
    }

    @Test
    public void crear_pieza_T_Test(){
        
        PieceT t1 = new PieceT();

        assertEquals(true, t1.setPieza());

    }

    @Test
    public void crear_pieza_Stick_Test(){
        
        PieceStick t1 = new PieceStick();

        assertEquals(true, t1.setPieza());

    }
    
}