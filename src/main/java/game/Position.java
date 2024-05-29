package game;

public class Position {
    public int x;
    public int y;
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setPosition(int valueX, int valueY){
        this.x = valueX;
        this.y = valueY;

    }
    public Position getDiffPos(Position target) {
        return new Position(x - target.x, y - target.y);
    }

    /**
     * Check distance on between hero and target
     * @param target targeting
     * @return distance
     */
    public double getDistance(Position target){
        return Math.sqrt(Math.pow(this.x - target.x, 2) + Math.pow(this.y - target.y, 2));
    }
}

