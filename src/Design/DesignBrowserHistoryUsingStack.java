package Design;

import java.util.Stack;

public class DesignBrowserHistoryUsingStack {
    class BrowserHistory {
        Stack<String> history ;
        Stack<String> helper;
        public BrowserHistory(String homepage) {
            history = new Stack<>();
            helper = new Stack<>();
            history.push(homepage);
        }

        public void visit(String url) {
            helper = new Stack<>();
            history.push(url);
        }

        public String back(int steps) {
            while(steps > 0 && history.size() > 1) {
                helper.push(history.peek());
                history.pop();
                steps--;
            }
            return history.peek();
        }

        public String forward(int steps) {

            while(steps > 0 && helper.size() > 0) {
                history.push(helper.peek());
                helper.pop();
                steps--;
            }
            return history.peek();
        }
    }

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
}
