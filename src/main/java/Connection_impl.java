import java.sql.SQLOutput;
import java.util.*;

public class Connection_impl implements Connection {

    public Scanner key = new Scanner(System.in);

    Service serv1 = new Service();

    @Override
    public void connect_to_server() {

        serv1.setUsername("Input username : " + key.next());
        serv1.setPassword("Input password :" + key.next());
        serv1.setPort(Integer.parseInt("Input port : " + key.next()));
        serv1.setHostname("Input hostname : " + key.next());

    }

    public void connection(){
        //never mind this i know it doesn't really work i'm just messing around
        String connect = serv1.getUsername() + serv1.getPassword() + serv1.getHostname()+ serv1.getPort();

        try{
            System.out.println(connect);
        }catch (Exception e){
            System.out.println("Error cant connect " + e.getStackTrace());
        }

    }

}
