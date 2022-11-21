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

public final class cdl extends ccl implements ServiceConnection
{
    public final ComponentName a;
    public final ArrayList b;
    public boolean c;
    public cdf d;
    public boolean m;
    final aeny n;
    public oqz o;
    private boolean p;
    
    public cdl(final Context context, final ComponentName a) {
        super(context, new ccj(a));
        this.b = new ArrayList();
        this.a = a;
        this.n = new aeny((byte[])null);
    }
    
    private final cck r(final String s, final String s2) {
        final ccm j = super.j;
        if (j != null) {
            final List a = j.a;
            for (int size = a.size(), i = 0; i < size; ++i) {
                if (((ccf)a.get(i)).n().equals(s)) {
                    final cdk cdk = new cdk(this, s, s2);
                    this.b.add(cdk);
                    if (this.m) {
                        cdk.e(this.d);
                    }
                    this.p();
                    return cdk;
                }
            }
        }
        return null;
    }
    
    @Override
    public final cck b(final String s) {
        if (s != null) {
            return this.r(s, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }
    
    @Override
    public final void d(final ccg ccg) {
        if (this.m) {
            this.d.c(ccg);
        }
        this.p();
    }
    
    public final cdg e(final int n) {
        final ArrayList b = this.b;
        final int size = b.size();
        int i = 0;
        while (i < size) {
            final cdg cdg = (cdg)b.get(i);
            final int d = cdg.d();
            ++i;
            if (d == n) {
                return cdg;
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
            this.le(null);
            this.m = false;
            for (int size = this.b.size(), i = 0; i < size; ++i) {
                ((cdg)this.b.get(i)).f();
            }
            final cdf d = this.d;
            d.g(2, 0, 0, null, null);
            d.b.a.clear();
            d.a.getBinder().unlinkToDeath((IBinder$DeathRecipient)d, 0);
            d.h.n.post((Runnable)new cde(d, 1));
            this.d = null;
        }
    }
    
    final void l(final cdf cdf, final ccm ccm) {
        if (this.d == cdf) {
            this.le(ccm);
        }
    }
    
    @Override
    public final cch lc(final String s) {
        if (s != null) {
            final ccm j = super.j;
            Object o2;
            final Object o = o2 = null;
            if (j != null) {
                final List a = j.a;
                final int size = a.size();
                int n = 0;
                while (true) {
                    o2 = o;
                    if (n >= size) {
                        break;
                    }
                    if (((ccf)a.get(n)).n().equals(s)) {
                        o2 = new cdj(this, s);
                        this.b.add(o2);
                        if (this.m) {
                            ((cdg)o2).e(this.d);
                        }
                        this.p();
                        break;
                    }
                    ++n;
                }
            }
            return (cch)o2;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }
    
    @Override
    public final cck ld(final String s, final String s2) {
        if (s == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (s2 != null) {
            return this.r(s, s2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }
    
    final void m(final cdg cdg) {
        this.b.remove(cdg);
        cdg.f();
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
                    binder = new cdf(this, messenger);
                    final int f = ((cdf)binder).c++;
                    ((cdf)binder).f = f;
                    if (!((cdf)binder).g(1, f, 4, null, null)) {
                        return;
                    }
                    try {
                        ((cdf)binder).a.getBinder().linkToDeath((IBinder$DeathRecipient)binder, 0);
                        this.d = (cdf)binder;
                        return;
                    }
                    catch (final RemoteException ex) {
                        ((cdf)binder).binderDied();
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
