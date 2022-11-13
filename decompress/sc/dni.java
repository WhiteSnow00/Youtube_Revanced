// 
// Decompiled by Procyon v0.6.0
// 

public final class dni implements dnn, dnl
{
    public volatile dnl a;
    public volatile dnl b;
    private final Object c;
    private final dnn d;
    private dnm e;
    private dnm f;
    
    public dni(final Object c, final dnn d) {
        this.e = dnm.c;
        this.f = dnm.c;
        this.c = c;
        this.d = d;
    }
    
    public final dnn a() {
        synchronized (this.c) {
            final dnn d = this.d;
            Object a;
            if (d != null) {
                a = d.a();
            }
            else {
                a = this;
            }
            return (dnn)a;
        }
    }
    
    public final void b() {
        synchronized (this.c) {
            if (this.e != dnm.a) {
                this.e = dnm.a;
                this.a.b();
            }
        }
    }
    
    public final void c() {
        synchronized (this.c) {
            this.e = dnm.c;
            this.a.c();
            final dnm f = this.f;
            final dnm c = dnm.c;
            if (f != c) {
                this.f = c;
                this.b.c();
            }
        }
    }
    
    public final void d(final dnl dnl) {
        synchronized (this.c) {
            if (!dnl.equals(this.b)) {
                this.e = dnm.e;
                final dnm f = this.f;
                final dnm a = dnm.a;
                if (f != a) {
                    this.f = a;
                    this.b.b();
                }
                return;
            }
            this.f = dnm.e;
            final dnn d = this.d;
            if (d != null) {
                d.d((dnl)this);
            }
        }
    }
    
    public final void e(final dnl dnl) {
        synchronized (this.c) {
            if (dnl.equals(this.a)) {
                this.e = dnm.d;
            }
            else if (dnl.equals(this.b)) {
                this.f = dnm.d;
            }
            final dnn d = this.d;
            if (d != null) {
                d.e((dnl)this);
            }
        }
    }
    
    public final void f() {
        synchronized (this.c) {
            if (this.e == dnm.a) {
                this.e = dnm.b;
                this.a.f();
            }
            if (this.f == dnm.a) {
                this.f = dnm.b;
                this.b.f();
            }
        }
    }
    
    public final boolean g(final dnl dnl) {
        synchronized (this.c) {
            final dnn d = this.d;
            final boolean b = false;
            if (d != null) {
                final boolean b2 = b;
                if (!d.g((dnl)this)) {
                    return b2;
                }
            }
            boolean b2 = b;
            if (dnl.equals(this.a)) {
                b2 = true;
            }
            return b2;
        }
    }
    
    public final boolean h(final dnl dnl) {
        synchronized (this.c) {
            final dnn d = this.d;
            final boolean b = false;
            if (d != null) {
                final boolean b2 = b;
                if (!d.h((dnl)this)) {
                    return b2;
                }
            }
            boolean equals = false;
            Label_0099: {
                if (this.e != dnm.e) {
                    equals = dnl.equals(this.a);
                }
                else {
                    if (dnl.equals(this.b)) {
                        final dnm f = this.f;
                        if (f == dnm.d) {
                            equals = true;
                            break Label_0099;
                        }
                        if (f == dnm.e) {
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
    
    public final boolean i(final dnl dnl) {
        synchronized (this.c) {
            final dnn d = this.d;
            boolean b = true;
            if (d != null) {
                b = (d.i((dnl)this) && b);
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
            final dnm e = this.e;
            final dnm c = dnm.c;
            boolean b = false;
            if (e == c) {
                b = b;
                if (this.f == dnm.c) {
                    b = true;
                }
            }
            return b;
        }
    }
    
    public final boolean l() {
        synchronized (this.c) {
            final dnm e = this.e;
            final dnm d = dnm.d;
            boolean b = true;
            if (e != d) {
                b = (this.f == dnm.d && b);
            }
            return b;
        }
    }
    
    public final boolean m(final dnl dnl) {
        if (dnl instanceof dni) {
            final dni dni = (dni)dnl;
            if (this.a.m(dni.a) && this.b.m(dni.b)) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean n() {
        synchronized (this.c) {
            final dnm e = this.e;
            final dnm a = dnm.a;
            boolean b = true;
            if (e != a) {
                b = (this.f == dnm.a && b);
            }
            return b;
        }
    }
}
