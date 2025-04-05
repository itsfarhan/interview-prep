package LinkedLists;

import java.util.LinkedList;

class BrowserHistory{
    private LinkedList<String> history;
    private int currentIndex;
    private int maxIndex;

    public BrowserHistory(String homepage){
        history = new LinkedList<>();
        history.add(homepage);
        this.currentIndex = 0;
        this.maxIndex = 0;
    }

    //Visit a new URL
    public void visit(String url){
        currentIndex++; // Move to next index
        if(currentIndex < history.size()){
            history.set(currentIndex, url); // Overwrite existing history
            return;
        } 
        history.add(url); //Add new history
        maxIndex = currentIndex; // Reset forward history
    }

    public String back(int steps){
        // Move back safely
        currentIndex = Math.max(0, currentIndex - steps);
        return history.get(currentIndex);
    }

    public String forward(int steps){
        // Move forward safely
        currentIndex = Math.min(maxIndex, currentIndex + steps);
        return history.get(currentIndex);
    }
}

public class DesignBrowsingHistory {
    public static void main(String[] args) {

        BrowserHistory browserHistory = new BrowserHistory("homepage.com");
        
        browserHistory.visit("google.com");
        System.out.println(browserHistory.back(1)); // homepage

        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");
        
        System.out.println(browserHistory.back(1)); // facebook
        System.out.println(browserHistory.back(1)); // homepage
        System.out.println(browserHistory.forward(1)); // facebook
        
        browserHistory.visit("linkedin.com");
        
        System.out.println(browserHistory.forward(2)); // linkedin
        System.out.println(browserHistory.back(2)); // homepage
        System.out.println(browserHistory.back(7)); // homepage
    }
}
