package starter;

public class Player extends Character
{
    boolean moveRight, moveLeft;
    
    public Player(int x, int y, int speed)
    {
        super(x, y, speed);
        
        moveLeft = false;
        moveRight = false;
    }
}
