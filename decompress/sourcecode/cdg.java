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

public final class cdg extends cch implements ServiceConnection
{
    public final ComponentName a;
    public final ArrayList b;
    public boolean c;
    public cda d;
    public boolean m;
    final aeke n;
    public qpt o;
    private boolean p;
    
    public cdg(final Context context, final ComponentName a) {
        super(context, new ccf(a));
        this.b = new ArrayList();
        this.a = a;
        this.n = new aeke((byte[])null);
    }
    
    private final ccg r(final String s, final String s2) {
        final cci j = super.j;
        if (j != null) {
            final List a = j.a;
            for (int size = a.size(), i = 0; i < size; ++i) {
                if (((ccb)a.get(i)).n().equals(s)) {
                    final cdf cdf = new cdf(this, s, s2);
                    this.b.add(cdf);
                    if (this.m) {
                        cdf.e(this.d);
                    }
                    this.p();
                    return cdf;
                }
            }
        }
        return null;
    }
    
    @Override
    public final ccg b(final String s) {
        if (s != null) {
            return this.r(s, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }
    
    @Override
    public final void d(final ccc ccc) {
        if (this.m) {
            this.d.c(ccc);
        }
        this.p();
    }
    
    public final cdb e(final int n) {
        final ArrayList b = this.b;
        final int size = b.size();
        int i = 0;
        while (i < size) {
            final cdb cdb = (cdb)b.get(i);
            ++i;
            if (cdb.d() == n) {
                return cdb;
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
                ((cdb)this.b.get(i)).f();
            }
            final cda d = this.d;
            d.g(2, 0, 0, null, null);
            d.b.a.clear();
            d.a.getBinder().unlinkToDeath((IBinder$DeathRecipient)d, 0);
            d.h.n.post((Runnable)new aur(d, 20));
            this.d = null;
        }
    }
    
    final void l(final cda cda, final cci cci) {
        if (this.d == cda) {
            this.le(cci);
        }
    }
    
    @Override
    public final ccd lc(final String s) {
        if (s != null) {
            final cci j = super.j;
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
                    if (((ccb)a.get(n)).n().equals(s)) {
                        o2 = new cde(this, s);
                        this.b.add(o2);
                        if (this.m) {
                            ((cdb)o2).e(this.d);
                        }
                        this.p();
                        break;
                    }
                    ++n;
                }
            }
            return (ccd)o2;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }
    
    @Override
    public final ccg ld(final String s, final String s2) {
        if (s == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (s2 != null) {
            return this.r(s, s2);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }
    
    final void m(final cdb cdb) {
        this.b.remove(cdb);
        cdb.f();
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
                    binder = new cda(this, messenger);
                    final int f = ((cda)binder).c++;
                    ((cda)binder).f = f;
                    if (!((cda)binder).g(1, f, 4, null, null)) {
                        return;
                    }
                    try {
                        ((cda)binder).a.getBinder().linkToDeath((IBinder$DeathRecipient)binder, 0);
                        this.d = (cda)binder;
                        return;
                    }
                    catch (final RemoteException ex) {
                        ((cda)binder).binderDied();
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
