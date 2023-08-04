import entity.User;

public class App {
    public static void main(String[] args){
        User x = new User();

        x.setNome("João");
        System.out.println(x.getNome());
    }
}
