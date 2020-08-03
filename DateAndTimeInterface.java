public interface DateAndTimeInterface{
    
    //public DateAndTime();
    //public void DateAndTime(int d,int m,int y,int h,int n,int s);
    public void setDateAndTime(int d,int m,int y,int h,int n,int s);
    public String toString();
    public void setTime(int h,int n,int s);
    public String timeToString();
    public String timeToMilitaryString();
    public boolean incHour();
    public boolean incMinute();
    public boolean incSecond();
    public void setDate(int d,int m,int y);
    public String dateToString();
    public boolean incDay();
    public boolean incMonth();
    public boolean incYear();
}