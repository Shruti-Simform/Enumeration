import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        State[] s = State.values();
        for (State s1 : s) {
            System.out.println(s1 + " : " + s1.getStateNumber() + ", " + s1.getState());
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter state value : ");
        String state = sc.next();

        System.out.println("STATUS : " + State.findByState(state));
    }
}