package MediaManager;

import org.apache.log4j.*;
import org.apache.log4j.xml.DOMConfigurator;

import java.io.OutputStream;
import java.io.PrintStream;


/**
 * Created by Kody on 5/09/2017.
 */
public class Launcher {
    static Logger log;
    static PrintStream consoleStream;


    public static void main( String[] args ) {
        log = Logger.getLogger(Launcher.class.getName());

//        hideConsole();
        DOMConfigurator.configure("src\\main\\java\\MediaManager\\log4j.xml");


        MediaManager mediaManager = new MediaManager();
        RequestHandler requestHandler = new RequestHandler(mediaManager);
        ClientStub clientStub = new ClientStub();

//        showConsole();

        log.info("Launcher Started");

        mediaManager.start();
        requestHandler.start();
        clientStub.start();

    }

    public static void hideConsole(){
        consoleStream = System.out;

        PrintStream dummyStream    = new PrintStream(new OutputStream(){
            public void write(int b) {
                //NO-OP
            }
        });
        System.setOut(dummyStream);
    }

    public static void showConsole(){
        System.setOut(consoleStream);
    }
}