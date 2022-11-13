import com.google.android.apps.youtube.app.common.notification.FcmMessageListenerService;
import android.app.Service;
import com.google.firebase.messaging.FirebaseMessagingService;

// 
// Decompiled by Procyon v0.6.0
// 

public class fku extends FirebaseMessagingService implements arln
{
    private volatile arle a;
    private final Object b;
    private boolean c;
    
    public fku() {
        this.b = new Object();
        this.c = false;
    }
    
    public final Object aR() {
        return this.d().aR();
    }
    
    public final arle d() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new arle(this);
                }
            }
        }
        return this.a;
    }
    
    @Override
    public final /* bridge */ arlm lC() {
        return (arlm)this.d();
    }
    
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            final Object ar = this.aR();
            final FcmMessageListenerService fcmMessageListenerService = (FcmMessageListenerService)this;
            final est est = (est)ar;
            fcmMessageListenerService.d = (arwh)est.b.v.a();
            fcmMessageListenerService.a = arlr.b(est.d);
            final eqy b = est.b;
            fcmMessageListenerService.b = b.ey;
            fcmMessageListenerService.c = b.jw;
        }
        super.onCreate();
    }
}
