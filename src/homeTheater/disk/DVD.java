/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeTheater.disk;

/**
 *
 * @author anthony
 */
public class DVD {
    
    String name;
    String realisator;

    public DVD(String name, String realisator) {
        this.name = name;
        this.realisator = realisator;
    }

    public String getName() {
        return name;
    }

    public String getRealisator() {
        return realisator;
    }
    
    
}
