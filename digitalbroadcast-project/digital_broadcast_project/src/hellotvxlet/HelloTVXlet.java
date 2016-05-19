package hellotvxlet;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Timer;
import org.bluray.ui.event.HRcEvent;
import org.davic.resources.ResourceClient;
import org.davic.resources.ResourceProxy;
import org.dvb.event.EventManager;
import org.dvb.event.UserEvent;
import org.dvb.event.UserEventListener;
import org.dvb.event.UserEventRepository;
import org.havi.ui.HBackgroundConfigTemplate;
import org.havi.ui.HBackgroundDevice;
import org.havi.ui.HBackgroundImage;
import org.havi.ui.HConfigurationException;
import org.havi.ui.HPermissionDeniedException;
import org.havi.ui.HScene;
import org.havi.ui.HSceneFactory;
import org.havi.ui.HScreen;
import org.havi.ui.HStaticText;
import org.havi.ui.HStillImageBackgroundConfiguration;
import org.havi.ui.event.HBackgroundImageEvent;
import org.havi.ui.event.HBackgroundImageListener;
import javax.tv.xlet.*;
import org.havi.ui.HVisible;


public class HelloTVXlet implements Xlet, ResourceClient, HBackgroundImageListener, UserEventListener {

    HStillImageBackgroundConfiguration hsibc;
    
    String pizza = "";
    private HBackgroundImage[] imageArray = new HBackgroundImage[5];
    
    private int imageTeller = 0;
    private int cursor = 0;
    
    Subject sub;
    
    
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context) throws XletStateChangeException{
        
        Observer ob1=new Observer();
        sub=new Subject();
        sub.register(ob1);
        
        
        
        HScreen screen = HScreen.getDefaultHScreen();
        HBackgroundDevice hbackgrounddev = screen.getDefaultHBackgroundDevice();
        boolean reserved = hbackgrounddev.reserveDevice(this);
        if(reserved)
        {
            System.out.println("backgrounddev gereserveerd");
        }
        
        //confirguratie:
        HBackgroundConfigTemplate hbct = new HBackgroundConfigTemplate();
        hbct.setPreference(HBackgroundConfigTemplate.STILL_IMAGE, HBackgroundConfigTemplate.REQUIRED);
        hsibc = (HStillImageBackgroundConfiguration)hbackgrounddev.getBestConfiguration(hbct);
        
        imageArray[0] = new HBackgroundImage("jack-daniels.m2v");
        imageArray[1] = new HBackgroundImage("cocktail.m2v");
        imageArray[2] = new HBackgroundImage("wodka.m2v");
        imageArray[3] = new HBackgroundImage("limoncello.m2v");
        imageArray[4] = new HBackgroundImage("martini.m2v");
        
        imageArray[0].load(this);
        imageArray[1].load(this);
        imageArray[2].load(this);
        imageArray[3].load(this);
        imageArray[4].load(this);
        
        //maak een user eventrepository
       UserEventRepository rep = new UserEventRepository("naam");
       //voeg daar allArrowKeys aan toe
       rep.addAllArrowKeys();
       rep.addKey(32);
       //vraag een link naar Eventmanager op met .getInstance()
       //registreer de UserEventRepository op de Eventmanager met
       //addusereventlistener.
       EventManager.getInstance().addUserEventListener(this, rep);
       //Implementeer de inerface UserEventListener op deze Xlet
       //Vang de events op in UserEventReceived
        
        HScene scene=HSceneFactory.getInstance().getDefaultHScene();
        //scene.add(xxx);
        scene.validate(); scene.setVisible(true);
     
    }

    public void destroyXlet(boolean unconditional) throws XletStateChangeException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void pauseXlet() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void startXlet() throws XletStateChangeException {
        SterkeDrank sd = new SterkeDrank(cursor);
        HScene scene = HSceneFactory.getInstance().getDefaultHScene();
        
        
        sub.register(sd);
        scene.add(sd.hst_titel);
        scene.add(sd.hst_info);
        scene.validate();
        scene.setVisible(true);
       
        
    }

    public boolean requestRelease(ResourceProxy proxy, Object requestData) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void release(ResourceProxy proxy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void notifyRelease(ResourceProxy proxy) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void imageLoaded(HBackgroundImageEvent e) {
        imageTeller++;
        if(imageTeller == 1) System.out.println("Image geladen");
        try{            
            hsibc.displayImage(imageArray[0]);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (HPermissionDeniedException ex) {
            ex.printStackTrace();
        } catch (HConfigurationException ex) {
            ex.printStackTrace();
        }
    }

    public void imageLoadFailed(HBackgroundImageEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void userEventReceived(UserEvent e) {
        if(e.getType() == KeyEvent.KEY_PRESSED)
        {
            if(e.getCode() == HRcEvent.VK_LEFT)
            {
                cursor--;
                if(cursor<0) cursor =4;
                sub.update_observers(cursor);
                try {
                    hsibc.displayImage(imageArray[cursor]);
                }
                catch(Exception ex)
                {
                ex.printStackTrace();
                }
            }
            if(e.getCode() == HRcEvent.VK_RIGHT)
            {
                cursor++;
                if(cursor > 4) cursor = 0;
                sub.update_observers(cursor);
                try {
                    hsibc.displayImage(imageArray[cursor]);
                }
                catch(Exception ex)
                {
                ex.printStackTrace();
                }
            }           
        }
    }


    
}
