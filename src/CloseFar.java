/**
 * Created by fenji on 9/27/2016.
 */
public class CloseFar {
    public boolean closeFar(int a, int b, int c) {
        int aMinB = Math.abs(a-b);
        int aMinC = Math.abs(a-c);
        int bMinC = Math.abs(b-c);
        if((aMinB <= 1) && (aMinC <= 1)){
            return false;
        } else if ((aMinB <= 1) && ((aMinC >=2) && (bMinC >=2))){
            return true;
        } else if ((aMinC <= 1) && ((aMinB >=2)  && (bMinC >=2))){
            return true;
        }
        return false;
    }

}
