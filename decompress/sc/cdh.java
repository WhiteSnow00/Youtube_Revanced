import android.os.RemoteException;
import android.os.Messenger;
import android.os.IBinder;
import android.util.Log;
import android.os.IBinder$DeathRecipient;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.content.Intent;
import java.util.List;
import android.content.Context;
import java.util.ArrayList;
import android.content.ComponentName;
import android.content.ServiceConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cdh extends cci implements ServiceConnection
{
    public final ComponentName a;
    public final ArrayList b;
    public boolean c;
    public cdb d;
    public boolean m;
    final aemf n;
    public pvh o;
    private boolean p;
    
    public cdh(final Context context, final ComponentName a) {
        super(context, new ccg(a));
        this.b = new ArrayList();
        this.a = a;
        this.n = new aemf((byte[])null);
    }
    
    private final cch r(final String s, final String s2) {
        final ccj j = super.j;
        if (j != null) {
            final List a = j.a;
            for (int size = a.size(), i = 0; i < size; ++i) {
                if (((ccc)a.get(i)).n().equals(s)) {
                    final cdg cdg = new cdg(this, s, s2);
                    this.b.add(cdg);
                    if (this.m) {
                        ((cdc)cdg).e(this.d);
                    }
                    this.p();
                    return cdg;
                }
            }
        }
        return null;
    }
    
    public final cch b(final String s) {
        if (s != null) {
            return this.r(s, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }
    
    public final void d(final ccd ccd) {
        if (this.m) {
            this.d.c(ccd);
        }
        this.p();
    }
    
    public final cdc e(final int n) {
        final ArrayList b = this.b;
        final int size = b.size();
        int i = 0;
        while (i < size) {
            final cdc cdc = (cdc)b.get(i);
            final int d = cdc.d();
            ++i;
            if (d == n) {
                return cdc;
            }
        }
        return null;
    }
    
    public final void f() {
        if (this.p) {
            return;
        }
        final Intent intent = new Intent("android.media.MediaRouteProviderService");
        intent.setComponent(this.a);
        try {
            int n;
            if (Build$VERSION.SDK_INT >= 29) {
                n = 4097;
            }
            else {
                n = 1;
            }
            this.p = super.e.bindService(intent, (ServiceConnection)this, n);
        }
        catch (final SecurityException ex) {}
    }
    
    public final void k() {
        if (this.d != null) {
            this.le((ccj)null);
            this.m = false;
            for (int size = this.b.size(), i = 0; i < size; ++i) {
                ((cdc)this.b.get(i)).f();
            }
            final cdb d = this.d;
            d.g(2, 0, 0, (Object)null, (Bundle)null);
            d.b.a.clear();
            d.a.getBinder().unlinkToDeath((IBinder$DeathRecipient)d, 0);
            d.h.n.post((Runnable)new aus(d, 20));
            this.d = null;
        }
    }
    
    final void l(final cdb cdb, final ccj ccj) {
        if (this.d == cdb) {
            this.le(ccj);
        }
    }
    
    public final cce lc(final String s) {
        if (s != null) {
            final ccj j = super.j;
            cdf cdf2;
            final cdf cdf = cdf2 = null;
            if (j != null) {
                final List a = j.a;
                final int size = a.size();
                int n = 0;
                while (true) {
                    cdf2 = cdf;
                    if (n >= size) {
                        break;
                    }
                    if (((ccc)a.get(n)).n().equals(s)) {
                        cdf2 = new cdf(this, s);
                        this.b.add(cdf2);
                        if (this.m) {
                            ((cdc)cdf2).e(this.d);
                        }
                        this.p();
                        break;
                    }
                    ++n;
                }
            }
            return cdf2;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }
    
    public final cch ld(final String s, final String s2) {
        if (s == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (s2 != null) {
            return this.r(s, s2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }
    
    final void m(final cdc cdc) {
        this.b.remove(cdc);
        cdc.f();
        this.p();
    }
    
    public final void n() {
        if (!this.c) {
            this.c = true;
            this.p();
        }
    }
    
    public final void o() {
        if (this.p) {
            this.p = false;
            this.k();
            try {
                super.e.unbindService((ServiceConnection)this);
            }
            catch (final IllegalArgumentException ex) {
                new StringBuilder().append(this);
                Log.e("MediaRouteProviderProxy", this.toString().concat(": unbindService failed"), (Throwable)ex);
            }
        }
    }
    
    public final void onServiceConnected(final ComponentName componentName, IBinder binder) {
        if (!this.p) {
            return;
        }
        this.k();
        Messenger messenger;
        if (binder != null) {
            messenger = new Messenger((IBinder)binder);
        }
        else {
            messenger = null;
        }
        while (true) {
            if (messenger == null) {
                break Label_0110;
            }
            try {
                binder = messenger.getBinder();
                if (binder != null) {
                    binder = new cdb(this, messenger);
                    final int f = ((cdb)binder).c++;
                    ((cdb)binder).f = f;
                    if (!((cdb)binder).g(1, f, 4, (Object)null, (Bundle)null)) {
                        return;
                    }
                    try {
                        ((cdb)binder).a.getBinder().linkToDeath((IBinder$DeathRecipient)binder, 0);
                        this.d = (cdb)binder;
                        return;
                    }
                    catch (final RemoteException ex) {
                        ((cdb)binder).binderDied();
                        return;
                    }
                }
                new StringBuilder().append(this);
                Log.e("MediaRouteProviderProxy", this.toString().concat(": Service returned invalid messenger binder"));
            }
            catch (final NullPointerException ex2) {
                continue;
            }
            break;
        }
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
        this.k();
    }
    
    public final void p() {
        if (this.q()) {
            this.f();
            return;
        }
        this.o();
    }
    
    public final boolean q() {
        if (this.c) {
            if (super.h != null) {
                return true;
            }
            if (!this.b.isEmpty()) {
                return true;
            }
        }
        return false;
    }
    
    public final String toString() {
        return "Service connection ".concat(String.valueOf(this.a.flattenToShortString()));
    }
}
