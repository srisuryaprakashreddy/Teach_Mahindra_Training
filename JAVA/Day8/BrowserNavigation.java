package homework;

import java.util.ArrayDeque;

class BrowserNavigation {
    private ArrayDeque<String> backStack = new ArrayDeque<>();
    private ArrayDeque<String> forwardStack = new ArrayDeque<>();
    private String currentPage = "Home";

    public void visit(String page) {
        backStack.push(currentPage);
        currentPage = page;
        forwardStack.clear();
        System.out.println("Visited: " + currentPage);
    }

    public void back() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Back to: " + currentPage);
        } else {
            System.out.println("No pages in back history.");
        }
    }

    public void forward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Forward to: " + currentPage);
        } else {
            System.out.println("No pages in forward history.");
        }
    }

    public void navigate() {
        visit("Page1");
        visit("Page2");
        back();
        forward();
        visit("Page3");
        back();
    }

    public static void main(String[] args) {
        BrowserNavigation bn = new BrowserNavigation();
        bn.navigate();
    }
}
