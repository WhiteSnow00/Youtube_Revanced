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
public abstract class afg extends Service
{
    static final Object a;
    static final HashMap b;
    afd c;
    aff d;
    
    static {
        a = new Object();
        b = new HashMap();
    }
    
    public static void a(final Context context, final Class clazz, final Intent intent) {
        final ComponentName componentName = new ComponentName(context, clazz);
        synchronized (afg.a) {
            final HashMap b = afg.b;
            msg msg;
            if ((msg = b.get(componentName)) == null) {
                msg = new msg(context, componentName);
                b.put(componentName, msg);
            }
            msg.b();
            ((JobScheduler)msg.c).enqueue((JobInfo)msg.b, new JobWorkItem(intent));
        }
    }
    
    protected abstract void b();
    
    public final IBinder onBind(final Intent intent) {
        final aff d = this.d;
        if (d != null) {
            return d.getBinder();
        }
        return null;
    }
    
    public void onCreate() {
        super.onCreate();
        this.d = new aff(this);
    }
    
    public final int onStartCommand(final Intent intent, final int n, final int n2) {
        return 2;
    }
}
