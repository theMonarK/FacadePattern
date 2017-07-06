package homeTheater;


/**
 * 
 */
public class Tuner implements iPlayer {
    
    protected Amplifier amp;
    protected double freq;

    /**
     * Default constructor
     */
    public Tuner() {
    }

    /**
     * 
     * @param freq
     */
    public void setFreq(double freq) {
        this.freq = freq;
    }
    
    @Override
    public String stop(){
        return "Tuner stopped";
    }

    @Override
    public String pause() {
        throw new UnsupportedOperationException("Not supported for this device."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eject() {
        throw new UnsupportedOperationException("Not supported for this device."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String play() {
        return "Listening radio at frequency "+this.freq;
    }
    

}