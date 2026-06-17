import java.util.*;

class MinStack {
    private List<int[]> st;

    public MinStack() {
        st = new ArrayList<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            st.add(new int[]{val, val});
        } else {
            int currentMin = st.get(st.size() - 1)[1];
            st.add(new int[]{val, Math.min(val, currentMin)});
        }
    }

    public void pop() {
        if (!st.isEmpty()) {
            st.remove(st.size() - 1);
        }
    }

    public int top() {
        if (st.isEmpty()) {
            return -1;
        }
        return st.get(st.size() - 1)[0];
    }

    public int getMin() {
        if (st.isEmpty()) {
            return -1;
        }
        return st.get(st.size() - 1)[1];
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
