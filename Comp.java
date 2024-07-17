import java.util.Comparator;

public class Comp implements Comparator<pair> {

    @Override
    public int compare(pair o1, pair o2) {
        // TODO Auto-generated method stub
        return o1.st-o2.st;
    }
    
}
