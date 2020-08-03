/**
 * Interface for Time
 * 
 * @author Abhishek Tamang
 * 
 * FILE IS COMPLETE -- NO ALTERATIONS REQUIRED
 */

public interface TimeInterface
{
    //public Time();
    public void setTime(int h, int m, int s);
    public String toString();
    public String toMilitaryString();
    public boolean equals(Time t);
}
