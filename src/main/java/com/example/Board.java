package com.example;

import java.util.Random;

import com.example.Pieces.PieceDogLeft;
import com.example.Pieces.PieceDogRight;
import com.example.Pieces.PieceEleLeft;
import com.example.Pieces.PieceEleRight;
import com.example.Pieces.PieceSquare;
import com.example.Pieces.PieceStick;
import com.example.Pieces.PieceT;

public class Board extends Tetris{

    private int board[][];
    private Random random = new Random();
    

    public void setBoard() {
        board = new int[10][20]; // Filas x Columnas
    }
    public boolean getBoard() {
        if (board != null) {
            return true;
        }else{
            return false;
        }
    }

    public void agregarPiezaRandom(){
        
        int randomPieza = random.nextInt(7);

        IPiece pieza = null;

        switch(randomPieza){
            case 0: pieza = new PieceSquare(); break;

            case 1: pieza = new PieceT(); break;

            case 2: pieza = new PieceStick(); break;

            case 3: pieza = new PieceEleLeft(); break;

            case 4: pieza = new PieceEleRight(); break;

            case 5: pieza = new PieceDogLeft(); break;
            
            case 6: pieza = new PieceDogRight(); break;
        }

    }

    public boolean PosicionarPiezaTablero(IPiece pieza) {
        pieza.getPieza();

        int columna = random.nextInt(20);
        int [][]forma = pieza.getForma();

        if (SePuedeColocarPieza(forma, 0, columna)) {
            for (int i = 0; i < forma.length; i++) {
                for (int j = 0; j < forma[i].length; j++) {

                    if (forma[i][j] != 0) {
                        board[i][columna + j] = forma[i][j];
                        
                    }
                
                }
            }
        return true;

        }else{
            return false;
        }
    }   

    private boolean SePuedeColocarPieza(int [][]forma,int fila, int columna) {

        for(int i = 0; i < forma.length; i++) {
            for(int j = 0; j < forma[i].length; j++) {
                if (forma[i][j] != 0 && (columna + j >= board.length || board[fila + i][columna + j] != 0)) {
                    return false;
                }
            }

        }
        return true;

    
    
    }
}