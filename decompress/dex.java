import java.io.File;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class dex implements dfa, ddx
{
    private final List a;
    private final dfb b;
    private final dez c;
    private int d;
    private ddk e;
    private List f;
    private int g;
    private File h;
    private volatile aln i;
    
    public dex(final List a, final dfb b, final dez c) {
        this.d = -1;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final boolean d() {
        return this.g < this.f.size();
    }
    
    public final void a() {
        final aln i = this.i;
        if (i != null) {
            ((ddy)i.b).lq();
        }
    }
    
    public final void b(final Object o) {
        this.c.d(this.e, o, (ddy)this.i.b, 3, this.e);
    }
    
    public final boolean c() {
        try {
            while (true) {
                final List f = this.f;
                boolean b = false;
                if (f != null && this.d()) {
                    this.i = null;
                    while (!b && this.d()) {
                        final dij dij = this.f.get(this.g++);
                        final File h = this.h;
                        final dfb b2 = this.b;
                        this.i = dij.b((Object)h, b2.e, b2.f, b2.h);
                        if (this.i != null && this.b.h(((ddy)this.i.b).a())) {
                            ((ddy)this.i.b).f(this.b.n, (ddx)this);
                            b = true;
                        }
                    }
                    return b;
                }
                if (++this.d >= this.a.size()) {
                    return false;
                }
                final ddk e = this.a.get(this.d);
                final dfb b3 = this.b;
                final File a = b3.d().a((ddk)new dey(e, b3.m));
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
        this.c.b(this.e, ex, (ddy)this.i.b, 3);
    }
}
