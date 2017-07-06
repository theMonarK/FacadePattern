package homeTheater;

import homeTheater.disk.CD;


/**
 * 
 */
public class CDPlayer implements iPlayer {
    
    protected Amplifier amp;
    protected boolean isPlaying;
    protected CD cd;

    /**
     * Default constructor
     */
    public CDPlayer() {
    }
    
    /**
     * 
     * @param artist
     * @param record
     */
    public void setCD(String artist, String record) {
        this.cd = new CD(artist,record);
    }


    /**
     * 
     * @return 
     */
    @Override
    public String play() {
        return "Listen to "+this.cd.getRecord()+" from "+this.cd.getArtist();
    }

    /**
     * 
     * @return 
     */
    @Override
    public String pause() {
        return "CD paused";
    }

    /**
     * 
     * @return 
     */
    @Override
    public String stop() {
        return "CD stopped";
    }

    /**
     * 
     * @return 
     */
    @Override
    public String eject() {
        return "CD ejected";
    }

}