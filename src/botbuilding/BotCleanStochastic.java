package botbuilding;

import java.util.Scanner;

public class Solution {

    static void nextMove(int posr, int posc, String[] board){
        if(board[posr].charAt(posc) == 'd'){
            System.out.println("CLEAN");
            return;
        }

        for(int i = 0; i < board.length;i++){
            if(board[i].contains("d")){
                if(i != posr){
                    System.out.println("UP");
                    return;
                }
                if(board[i].indexOf("d") > posc){
                    System.out.println("RIGHT");
                    return;
                }
                System.out.println("LEFT");
                return;
            }
            else if(i == posr){
                System.out.println("DOWN");
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] pos = new int[2];
        String board[] = new String[5];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<5;i++) board[i] = in.next();
        nextMove(pos[0], pos[1], board);
    }
}
