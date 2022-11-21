import android.os.IBinder;
import android.content.ComponentName;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import android.os.Process;
import android.os.Binder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Intent;
import android.content.Context;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

final class agov implements ServiceConnection
{
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue d;
    private agou e;
    private boolean f;
    
    public agov(Context applicationContext) {
        final ScheduledThreadPoolExecutor c = new ScheduledThreadPoolExecutor(0, (ThreadFactory)new emm("Firebase-FirebaseInstanceIdServiceConnection", 2));
        this.d = new ArrayDeque();
        this.f = false;
        applicationContext = applicationContext.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = c;
    }
    
    private final void b() {
        while (!this.d.isEmpty()) {
            this.d.poll().b();
        }
    }
    
    private final void c() {
        monitorenter(this);
        try {
            while (!this.d.isEmpty()) {
                final agou e = this.e;
                if (e == null || !e.isBinderAlive()) {
                    Label_0167: {
                        if (this.f) {
                            break Label_0167;
                        }
                        this.f = true;
                        try {
                            if (mvw.a().c(this.a, this.b, (ServiceConnection)this, 65)) {
                                monitorexit(this);
                                return;
                            }
                            Log.e("FirebaseMessaging", "binding to the service failed");
                        }
                        catch (final SecurityException ex) {
                            Log.e("FirebaseMessaging", "Exception while binding the service", (Throwable)ex);
                        }
                    }
                    this.f = false;
                    this.b();
                    monitorexit(this);
                    return;
                }
                final aheu aheu = this.d.poll();
                final agou e2 = this.e;
                if (Binder.getCallingUid() != Process.myUid()) {
                    throw new SecurityException("Binding only allowed within app");
                }
                ((agny)e2.a.a).e((Intent)aheu.a).l((Executor)rs.m, (nnn)new mki(aheu, 5, (byte[])null));
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final nnt a(final Intent intent) {
        synchronized (this) {
            final aheu aheu = new aheu(intent);
            final ScheduledExecutorService c = this.c;
            aheu.a().l((Executor)c, (nnn)new mki((ScheduledFuture)c.schedule(new aevy(aheu, 15, null), 9000L, TimeUnit.MILLISECONDS), 6));
            this.d.add(aheu);
            this.c();
            return aheu.a();
        }
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        synchronized (this) {
            this.f = false;
            if (!(binder instanceof agou)) {
                Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(String.valueOf(binder))));
                this.b();
                return;
            }
            this.e = (agou)binder;
            this.c();
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        this.c();
    }
}
