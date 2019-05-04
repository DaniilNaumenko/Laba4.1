package gui;

import org.junit.Test;
import java.lang.IllegalAccessException;
import java.util.concurrent.ArrayBlockingQueue;

import static org.junit.Assert.*;

public class LibrarySceneTest {

         @Test
    public void convertStateToString(){
            LibraryScene libraryScene = new LibraryScene("Waite");
            assertEquals(null,libraryScene.convertStateToString());
         }

}