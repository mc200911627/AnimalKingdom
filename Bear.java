
import java.awt.Color;

public class Bear extends Critter {
    private boolean polar;
    private int moves;

    public Bear(boolean polar){
        this.polar=polar;
    }

    public Color getColor() {
        if(polar==true){
            return Color.WHITE;
        }
        else{
            return Color.BLACK;
        }
    }

    public String toString(){
        if(moves%2==0){
            return "/";
        }
        else{
            return "\\" ;
        }
    }

    public Action getMove(CritterInfo info){
        moves++;
        if (info.getFront()==Neighbor.OTHER){
            return Action.INFECT;
        }
        else if(info.getFront()==Neighbor.WALL){
            return Action.LEFT;
        }
        else{
            return Action.HOP;
        }
    }
}
