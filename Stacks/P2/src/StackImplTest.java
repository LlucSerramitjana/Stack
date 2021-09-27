import java.util.EmptyStackException;

public class StackImplTest {
    public static void main(String[] args) {
        System.out.println("TEST");
        Stack<Integer> s = new StackImpl<Integer>(3);
        try{
            s.push (1);
            System.out.println(s.size());
            s.push(200);
            System.out.println(s.size());
            s.push(12);
            System.out.println(s.size());

            Stack<String> s2 = new StackImpl<String>(2);
            s2.push("Hello");
            System.out.println(s.size());
            s2.push ("World");
            System.out.println(s.size());
            s2.pop();
        }
        catch (EmptyStackException empty){
            empty.printStackTrace();
        }
        catch (FullStackException full){
            //
        }
        finally {
            //
        }
    }
}

