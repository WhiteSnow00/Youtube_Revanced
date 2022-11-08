import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;
import android.os.RemoteException;
import android.os.Message;
import android.os.Parcelable;
import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import android.os.Messenger;
import android.app.PendingIntent;
import java.util.regex.Pattern;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mol
{
    public static final Executor a;
    public static final Pattern b;
    private static int f;
    private static PendingIntent g;
    public final abn c;
    public Messenger d;
    public CloudMessagingMessengerCompat e;
    private final Context h;
    private final ScheduledExecutorService i;
    private final Messenger j;
    private final uca k;
    
    static {
        a = (Executor)rr.a;
        b = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    }
    
    public mol(final Context h) {
        this.c = new abn();
        this.h = h;
        this.k = new uca(h);
        this.j = new Messenger((Handler)new mok(this, Looper.getMainLooper()));
        final ScheduledThreadPoolExecutor i = new ScheduledThreadPoolExecutor(1);
        i.setKeepAliveTime(60L, TimeUnit.SECONDS);
        i.allowCoreThreadTimeOut(true);
        this.i = i;
    }
    
    public static boolean d(final Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }
    
    private static String e() {
        synchronized (mol.class) {
            final int f = mol.f;
            mol.f = f + 1;
            return Integer.toString(f);
        }
    }
    
    private static void f(final Context context, final Intent intent) {
        synchronized (mol.class) {
            if (mol.g == null) {
                final Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                mol.g = nac.b(context, intent2, nac.a);
            }
            intent.putExtra("app", (Parcelable)mol.g);
        }
    }
    
    public final nly a(final Bundle bundle) {
        final String e = e();
        final nmo nmo = new nmo();
        Object obj = this.c;
        synchronized (obj) {
            this.c.put((Object)e, (Object)nmo);
            monitorexit(obj);
            obj = new Intent();
            ((Intent)obj).setPackage("com.mgoogle.android.gms");
            if (this.k.c() == 2) {
                ((Intent)obj).setAction("com.mgoogle.iid.TOKEN_REQUEST");
            }
            else {
                ((Intent)obj).setAction("com.mgoogle.android.c2dm.intent.REGISTER");
            }
            ((Intent)obj).putExtras(bundle);
            f(this.h, (Intent)obj);
            final StringBuilder sb = new StringBuilder("|ID|");
            sb.append(e);
            sb.append("|");
            ((Intent)obj).putExtra("kid", sb.toString());
            ((Intent)obj).putExtra("google.messenger", (Parcelable)this.j);
            Label_0233: {
                if (this.d != null || this.e != null) {
                    final Message obtain = Message.obtain();
                    obtain.obj = obj;
                    try {
                        final Messenger d = this.d;
                        if (d != null) {
                            d.send(obtain);
                            break Label_0233;
                        }
                        this.e.b(obtain);
                        break Label_0233;
                    }
                    catch (final RemoteException ex) {}
                }
                if (this.k.c() == 2) {
                    this.h.sendBroadcast((Intent)obj);
                }
                else {
                    this.h.startService((Intent)obj);
                }
            }
            final ScheduledFuture<?> schedule = this.i.schedule(new mkn(nmo, 7, null), 30L, TimeUnit.SECONDS);
            obj = nmo.a;
            ((nly)obj).l(mol.a, (nlr)new xgh(this, e, (ScheduledFuture)schedule, 1));
            return (nly)nmo.a;
        }
    }
    
    public final nly b(final Bundle bundle) {
        if (this.k.b() < 12000000) {
            nly nly;
            if (this.k.c() != 0) {
                nly = this.a(bundle).b(mol.a, (nln)new agjb(this, bundle, 1));
            }
            else {
                nly = nmr.b((Exception)new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            return nly;
        }
        final qqr c = qqr.c(this.h);
        return c.b((moh)new moj(c.a(), bundle)).a(mol.a, (nln)mxc.b);
    }
    
    public final void c(final String s, final Bundle bundle) {
        synchronized (this.c) {
            final nmo nmo = (nmo)this.c.remove((Object)s);
            if (nmo == null) {
                final StringBuilder sb = new StringBuilder("Missing callback for ");
                sb.append(s);
                Log.w("Rpc", sb.toString());
                return;
            }
            nmo.c((Object)bundle);
        }
    }
}
