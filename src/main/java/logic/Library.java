package logic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;

public class Library {

    public interface StudentSubscriber {
        void updateState(Student who, Student.State newState);
    }
    private LinkedList<String> availableBooks = new LinkedList<>(
            Arrays.asList("Game of Thrones", "Harry Potter", "Java",
                    "Success", "War and Peace"));

    private HashMap<String, ArrayBlockingQueue<String>> bookQueueMap;

    public Library() {
        bookQueueMap = new HashMap<>(availableBooks.size());
        for(String bookName : availableBooks) {
            ArrayBlockingQueue<String> bookQueue = new ArrayBlockingQueue<>(1);
            bookQueue.add(bookName);
            bookQueueMap.put(bookName, bookQueue);
        }
    }

    public LinkedList<String> getAvailableBooks() {
        return  availableBooks;
    }

    public ArrayBlockingQueue<String> getBookQueue(String book) {
        return bookQueueMap.get(book);
    }
}