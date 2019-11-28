package starter;

public class Alien extends Character
{
    boolean moveRight, moveLeft, isVisible;
    
    public Alien(int x, int y, int speed)
    {
        super(x, y, speed);
        
        moveLeft = false;
        moveRight = true;
        isVisible = true;
    }
}
