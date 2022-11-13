// 
// Decompiled by Procyon v0.6.0
// 

public final class dnt implements dnn, dnl
{
    public volatile dnl a;
    public volatile dnl b;
    private final dnn c;
    private final Object d;
    private dnm e;
    private dnm f;
    private boolean g;
    
    public dnt(final Object d, final dnn c) {
        this.e = dnm.c;
        this.f = dnm.c;
        this.d = d;
        this.c = c;
    }
    
    public final dnn a() {
        synchronized (this.d) {
            final dnn c = this.c;
            Object a;
            if (c != null) {
                a = c.a();
            }
            else {
                a = this;
            }
            return (dnn)a;
        }
    }
    
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != dnm.d) {
                    final dnm f = this.f;
                    final dnm a = dnm.a;
                    if (f != a) {
                        this.f = a;
                        this.b.b();
                    }
                }
                if (this.g) {
                    final dnm e = this.e;
                    final dnm a2 = dnm.a;
                    if (e != a2) {
                        this.e = a2;
                        this.a.b();
                    }
                }
            }
            finally {
                this.g = false;
            }
        }
    }
    
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            this.e = dnm.c;
            this.f = dnm.c;
            this.b.c();
            this.a.c();
        }
    }
    
    public final void d(final dnl dnl) {
        synchronized (this.d) {
            if (!dnl.equals(this.a)) {
                this.f = dnm.e;
                return;
            }
            this.e = dnm.e;
            final dnn c = this.c;
            if (c != null) {
                c.d((dnl)this);
            }
        }
    }
    
    public final void e(final dnl dnl) {
        synchronized (this.d) {
            if (dnl.equals(this.b)) {
                this.f = dnm.d;
                return;
            }
            this.e = dnm.d;
            final dnn c = this.c;
            if (c != null) {
                c.e((dnl)this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }
    
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = dnm.b;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = dnm.b;
                this.a.f();
            }
        }
    }
    
    public final boolean g(final dnl dnl) {
        synchronized (this.d) {
            final dnn c = this.c;
            final boolean b = false;
            if (c != null) {
                final boolean b2 = b;
                if (!c.g((dnl)this)) {
                    return b2;
                }
            }
            boolean b2 = b;
            if (dnl.equals(this.a)) {
                b2 = b;
                if (this.e != dnm.b) {
                    b2 = true;
                }
            }
            return b2;
        }
    }
    
    public final boolean h(final dnl dnl) {
        synchronized (this.d) {
            final dnn c = this.c;
            final boolean b = false;
            if (c != null) {
                final boolean b2 = b;
                if (!c.h((dnl)this)) {
                    return b2;
                }
            }
            boolean b2 = b;
            if (dnl.equals(this.a)) {
                b2 = b;
                if (!this.j()) {
                    b2 = true;
                }
            }
            return b2;
        }
    }
    
    public final boolean i(final dnl dnl) {
        synchronized (this.d) {
            final dnn c = this.c;
            final boolean b = false;
            if (c != null) {
                final boolean b2 = b;
                if (!c.i((dnl)this)) {
                    return b2;
                }
            }
            if (!dnl.equals(this.a)) {
                final boolean b2 = b;
                if (this.e == dnm.d) {
                    return b2;
                }
            }
            return true;
        }
    }
    
    public final boolean j() {
        synchronized (this.d) {
            final boolean j = this.b.j();
            boolean b = true;
            if (!j) {
                b = (this.a.j() && b);
            }
            return b;
        }
    }
    
    public final boolean k() {
        synchronized (this.d) {
            return this.e == dnm.c;
        }
    }
    
    public final boolean l() {
        synchronized (this.d) {
            return this.e == dnm.d;
        }
    }
    
    public final boolean m(final dnl dnl) {
        if (dnl instanceof dnt) {
            final dnt dnt = (dnt)dnl;
            if (this.a == null) {
                if (dnt.a != null) {
                    return false;
                }
            }
            else if (!this.a.m(dnt.a)) {
                return false;
            }
            if (this.b == null) {
                if (dnt.b != null) {
                    return false;
                }
            }
            else if (!this.b.m(dnt.b)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    public final boolean n() {
        synchronized (this.d) {
            return this.e == dnm.a;
        }
    }
}
