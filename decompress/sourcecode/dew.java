import java.io.File;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class dew implements dez, ddw
{
    private final List a;
    private final dfa b;
    private final dey c;
    private int d;
    private ddj e;
    private List f;
    private int g;
    private File h;
    private volatile alm i;
    
    public dew(final List a, final dfa b, final dey c) {
        this.d = -1;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final boolean d() {
        return this.g < this.f.size();
    }
    
    public final void a() {
        final alm i = this.i;
        if (i != null) {
            ((ddx)i.b).lq();
        }
    }
    
    public final void b(final Object o) {
        this.c.d(this.e, o, (ddx)this.i.b, 3, this.e);
    }
    
    public final boolean c() {
        try {
            while (true) {
                final List f = this.f;
                boolean b = false;
                if (f != null && this.d()) {
                    this.i = null;
                    while (!b && this.d()) {
                        final dii dii = this.f.get(this.g++);
                        final File h = this.h;
                        final dfa b2 = this.b;
                        this.i = dii.b((Object)h, b2.e, b2.f, b2.h);
                        if (this.i != null && this.b.h(((ddx)this.i.b).a())) {
                            ((ddx)this.i.b).f(this.b.n, (ddw)this);
                            b = true;
                        }
                    }
                    return b;
                }
                if (++this.d >= this.a.size()) {
                    return false;
                }
                final ddj e = this.a.get(this.d);
                final dfa b3 = this.b;
                final File a = b3.d().a((ddj)new dex(e, b3.m));
                if ((this.h = a) == null) {
                    continue;
                }
                this.e = e;
                this.f = this.b.g(a);
                this.g = 0;
            }
        }
        finally {
            while (true) {}
        }
    }
    
    public final void e(final Exception ex) {
        this.c.b(this.e, ex, (ddx)this.i.b, 3);
    }
}
