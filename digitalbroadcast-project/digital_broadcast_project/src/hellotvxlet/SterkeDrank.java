/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import java.awt.Color;
import java.awt.Image;
import java.awt.MediaTracker;
import org.dvb.ui.DVBColor;
import org.havi.ui.HIcon;
import org.havi.ui.HStaticText;
import org.havi.ui.HTextButton;
import org.havi.ui.HVisible;
/**
 *
 * @author student
 */
public class SterkeDrank extends HIcon implements ObserverInterface {
    
    String[] titel = new String[5];
    String[] info = new String[5];
    public HStaticText hst_titel;
    public HStaticText hst_info;
    
    public SterkeDrank(int index){
        super();
        
        titel[0] = "Jack Daniels";
        titel[1] = "Cocktail Surprise";
        titel[2] = "Wodka";
        titel[3] = "Limoncello";
        titel[4] = "Martini";
        
        info[0] = "Ook bekend als Jack Daniel’s\nOld No.7, is het meest\nverkochte merk en heeft een\nalcoholpercentage van 40%.";
        info[1] = "Cocktail van het huis\ngeleverd in flessenformaat.\nEen bestseller in de\n zomer.";
        info[2] = "Russische sterke drank\nmet een variabel alcohol\npercentage. Zeer populair\nin Oost-Europa.";
        info[3] = "Traditioneel gemaakt van de\nzest van de Femminello\nSt Teresa citroenen. Deze geel\ngekleurde drank is populair\nbij de vrouwen.";
        info[4] = "Martini is een italiaans\nvermout merk. Er zijn\nverschillende smaken\nverkrijgbaar.";
        
        
        hst_info = new HStaticText(info[index]);
        hst_info.setLocation(350,165);
        hst_info.setSize(300,250);
        hst_info.setBackground(new DVBColor(0,0,0,250));
        hst_info.setBackgroundMode(HVisible.BACKGROUND_FILL);
        
        hst_titel = new HStaticText(titel[index]);
        hst_titel.setLocation(350,100);
        hst_titel.setSize(300,50);
        hst_titel.setBackground(new DVBColor(0,0,0,250));
        hst_titel.setBackgroundMode(HVisible.BACKGROUND_FILL);
        
     
    }
    
    public void update(int index) {
        System.out.print("sterke drank");
        hst_titel.setTextContent(titel[index], HVisible.ALL_STATES);
        hst_info.setTextContent(info[index], HVisible.ALL_STATES);
    }

}
