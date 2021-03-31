/*
    @Service
    @Author 217120830

     */

public class Service {

    private String username;
    private  String password;
    private  String hostname;
    private int port;

    public Service(){

    }

    public Service(String username, String password, String hostname , int port){
        this.username = username;
        this.password = password;
        this.hostname = hostname;
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString(){
        return "Username : " + this.getUsername() + "\nPassword : " + this.getPassword() + "\nHostname : " +
                this.getHostname() + "\nPort : " + this.getPort();
    }

}
