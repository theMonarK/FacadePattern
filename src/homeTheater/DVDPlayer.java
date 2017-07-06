package homeTheater;

import homeTheater.disk.DVD;


/**
 * 
 */
public class DVDPlayer implements iPlayer {
    
    protected Amplifier amp;
    protected boolean isPlaying;
    protected DVD dvd;

    /**
     * Default constructor
     */
    public DVDPlayer() {
    }
    
    /**
     * 
     * @param realisator
     * @param name
     */
    public void setDVD(String realisator, String name) {
        this.dvd = new DVD(realisator,name);
    }


    /**
     * 
     * @return 
     */
    @Override
    public String play() {
        return "Watching "+this.dvd.getName()+" from "+this.dvd.getRealisator();
    }

    /**
     * 
     * @return 
     */
    @Override
    public String pause() {
        return "DVD paused";
    }

    /**
     * 
     * @return 
     */
    @Override
    public String stop() {
        return "DVD stopped";
    }

    /**
     * 
     * @return 
     */
    @Override
    public String eject() {
        return "DVD ejected";
    }

}