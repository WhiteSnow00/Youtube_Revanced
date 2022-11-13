import android.view.View;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class icy implements xnr, fju, icx, ich
{
    public static final int b = 0;
    Optional a;
    private final bu c;
    private final xnt d;
    private final fjv e;
    private final atjz f;
    private final asht g;
    private final afaq h;
    private boolean i;
    private br j;
    private final skt k;
    
    static {
        ttr.a("MDX.LazyInitializer");
    }
    
    public icy(final bu c, final xnt d, final skt k, final fjv e, final byte[] array, final byte[] array2, final byte[] array3) {
        final adba h = new adba(1);
        final atjm aw = atjm.aW((Object)Optional.empty());
        this.f = (atjz)aw;
        this.g = ((asht)aw).aq((asjr)hzh.l);
        this.i = true;
        c.getClass();
        this.c = c;
        d.getClass();
        this.d = d;
        k.getClass();
        this.k = k;
        this.h = (afaq)h;
        this.e = e;
        this.a = Optional.empty();
    }
    
    private final View h() {
        return this.c.findViewById(2131429756);
    }
    
    private final void i() {
        synchronized (this) {
            if (this.i) {
                return;
            }
            if (this.d.g() != null) {
                if (this.g() == null) {
                    adkp.Q(this.g() == null);
                    final Object a = this.h.a();
                    this.j = (br)a;
                    final ct i = this.c.getSupportFragmentManager().i();
                    i.r(2131429756, (br)a, "MdxWatchFragment");
                    i.d();
                    final br j = this.j;
                    if (j instanceof icw) {
                        this.f.tu((Object)Optional.of((Object)j));
                    }
                }
                final br g = this.g();
                if (this.a.isPresent() && g instanceof icw) {
                    ((icw)g).n(((agoe)this.a.get()).b);
                }
            }
        }
    }
    
    private final void j() {
        if (this.i) {
            return;
        }
        if (this.d.g() == null && this.g() != null) {
            final br g = this.g();
            g.getClass();
            final ct i = this.c.getSupportFragmentManager().i();
            i.n(g);
            i.d();
            this.j = null;
            this.f.tu((Object)Optional.empty());
        }
    }
    
    public final asht a() {
        return this.g;
    }
    
    public final void b() {
        this.d.i((xnr)this);
        this.e.l(this);
    }
    
    public final void c() {
        this.d.k((xnr)this);
        this.e.n(this);
    }
    
    public final void d() {
        this.i = true;
    }
    
    public final void e() {
        this.i = false;
        this.i();
        this.j();
    }
    
    public final void f(final fxz fxz, final int n) {
        String.valueOf(fxz);
        if (this.a.isEmpty()) {
            this.a = Optional.of((Object)new agoe((byte[])null, (byte[])null));
        }
        ((agoe)this.a.get()).x(fxz, n);
        final View h = this.h();
        final icw icw = (icw)this.g();
        if (icw != null && h != null && h.getVisibility() == 0) {
            icw.n(((agoe)this.a.get()).b);
        }
    }
    
    final br g() {
        if (this.j == null) {
            this.j = this.c.getSupportFragmentManager().f("MdxWatchFragment");
        }
        return this.j;
    }
    
    public final void n(final fkr fkr) {
    }
    
    public final void o(final xnm xnm) {
    }
    
    public final void oK(final fkr fkr, final fkr fkr2) {
        if (fkr == fkr2) {
            return;
        }
        final View h = this.h();
        if (h != null) {
            int visibility;
            if (fkr2 == fkr.d) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            h.setVisibility(visibility);
        }
    }
    
    public final void p(final xnm xnm) {
        this.j();
        this.k.i(false);
    }
    
    public final void q(final xnm xnm) {
        this.i();
        this.k.i(true);
    }
}
