import android.app.Application;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class arht extends Service
{
    public final void onCreate() {
        final Application application = this.getApplication();
        if (application instanceof arhv) {
            aqqm.m((Object)this, (arhv)application);
            super.onCreate();
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", ((arhv)application).getClass().getCanonicalName(), arhv.class.getCanonicalName()));
    }
}
