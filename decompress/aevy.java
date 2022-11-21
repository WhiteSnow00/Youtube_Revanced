import java.util.concurrent.Executor;
import android.content.SharedPreferences;
import java.util.HashMap;
import com.google.common.util.concurrent.ListenableFuture;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.Context;
import java.util.Iterator;
import android.content.SharedPreferences$Editor;
import java.io.IOException;
import java.util.logging.Level;
import android.os.Build$VERSION;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.ArrayDeque;
import android.util.Log;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Future;
import java.io.Closeable;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.common.android.concurrent.ParcelableFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevy implements Runnable
{
    final Object a;
    private final int b;
    
    public aevy(final aetr a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final aevz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final aeww a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final afvx a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final agna a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final agps a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final agpv a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final agve a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final aheu a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final arac a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final arxu a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final ParcelableFuture a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final FirebaseMessaging a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final Closeable a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final Future a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final AtomicReference a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aevy(final zkt a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        switch (this.b) {
            default: {
                ((arac)this.a).c.cancel();
                return;
            }
            case 19: {
                agvf.g((agvk)this.a);
                return;
            }
            case 18: {
                ((arxu)this.a).d();
                return;
            }
            case 17: {
                final agps agps = (agps)this.a;
                if (!agps.a) {
                    agps.c.d();
                }
                return;
            }
            case 16: {
                final agpv agpv = (agpv)this.a;
                if (!agpv.g) {
                    agpv.e = true;
                    agpv.d();
                }
                return;
            }
            case 15: {
                final aheu aheu = (aheu)this.a;
                final String action = ((Intent)aheu.a).getAction();
                final StringBuilder sb = new StringBuilder("Service took too long to process intent: ");
                sb.append(action);
                sb.append(" App may get closed.");
                Log.w("FirebaseMessaging", sb.toString());
                aheu.b();
                return;
            }
            case 14: {
                final Object a = this.a;
                synchronized (((zkt)a).d) {
                    final SharedPreferences$Editor edit = ((SharedPreferences)((zkt)a).b).edit();
                    final Object c = ((zkt)a).c;
                    final StringBuilder sb2 = new StringBuilder();
                    final Iterator iterator = ((ArrayDeque)((zkt)a).d).iterator();
                    while (iterator.hasNext()) {
                        sb2.append((String)iterator.next());
                        sb2.append((String)((zkt)a).a);
                    }
                    edit.putString((String)c, sb2.toString()).commit();
                }
            }
            case 13: {
                final Context d = ((FirebaseMessaging)this.a).d;
                if (agpx.l(d).getBoolean("proxy_notification_initialized", false)) {
                    return;
                }
                final rs l = rs.l;
                boolean boolean1 = false;
                Label_0499: {
                    try {
                        final Context applicationContext = d.getApplicationContext();
                        final PackageManager packageManager = applicationContext.getPackageManager();
                        if (packageManager != null) {
                            final ApplicationInfo applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128);
                            if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                                boolean1 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                                break Label_0499;
                            }
                        }
                    }
                    catch (final PackageManager$NameNotFoundException ex) {}
                    boolean1 = true;
                }
                if (Build$VERSION.SDK_INT >= 29) {
                    ((Executor)l).execute((Runnable)new hta(d, boolean1, new noj(), 20, (byte[])null));
                    return;
                }
                nom.e((Object)null);
                return;
            }
            case 12: {
                final FirebaseMessaging firebaseMessaging = (FirebaseMessaging)this.a;
                if (firebaseMessaging.i()) {
                    firebaseMessaging.g();
                }
                return;
            }
            case 11: {
                ((agna)this.a).k();
                return;
            }
            case 10: {
                ((agna)this.a).k();
                return;
            }
            case 9: {
                ((Future)this.a).cancel(false);
                return;
            }
            case 8: {
                ((afvx)this.a).e(afvw.c, afvw.d);
                final Object a2 = this.a;
                afvx.a.logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "close", "closing {0}", a2);
                ((afvx)a2).b.close();
                ((afvx)this.a).e(afvw.d, afvw.e);
                return;
            }
            case 7: {
                try {
                    ((Closeable)this.a).close();
                    return;
                }
                catch (final RuntimeException ex2) {}
                catch (final IOException ex3) {}
                final RuntimeException ex2;
                afvx.a.logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture$11", "run", "thrown by close()", ex2);
                return;
            }
            case 6: {
                ((AtomicReference)this.a).get().cancel(false);
                return;
            }
            case 5: {
                ((ParcelableFuture)this.a).a();
                return;
            }
            case 4: {
                final Object b = ((ParcelableFuture)this.a).b;
                return;
            }
            case 3: {
                final ParcelableFuture parcelableFuture = (ParcelableFuture)this.a;
                final Object b2 = parcelableFuture.b;
                final ListenableFuture c2 = parcelableFuture.c;
                return;
            }
            case 2: {
                final Object a3 = this.a;
                final Object c3 = aewf.c;
                final Object a4 = ((aetr)a3).a;
                synchronized (c3) {
                    if (atqz.c(aewf.d, a4)) {
                        aewf.d = null;
                    }
                }
            }
            case 1: {
                ((aeww)this.a).e.cancel(true);
                return;
            }
            case 0: {
                final Object a5 = this.a;
                final HashMap b3 = aewf.b;
                monitorenter(b3);
                try {
                    final aevk aevk = aewf.b.remove(((aevz)a5).a);
                    monitorexit(b3);
                    return;
                }
                finally {
                    monitorexit(b3);
                    while (true) {}
                }
                break;
            }
        }
    }
}
