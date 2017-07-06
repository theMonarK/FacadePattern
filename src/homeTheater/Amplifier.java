package homeTheater;


/**
 * 
 */
public class Amplifier {
    
    protected CDPlayer cdPlayer;
    protected DVDPlayer dvdPlayer;
    protected Tuner tuner;
    protected int volume;

    /**
     * Default constructor
     */
    public Amplifier() {
        this.volume = 30;
    }
    
    public int upVolume(){
        this.volume ++;
        if(this.volume>100){return 100;}
        else{return this.volume;}
    }
    
    public int downVolume(){
        this.volume --;
        if(this.volume<0){return 0;}
        else{return this.volume;}
    }

}