package gov.iti.jets.listener;

import gov.iti.jets.persistence.DBFactory;
import gov.iti.jets.util.MyLocal;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

public class RequestListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre){
        MyLocal.getInstance().set(DBFactory.getInstance().createEntityManager());
    }
    @Override
    public void requestDestroyed(ServletRequestEvent sre){
        MyLocal.getInstance().get().close();
        MyLocal.getInstance().remove();
    }
}
