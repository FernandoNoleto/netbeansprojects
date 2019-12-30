package ping;

/**
 *
 * @author Fernando
 */
public class counter implements pingable{
    int count = 0;
    @Override
    public void ping(){
        ++count;
    }
    public int val(){
        return count;
    }
}
