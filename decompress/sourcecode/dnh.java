// 
// Decompiled by Procyon v0.6.0
// 

public final class dnh implements dnm, dnk
{
    public volatile dnk a;
    public volatile dnk b;
    private final Object c;
    private final dnm d;
    private dnl e;
    private dnl f;
    
    public dnh(final Object c, final dnm d) {
        this.e = dnl.c;
        this.f = dnl.c;
        this.c = c;
        this.d = d;
    }
    
    public final dnm a() {
        synchronized (this.c) {
            final dnm d = this.d;
            Object a;
            if (d != null) {
                a = d.a();
            }
            else {
                a = this;
            }
            return (dnm)a;
        }
    }
    
    public final void b() {
        synchronized (this.c) {
            if (this.e != dnl.a) {
                this.e = dnl.a;
                this.a.b();
            }
        }
    }
    
    public final void c() {
        synchronized (this.c) {
            this.e = dnl.c;
            this.a.c();
            final dnl f = this.f;
            final dnl c = dnl.c;
            if (f != c) {
                this.f = c;
                this.b.c();
            }
        }
    }
    
    public final void d(final dnk dnk) {
        synchronized (this.c) {
            if (!dnk.equals(this.b)) {
                this.e = dnl.e;
                final dnl f = this.f;
                final dnl a = dnl.a;
                if (f != a) {
                    this.f = a;
                    this.b.b();
                }
                return;
            }
            this.f = dnl.e;
            final dnm d = this.d;
            if (d != null) {
                d.d((dnk)this);
            }
        }
    }
    
    public final void e(final dnk dnk) {
        synchronized (this.c) {
            if (dnk.equals(this.a)) {
                this.e = dnl.d;
            }
            else if (dnk.equals(this.b)) {
                this.f = dnl.d;
            }
            final dnm d = this.d;
            if (d != null) {
                d.e((dnk)this);
            }
        }
    }
    
    public final void f() {
        synchronized (this.c) {
            if (this.e == dnl.a) {
                this.e = dnl.b;
                this.a.f();
            }
            if (this.f == dnl.a) {
                this.f = dnl.b;
                this.b.f();
            }
        }
    }
    
    public final boolean g(final dnk dnk) {
        synchronized (this.c) {
            final dnm d = this.d;
            final boolean b = false;
            if (d != null) {
                final boolean b2 = b;
                if (!d.g((dnk)this)) {
                    return b2;
                }
            }
            boolean b2 = b;
            if (dnk.equals(this.a)) {
                b2 = true;
            }
            return b2;
        }
    }
    
    public final boolean h(final dnk dnk) {
        synchronized (this.c) {
            final dnm d = this.d;
            final boolean b = false;
            if (d != null) {
                final boolean b2 = b;
                if (!d.h((dnk)this)) {
                    return b2;
                }
            }
            boolean equals = false;
            Label_0098: {
                if (this.e != dnl.e) {
                    equals = dnk.equals(this.a);
                }
                else {
                    if (dnk.equals(this.b)) {
                        final dnl f = this.f;
                        if (f == dnl.d) {
                            equals = true;
                            break Label_0098;
                        }
                        if (f == dnl.e) {
                            return true;
                        }
                    }
                    equals = false;
                }
            }
            boolean b2 = b;
            if (!equals) {
                return b2;
            }
            b2 = true;
            return b2;
        }
    }
    
    public final boolean i(final dnk dnk) {
        synchronized (this.c) {
            final dnm d = this.d;
            boolean b = true;
            if (d != null) {
                b = (d.i((dnk)this) && b);
            }
            return b;
        }
    }
    
    public final boolean j() {
        synchronized (this.c) {
            final boolean j = this.a.j();
            boolean b = true;
            if (!j) {
                b = (this.b.j() && b);
            }
            return b;
        }
    }
    
    public final boolean k() {
        synchronized (this.c) {
            final dnl e = this.e;
            final dnl c = dnl.c;
            boolean b = false;
            if (e == c) {
                b = b;
                if (this.f == dnl.c) {
                    b = true;
                }
            }
            return b;
        }
    }
    
    public final boolean l() {
        synchronized (this.c) {
            final dnl e = this.e;
            final dnl d = dnl.d;
            boolean b = true;
            if (e != d) {
                b = (this.f == dnl.d && b);
            }
            return b;
        }
    }
    
    public final boolean m(final dnk dnk) {
        if (dnk instanceof dnh) {
            final dnh dnh = (dnh)dnk;
            if (this.a.m(dnh.a) && this.b.m(dnh.b)) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean n() {
        synchronized (this.c) {
            final dnl e = this.e;
            final dnl a = dnl.a;
            boolean b = true;
            if (e != a) {
                b = (this.f == dnl.a && b);
            }
            return b;
        }
    }
}
