package com.company;

public class DDD extends CCC{
    public int x;
    private int y;

    public DDD()
    {
        super();
        x = 1;
        y = 1;
    }

    public DDD(int x, int y)
    {
        super(x, y);
    }

    public int sum()
    {
        return x + y + super.sum();
    }

    public int calc()
    {
        return x * y + super.x * super.y;
    }

    public String info()
    {
        return Integer.toString(super.y) + " " + Integer.toString(this.y) + "\n"
                + Integer.toString(super.x) + " " + Integer.toString(this.x);
    }

}
