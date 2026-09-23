package session8.mft3;

//@TimeIt
public class OnlineStudent extends  Student implements User{
    @Override
    public boolean login(String username, String password) {
        return false;
    }
}
