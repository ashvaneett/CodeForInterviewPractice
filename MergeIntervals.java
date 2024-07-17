import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class pair{
    int st;
    int ed;
    public pair(int st,int ed){
        this.st=st;
        this.ed=ed;
    }
}

public class MergeIntervals {

    static private void merge(pair[] interval){
        
        Arrays.sort(interval,new Comp());
        int res=0;
        for(int i=0;i<interval.length;i++){
            if(interval[res].ed>=interval[i].st){
                interval[res].ed=Math.max(interval[res].ed, interval[i].ed);
                interval[res].st=Math.min(interval[i].st, interval[res].st);
            }
            else{
                res+=1;
                interval[res]=interval[i];
            }
        }
        for(int i=0;i<res;i++){
            System.out.println(interval[i].st+" "+interval[i].ed);
        }

    }
    public static void main(String[] args) {
        pair[] arr={new pair(5, 10),new pair(3, 15),new pair(18, 30),new pair(2, 7)};
        merge(arr);
    }
    
}
