import java.io.IOException;
import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

final class dgc implements dfa, dez
{
    public final dfb a;
    public final dez b;
    public volatile Object c;
    public volatile dey d;
    private volatile int e;
    private volatile dex f;
    private volatile aln g;
    
    public dgc(final dfb a, final dez b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a() {
        final aln g = this.g;
        if (g != null) {
            ((ddy)g.b).lq();
        }
    }
    
    public final void b(final ddk ddk, final Exception ex, final ddy ddy, final int n) {
        this.b.b(ddk, ex, ddy, ((ddy)this.g.b).g());
    }
    
    public final boolean c() {
        final Object c = this.c;
        boolean b = false;
        Label_0301: {
            if (c != null) {
                final Object c2 = this.c;
                this.c = null;
                try {
                    dpc.b();
                    boolean b2 = false;
                    Label_0282: {
                        try {
                            final dea a = this.a.c.a().a(c2);
                            final Object a2 = a.a();
                            final ddc s = this.a.c.a().h.s(a2.getClass());
                            if (s != null) {
                                final aln aln = new aln(s, a2, this.a.h);
                                final Object a3 = this.g.a;
                                final dfb a4 = this.a;
                                final dey d = new dey((ddk)a3, a4.m);
                                final dgw d2 = a4.d();
                                d2.b((ddk)d, aln);
                                if (d2.a((ddk)d) != null) {
                                    this.d = d;
                                    this.f = new dex(Collections.singletonList(this.g.a), this.a, (dez)this);
                                    ((ddy)this.g.b).d();
                                    break Label_0301;
                                }
                                try {
                                    this.b.d((ddk)this.g.a, a.a(), (ddy)this.g.b, ((ddy)this.g.b).g(), (ddk)this.g.a);
                                    return true;
                                }
                                finally {
                                    break Label_0282;
                                }
                            }
                            throw new dcf(a2.getClass());
                        }
                        finally {
                            b2 = false;
                        }
                    }
                    if (!b2) {
                        ((ddy)this.g.b).d();
                    }
                }
                catch (final IOException ex) {}
            }
        }
        if (this.f != null && this.f.c()) {
            return true;
        }
        this.f = null;
        this.g = null;
        while (!b && this.e < this.a.f().size()) {
            this.g = this.a.f().get(this.e++);
            if (this.g != null && (this.a.o.c(((ddy)this.g.b).g()) || this.a.h(((ddy)this.g.b).a()))) {
                ((ddy)this.g.b).f(this.a.n, (ddx)new dgb(this, this.g, null, null));
                b = true;
            }
        }
        return b;
    }
    
    public final void d(final ddk ddk, final Object o, final ddy ddy, final int n, final ddk ddk2) {
        this.b.d(ddk, o, ddy, ((ddy)this.g.b).g(), ddk);
    }
    
    final boolean e(final aln aln) {
        final aln g = this.g;
        return g != null && g == aln;
    }
}
