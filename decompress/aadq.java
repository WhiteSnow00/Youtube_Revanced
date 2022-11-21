import android.app.Notification;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aadq implements aads
{
    private final oco a;
    private final atnb b;
    private final aadr c;
    private long d;
    
    public aadq(final oco a, final atnb b, final aadr c) {
        this.d = 0L;
        a.getClass();
        this.a = a;
        b.getClass();
        this.b = b;
        c.getClass();
        this.c = c;
    }
    
    public final void A(final aadf aadf) {
        final int h = aahc.h(aadf.f);
        if (h != 1 && h != 4 && h != 6 && h != 7) {
            return;
        }
        final String s = aahc.s(aadf.f);
        aahc.v(aadf.f);
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final boolean y = aahc.Y(aadf.f);
            final aacp d = ((aadl)this.b.a()).a().i().d(s);
            if (d != null && d.e()) {
                if (y) {
                    this.k(d);
                    return;
                }
                this.i(d);
            }
            return;
        }
        final aadc e = ((aadl)this.b.a()).a().l().e(aahc.u(aadf.f));
        if (e != null && e.c()) {
            this.m(e);
        }
    }
    
    public final void B(final aadf aadf) {
        final int h = aahc.h(aadf.f);
        if (h != 1 && h != 4 && h != 6 && h != 7) {
            return;
        }
        final String s = aahc.s(aadf.f);
        aahc.v(aadf.f);
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final aacp d = ((aadl)this.b.a()).a().i().d(s);
            if (d != null && d.e()) {
                this.i(d);
            }
            return;
        }
        final aadc e = ((aadl)this.b.a()).a().l().e(aahc.u(aadf.f));
        if (e != null && e.s()) {
            this.n(e);
        }
    }
    
    public final void C(final aadf aadf, final boolean b) {
        final long c = this.a.c();
        if (c - this.d < 250L) {
            return;
        }
        this.d = c;
        final int h = aahc.h(aadf.f);
        if (h != 1) {
            if (h != 2) {
                if (h != 4 && h != 6 && h != 7) {
                    return;
                }
            }
            else {
                final aadc e = ((aadl)this.b.a()).a().l().e(aahc.u(aadf.f));
                if (e == null) {
                    return;
                }
                this.q(e);
                return;
            }
        }
        final String s = aahc.s(aadf.f);
        aahc.v(aadf.f);
        if (!TextUtils.isEmpty((CharSequence)s)) {
            final boolean y = aahc.Y(aadf.f);
            final aacp d = ((aadl)this.b.a()).a().i().d(s);
            if (d == null) {
                return;
            }
            if (y) {
                this.l(d);
                return;
            }
            this.j(d);
        }
        else {
            final aadc e2 = ((aadl)this.b.a()).a().l().e(aahc.u(aadf.f));
            if (e2 == null) {
                return;
            }
            final boolean z = aahc.Z(aadf.f);
            if (!b) {
                this.o(e2, z);
                return;
            }
            this.p(e2);
        }
    }
    
    protected final void D(final Notification notification) {
        synchronized (this) {
            this.c.e("15", 15, notification, true);
        }
    }
    
    public void c() {
        synchronized (this) {
            this.c.b();
        }
    }
    
    protected void d(final String s) {
        synchronized (this) {
            this.c.a(s, 8);
        }
    }
    
    protected void e(final String s) {
        synchronized (this) {
            this.c.a(s, 10);
        }
    }
    
    protected void f(final String s) {
        synchronized (this) {
            this.c.a(s, 7);
        }
    }
    
    protected abstract void i(final aacp p0);
    
    protected abstract void j(final aacp p0);
    
    protected abstract void k(final aacp p0);
    
    protected abstract void l(final aacp p0);
    
    protected abstract void m(final aadc p0);
    
    protected abstract void n(final aadc p0);
    
    protected abstract void o(final aadc p0, final boolean p1);
    
    protected abstract void p(final aadc p0);
    
    protected abstract void q(final aadc p0);
    
    protected final void s(final String s, final Notification notification) {
        synchronized (this) {
            this.c.c(s, 8, notification);
        }
    }
    
    protected final void t(final String s, final Notification notification) {
        synchronized (this) {
            this.c.d(s, 8, notification);
        }
    }
    
    protected final void u(final String s, final Notification notification) {
        synchronized (this) {
            this.c.c(s, 10, notification);
        }
    }
    
    protected final void v(final String s, final Notification notification) {
        synchronized (this) {
            this.c.d(s, 10, notification);
        }
    }
    
    protected final void w(final String s, final Notification notification) {
        synchronized (this) {
            this.c.d(s, 14, notification);
        }
    }
    
    protected final void x(final String s, final Notification notification) {
        synchronized (this) {
            this.c.c(s, 7, notification);
        }
    }
    
    protected final void y(final String s, final Notification notification) {
        synchronized (this) {
            this.c.d(s, 7, notification);
        }
    }
    
    public final void z(final aadf aadf) {
        final int h = aahc.h(aadf.f);
        if (h != 1 && h != 4 && h != 6 && h != 7) {
            return;
        }
        final String s = aahc.s(aadf.f);
        aahc.v(aadf.f);
        if (TextUtils.isEmpty((CharSequence)s)) {
            this.f(aahc.u(aadf.f));
            return;
        }
        if (aahc.Y(aadf.f)) {
            this.e(s);
            return;
        }
        this.d(s);
    }
}
