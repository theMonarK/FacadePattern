package homeTheater;

/**
 * 
 */

public class HomeTheaterFacade {
    
    public final static int MediaType_Movie=0;
    public final static int MediaType_Music=1;
    public final static int MediaType_Tuner=2;
    
    protected Amplifier amp;
    protected CDPlayer cdPlayer;
    protected DVDPlayer dvdPlayer;
    protected Tuner tuner;

    /**
     * Default constructor
     */
    public HomeTheaterFacade() {
        this.amp = new Amplifier();
        this.cdPlayer = new CDPlayer();
        this.dvdPlayer = new DVDPlayer();
        this.tuner = new Tuner();
    }


    /**
     * 
     * @return 
     */
    public String listenCD() {
        return this.cdPlayer.play();
        
    }

    /**
     * 
     * @return 
     */
    public String listenRadio() {
        return this.tuner.play();
    }

    /**
     * 
     * @return 
     */
    public String watchMovie() {
        return this.dvdPlayer.play();
    }

    /**
     * 
     * @return 
     */
    public String endCD() {
        return this.cdPlayer.stop();
    }
    
    /**
     * 
     * @return 
     */
    public String pauseMovie() {
        return this.dvdPlayer.pause();
    }

    /**
     * 
     * @return 
     */
    public String pauseCD() {
        return this.cdPlayer.pause();
    }

    /**
     * 
     * @return 
     */
    public String endTuner() {
        return this.tuner.stop();
    }

    /**
     * 
     * @return 
     */
    public String endMovie() {
        return this.dvdPlayer.stop();
    }
    
    public int getVolume(){
        return this.amp.volume;
    }
    
    public int upVolume(){
        return this.amp.upVolume();
    }
    
    public int downVolume(){
        return this.amp.downVolume();
    }
    
    public void setCD(String artist,String record){
        this.cdPlayer.setCD(artist, record);
    }
    
    public void setDVD(String realisator,String name){
        this.dvdPlayer.setDVD(realisator, name);
    }
    
    public void setTuner(double freq){
        this.tuner.setFreq(freq);
    }

}