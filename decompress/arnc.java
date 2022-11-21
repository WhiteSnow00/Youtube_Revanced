import android.app.Application;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arnc extends Service
{
    public final void onCreate() {
        final Application application = this.getApplication();
        if (application instanceof arne) {
            aqvs.k((Object)this, (arne)application);
            super.onCreate();
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", ((arne)application).getClass().getCanonicalName(), arne.class.getCanonicalName()));
    }
}
