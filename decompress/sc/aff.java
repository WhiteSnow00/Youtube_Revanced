import android.os.IBinder;
import android.app.job.JobWorkItem;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;
import java.util.HashMap;
import android.app.Service;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public abstract class aff extends Service
{
    static final Object a;
    static final HashMap b;
    afc c;
    afe d;
    
    static {
        a = new Object();
        b = new HashMap();
    }
    
    public static void a(final Context context, final Class clazz, final Intent intent) {
        final ComponentName componentName = new ComponentName(context, clazz);
        synchronized (aff.a) {
            final HashMap b = aff.b;
            mrs mrs;
            if ((mrs = b.get(componentName)) == null) {
                mrs = new mrs(context, componentName);
                b.put(componentName, mrs);
            }
            mrs.b();
            ((JobScheduler)mrs.c).enqueue((JobInfo)mrs.b, new JobWorkItem(intent));
        }
    }
    
    protected abstract void b();
    
    public final IBinder onBind(final Intent intent) {
        final afe d = this.d;
        if (d != null) {
            return d.getBinder();
        }
        return null;
    }
    
    public void onCreate() {
        super.onCreate();
        this.d = new afe(this);
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        return 2;
    }
}
