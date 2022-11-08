// 
// Decompiled by Procyon v0.6.0
// 

public final class dns implements dnm, dnk
{
    public volatile dnk a;
    public volatile dnk b;
    private final dnm c;
    private final Object d;
    private dnl e;
    private dnl f;
    private boolean g;
    
    public dns(final Object d, final dnm c) {
        this.e = dnl.c;
        this.f = dnl.c;
        this.d = d;
        this.c = c;
    }
    
    public final dnm a() {
        synchronized (this.d) {
            final dnm c = this.c;
            Object a;
            if (c != null) {
                a = c.a();
            }
            else {
                a = this;
            }
            return (dnm)a;
        }
    }
    
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != dnl.d) {
                    final dnl f = this.f;
                    final dnl a = dnl.a;
                    if (f != a) {
                        this.f = a;
                        this.b.b();
                    }
                }
                if (this.g) {
                    final dnl e = this.e;
                    final dnl a2 = dnl.a;
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
            this.e = dnl.c;
            this.f = dnl.c;
            this.b.c();
            this.a.c();
        }
    }
    
    public final void d(final dnk dnk) {
        synchronized (this.d) {
            if (!dnk.equals(this.a)) {
                this.f = dnl.e;
                return;
            }
            this.e = dnl.e;
            final dnm c = this.c;
            if (c != null) {
                c.d((dnk)this);
            }
        }
    }
    
    public final void e(final dnk dnk) {
        synchronized (this.d) {
            if (dnk.equals(this.b)) {
                this.f = dnl.d;
                return;
            }
            this.e = dnl.d;
            final dnm c = this.c;
            if (c != null) {
                c.e((dnk)this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }
    
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = dnl.b;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = dnl.b;
                this.a.f();
            }
        }
    }
    
    public final boolean g(final dnk dnk) {
        synchronized (this.d) {
            final dnm c = this.c;
            final boolean b = false;
            if (c != null) {
                final boolean b2 = b;
                if (!c.g((dnk)this)) {
                    return b2;
                }
            }
            boolean b2 = b;
            if (dnk.equals(this.a)) {
                b2 = b;
                if (this.e != dnl.b) {
                    b2 = true;
                }
            }
            return b2;
        }
    }
    
    public final boolean h(final dnk dnk) {
        synchronized (this.d) {
            final dnm c = this.c;
            final boolean b = false;
            if (c != null) {
                final boolean b2 = b;
                if (!c.h((dnk)this)) {
                    return b2;
                }
            }
            boolean b2 = b;
            if (dnk.equals(this.a)) {
                b2 = b;
                if (!this.j()) {
                    b2 = true;
                }
            }
            return b2;
        }
    }
    
    public final boolean i(final dnk dnk) {
        synchronized (this.d) {
            final dnm c = this.c;
            final boolean b = false;
            if (c != null) {
                final boolean b2 = b;
                if (!c.i((dnk)this)) {
                    return b2;
                }
            }
            if (!dnk.equals(this.a)) {
                final boolean b2 = b;
                if (this.e == dnl.d) {
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
            return this.e == dnl.c;
        }
    }
    
    public final boolean l() {
        synchronized (this.d) {
            return this.e == dnl.d;
        }
    }
    
    public final boolean m(final dnk dnk) {
        if (dnk instanceof dns) {
            final dns dns = (dns)dnk;
            if (this.a == null) {
                if (dns.a != null) {
                    return false;
                }
            }
            else if (!this.a.m(dns.a)) {
                return false;
            }
            if (this.b == null) {
                if (dns.b != null) {
                    return false;
                }
            }
            else if (!this.b.m(dns.b)) {
                return false;
            }
            return true;
        }
        return false;
    }
    
    public final boolean n() {
        synchronized (this.d) {
            return this.e == dnl.a;
        }
    }
}
