
import homeTheater.HomeTheaterFacade;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthony
 */
public class TestHomeTheater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HomeTheaterFacade htf = new HomeTheaterFacade();
        System.out.println("------------ VOLUME - ------------");
        System.out.println(htf.downVolume());
        System.out.println("------------ VOLUME + ------------");
        System.out.println(htf.upVolume());
        System.out.println("------------ LISTEN MUSIC ------------");
        htf.setCD("artist", "record");
        System.out.println(htf.listenCD());
        System.out.println("------------ PAUSE MUSIC ------------");
        System.out.println(htf.pauseCD());
        System.out.println("------------ STOP MUSIC ------------");
        System.out.println(htf.endCD());
        System.out.println("------------ WATCH MOVIE ------------");
        htf.setDVD("realisator", "name");
        System.out.println(htf.watchMovie());
        System.out.println("------------ PAUSE MOVIE  ------------");
        System.out.println(htf.pauseMovie());
        System.out.println("------------ STOP MOVIE  ------------");
        System.out.println(htf.endMovie());
        System.out.println("------------ LISTEN RADIO ------------");
        htf.setTuner(51.69);
        System.out.println(htf.listenRadio());
        System.out.println("------------ STOP RADIO ------------");
        System.out.println(htf.endTuner());
    }
    
}
