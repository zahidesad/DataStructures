/**
 *
 * @author zahid
 */
public class MyStack {
    int a[];
    int topA;
    int topB;

    public MyStack(int n) {
        a = new int[n];
        this.topA = -1;
        this.topB = n;
    }

    public static int pop(MyStack st, boolean fromA) {
        if (fromA) {
            if (st.topA == -1) {
                System.out.println("Stack A is empty");
                return -1;
            }
            int poppedElement = st.a[st.topA];
            st.topA--;
            return poppedElement;
        } else {
            if (st.topB == st.a.length) {
               System.out.println("Stack B is empty");
               return -1;

            }
            int poppedElement = st.a[st.topB];
            st.topB++;
            return poppedElement;
        }
    }

    public static int push(MyStack st, boolean intoA, int element) {
        if (st.topA + 1 == st.topB) {
            System.out.println("Both stacks are full");
            return -1;
        }
        if (intoA) {
            st.a[++st.topA] = element;
            return st.topA;
        } else {
            st.a[--st.topB] = element;
            return st.topB;
        }
    }
}
