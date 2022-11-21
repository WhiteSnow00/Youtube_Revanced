// 
// Decompiled by Procyon v0.6.0
// 

package androidx.window.java.area;

import androidx.window.area.WindowAreaSessionCallback;
import android.app.Activity;
import java.util.concurrent.Executor;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Map;
import androidx.window.area.WindowAreaController;

public final class WindowAreaControllerJavaAdapter implements WindowAreaController
{
    private final Map consumerToJobMap;
    private final WindowAreaController controller;
    private final ReentrantLock lock;
    
    public WindowAreaControllerJavaAdapter(final WindowAreaController controller) {
        controller.getClass();
        this.controller = controller;
        this.lock = new ReentrantLock();
        this.consumerToJobMap = new LinkedHashMap();
    }
    
    public final void addRearDisplayStatusListener(final Executor executor, final akp akp) {
        executor.getClass();
        akp.getClass();
        final atxe rearDisplayStatus = this.controller.rearDisplayStatus();
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            if (this.consumerToJobMap.get(akp) == null) {
                this.consumerToJobMap.put(akp, aupp.n(attu.d((atpa)aqvr.u(executor)), (atqh)new WindowAreaControllerJavaAdapter$addRearDisplayStatusListener$1$1(rearDisplayStatus, akp, (atov)null)));
            }
        }
        finally {
            lock.unlock();
        }
    }
    
    public void rearDisplayMode(final Activity activity, final Executor executor, final WindowAreaSessionCallback windowAreaSessionCallback) {
        activity.getClass();
        executor.getClass();
        windowAreaSessionCallback.getClass();
        this.controller.rearDisplayMode(activity, executor, windowAreaSessionCallback);
    }
    
    public atxe rearDisplayStatus() {
        return this.controller.rearDisplayStatus();
    }
    
    public final void removeRearDisplayStatusListener(final akp akp) {
        akp.getClass();
        final ReentrantLock lock = this.lock;
        lock.lock();
        try {
            final atut atut = this.consumerToJobMap.get(akp);
            if (atut != null) {
                aqvr.s(atut);
            }
            final atut atut2 = this.consumerToJobMap.remove(akp);
        }
        finally {
            lock.unlock();
        }
    }
    
    public final void startRearDisplayModeSession(final Activity activity, final Executor executor, final WindowAreaSessionCallback windowAreaSessionCallback) {
        activity.getClass();
        executor.getClass();
        windowAreaSessionCallback.getClass();
        this.controller.rearDisplayMode(activity, executor, windowAreaSessionCallback);
    }
}
