import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abcv implements abct, abps, tgg
{
    private static final apjo[] c;
    public final abpq a;
    public PlayerResponseModel b;
    private final abcu d;
    
    static {
        c = new apjo[0];
    }
    
    public abcv(final abpq a, final abcu d) {
        a.getClass();
        this.a = a;
        d.getClass();
        this.d = d;
        ((itd)d).a.a((abct)this);
    }
    
    private final void d() {
        this.d.d(false);
        this.d.c(abcv.c, -1);
    }
    
    public final void a(final aamb aamb) {
        this.c(aamb.c());
    }
    
    public final void b(final aans aans) {
        final abke c = aans.c();
        this.b = aans.b();
        if (c.h()) {
            this.d();
        }
        if (c == abke.i) {
            this.c(aamb.d(aans.b()));
            final abcu d = this.d;
            apjp apjp;
            if ((apjp = aans.b().m().c.s) == null) {
                apjp = apjp.a;
            }
            ((itd)d).b = apjp.d;
        }
    }
    
    public final void c(final apjo[] array) {
        final Object a = this.a.u.a;
        int i = 0;
        final boolean b = a != null && ((abvb)a).am().a();
        this.d.d(b);
        if (b) {
            while (true) {
                while (i < array.length) {
                    if (Float.compare(array[i].d, this.a.h()) == 0) {
                        this.d.c(array, i);
                        return;
                    }
                    ++i;
                }
                i = -1;
                continue;
            }
        }
        this.d();
    }
    
    public final asir[] lX(final abpu abpu) {
        return new asir[] { ((ashi)abpu.p().a).j(aale.s(abpu.bM(), 131072L)).j(aale.q(1)).an((asjm)new abci(this, 12), abba.k), abpu.H((aezf)aalg.s, (aezf)aalg.t).j(aale.s(abpu.bM(), 131072L)).j(aale.q(1)).an((asjm)new abci(this, 13), abba.k) };
    }
    
    public final Class[] ms(final Class clazz, final Object o, final int n) {
        Class[] array;
        if (n != -1) {
            array = null;
            if (n != 0) {
                if (n != 1) {
                    final StringBuilder sb = new StringBuilder("unsupported op code: ");
                    sb.append(n);
                    throw new IllegalStateException(sb.toString());
                }
                this.b((aans)o);
            }
            else {
                this.a((aamb)o);
            }
        }
        else {
            array = new Class[] { aamb.class, aans.class };
        }
        return array;
    }
}
