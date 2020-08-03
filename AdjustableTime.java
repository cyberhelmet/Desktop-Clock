public class AdjustableTime extends Time implements AdjustableTimeInterface {
    
    final int MAX_SECOND = 60;
    final int MIN_SECOND = 0;
    
    public boolean incHour(){
          boolean overflow = false;
          if(this.hour == 24){
            this.hour = 0;
            return overflow = true;
        }
        return overflow;
        
    };
    public boolean incMinute(){
        boolean overflow = false;
        this.minute++;
        if(this.minute >= MAX_SECOND){
            
            this.minute = MIN_SECOND;
            return overflow = true;
        }
        return overflow;
    };
    public boolean incSecond(){
        boolean overflow = false;
        this.second++;
        if(this.second >= MAX_SECOND){
            
            this.second = MIN_SECOND;
            return overflow =true;
        }
        return overflow;
        
    };
}








